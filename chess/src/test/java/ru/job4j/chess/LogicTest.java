package ru.job4j.chess;

import org.junit.Ignore;
import org.junit.Test;
import ru.job4j.chess.firuges.Cell;
import ru.job4j.chess.firuges.black.BishopBlack;
import ru.job4j.chess.firuges.black.PawnBlack;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.*;

public class LogicTest {

    //@Ignore
    @Test
    public void moveNotImposible() {
        Logic logic = new Logic();
        logic.add(new PawnBlack(Cell.D7));
        logic.add(new BishopBlack(Cell.C8));
        boolean rsl = logic.move(Cell.C8, Cell.F5);
        assertThat(rsl, is(false));
    }

    @Test
    public void moveImposible() {
        Logic logic = new Logic();
        logic.add(new PawnBlack(Cell.C7));
        logic.add(new BishopBlack(Cell.C8));

        boolean rsl = logic.move(Cell.C8, Cell.F5);
        assertThat(rsl, is(true));
    }
}