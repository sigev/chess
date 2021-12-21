package ddd.core.moves;

import ddd.core.domain.*;

public class PawnMove extends Move {
    public PawnMove(Piece piece, Position to) {
        super(piece, to);
    }

    @Override
    public boolean isValid() {
        return super.isValid() && validateTargetPosition();
    }

    private boolean validateTargetPosition() {
        // We assume that a Pawn can only move 1 up or down.
        if (super.getPiece().isBlack()) {
            Position validPosition = new Position(Rank.values()[super.getPiece().getPosition().getRank().ordinal() + 1], super.getPiece().getPosition().getFile());
            return super.getTo().equals(validPosition);
        }

        if (super.getPiece().isWhite()) {
            Position validPosition = new Position(Rank.values()[super.getPiece().getPosition().getRank().ordinal() - 1], super.getPiece().getPosition().getFile());
            return super.getTo().equals(validPosition);
        }

        return false;
    }

}
