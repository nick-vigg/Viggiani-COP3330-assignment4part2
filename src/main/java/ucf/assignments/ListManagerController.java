package ucf.assignments;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.*;
import javafx.stage.FileChooser;

import java.time.LocalDate;

public class ListManagerController {
    private final ToDoList itemList = new ToDoList();
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

    @FXML
    private ListView<LocalDate> toDoListDates;

    public void addButtonIsClicked(ActionEvent actionEvent) {
        //creates a new item to add to the to do list
        //sets values for the item
        //reset displays to default
        Item item = new Item();
        item.setItemDescription(itemDescription.getText());
        item.setItemDueDate((itemDue.getValue()));
        item.setItemStatus(isComplete.isSelected());
        itemList.addItem(item);
        setToDoListItems();
        resetInputs();
    }

    public void clearButtonIsClicked(ActionEvent actionEvent) {
        //all items are cleared from the lists
        itemList.clearList();
        toDoListItems.getItems().clear();
        completeItems.getItems().clear();
        toDoListDates.getItems().clear();
        resetInputs();
    }

    public void removeButtonIsClicked(ActionEvent actionEvent) {
        //item is removed from the to do list
        itemList.removeItem(toDoListItems.getSelectionModel().getSelectedIndex());
        setToDoListItems();
        resetInputs();
    }

    public void setItemStatus(ActionEvent actionEvent) {
        //user inputs item status
        if (showCompleteItems.isSelected()) {
            ObservableList<String> list = FXCollections.observableArrayList(itemList.isComplete());
            completeItems.setItems(list);
        } else {
            ObservableList<String> list = FXCollections.observableArrayList(itemList.isIncomplete());
            completeItems.setItems(list);
        }
    }

    public void openButtonIsClicked(ActionEvent actionEvent) {
        //allows for user input to be saved to or loaded from a file
        FileChooser fileChooser = new FileChooser();
        fileChooser.setTitle("Open Resource File");
        fileChooser.showOpenDialog(openButton.getScene().getWindow());
    }

    public void setToDoListItems() {
        //sets displays for listViews
        ObservableList<String> titleList = FXCollections.observableArrayList(itemList.getTitles());
        toDoListItems.setItems(titleList);
        ObservableList<String> completeList = FXCollections.observableArrayList(itemList.isIncomplete());
        completeItems.setItems(completeList);
        ObservableList<LocalDate> dateList = FXCollections.observableArrayList(itemList.getDates());
        toDoListDates.setItems(dateList);
    }

    public void resetInputs() {
        //resets displays to default for user
        itemDescription.clear();
        itemDue.setValue(null);
        isComplete.setSelected(false);
        showCompleteItems.setSelected(false);
    }

    public void editButtonIsClicked(ActionEvent actionEvent) {
        //user selects an item from the list to edit
        //items data loads to input boxes to be changed by user
        //removes editable from list
        itemDescription.setText(toDoListItems.getSelectionModel().getSelectedItem());
        itemDue.setValue(itemList.getDates().get(toDoListItems.getSelectionModel().getSelectedIndex()));
        isComplete.setSelected(itemList.getComplete().get(toDoListItems.getSelectionModel().getSelectedIndex()));
        itemList.removeItem(toDoListItems.getSelectionModel().getSelectedIndex());
        setToDoListItems();
    }
}