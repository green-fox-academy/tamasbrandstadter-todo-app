import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

public class Main {

  private final static String FILE_NAME = "data.csv";

  public static void main(String[] args) {
    List<String> rawLines = readLinesFromFile();
  }


  public static List<String> readLinesFromFile() {
    Path path = Paths.get(FILE_NAME);
    List<String> rawLines;

    try {
      rawLines = Files.readAllLines(path);
    } catch (IOException ex) {
      ex.printStackTrace();
      rawLines = new ArrayList<>();
    }

    return rawLines;

  }
}
