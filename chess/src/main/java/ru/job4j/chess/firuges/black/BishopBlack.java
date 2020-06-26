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
        int size = Math.max(Math.abs(dest.x-source.x), Math.abs(dest.y-source.y));
        Cell[] steps = new Cell[size];
        int deltaX = dest.x-source.x;
        int deltaY = dest.y-source.y;
        for (int index = 0; index < size; index++) {
            int x = source.x + (index + 1)*(deltaX/size);
            int y = source.y + (index + 1)*(deltaY/size);
            steps[index] = Cell.findBy(x,y);
            //System.out.println(steps[index]);
        }
                return steps;
    }

    public boolean isDiagonal(Cell source, Cell dest) {
        return Math.abs(dest.x - source.x) == Math.abs(dest.y - source.y);
    }

    @Override
    public Figure copy(Cell dest) {
        return new BishopBlack(dest);
    }
}
