package no.ntnu.idatx2001.actions;

import no.ntnu.idatx2001.Player;

/**
 * A class that represents future change in the state of the player.
 * Includes changes to the player's score, health, gold or inventory.
 */
public interface Action {

    /**
     * Changes the state of the player when called upon.
     * @param player The player that the state changes for
     */
    void execute(Player player);
}
