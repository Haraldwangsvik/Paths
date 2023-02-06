package no.ntnu.idatx2001;

import java.util.List;

public class Link {

  // A describing text that indicated a choice or an action in a story.
  // The text is the part of Link which is visible for the player.
  private String text;

  // A string that identifies a passage (a part of a story).
  private String reference;

  // A list with special objects that makes it possible to affect the features of a player.
  private List<Action> actions;

  public Link(String text, String reference) {
    if (text.isBlank()) {
      IllegalArgumentException e = new IllegalArgumentException();
      e.printStackTrace();
      System.out.println("text can not be null");
    } else {
      this.text = text;
    }

    if (reference.isBlank()) {
      IllegalArgumentException e = new IllegalArgumentException();
      e.printStackTrace();
      System.out.println("text can not be null");
    } else {
      this.reference = reference;
    }
  }

  


}
