package ddd.core.domain.pieces;

import ddd.core.domain.Piece;
import ddd.core.domain.PieceColor;
import ddd.core.domain.Position;


public class Pawn extends Piece {
    public Pawn(PieceColor color, Position position) {
        super(color, position);
    }

    @Override
    public String toString() {
        return "P" + (this.getColor() == PieceColor.BLACK ? "B" : "W");
    }
}
