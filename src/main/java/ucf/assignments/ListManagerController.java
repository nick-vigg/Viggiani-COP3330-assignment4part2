package ucf.assignments;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.stage.FileChooser;
import javafx.stage.Stage;

import java.io.IOException;

public class ListManagerController {
    @FXML
    private ListView<?> toDoListItems;

    @FXML
    private Button addButton;

    @FXML
    private Button clearButton;

    @FXML
    private Button removeButton;

    @FXML
    private TextField itemDescription;

    @FXML
    private RadioButton isComplete;

    @FXML
    private DatePicker itemDue;

    @FXML
    private RadioButton showCompleteItems;

    @FXML
    private ListView<?> completeItems;

    @FXML
    private Button openButton;


    public void addButtonIsClicked(ActionEvent actionEvent) {
    }

    public void clearButtonIsClicked(ActionEvent actionEvent) {
    }

    public void removeButtonIsClicked(ActionEvent actionEvent) {
    }

    public void setItemStatus(ActionEvent actionEvent) {
    }

    public void setItemDue(ActionEvent actionEvent) {
    }

    public void setItemDescription(ActionEvent actionEvent) {
    }

    public void openButtonIsClicked(ActionEvent actionEvent) {
        FileChooser fileChooser = new FileChooser();
        fileChooser.setTitle("Open Resource File");
        fileChooser.showOpenDialog(openButton.getScene().getWindow());

    }
}