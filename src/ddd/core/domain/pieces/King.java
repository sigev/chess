package ddd.core.domain.pieces;

import ddd.core.domain.Piece;
import ddd.core.domain.PieceColor;
import ddd.core.domain.Position;

public class King extends Piece {
    public King(PieceColor color, Position position) {
        super(color, position);
    }
}
