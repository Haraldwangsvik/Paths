package no.ntnu.idatx2001.test;

import no.ntnu.idatx2001.*;
import no.ntnu.idatx2001.goals.Goal;
import no.ntnu.idatx2001.goals.GoldGoal;
import no.ntnu.idatx2001.goals.HealthGoal;
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

        Goal goal = new GoldGoal(100);
        game.getGoals().add(goal);

        assertEquals(1, game.getGoals().size());

        Goal goal1 = new HealthGoal(83);
        game.getGoals().add(goal1);

        assertEquals(2, game.getGoals().size());
    }
    @Test
    public void testBegin() {
        Player player = new Player("name", 100, 10, 15);
        Passage passage = new Passage("title", "content");
        Story story = new Story("title", passage);
        Game game = new Game(player, story, goals);

        assertEquals(passage, game.begin());
    }

    @Test
    public void testBeginWithNull() {
        try {
            Player player = new Player("name", 100, 10, 15);
            Passage passage = new Passage("title", "content");
            Story story = new Story("title", passage);
            Game game = new Game(null, null, null);

            game.begin();
        } catch (IllegalArgumentException e) {
            assertTrue(true);
            e.getMessage();
        }
    }

    @Test
    public void testGo() {
        Player player = new Player("name", 100, 10, 15);
        Link link = new Link("text", "title");
        Passage passage = new Passage("title", "content");
        Story story = new Story("title", passage);
        Game game = new Game(player, story, goals);

        assertEquals(story.getPassage(link), game.go(link));
    }

    @Test
    public void testGoWithDifferentValues() {
        try {
            Player player = new Player("name", 100, 10, 15);
            Link link = new Link("text", "reference");
            Passage passage = new Passage("title", "content");
            Story story = new Story("title", passage);
            Game game = new Game(player, story, goals);

            game.go(link);
        } catch (IllegalArgumentException e) {
            assertTrue(true);
            e.getMessage();
        }
    }

    @Test
    public void testGoWithNull() {
        try {
            Player player = new Player("name", 100, 10, 15);
            Link link = new Link("text", null);
            Passage passage = new Passage("title", "content");
            Story story = new Story(null, passage);
            Game game = new Game(player, story, goals);

            game.go(link);

        } catch (IllegalArgumentException e) {
            assertTrue(true);
            e.getMessage();
        }
    }
}