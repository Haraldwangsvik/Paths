package no.ntnu.idatx2001.test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertThrows;
import static org.junit.Assert.assertTrue;

import no.ntnu.idatx2001.Link;
import org.junit.Test;

public class LinkTest {

  @Test
  public void testCreationOfLinkWithValidParameter()
  {
    Link link = new Link("text", "reference");
    assertEquals("text", link.getText());
    assertEquals("reference", link.getReference());
  }

  @Test
  public void testCreationOfLinkWithTextAsNull() {
    Link link = new Link(null, "reference");
    Exception exception = assertThrows(IllegalArgumentException.class, () ->
    {
      Integer.parseInt("1a");
    } );

    String expectedMessage = "Invalid entry";
    String actualMessage = exception.getMessage();

    assertTrue(actualMessage.contains(expectedMessage));
  }

}
