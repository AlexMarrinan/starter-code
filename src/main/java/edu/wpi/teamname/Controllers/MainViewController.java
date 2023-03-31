package edu.wpi.teamname.Controllers;

import io.github.palexdev.materialfx.controls.MFXButton;
import java.io.File;
import java.io.IOException;
import java.sql.*;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.layout.AnchorPane;
import javafx.scene.text.Text;
import javafx.stage.FileChooser;
import javafx.stage.Stage;

public class MainViewController {
  @FXML MFXButton InteriorButton; // fx:ID of the button in the ExampleFXML
  @FXML MFXButton ExteriorButton; // fx:ID of the button in the ExampleFXML

  @FXML AnchorPane anchorpane;

  @FXML Text interiorSelected;

  @FXML Text exteriorSelected;

  @FXML MFXButton graphButton;

  private Connection connection = null; // connection to database

  private File interiorFile = null;
  private File exteriorFile = null;

  /** Method run when controller is initializes */
  public void initialize() {
    updateScreen();
  }

  /**
   * When the interior button is clicked, the method will run the file explorer and record the
   * interior temp CSV location
   *
   * @param actionEvent event that triggered method
   * @throws IOException
   */
  public void interiorButtonClicked(ActionEvent actionEvent) throws IOException {
    interiorFile = runFileExplorer("Interior");
    updateScreen();
  }

  /**
   * When the exterior button is clicked, the method will run the file explorer and record the
   * exterior temp CSV location
   *
   * @param actionEvent event that triggered method
   * @throws IOException
   */
  public void exteriorButtonClicked(ActionEvent actionEvent) throws IOException {
    exteriorFile = runFileExplorer("Exterior");
    updateScreen();
  }

  public void GraphButtonPressed(ActionEvent actionEvent) throws IOException {}

  private File runFileExplorer(String intExt) {
    // Set up file explorer
    FileChooser fileChooser = new FileChooser();
    fileChooser.setTitle("Open " + intExt + " CSV");

    // Set extension filter
    FileChooser.ExtensionFilter extFilter =
        new FileChooser.ExtensionFilter("CSV files (*.csv)", "*.csv");
    fileChooser.getExtensionFilters().add(extFilter);

    // display file explorer
    Stage stage = (Stage) anchorpane.getScene().getWindow();

    // Return selected file
    File file = fileChooser.showOpenDialog(stage);

    return file;
  }

  private void updateScreen() {
    if (interiorFile != null && exteriorFile != null) graphButton.setDisable(false);
    else graphButton.setDisable(true);

    if (interiorFile != null) interiorSelected.setVisible(true);
    else interiorSelected.setVisible(false);

    if (exteriorFile != null) exteriorSelected.setVisible(true);
    else exteriorSelected.setVisible(false);
  }
}
