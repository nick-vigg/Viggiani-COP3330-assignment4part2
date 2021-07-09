package ucf.assignments;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.*;
import javafx.stage.FileChooser;

public class ListManagerController {
    private ToDoList itemList = new ToDoList();
    @FXML
    private ListView<String> toDoListItems;

    @FXML
    private TextField itemDescription;

    @FXML
    private RadioButton isComplete;

    @FXML
    private DatePicker itemDue;

    @FXML
    private RadioButton showCompleteItems;

    @FXML
    private ListView<String> completeItems;

    @FXML
    private Button openButton;

    public void addButtonIsClicked(ActionEvent actionEvent) {
        Item item = new Item();
        item.setItemDescription(itemDescription.getText());
        item.setItemDueDate((itemDue.getValue()));
        if (isComplete.isSelected()){
            item.setItemStatus(true);
        } else {
            item.setItemStatus(false);
        }
        itemList.addItem(item);
        setToDoListItems();

    }

    public void clearButtonIsClicked(ActionEvent actionEvent) {
        itemList.clearList();
    }

    public void removeButtonIsClicked(ActionEvent actionEvent) {
        //itemList.removeItem(item);
    }

    public void setItemStatus(ActionEvent actionEvent) {
        if (showCompleteItems.isSelected()){
            ObservableList<String> list = FXCollections.observableArrayList(itemList.isComplete());
            completeItems.setItems(list);
        } else {
            ObservableList<String> list = FXCollections.observableArrayList(itemList.isIncomplete());
            completeItems.setItems(list);
        }
    }

    public void openButtonIsClicked(ActionEvent actionEvent) {
        FileChooser fileChooser = new FileChooser();
        fileChooser.setTitle("Open Resource File");
        fileChooser.showOpenDialog(openButton.getScene().getWindow());
    }

    public void setToDoListItems(){
        ObservableList<String> titleList = FXCollections.observableArrayList(itemList.getTitles());
        toDoListItems.setItems(titleList);
        ObservableList<String> completeList = FXCollections.observableArrayList(itemList.isIncomplete());
        completeItems.setItems(completeList);
    }
}