package Entities;

import WocFridgeCode.Entities.CSVParser;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class CSVTest {

  String filePath = "";

  @BeforeEach
  public void setup() {
    filePath =
        "D:\\ClassStuff\\FridgeData\\MOCREO_ST4_Exterior _(03_20_2023, 03_21_2023)_record.csv";
  }

  @Test
  public void testCSV() {
    CSVParser data = new CSVParser();
    data.parseFile(filePath);
  }
}
