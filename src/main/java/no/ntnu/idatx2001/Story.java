package no.ntnu.idatx2001;

import java.util.Collection;
import java.util.Map;

/**
 * A class that represents a story.
 * Consists of a collection of passages.
 */
public class Story {
    //The stories title
    private final String title;
    //A Map containing the passage of the story,
    //where the key to each passage is a link
    private Map<Link, Passage> passages;
    //The first passage in the story.
    //Object must be added in passages
    private final Passage openingPassage;

    public Story(String title, Passage openingPassage) {
        if (title.isBlank()) {
            throw new IllegalArgumentException("Title cannot be blank!");
        } else {
            this.title = title;
        }

        this.openingPassage = openingPassage;
    }

    /**
     * Returns the title of the story.
     * @return the title of the story
     */
    public String getTitle() {
        return title;
    }

    /**
     * Returns the first passage of the story.
     * @return the first passage of the story
     */
    public Passage getOpeningPassage() {
        return openingPassage;
    }

    /**
     * Lets you add passage to the story.
     * @param passage the passage added to the story
     */
    public void addPassage(Passage passage) {
        Link link = new Link(title, title);
        this.passages.put(link, passage);
    }

    /**
     * Returns passage using link object.
     * @param link The link object
     * @return passage using link object
     */
    public Passage getPassage(Link link) {
        return this.passages.get(link);
    }

    /**
     * Returns all the passages.
     * @return all the passages
     */
    public Collection<Passage> getPassages() {
        return passages.values();
    }
}
