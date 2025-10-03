package cs151.application;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.stage.Stage;

import java.io.IOException;

public class MainController {
    @FXML
    private Label welcomeText;

    @FXML
    protected void onDPLButtonClick() {
        try {
            // Load the new FXML file
            FXMLLoader loader = new FXMLLoader(getClass().getResource("DefineProgrammingLanguages.fxml"));
            Parent root = loader.load();

            // Get the current stage from the welcomeText label
            Stage stage = (Stage) welcomeText.getScene().getWindow();

            // Set the new scene
            stage.setScene(new Scene(root));
            stage.setTitle("Define Programming Languages");
            stage.show();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}