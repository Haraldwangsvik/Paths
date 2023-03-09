package no.ntnu.idatx2001.test;
import no.ntnu.idatx2001.Link;
import no.ntnu.idatx2001.Passage;
import no.ntnu.idatx2001.Story;
import org.junit.Test;

import java.util.HashMap;

import static org.junit.Assert.*;
public class StoryTest {

    @Test
    public void testGetTitle() {
        Passage passage = new Passage("title", "content");
        Story story = new Story("title", passage);

        assertEquals("title", passage.getTitle());
    }

    @Test
    public void testGetTitleWithNullValue() {
        try {
            Passage passage = new Passage("title", "content");
            Story story = new Story(null, passage);
            story.getTitle();
        } catch (IllegalArgumentException e) {
            assertTrue(true);
            e.getMessage();
        }
    }

    @Test
    public void testGetOpeningPassage() {
        Passage passage = new Passage("title", "content");
        Story story = new Story("title", passage);

        assertEquals(passage, story.getOpeningPassage());
    }

    @Test
    public void testGetOpeningPassageWithNullValue() {
        try {
            Passage passage = new Passage("title", "content");
            Story story = new Story(null, null);
            story.getOpeningPassage();
        } catch (IllegalArgumentException e) {
            assertTrue(true);
            e.getMessage();
        }
    }

    @Test
    public void testAddPassage() {
        Passage passage = new Passage("title", "content");
        Story story = new Story("title", passage);
        Link link = new Link("text", "reference");

        story.addPassage(passage);
    }



}
