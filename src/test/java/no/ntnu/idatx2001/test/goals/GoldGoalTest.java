package no.ntnu.idatx2001.test.goals;

import no.ntnu.idatx2001.Player;
import no.ntnu.idatx2001.goals.Goal;
import no.ntnu.idatx2001.goals.GoldGoal;
import org.junit.Test;
import static org.junit.Assert.*;
public class GoldGoalTest {

    @Test
    public void testIsFulFilledExact() {
        Goal goal = new GoldGoal(63);
        Player player = new Player("name", 100, 10, 63);

        assertTrue(goal.isFulfilled(player));
        assertEquals(63, player.getGold());
    }

    @Test
    public void testIsFulFilledExtra() {
        Goal goal = new GoldGoal(63);
        Player player = new Player("name", 100, 10, 105);

        assertTrue(goal.isFulfilled(player));
        assertEquals(105, player.getGold());
    }

    @Test
    public void testIsFulFilledNotFulfilled() {
        Goal goal = new GoldGoal(63);
        Player player = new Player("name", 100, 10, 44);

        assertFalse(goal.isFulfilled(player));
        assertEquals(44, player.getGold());
    }

    @Test
    public void testIsFulFilledNegativeValue() {
        try {
            Goal goal = new GoldGoal(63);
            Player player = new Player("name", 100, 10, -4);

            assertFalse(goal.isFulfilled(player));
        } catch (IllegalArgumentException e) {
            assertTrue(true);
            e.getMessage();
        }
    }
}
