package no.ntnu.idatx2001.InterfaceActions;

import no.ntnu.idatx2001.Player;

/**
 * Represents a class that changes a players inventory.
 */
public class InventoryAction {
    private String item;

    public InventoryAction(String item) {
        this.item = item;
    }

    /**
     * Add an item to the players inventory.
     * @param player The player that the inventory changes for.
     */
    public void execute(Player player) {
        player.addToInventory(item);
    }
}
