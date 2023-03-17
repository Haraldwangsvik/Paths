package no.ntnu.idatx2001.test;

import no.ntnu.idatx2001.Game;
import no.ntnu.idatx2001.Passage;
import no.ntnu.idatx2001.Player;
import no.ntnu.idatx2001.Story;
import no.ntnu.idatx2001.goals.Goal;
import no.ntnu.idatx2001.goals.GoldGoal;
import org.junit.Test;
import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.List;

public class GameTest {
    private List<Goal> goals;

    public GameTest() {
        this.goals = new ArrayList<>();
    }

    @Test
    public void testGetPlayer() {
        Player player = new Player("name", 100, 10, 15);
        Passage passage = new Passage("title", "content");
        Story story = new Story("title", passage);
        Game game = new Game(player, story, goals);

        assertEquals(player, game.getPlayer());
    }

    @Test
    public void testGetPlayerWithNull() {
        try {
            Player player = new Player("name", 100, 10, 15);
            Passage passage = new Passage("title", "content");
            Story story = new Story("title", passage);
            Game game = new Game(null, story, goals);
            game.getPlayer();
        }catch (IllegalArgumentException e) {
            assertTrue(true);
            e.getMessage();
        }
    }

    @Test
    public void testGetStory() {
        Player player = new Player("name", 100, 10, 15);
        Passage passage = new Passage("title", "content");
        Story story = new Story("title", passage);
        Game game = new Game(player, story, goals);

        assertEquals(story, game.getStory());
    }

    @Test
    public void tetGetStoryWithNull() {
        try {
            Player player = new Player("name", 100, 10, 15);
            Passage passage = new Passage("title", "content");
            Story story = new Story("title", passage);
            Game game = new Game(player, null, goals);
            game.getStory();
        }catch (IllegalArgumentException e) {
            assertTrue(true);
            e.getMessage();
        }
    }

    @Test
    public void testGetGoals() {
        Player player = new Player("name", 100, 10, 15);
        Passage passage = new Passage("title", "content");
        Story story = new Story("title", passage);
        Game game = new Game(player, story, goals);

        GoldGoal goldGoal = new GoldGoal(100);

        goals.add(player1 -> goldGoal.isFulfilled(player1));

        assertEquals(1, game.getGoals().size());
    }
}