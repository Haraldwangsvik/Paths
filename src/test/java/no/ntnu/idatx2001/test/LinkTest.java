package no.ntnu.idatx2001.test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertThrows;
import static org.junit.Assert.assertTrue;

import java.lang.reflect.Executable;
import no.ntnu.idatx2001.Link;
import org.junit.Test;

public class LinkTest {

  /**
   * Testing creation of Link class with valid input by calling
   * text: "text" and reference "reference, and then checking that it equals
   */
  @Test
  public void testCreationOfLinkWithValidParameter()
  {
    Link link = new Link("text", "reference");
    assertEquals("text", link.getText());
    assertEquals("reference", link.getReference());
  }

  @Test
  public void testCreationOfLinkWithTextAsNull() {
    try {
      Link link = new Link(null, "reference");
    } catch (IllegalArgumentException e) {
      assertTrue(true);
      e.getMessage();
    }
  }

  @Test
  public void testCreationOfLinkWithReferenceAsNull() {
    try {
      Link link = new Link("text", null);
    } catch (IllegalArgumentException e) {
      assertTrue(true);
      e.getMessage();
    }
  }

  @Test
  public void testGetMethods() {
    Link link = new Link("text", "reference");
    assertEquals("text", link.getText());
    assertEquals("reference", link.getReference());
  }
}
