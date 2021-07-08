package ucf.assignments;

import javafx.application.Application;
import javafx.beans.Observable;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.stage.FileChooser;
import javafx.stage.Stage;
import java.io.IOException;
import java.util.Date;

public class ListManagerController {
    private Item item = new Item();
    private ToDoList itemList = new ToDoList();
    @FXML
    private ListView<Item> toDoListItems;

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
        item.getItemStatus();
        item.getItemDueDate();
        item.getItemDescription();
        itemList.addItem(item);

    }

    public void clearButtonIsClicked(ActionEvent actionEvent) {
        itemList.clearList();
    }

    public void removeButtonIsClicked(ActionEvent actionEvent) {
        itemList.removeItem(item);
    }

    public void setItemStatus(ActionEvent actionEvent) {
        if (isComplete.isSelected()){
            item.setItemStatus(true);
        } else {
            item.setItemStatus(false);
        }
    }

    public void setItemDue(ActionEvent actionEvent) {
        item.setItemDueDate((itemDue.getValue()));
    }

    public void setItemDescription(ActionEvent actionEvent) {
        item.setItemDescription(itemDescription.getText());
    }

    public void openButtonIsClicked(ActionEvent actionEvent) {
        FileChooser fileChooser = new FileChooser();
        fileChooser.setTitle("Open Resource File");
        fileChooser.showOpenDialog(openButton.getScene().getWindow());
    }

    public void setToDoListItems(){
        //ObservableList<Item> list = FXCollections.observableArrayList(itemList.getItems());
        //toDoListItems.setItems(list);
    }
}
