package no.ntnu.idatx2001.test.actions;

import static org.junit.Assert.*;

import no.ntnu.idatx2001.Player;
import no.ntnu.idatx2001.actions.Action;
import no.ntnu.idatx2001.actions.InventoryAction;
import org.junit.Test;
public class InventoryActionTest {

    @Test
    public void testExecutePositive() {
        Player player = new Player("name", 100, 10, 15);

        Action action = new InventoryAction("Bow");

        action.execute(player);

        assertEquals(1, player.getInventory().size());
    }

    @Test
    public void testExecuteNegative() {
        try {
            Player player = new Player("name", 100, 10, 15);
            Action action = new InventoryAction(null);
            action.execute(player);
        } catch (IllegalArgumentException e) {
            assertTrue(true);
            e.getMessage();
        }
    }
}
