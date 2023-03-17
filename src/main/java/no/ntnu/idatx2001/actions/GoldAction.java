package no.ntnu.idatx2001.actions;

import no.ntnu.idatx2001.Player;

/**
 * Represents a class that changes a players amount of gold.
 */
public class GoldAction implements Action {
    private int gold;

    public GoldAction(int gold) {
        this.gold = gold;
    }

    /**
     * Change the amount gold the player has.
     * @param player The player that the gold changes for.
     */
    public void execute(Player player) {
        player.addGold(gold);
    }
}
