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
        Passage passage = new Passage("title", "content");
        Link link = new Link("text", "reference");

        boolean result = passage.addLink(link);

        assertTrue(result);
    }

    @Test
    public void testAddLinkWithLinkNull() {
        Passage passage = new Passage("title","content");
        try {
            passage.addLink(null);
        } catch (IllegalArgumentException e) {
            assertTrue(true);
            e.getMessage();
        }
    }

    @Test
    public void testGetLinks() {
        Passage passage = new Passage("title", "content");
        Link link = new Link("text", "reference");
        Link link2 = new Link("text2", "reference2");

        passage.addLink(link);
        passage.addLink(link2);

        assertTrue(passage.getLinks().contains(link));
        assertTrue(passage.getLinks().contains(link2));
        assertEquals(2, passage.getLinks().size());
    }

    @Test
    public void testHasLinks() {
        Passage passage = new Passage("title", "content");
        Link link = new Link("text", "reference");
        Link link2 = new Link("text2", "reference2");

        passage.addLink(link);
        passage.addLink(link2);

        assertTrue(passage.hasLinks());
    }
}