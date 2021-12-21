package ddd.core.domain;

import ddd.core.ValueObject;

public class Piece extends ValueObject {
    private PieceColor color;
    private Position position;

    public Piece(PieceColor color, Position position) {
        this.color = color;
        this.position = position;
    }

    public Position getPosition() {
        return position;
    }

    public PieceColor getColor() {
        return color;
    }

    public boolean isBlack() {
        return this.color.equals(PieceColor.BLACK);
    }

    public boolean isWhite() {
        return this.color.equals(PieceColor.WHITE);
    }

    public void setPosition(Position position) {
        this.position = position;
    }

    @Override
    protected Object[] GetAtomicValues() {
        return new Object[0];
    }
}
