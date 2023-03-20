package no.ntnu.idatx2001.test.goals;
import no.ntnu.idatx2001.Player;
import no.ntnu.idatx2001.goals.Goal;
import no.ntnu.idatx2001.goals.ScoreGoal;
import org.junit.Test;
import static org.junit.Assert.*;

public class ScoreGoalTest {

    @Test
    public void testIsFulFilledExact() {
        Goal goal = new ScoreGoal(63);
        Player player = new Player("name", 100, 63, 63);

        assertTrue(goal.isFulfilled(player));
        assertEquals(63, player.getScore());
    }

    @Test
    public void testIsFulFilledExtra() {
        Goal goal = new ScoreGoal(70);
        Player player = new Player("name", 100, 84, 105);

        assertTrue(goal.isFulfilled(player));
        assertEquals(84, player.getScore());
    }

    @Test
    public void testIsFulFilledNotFulfilled() {
        Goal goal = new ScoreGoal(70);
        Player player = new Player("name", 100, 13, 44);

        assertFalse(goal.isFulfilled(player));
        assertEquals(13, player.getScore());
    }

    @Test
    public void testIsFulFilledNegativeValue() {
        try {
            Goal goal = new ScoreGoal(70);
            Player player = new Player("name", 100, -7, 40);

            assertFalse(goal.isFulfilled(player));
        } catch (IllegalArgumentException e) {
            assertTrue(true);
            e.getMessage();
        }
    }
}
