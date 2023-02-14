package no.ntnu.idatx2001.test;

import static org.junit.Assert.assertEquals;

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

}
