package no.ntnu.idatx2001.test.goals;

import no.ntnu.idatx2001.Player;
import no.ntnu.idatx2001.goals.Goal;
import no.ntnu.idatx2001.goals.InventoryGoal;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.*;
public class InventoryGoalTest {
    private List<String> mandatoryItems;

    public InventoryGoalTest() {
        this.mandatoryItems = new ArrayList<>();
    }
    @Test
    public void testIsFulfilledPositive() {
        mandatoryItems.add("item1");
        mandatoryItems.add("item2");

        Goal goal = new InventoryGoal(mandatoryItems);
        Player player = new Player("name", 100, 10, 24);

        player.addToInventory("item1");
        player.addToInventory("item2");
        player.addToInventory("item3");
        player.addToInventory("item4");

        assertTrue(goal.isFulfilled(player));
    }

    @Test
    public void testIsFulfilledNegative() {
        mandatoryItems.add("item2");

        Goal goal = new InventoryGoal(mandatoryItems);
        Player player = new Player("name", 100, 10, 24);

        player.addToInventory("item1");

        assertFalse(goal.isFulfilled(player));
    }
}
