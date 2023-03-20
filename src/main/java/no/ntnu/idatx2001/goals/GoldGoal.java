package no.ntnu.idatx2001.goals;

import no.ntnu.idatx2001.Player;

/**
 * A class that represents the expected minimum gold.
 */
public class GoldGoal implements Goal{
    private final int minimumGold;

    public GoldGoal(int minimumGold) {
        this.minimumGold = minimumGold;
    }

    /**
     * Returns true if the minimum gold is fulfilled and false if not.
     * @param player The player whose gold is checked
     * @return true if minimum gold is fulfilled and false if not
     */
    public boolean isFulfilled(Player player) {
        return player.getGold() >= minimumGold;
    }
}
