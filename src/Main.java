import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

public class Main {

  private final static String FILE_NAME = "data.csv";
  private final static String USAGE_INFOS = "usageinfos.txt";

  public static void main(String[] args) {
    List<String> rawLines;
    List<String> usageInfoLines;
    List<String> listLines;



    if (args[0].equals("-l")) {
      listLines = readLinesFromData();
      splitFile(listLines);
    } else if (args.length == 0) {
      rawLines = readLinesFromTxt();
      splitFile(rawLines);
    }
  }


  public static List<String> readLinesFromTxt() {
    Path path = Paths.get(USAGE_INFOS);
    List<String> rawLines;
    try {
      rawLines = Files.readAllLines(path);
    } catch (IOException ex) {
      ex.printStackTrace();
      rawLines = new ArrayList<>();
    }
    return rawLines;
  }


  public static List<String> readLinesFromData() {
    Path path2 = Paths.get(FILE_NAME);
    List<String> fileNameLines;
    try {
      fileNameLines = Files.readAllLines(path2);
    } catch (IOException ex) {
      ex.printStackTrace();
      fileNameLines = new ArrayList<>();
    }
    return fileNameLines;
  }

  public static void writeLinesToFile(List<String> inputText) {
    Path path = Paths.get(FILE_NAME);
    try {
      Files.write(path, inputText);
    } catch (IOException ex) {
      ex.printStackTrace();
    }
  }

  public static void splitFile(List<String> rawLines) {
    for (String line : rawLines) {
      System.out.println(line);
    }

  }
}




