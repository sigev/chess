package ddd.core;

import ddd.core.domain.*;
import ddd.core.moves.PawnMove;

public class Main {

    public static void main(String[] args) {
        // write your code here
        Player player1 = new Player("Sige", "sige.vanvynckt@infosupport.com", new EloRating(600));
        Player player2 = new Player("Gerry", "timgerry.geerts@infosupport.com", new EloRating(699));

        Game game = new Game(player1, player2);
        System.out.println("======== Initial board ========");
        game.printBoard();

        Position move1From = new Position(Rank.SEVEN, File.A);
        Position move1To = new Position(Rank.SIX, File.A);
        Piece piece = new Piece(PieceColor.BLACK, move1From);

        Move move1 = new PawnMove(piece, move1To);
        game.makeMove(move1);

        System.out.println("======== Board after move ========");
        game.printBoard();
    }
}
