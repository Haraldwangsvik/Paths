package no.ntnu.idatx2001.goals;

import no.ntnu.idatx2001.Player;

/**
 * A class that represents a target value for the player to reach.
 */
public interface Goal {

  /**
   * Check if the goal is reached.
   * @param player The player whose score is checked
   * @return true if the goal is reached, false if not
   */
  boolean isFulfilled(Player player);
}
