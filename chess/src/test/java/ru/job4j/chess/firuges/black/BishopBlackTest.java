package ru.job4j.chess.firuges.black;

import junit.framework.TestCase;
import org.junit.Test;
import ru.job4j.chess.firuges.Cell;
import ru.job4j.chess.firuges.Figure;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertThat;

public class BishopBlackTest extends TestCase {
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

//    @Test
//    public void testWay() {
//        BishopBlack bishopBlack = new BishopBlack(Cell.C1);
//        Cell[] carentPosition = bishopBlack.way(Cell.C1, Cell.G5);
//        //assertArrayEquals(carentPosition..position().name(), is("G5"));
//    }

    @Test
    public void testIsDiagonal() {
        BishopBlack bishopBlack = new BishopBlack(Cell.C1);
        Cell source = bishopBlack.position();
        Cell dest = Cell.G5;
        //Figure carentPosition = bishopBlack.copy(Cell.G5);
        boolean isCorectDiagonal = BishopBlack.isDiagonal(source, dest);
        //assertArrayEquals(BishopBlack.isDiagonal(bishopBlack.position(), carentPosition)); is("G5"));
    }
}