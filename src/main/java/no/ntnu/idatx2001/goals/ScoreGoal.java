package no.ntnu.idatx2001.goals;

import no.ntnu.idatx2001.Player;

/**
 * A class that represents the expected minimum score.
 */
public class ScoreGoal implements Goal {
    private final int minimumPoints;

    public ScoreGoal(int minimumPoints) {
        this.minimumPoints = minimumPoints;
    }

    /**
     * Returns true if the minimum points is fulfilled and false if not.
     * @param player The player whose score is checked
     * @return true if minimum points is fulfilled and false if not
     */
    public boolean isFulfilled(Player player) {
        return player.getScore() >= minimumPoints;
    }
}
