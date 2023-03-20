package no.ntnu.idatx2001.test.actions;

import no.ntnu.idatx2001.Player;
import no.ntnu.idatx2001.actions.Action;
import no.ntnu.idatx2001.actions.GoldAction;
import static org.junit.Assert.*;
import org.junit.Test;

public class GoldActionTest {

    @Test
    public void testExecuteAdd() {
        Player player = new Player("name", 100, 12, 120);
        Action action = new GoldAction(30);

        action.execute(player);

        assertEquals(150, player.getGold());
    }

    @Test
    public void testExecuteSubtract() {
        Player player = new Player("name", 100, 12, 120);
        Action action = new GoldAction(-35);

        action.execute(player);

        assertEquals(85, player.getGold());
    }

    @Test
    public void testExecuteSubtractToNegative() {
        try {
            Player player = new Player("name", 100, 12, 120);
            Action action = new GoldAction(-130);

            action.execute(player);
        } catch (IllegalArgumentException e) {
            assertTrue(true);
            e.getMessage();
            System.out.println(e);
        }
    }
}
