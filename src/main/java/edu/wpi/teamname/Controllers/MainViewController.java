package edu.wpi.teamname.Controllers;

import io.github.palexdev.materialfx.controls.MFXButton;
import java.io.IOException;
import java.sql.*;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;

public class MainViewController {
  @FXML MFXButton InteriorButton; // fx:ID of the button in the ExampleFXML
  @FXML MFXButton ExteriorButton; // fx:ID of the button in the ExampleFXML

  private Connection connection = null; // connection to database

  private String interiorFile = "";
  private String exteriorFile = "";

  /** Method run when controller is initializes */
  public void initialize() {}

  /**
   * When the interior button is clicked, the method will run the file explorer and record the
   * interior temp CSV location
   *
   * @param actionEvent event that triggered method
   * @throws IOException
   */
  public void interiorButtonClicked(ActionEvent actionEvent) throws IOException {
    System.out.println("Interior button was clicked");
  }

  /**
   * When the exterior button is clicked, the method will run the file explorer and record the
   * exterior temp CSV location
   *
   * @param actionEvent event that triggered method
   * @throws IOException
   */
  public void exteriorButtonClicked(ActionEvent actionEvent) throws IOException {
    System.out.println("Exterior button was clicked");
  }

  public void runFileExplorer() {
    System.out.println("Running file explorer");
  }
}
