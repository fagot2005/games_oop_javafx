package ru.job4j.chess.firuges.black;

import ru.job4j.chess.firuges.Cell;
import ru.job4j.chess.firuges.Figure;

public class BishopBlack implements Figure {
    private final Cell position;

    public BishopBlack(final Cell position) {
        this.position = position;
    }

    @Override
    public Cell position() {
        return this.position;
    }

    @Override
    public Cell[] way(Cell source, Cell dest) {
        if (! isDiagonal(source, dest)) {
            throw new IllegalStateException(
                    String.format("Could not move by diagonal from %s to %s", source, dest)
            );
        }
        return null;//steps;
    }
//        int size = Math.max(dest.x-source.x, dest.y-source.y);
//        Cell[] steps = new Cell[size];
//        int deltaX = dest.x-source.x;
//        int deltaY = dest.y-source.y;
//        for (int index = 0; index < size; index++) {
//            steps[index] = source[x...
//        }


    public boolean isDiagonal(Cell source, Cell dest) {
        return Math.abs(dest.x - source.x) == Math.abs(dest.y - dest.y);
    }

    //Cell deltaX = ;
//            int deltaY = dest.y-source.y;
    //}

    //}

    @Override
    public Figure copy(Cell dest) {
        return new BishopBlack(dest);
    }
}
