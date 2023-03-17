package no.ntnu.idatx2001;

import no.ntnu.idatx2001.goals.Goal;

import java.util.ArrayList;
import java.util.List;

public class Game {

  //Represents a player from the Player class
  private Player player;

  //Represents a story from the Story class
  private Story story;

  //a list filled with goals
  private List<Goal> goals;

  /**
   * Game is a facade for a Paths-game. This class connects a player to a story,
   * and has methods to start and maneuver the game.
   *
   * @param player Represents a player from the player class
   * @param story Represents a story from the story class
   * @param goals a list filled with goals.
   */
  public Game(Player player, Story story, List<Goal> goals) {
    if (isValid(player) && isValid(story)) {
      this.player = player;
      this.story = story;
    } else {
      IllegalArgumentException e = new IllegalArgumentException("Invalid entry");
      throw e;
    }
    this.goals = new ArrayList<>();
  }

  /**
   * Return the player
   * @return player
   */
  public Player getPlayer() {
    return this.player;
  }

  /**
   * Return the story
   * @return story
   */
  public Story getStory() {
    return this.story;
  }

  /**
   * Return goals list
   * @return goals list
   */
  public List<Goal> getGoals() {
    return this.goals;
  }

  /**
   * Return the first passage of the story.
   * @return first passage of the story
   */
  public Passage begin() {
    return story.getOpeningPassage();
  }

  public Passage go(Link link) {
    if (link.getReference().equals(story.getTitle())) {
      return story.getPassage(link);
    } else {
      throw new IllegalArgumentException("The links reference " +
              "and the stories title do not match.");
    }
  }

  private boolean isValid(Object o) {
    return o != null;
  }

}
