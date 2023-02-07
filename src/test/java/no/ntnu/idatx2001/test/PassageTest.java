package no.ntnu.idatx2001.test;

import no.ntnu.idatx2001.Link;
import no.ntnu.idatx2001.Passage;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.*;

public class PassageTest {

    @Test
    public void testGetTitle() {
        Passage passage = new Passage("Gold sword", "You found a gold sword");

        assertEquals("Gold sword", passage.getTitle());
        assertNotEquals("", passage.getTitle());
        assertNotEquals("Silver sword", passage.getTitle());
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
        Link link = new Link("Test text", "reference1");
        Passage passage = new Passage("Gold sword", "You found a gold sword");

        ArrayList<Link> links = new ArrayList<Link>();

        passage.addLink(link);
    }

    @Test
    public void testGetLinks() {
        Link link = new Link("Test text", "reference1");
        Passage passage = new Passage("Gold sword", "You found a gold sword");


    }

    @Test
    public void testHasLinks() {

    }

}
