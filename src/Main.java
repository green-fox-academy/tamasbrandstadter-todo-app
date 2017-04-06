import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

public class Main {


  public static void main(String[] args) {

    if(args.length == 0) {
      printUsage();
    } else if (args[0].equals("-l")) {
      listTasks();
      }
    }

  private static void listTasks() {
    Path path = Paths.get("data.csv");
    try {
      List<String> data = Files.readAllLines(path);
      if (data.size() == 0) {
        System.out.println("No todos for today! :)");
      } else {
        for (int i = 0; i < data.size(); i++) {
          System.out.println(i+1 + " - " + data.get(i));
        }
      }
    } catch (IOException ex) {
      ex.printStackTrace();
      System.out.println("Error.");
    }
  }




  public static void printUsage() {
    Path path = Paths.get("usageinfos.txt");
    try {
      List<String> usageInfos = Files.readAllLines(path);
      for (int i = 0; i < usageInfos.size(); i++) {
        System.out.println(usageInfos.get(i));
      }
    } catch (IOException ex) {
      ex.printStackTrace();
      System.out.println("Error.");
    }


  }


}









