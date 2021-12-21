package ddd.core.domain;

import ddd.core.ValueObject;

import java.util.Objects;

public class Position extends ValueObject {
    private final Rank rank;
    private final File file;

    public Position(Rank rank, File file) {
        this.rank = rank;
        this.file = file;
    }

    public Rank getRank() {
        return rank;
    }

    public File getFile() {
        return file;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Position position = (Position) o;
        return rank == position.rank && file == position.file;
    }

    @Override
    protected Object[] GetAtomicValues() {
        return new Object[0];
    }
}