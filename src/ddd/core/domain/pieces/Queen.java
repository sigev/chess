package ddd.core.domain.pieces;

import ddd.core.domain.Piece;
import ddd.core.domain.PieceColor;
import ddd.core.domain.Position;

public class Queen extends Piece {
    public Queen(PieceColor color, Position position) {
        super(color, position);
    }
}
