package no.ntnu.idatx2001;

import java.io.StringReader;
import java.util.ArrayList;
import java.util.List;

/**
 * A class that represents a player
 * with different characteristics which can be affected in a story.
 */
public class Player {
    //represents the name of the player
    private String name;
    //represents a players health
    private int health;
    //represents a players score
    private int score;
    //represents the gold a player has
    private int gold;
    //A list of what the player has in its inventory
    private List<String> inventory;

    public Player(String name, int health, int score, int gold) {
        if (isValid(name)) {
            this.name = name;
        } else {
            throw new IllegalArgumentException("Invalid entry");
        }
        if (health < 0) {
            throw new IllegalArgumentException("Health can not be negative");
        } else {
            this.health = health;
        }
        this.score = score;
        this.gold = gold;
        this.inventory = new ArrayList<>();
    }

    /**
     * Returns the name of the player.
     * @return the name of the player
     */
    public String getName() {
        return name;
    }

    /**
     * Lets you add health to the players current health.
     * @param health The health which can be added
     */
    public void addHealth(int health) {
        this.health += health;
    }

    /**
     * Returns the health of the player.
     * @return the health of the player
     */
    public int getHealth() {
        return health;
    }

    /**
     * Lets you add points to the players current points.
     * @param points The points which gets added
     */
    public void addScore(int points) {
        this.score += points;
    }

    /**
     * Returns the score of the player.
     * @return the score of the player
     */
    public int getScore() {
        return score;
    }

    /**
     * Lets you add gold to the players current gold.
     * @param gold The gold which gets added.
     */
    public void addGold(int gold) {
        this.gold += gold;
    }

    /**
     * Returns the gold the player has.
     * @return the gold the player has
     */
    public int getGold() {
        return gold;
    }

    /**
     * Lets you add items to the players inventory.
     * @param item The item which gets added to the inventory
     */
    public void addToInventory(String item) {
        if (item == null) {
            throw new IllegalArgumentException("Item can not be null");
        } else {
            inventory.add(item);
        }
    }

    /**
     * Returns all the items in the inventory.
     * @return all the items in the inventory
     */
    public List<String> getInventory() {
        return inventory;
    }

    /**
     * Check that a String is valid by checking that it does not equal null or is empty.
     *
     * @param string to be checked if is valid
     * @return true on string not null or empty, false on string equals null or string is empty
     */
    public boolean isValid(String string) {
        return string != null && !string.isEmpty();
    }
}
