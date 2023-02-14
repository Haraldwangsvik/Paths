package no.ntnu.idatx2001;

import java.util.List;
import java.util.Objects;

public class Link {

  // A describing text that indicated a choice or an action in a story.
  // The text is the part of Link which is visible for the player.
  private String text;

  // A string that identifies a passage (a part of a story).
  private String reference;

  // A list with special objects that makes it possible to affect the features of a player.
  private List<Action> actions;

  /**
   * Creates an instance of Link by taking in text and reference
   *
   * @param text a describing text that indicates a choice or an action in a story.
   *             The text is the part of Link which is visible for the player.
   * @param reference A string that identifies a passage (a part of a story).
   */
  public Link(String text, String reference) {
    if (isValid(text) && isValid(reference)) {
      this.text = text;
      this.reference = reference;
    } else {
      IllegalArgumentException e = new IllegalArgumentException("Invalid entry");
      throw e;
    }
  }

  /**
   * Return the text of this link
   * @return the text of this link
   */
  public String getText() {
    return this.text;
  }

  /**
   * Return the reference of this link
   * @return the reference of this link
   */
  public String getReference() {
    return this.reference;
  }

  /**
   * Add an action to the action list
   */
  public void addAction(Action newAction) {
    actions.add(newAction);
  }

  /**
   * Return the list of actions
   * @return the list of actions
   */
  public List<Action> getActions() {
    return actions;
  }

  public boolean isValid(String s) {
    return s != null && !s.isEmpty();
  }

  /**
   * Return a formatted string, including all information about a link
   * @return a formatted string, including all information about a link
   */
  @Override
  public String toString() {
    return "Link{" +
        "text='" + text + '\'' +
        ", reference='" + reference + '\'' +
        ", actions=" + actions +
        '}';
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Link link = (Link) o;
    return Objects.equals(text, link.text) &&
        Objects.equals(reference, link.reference) &&
        Objects.equals(actions, link.actions);
  }

  @Override
  public int hashCode() {
    return Objects.hash(text, reference, actions);
  }
}


