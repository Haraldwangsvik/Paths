package no.ntnu.idatx2001;


import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class FileHandler {

  public static void importFromTXT(File file) throws IOException {
    Scanner sc = new Scanner(file);

    while (sc.hasNextLine()) {
      int i = sc.nextInt();

    }
  }
}
