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
   * text: "text" and reference "reference, and then checking that these values
   * are called "text" and "reference".
   */
  @Test
  public void testCreationOfLinkWithValidParameter()
  {
    Link link = new Link("text", "reference");
    assertEquals("text", link.getText());
    assertEquals("reference", link.getReference());
  }

  /**
   * Testing creation of Link with null as input for the text variable and that it returns
   * an illegal argument exception.
   */
  @Test
  public void testCreationOfLinkWithTextAsNull() {
    try {
      Link link = new Link(null, "reference");
    } catch (IllegalArgumentException e) {
      assertTrue(true);
      e.getMessage();
    }
  }

  /**
   * Testing creation of Link with null as input for the reference variable and that it returns
   * an illegal argument exception.
   */
  @Test
  public void testCreationOfLinkWithReferenceAsNull() {
    try {
      Link link = new Link("text", null);
    } catch (IllegalArgumentException e) {
      assertTrue(true);
      e.getMessage();
    }
  }
}
