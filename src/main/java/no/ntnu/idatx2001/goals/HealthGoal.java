package no.ntnu.idatx2001.goals;

import no.ntnu.idatx2001.Player;

/**
 * A class that represents the expected minimum health.
 */
public class HealthGoal {
    private final int minimumHealth;

    public HealthGoal(int minimumHealth) {
        this.minimumHealth = minimumHealth;
    }

    /**
     * Returns true if the minimum health is fulfilled and false if not.
     * @param player The player whose health is checked
     * @return true if minimum health is fulfilled and false if not
     */
    public boolean isFulfilled(Player player) {
        return player.getHealth() >= minimumHealth;
    }
}
