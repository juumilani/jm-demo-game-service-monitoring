package com.example.demo.model;

/**
 * Simple domain model representing a player.
 *
 * In a real system, this would likely be a database entity
 * with additional attributes such as inventory, stats, etc.
 */
public class Player {
    private String id;
    private String name;

    public Player(String id, String name) {
        this.id = id;
        this.name = name;
    }

    public String getId() { return id; }
    public String getName() { return name; }
}