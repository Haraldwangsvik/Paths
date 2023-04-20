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

    /**
     * Testing that a valid passage is added to story
     */
    @Test
    public void testAddPassage() {
        Passage passage = new Passage("title", "content");
        Story story = new Story("title", passage);
        Link link = new Link("title", "title");

        story.addPassage(passage);

        assertEquals(story.getPassage(link), passage);
    }
    @Test
    public void testAddSeveralPassage() {
        Passage passage = new Passage("title", "content");
        Passage passage1 = new Passage("title1", "content1");
        Story story = new Story("title", passage);
        Link link = new Link("title", "title");

        story.addPassage(passage);
        story.addPassage(passage1);
        assertEquals(2, story.getPassages().size());
    }

    /**
     * Testing that an attempt of adding an invalid passage return
     * an illegal argument exception
     */
    @Test
    public void testAddInvalidPassage() {
        try {
            Story story = new Story("title", null);
            Link link = new Link("title", "title");
            Passage passage = new Passage("title", null);

            story.addPassage(passage);
        } catch (IllegalArgumentException e) {
            assertTrue(true);
            e.getMessage();
        }
    }

    @Test
    public void testGetPassages() {
        Passage passage = new Passage("title", "content");
        Passage passage1 = new Passage("title1", "content1");
        Story story = new Story("title", passage);
        Link link = new Link("title", "title");

        story.addPassage(passage);
        assertEquals(1, story.getPassages().size());
    }
}