package ru.job4j.chess;

import org.junit.Ignore;
import org.junit.Test;
import ru.job4j.chess.firuges.Cell;
import ru.job4j.chess.firuges.black.BishopBlack;
import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.*;

public class LogicTest {

    //@Ignore
    @Test
    public void move() {
        Logic logic = new Logic();
        logic.add(new BishopBlack(Cell.C1));
        boolean rsl = logic.move(Cell.C1, Cell.G5);
        assertThat(rsl, is(true));
    }

    @Test
    public void position() {
        Logic logic = new Logic();
        logic.add(new BishopBlack(Cell.C1));

        for (int i = 0; i < )
            for (Logic x: logic
            ) {

////        }
//        //boolean rsl = //logic.move(Cell.C1, Cell.H6);
////        assertThat(rsl, is(true));
//    }
            }