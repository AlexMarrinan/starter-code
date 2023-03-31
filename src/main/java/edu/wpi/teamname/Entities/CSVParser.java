package edu.wpi.teamname.Entities;

import java.io.IOException;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Map;

public class CSVParser {

    public void parseFile(String filePath){
        try {
            getTemps(filePath);
        } catch (IOException e) {
            e.printStackTrace();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public ArrayList<String> getTemps(String filePath) throws IOException, SQLException{

        return null;
    }

}
