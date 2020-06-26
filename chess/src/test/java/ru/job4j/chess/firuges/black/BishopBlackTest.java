package ru.job4j.chess.firuges.black;

import junit.framework.TestCase;
import org.junit.Test;
import ru.job4j.chess.firuges.Cell;
import ru.job4j.chess.firuges.Figure;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class BishopBlackTest {
    @Test
    public void testPosition() {
        BishopBlack bishopBlack = new BishopBlack(Cell.C1);
        String carentPosition = bishopBlack.position().name();
        assertThat(carentPosition, is("C1"));
    }

    @Test
    public void testCopy() {
        BishopBlack bishopBlack = new BishopBlack(Cell.C1);
        Figure carentPosition = bishopBlack.copy(Cell.G5);
        assertThat(carentPosition.position().name(), is("G5"));
    }

    @Test
    public void testWay() {
        BishopBlack bishopBlack = new BishopBlack(Cell.G5);
        Cell[] stepsArray = bishopBlack.way(Cell.G5, Cell.C1);
        //assertArrayEquals(bishopBlack.way(Cell.G5, Cell.C1)), is({}));++
        System.out.println(stepsArray);
    }

    @Test
    public void testIsDiagonal() {
        BishopBlack bishopBlack = new BishopBlack(Cell.C1);
        Cell source = bishopBlack.position();
        Cell dest = Cell.G5;
        assertThat(bishopBlack.isDiagonal(source, dest), is(true));
    }

    @Test (expected = IllegalStateException.class)
    public void testIsNotDiagonal() {
        BishopBlack bishopBlack = new BishopBlack(Cell.C1);
        Cell source = bishopBlack.position();
        Cell dest = Cell.G7;
        assertThat(bishopBlack.way(source, dest), is(false));
    }

}