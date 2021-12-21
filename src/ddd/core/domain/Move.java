package ddd.core.domain;

import ddd.core.ValueObject;

/// <summary>
/// Represents a ValueObject in the domain (DDD).
/// </summary>
public abstract class Move extends ValueObject {

    private final Piece piece;
    private final Position to;

    public Move(Piece piece, Position to) {
        this.piece = piece;
        this.to = to;
    }

    public boolean isValid() {
        // This method could contain a general validation rule
        return true;
    }

    public Piece getPiece() {
        return piece;
    }

    public Position getTo() {
        return to;
    }

    @Override
    protected Object[] GetAtomicValues() {
        return new Object[0];
    }
}
