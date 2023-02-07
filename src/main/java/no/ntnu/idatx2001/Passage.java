package no.ntnu.idatx2001;

import java.util.List;
import java.util.Objects;

/**
 * A class that represents a smaller part of a story.
 * Can go from a passage to another through a link.
 */
public class Passage {
    //title is a description that also acts as an identifier.
    private String title;
    //content is text where the content represents a paragraph or part of a dialogue.
    private String content;
    //links connect this passage to other passages.
    private List<Link> links;

    public Passage(String title, String content) {

        if (title.isBlank()) {
            IllegalArgumentException e = new IllegalArgumentException();
            e.printStackTrace();
            System.out.println("Title cannot be empty!");
        } else {
            this.title = title;
        }

        if (content.isBlank()) {
            IllegalArgumentException e = new IllegalArgumentException();
            e.printStackTrace();
            System.out.println("Content cannot be empty!");
        } else {
            this.content = content;
        }
    }

    /**
     * Returns the title of the passage.
     * @return the title of the passage
     */
    public String getTitle() {
        return title;
    }

    /**
     * Returns the content of the passage.
     * @return the content of the passage
     */
    public String getContent() {
        return content;
    }

    /**
     * Returns true if link is added.
     * False if link is equal to null.
     * @param link the link added.
     * @return true if link is added, false if link is null.
     */
    public boolean addLink(Link link) {
        if(link != null)  {
            this.links.add(link);

            return true;

        } else {
            return false;
        }
    }

    /**
     * Returns the links in the list.
     * @return the links in the list
     */
    public List<Link> getLinks() {
        return links;
    }

    /**
     * Checks if the list has any
     * links in it.
     * Returns true if there are links in list
     * and false if empty.
     * @return true if links in list, false if empty
     */
    public boolean hasLinks() {
        if(links.isEmpty()) {
            return false;
        } else {
            return true;
        }
    }

    /**
     * Returns information about the passage.
     * @return information about the passage
     */
    @Override
    public String toString() {
        return "Passage{" +
                "title='" + title + '\'' +
                ", content='" + content + '\'' +
                ", links=" + links +
                '}';
    }

    /**
     * Returns a true if this == object
     * False if object == null.
     * @param object the object it checks for.
     * @return a boolean based on the object
     */
    @Override
    public boolean equals(Object object) {
        if (this == object) return true;
        if (object == null || getClass() != object.getClass()) return false;
        Passage passage = (Passage) object;
        return Objects.equals(title, passage.title) && Objects.equals(content, passage.content) && Objects.equals(links, passage.links);
    }

    /**
     * Returns objects title, content and links.
     * @return objects title, content, links
     */
    @Override
    public int hashCode() {
        return Objects.hash(title, content, links);
    }
}
