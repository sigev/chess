package ddd.core.domain;

import ddd.core.AggregateRoot;
import ddd.core.DomainEvent;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

/// <summary>
/// Represents an Entity in the domain (DDD).
/// </summary>
/// <typeparam name="TId">The type of the Id of the entity.</typeparam>
public class Game extends AggregateRoot<UUID> {
    private final Player black;
    private final Player white;
    private final GameBoard board;
    private final List<Move> moves;

    public Game(Player black, Player white) {
        super(UUID.randomUUID());
        this.black = black;
        this.white = white;
        this.board = new GameBoard();
        this.moves = new ArrayList<>();
    }

    public void makeMove(Move move) {
        if (!move.isValid()) {
            return;
        }

        moves.add(move);
        board.updatePiecePosition(move.getPiece().getPosition(), move.getTo());
    }

    public void printBoard() {
        System.out.println(board.toString());
    }

    @Override
    protected void when(DomainEvent domainEvent) {
        throw new UnsupportedOperationException();
    }
}