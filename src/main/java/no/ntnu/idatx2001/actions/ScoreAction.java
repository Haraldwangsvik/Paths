package no.ntnu.idatx2001.actions;

import no.ntnu.idatx2001.Player;

/**
 * Represents a class that changes a players score.
 */
public class ScoreAction {
    private int points;

    public ScoreAction(int points) {
        this.points = points;
    }

    /**
     * Change the score of the player.
     * @param player The player that the score changes for.
     */
    public void execute(Player player) {
        player.addScore(points);
    }
}
