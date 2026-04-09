package com.example.demo.controller;

import com.example.demo.model.Player;
import com.example.demo.service.PlayerService;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/players")
public class PlayerController {

    private final PlayerService playerService;

    public PlayerController(PlayerService playerService) {
        this.playerService = playerService;
    }

    /**
     * Retrieves a player by ID.
     */
    @GetMapping("/{id}")
    public Player getPlayer(@PathVariable String id) {
        return playerService.getPlayer(id);
    }

    /**
     * Creates a new player.
     */
    @PostMapping
    public Player createPlayer(@RequestParam String name) {
        return playerService.createPlayer(name);
    }
}