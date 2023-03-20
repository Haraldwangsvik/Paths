package no.ntnu.idatx2001.test.actions;

import no.ntnu.idatx2001.Player;
import no.ntnu.idatx2001.actions.Action;
import static org.junit.Assert.*;

import no.ntnu.idatx2001.actions.HealthAction;
import org.junit.Test;

public class HealthActionTest {

    @Test
    public void testExecuteAdd() {
        Player player = new Player("name", 70, 12, 120);
        Action action = new HealthAction(30);

        action.execute(player);

        assertEquals(100, player.getHealth());
    }

    @Test
    public void testExecuteSubtract() {
        Player player = new Player("name", 100, 12, 120);
        Action action = new HealthAction(-35);

        action.execute(player);

        assertEquals(65, player.getHealth());
    }

    @Test
    public void testExecuteSubtractToNegative() {
        try {
            Player player = new Player("name", 100, 12, 120);
            Action action = new HealthAction(-101);

            action.execute(player);
        } catch (IllegalArgumentException e) {
            assertTrue(true);
            e.getMessage();
        }
    }
}
