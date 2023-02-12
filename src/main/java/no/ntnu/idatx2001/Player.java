package no.ntnu.idatx2001;

import java.io.StringReader;
import java.util.List;

public class Player {
    private String name;
    private int health;
    private int score;
    private int gold;
    private List<String> inventory;

    public Player(String name, int health, int score, int gold) {
        if (name.isBlank()) {
            IllegalArgumentException e = new IllegalArgumentException();
            e.printStackTrace();
            System.out.println("Name cannot be empty!");
        } else {
            this.name = name;
        }
        if (health < 0) {
            this.health = 0;
        } else {
            this.health = health;
        }
        this.score = score;
        this.gold = gold;
    }

    public String getName() {
        return name;
    }

    public int getHealth() {
        return health;
    }

    public int getScore() {
        return score;
    }

    public int getGold() {
        return gold;
    }

    public List<String> getInventory() {
        return inventory;
    }
}
