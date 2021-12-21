package ddd.core.domain;

/// <summary>
/// Represents a ValueObject in the domain (DDD).
/// </summary>
public class EloRating {
   private int rating;

    public EloRating(int rating) {
        this.rating = rating;
    }
}
