package no.ntnu.idatx2001.actions;

import no.ntnu.idatx2001.Player;

/**
 * Represents a class that changes a players inventory.
 */
public class InventoryAction implements Action {
    private String item;

    public InventoryAction(String item) {
        if (isValidString(item)) {
            this.item = item;
        } else {
            throw new IllegalArgumentException("Invalid entry");
        }
    }

    /**
     * Add an item to the players inventory.
     * @param player The player that the inventory changes for.
     */
    public void execute(Player player) {
        player.addToInventory(item);
    }

    /**
     * Check that a String is valid by checking that it does not equal null or is empty.
     *
     * @param string to be checked if is valid
     * @return true on string not null or empty, false on string equals null or string is empty
     */
    public boolean isValidString(String string) {
        return string != null && !string.isEmpty();
    }

}
