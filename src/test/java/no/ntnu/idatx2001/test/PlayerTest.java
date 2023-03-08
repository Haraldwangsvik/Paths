package no.ntnu.idatx2001.test;

import no.ntnu.idatx2001.Passage;
import no.ntnu.idatx2001.Player;
import org.junit.Test;

import static org.junit.Assert.*;

public class PlayerTest {

    @Test
    public void testGetValues() {
        Player player = new Player("name", 100, 10, 1);

        assertEquals("name", player.getName());
        assertEquals(100, player.getHealth());
        assertEquals(10, player.getScore());
        assertEquals(1, player.getGold());
    }

    @Test
    public void testGetValuesWithNullValue() {
        try {
            Player player = new Player(null, 0, 0, 0);
        } catch (IllegalArgumentException e) {
            assertTrue(true);
            e.getMessage();
        }
    }

    @Test
    public void testGetHealthWithNegativeValue() {
        try{
            Player player = new Player("name", -12, 10, 1);
        } catch (IllegalArgumentException e) {
            assertTrue(true);
            e.getMessage();
        }
    }

    @Test
    public void testAddHealth() {
        Player player = new Player("name", 100, 10, 1);

        player.addHealth(10);

        assertEquals(110, player.getHealth());
    }

    @Test
    public void testAddHealthRemoveHealth() {
        Player player = new Player("name", 100, 10, 1);

        player.addHealth(-10);

        assertEquals(90, player.getHealth());
    }

    @Test
    public void testAddScore() {
        Player player = new Player("name", 100, 10, 1);

        player.addScore(23);

        assertEquals(33, player.getScore());

    }

    @Test
    public void testAddScoreRemovePoints() {
        Player player = new Player("name", 100, 10, 1);

        player.addScore(-8);

        assertEquals(2, player.getScore());
    }

    @Test
    public void testAddScoreNegativeScore() {
        Player player = new Player("name", 100, 10, 1);

        player.addScore(-12);

        assertEquals(-2, player.getScore());
    }

    @Test
    public void testAddGold() {
        Player player = new Player("name", 100, 10, 1);

        player.addGold(10);

        assertEquals(11, player.getGold());

    }

    @Test
    public void testAddGoldRemoveGold() {
        Player player = new Player("name", 100, 10, 1);

        player.addGold(-1);

        assertEquals(0, player.getGold());
    }

    @Test
    public void testAddGoldNegativeGold() {
        Player player = new Player("name", 100, 10, 1);

        player.addGold(-12);

        assertEquals(-11, player.getGold());
    }

    @Test
    public void testAddToInventory() {
        Player player = new Player("name", 100, 10, 1);
        String item = "Golden mirror";

        assertTrue(player.getInventory().isEmpty());
        assertEquals(0, player.getInventory().size());

        player.addToInventory(item);

        assertEquals(1, player.getInventory().size());
        assertTrue(player.getInventory().contains(item));
    }

    @Test
    public void testAddToInventoryWithNull() {
        Player player = new Player("name", 100, 10, 1);
        try {
            player.addToInventory(null);
        } catch (IllegalArgumentException e) {
            assertTrue(true);
            e.getMessage();
        }
    }
}
