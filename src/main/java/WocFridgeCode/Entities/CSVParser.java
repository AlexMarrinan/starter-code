package WocFridgeCode.Entities;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class CSVParser {

  //    public void parseFile(String filePath){
  //        try {
  //            getTemps(filePath);
  //        } catch (IOException e) {
  //            e.printStackTrace();
  //        } catch (SQLException e) {
  //            e.printStackTrace();
  //        }
  //    }
  //
  //    public ArrayList<String> getTemps(String filePath) throws IOException, SQLException{
  //
  //        return null;
  //    }

  public static void parseFile(String filePath) {

    // Initialize the scanner to read the file
    Scanner scanner = null;
    try {
      scanner = new Scanner(new File(filePath));
    } catch (FileNotFoundException e) {
      e.printStackTrace();
    }

    // Loop through each line in the file
    while (scanner.hasNextLine()) {

      // Parse the line using the comma delimiter
      String[] line = scanner.nextLine().split(",");

      // Print each value in the line
      for (String value : line) {
        System.out.print(value + " ");
      }

      // Print a newline character to separate each line
      System.out.println();
    }

    // Close the scanner when finished
    scanner.close();
  }
}
