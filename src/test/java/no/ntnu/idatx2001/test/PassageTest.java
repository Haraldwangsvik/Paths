package no.ntnu.idatx2001.test;

import no.ntnu.idatx2001.Link;
import no.ntnu.idatx2001.Passage;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.*;

public class PassageTest {

    @Test
    public void testGetTitleAndContent() {
        Passage passage = new Passage("Gold sword", "You found a gold sword");

        assertEquals("Gold sword", passage.getTitle());
        assertEquals("You found a gold sword", passage.getContent());
        assertNotEquals("", passage.getTitle());
        assertNotEquals("Silver sword", passage.getTitle());
    }
    @Test
    public void testGetTitleWithTitleAsNull() {
        try {
            Passage passage = new Passage(null, "content");
        } catch (IllegalArgumentException e) {
            assertTrue(true);
            e.getMessage();
        }
    }

    @Test
    public void testGetTitleWithContentAsNull() {
        try {
            Passage passage = new Passage("Gold sword", null);
        } catch (IllegalArgumentException e) {
            assertTrue(true);
            e.getMessage();
        }
    }

    @Test
    public void testGetContent() {
        Passage passage = new Passage("Gold sword", "You found a gold sword");

        assertEquals("You found a gold sword", passage.getContent());
        assertNotEquals("", passage.getContent());
        assertNotEquals("You found a silver sword", passage.getContent());
    }

    @Test
    public void testAddLink() {
        List<Link> list = new ArrayList<Link>();

        Link link = new Link("text", "reference");
        Passage passage = new Passage("Gold sword", "You found a gold sword");

        list.add(link);
    }

    @Test
    public void testGetLinks() {
        List<Link> list = new ArrayList<Link>();

        Link link = new Link("text", "reference");
        Passage passage = new Passage("Gold sword", "You found a gold sword");

        list.add(link);
        assertEquals(1, passage.getLinks());
    }

    @Test
    public void testHasLinks() {
        List<Link> list = new ArrayList<Link>();

        Link link = new Link("text", "reference");
        Passage passage = new Passage("Gold sword", "You found a gold sword");

        list.add(link);
    }

}
