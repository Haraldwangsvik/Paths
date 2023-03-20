package no.ntnu.idatx2001.test.actions;

import no.ntnu.idatx2001.Player;
import no.ntnu.idatx2001.actions.Action;
import no.ntnu.idatx2001.actions.GoldAction;
import static org.junit.Assert.*;

import no.ntnu.idatx2001.actions.ScoreAction;
import org.junit.Test;

public class ScoreActionTest {

    @Test
    public void testExecuteAdd() {
        Player player = new Player("name", 100, 12, 120);
        Action action = new ScoreAction(30);

        action.execute(player);

        assertEquals(42, player.getScore());
    }

    @Test
    public void testExecuteSubtract() {
        Player player = new Player("name", 100, 12, 120);
        Action action = new ScoreAction(-10);

        action.execute(player);

        assertEquals(2, player.getScore());
    }

    @Test
    public void testExecuteSubtractToNegative() {
        try {
            Player player = new Player("name", 100, 12, 120);
            Action action = new ScoreAction(-13);

            action.execute(player);
        } catch (IllegalArgumentException e) {
            assertTrue(true);
            e.getMessage();
        }
    }
}
