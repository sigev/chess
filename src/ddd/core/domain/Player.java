package ddd.core.domain;

import ddd.core.Entity;

import java.util.UUID;

/// <summary>
/// Represents an Entity in the domain (DDD).
/// </summary>
/// <typeparam name="TId">The type of the Id of the entity.</typeparam>
public class Player extends Entity<UUID> {

    private final String name;
    private final String email;
    private final EloRating eloRating;

    public Player(String name, String email, EloRating eloRating) {
        super(UUID.randomUUID());
        this.name = name;
        this.email = email;
        this.eloRating = eloRating;
    }
}