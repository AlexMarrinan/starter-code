package edu.wpi.teamname.Controllers;

import io.github.palexdev.materialfx.controls.MFXTextField;
import java.io.IOException;
import java.sql.*;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.text.Text;

public class ExampleController {
  @FXML Button ClickButton; // fx:ID of the button in the ExampleFXML
  @FXML Text nameDisplay;
  @FXML MFXTextField textField;

  /** Method run when controller is initializes */
  public void initialize() {
    nameDisplay.setVisible(false);
  }

  /**
   * When the button is clicked,
   *
   * @param actionEvent event that triggered method
   * @throws IOException
   */
  public void buttonClicked(ActionEvent actionEvent) {
    String name = textField.getText();
    System.out.println("Name submitted");
    nameDisplay.setText("Hello " + name + "\n");
    nameDisplay.setVisible(true);
  }
}
