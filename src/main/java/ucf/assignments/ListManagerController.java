/*
 *  UCF COP3330 Summer 2021 Assignment 4 Solution
 *  Copyright 2021 Nicholas Viggiani
 */
package ucf.assignments;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.scene.control.DatePicker;
import javafx.scene.control.ListView;
import javafx.scene.control.RadioButton;
import javafx.scene.control.TextField;

import java.time.LocalDate;
import java.util.ArrayList;

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
    private ListView<LocalDate> toDoListDates;

    public void addButtonIsClicked() {
        //creates a new item to add to the to do list
        //sets values for the item
        //reset displays to default
        Item item = new Item();
        item.setItemDescription(itemDescription.getText());
        if (itemDue.getValue() != null) {
            item.setItemDueDate((itemDue.getValue()));
        } else {
            item.setItemDescription("ERROR, Input valid date");
        }
        item.setItemStatus(isComplete.isSelected());
        itemList.addItem(item);
        setToDoListItems();
        resetInputs();
    }

    public void openButtonIsClicked() {
        //allows for user input to be loaded from a file
        //Filters the openable files to only .txt files;
        String path = FileManager.promptOpenFile();
        ArrayList<String> fileList = FileManager.readFromFile(path);
        if (!path.equals("")) {
            for (int i = 0; i < fileList.size(); i++) {
                Item item = new Item();
                item.fileToItem(fileList, i);
                itemList.addItem(item);
            }
        }
        setToDoListItems();
    }

    public void clearButtonIsClicked() {
        //all items are cleared from the lists
        itemList.clearList();
        toDoListItems.getItems().clear();
        completeItems.getItems().clear();
        toDoListDates.getItems().clear();
        resetInputs();
    }

    public void removeButtonIsClicked() {
        //item is removed from the to do list
        try {
            if (toDoListItems.getSelectionModel().isEmpty()) {
                itemList.removeItem(toDoListDates.getSelectionModel().getSelectedIndex());

            } else {
                itemList.removeItem(toDoListItems.getSelectionModel().getSelectedIndex());
            }

        } catch (IndexOutOfBoundsException e) {
            Item item = new Item();
            item.setItemDescription("ERROR, Select item to remove");
            itemList.addItem(item);
        }
        setToDoListItems();
        resetInputs();
    }

    public void setItemStatus() {
        //user inputs item status
        if (showCompleteItems.isSelected()) {
            ObservableList<String> list = FXCollections.observableArrayList(itemList.isComplete());
            completeItems.setItems(list);
        } else {
            ObservableList<String> list = FXCollections.observableArrayList(itemList.isIncomplete());
            completeItems.setItems(list);
        }
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

    public void editButtonIsClicked() {
        //user selects an item from the list to edit
        //items data loads to input boxes to be changed by user
        //removes editable from list
        try {
            if (!toDoListItems.getSelectionModel().isEmpty()) {
                itemDescription.setText(toDoListItems.getSelectionModel().getSelectedItem());
                itemDue.setValue(itemList.getDates().get(toDoListItems.getSelectionModel().getSelectedIndex()));
                isComplete.setSelected(itemList.getComplete().get(toDoListItems.getSelectionModel().getSelectedIndex()));
                itemList.removeItem(toDoListItems.getSelectionModel().getSelectedIndex());
            }
            if (!toDoListDates.getSelectionModel().isEmpty()) {
                itemDescription.setText(itemList.getItem(toDoListDates.getSelectionModel().getSelectedIndex()).getItemDescription());
                itemDue.setValue(itemList.getItem(toDoListDates.getSelectionModel().getSelectedIndex()).getItemDueDate());
                isComplete.setSelected(itemList.getItem(toDoListDates.getSelectionModel().getSelectedIndex()).getItemStatus());
                itemList.removeItem(toDoListDates.getSelectionModel().getSelectedIndex());
            }
            if (!completeItems.getSelectionModel().isEmpty()) {
                itemDescription.setText(itemList.getItem(completeItems.getSelectionModel().getSelectedIndex()).getItemDescription());
                itemDue.setValue(itemList.getItem(completeItems.getSelectionModel().getSelectedIndex()).getItemDueDate());
                isComplete.setSelected(itemList.getItem(completeItems.getSelectionModel().getSelectedIndex()).getItemStatus());
                itemList.removeItem(completeItems.getSelectionModel().getSelectedIndex());
            }
        } catch (IndexOutOfBoundsException e) {
            Item item = new Item();
            item.setItemDescription("ERROR, Select item to edit");
            itemList.addItem(item);
        }

        setToDoListItems();
    }

    public void saveButtonIsClicked() {
        //allows for user input to be saved to a file
        String path = FileManager.promptSaveFile();
        if (!path.equals("")) {
            FileManager.writeToFile(path, itemList);
        }

    }

}
