package no.ntnu.idatx2001.goals;

import no.ntnu.idatx2001.Player;

import java.util.ArrayList;
import java.util.List;

/**
 * A class that represents the expected inventory.
 */
public class InventoryGoal implements Goal{
    private List<String> mandatoryItems;

    public InventoryGoal(List<String> mandatoryItems) {
        this.mandatoryItems = mandatoryItems;
    }

    /**
     * Returns true if the inventory is fulfilled and false if not.
     * @param player The player whose inventory is checked
     * @return true if inventory is fulfilled and false if not
     */
    public boolean isFulfilled(Player player) {
        if (player == null) {
            throw new IllegalArgumentException("No player found");
        }
        return player.getInventory().containsAll(mandatoryItems);
    }
}
