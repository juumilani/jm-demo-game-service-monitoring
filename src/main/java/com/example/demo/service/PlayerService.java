package com.example.demo.service;

import com.example.demo.model.Player;
import io.micrometer.core.instrument.MeterRegistry;
import org.springframework.stereotype.Service;

import java.util.*;

/**
 * Service layer responsible for player-related operations.
 *
 * This simulates business logic and integrates monitoring
 * by recording metrics for each operation.
 */

@Service
public class PlayerService {

    // In-memory storage simulating a database
    private final Map<String, Player> db = new HashMap<>();
    // Micrometer registry for custom metrics
    private final MeterRegistry meterRegistry;

    public PlayerService(MeterRegistry meterRegistry) {
        this.meterRegistry = meterRegistry;
    }

    /**
     * Retrieves a player by ID.
     * Also records a metric and simulates latency.
     */
    public Player getPlayer(String id) {
        simulateLatency();
        meterRegistry.counter("player.get.requests").increment();
        return db.get(id);
    }

    public Player createPlayer(String name) {
        String id = UUID.randomUUID().toString();
        Player player = new Player(id, name);
        db.put(id, player);
        meterRegistry.counter("player.create.requests").increment();
        return player;
    }

    /**
     * Simulates network/database latency to better demonstrate
     * monitoring behavior under non-ideal conditions.
     */
    private void simulateLatency() {
        try {
            Thread.sleep(new Random().nextInt(200));
        } catch (InterruptedException ignored) {}
    }
}