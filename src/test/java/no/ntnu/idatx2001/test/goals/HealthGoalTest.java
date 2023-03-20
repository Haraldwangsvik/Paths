package no.ntnu.idatx2001.test.goals;

import no.ntnu.idatx2001.Player;
import no.ntnu.idatx2001.goals.Goal;
import no.ntnu.idatx2001.goals.HealthGoal;
import org.junit.Test;
import static org.junit.Assert.*;
public class HealthGoalTest {

    @Test
    public void testIsFulFilledExact() {
        Goal goal = new HealthGoal(80);
        Player player = new Player("name", 80, 10, 63);

        assertTrue(goal.isFulfilled(player));
        assertEquals(80, player.getHealth());
    }

    @Test
    public void testIsFulFilledExtra() {
        Goal goal = new HealthGoal(60);
        Player player = new Player("name", 94, 10, 105);

        assertTrue(goal.isFulfilled(player));
        assertEquals(94, player.getHealth());
    }

    @Test
    public void testIsFulFilledNotFulfilled() {
        Goal goal = new HealthGoal(70);
        Player player = new Player("name", 56, 10, 44);

        assertFalse(goal.isFulfilled(player));
        assertEquals(56, player.getHealth());
    }

    @Test
    public void testIsFulFilledNegativeValue() {
        try {
            Goal goal = new HealthGoal(70);
            Player player = new Player("name", -5, 10, 56);

            assertFalse(goal.isFulfilled(player));
        } catch (IllegalArgumentException e) {
            assertTrue(true);
            e.getMessage();
        }
    }
}
