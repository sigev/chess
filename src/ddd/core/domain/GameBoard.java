package ddd.core.domain;

import ddd.core.domain.pieces.Pawn;

import java.util.Optional;

public class GameBoard {

    private Piece[][] board = {
            {null, null, null, null, null, null, null, null},
            {new Pawn(PieceColor.BLACK, new Position(Rank.SEVEN, File.A)), new Pawn(PieceColor.BLACK, new Position(Rank.SEVEN, File.B)), new Pawn(PieceColor.BLACK, new Position(Rank.SEVEN, File.C)), new Pawn(PieceColor.BLACK, new Position(Rank.SEVEN, File.D)), new Pawn(PieceColor.BLACK, new Position(Rank.SEVEN, File.E)), new Pawn(PieceColor.BLACK, new Position(Rank.SEVEN, File.F)), new Pawn(PieceColor.BLACK, new Position(Rank.SEVEN, File.G)), new Pawn(PieceColor.BLACK, new Position(Rank.SEVEN, File.H))},
            {null, null, null, null, null, null, null, null},
            {null, null, null, null, null, null, null, null},
            {null, null, null, null, null, null, null, null},
            {null, null, null, null, null, null, null, null},
            {new Pawn(PieceColor.WHITE, new Position(Rank.TWO, File.A)), new Pawn(PieceColor.WHITE, new Position(Rank.TWO, File.B)), new Pawn(PieceColor.WHITE, new Position(Rank.TWO, File.C)), new Pawn(PieceColor.WHITE, new Position(Rank.TWO, File.D)), new Pawn(PieceColor.WHITE, new Position(Rank.TWO, File.E)), new Pawn(PieceColor.WHITE, new Position(Rank.TWO, File.F)), new Pawn(PieceColor.WHITE, new Position(Rank.TWO, File.G)), new Pawn(PieceColor.WHITE, new Position(Rank.TWO, File.H))},
            {null, null, null, null, null, null, null, null},
    };

    public void updatePiecePosition(Position from, Position to) {
        Piece previousPiece = board[from.getRank().ordinal()][from.getFile().ordinal()];
        previousPiece.setPosition(new Position(to.getRank(), to.getFile()));
        board[to.getRank().ordinal()][to.getFile().ordinal()] = previousPiece;
        board[from.getRank().ordinal()][from.getFile().ordinal()] = null;
    }

    @Override
    public String toString() {
        StringBuilder rows = new StringBuilder();
        for (int i = 0; i < 8; i++) {
            StringBuilder row = new StringBuilder();
            for (int j = 0; j < 8; j++) {
                Optional<Piece> currentPiece = Optional.ofNullable(board[i][j]);
                String stringValue = currentPiece
                        .map(p -> ":" + p + ":")
                        .orElse(":EM:");
                row.append(stringValue);
            }
            rows.append(row).append("\n");
        }

        return rows.toString();
    }
}
