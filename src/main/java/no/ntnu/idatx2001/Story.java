package no.ntnu.idatx2001;

import java.util.Collection;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
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

    /**
     * Removes a given passage from passages. The passage can't be removed if there is other passages linked to it.
     *
     * @param link to the passage to be removed
     * @return true on passage removed, false if passage not removed
     */
    public boolean removePassage(Link link) {

        boolean linksToOtherPassages = new HashSet<>(passages.values()).size() != passages.size();
        if (linksToOtherPassages) {
            passages.remove(link);
        }
        return linksToOtherPassages;
    }

    /**
     * Find and return a list of links that refers to a passage not found in passages.
     *
     * @return list of dead links
     */
    public List<Link> getBrokenLinks() {
        List<Link> deadLinks = new LinkedList<>();

        for ( Link link : passages.keySet()) {
            if(!passages.containsValue(link.getReference())) {
                deadLinks.add(link);
            }
        }

        return deadLinks;
    }
}
