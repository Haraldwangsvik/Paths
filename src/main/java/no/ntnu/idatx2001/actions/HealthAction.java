package no.ntnu.idatx2001.actions;

import no.ntnu.idatx2001.Player;

/**
 * Represents a class that changes a players health.
 */
public class HealthAction {
    private int health;

    public HealthAction(int health) {
        this.health = health;
    }

    /**
     * Change the health of the player.
     * @param player The player that the health changes for.
     */
    public void execute(Player player) {
        player.addHealth(health);
    }
}
