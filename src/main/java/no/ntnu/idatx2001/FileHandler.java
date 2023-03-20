package no.ntnu.idatx2001;


import java.io.File;
import java.io.IOException;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class FileHandler {

  //The title of the story
  static String title;
  static Passage currentPassage;

  static List<Link> options = new LinkedList<>();

  public static void importFile(File file) throws IOException {
    Scanner sc = new Scanner(file);
    title = sc.next();
    while (sc.hasNext()) {
      if (sc.next().startsWith("::")) {
        String passageTitle = sc.next();
        String passageContent = sc.next();
        currentPassage = new Passage(passageTitle, passageContent);

        while (!sc.next().isEmpty()) {
            String input = sc.next();
            String words[] = input.split("[] (]");

            String linkText = words[0].replaceAll("[\\[\\]]", "");
            String linkReference = words[1].replaceAll("[()]", "");

            options.add(new Link(linkText, linkReference));
        }

      }

    }
    Story story = new Story(title, currentPassage);
  }
}
