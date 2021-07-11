/*
 *  UCF COP3330 Summer 2021 Assignment 4 Solution
 *  Copyright 2021 Nicholas Viggiani
 */
package ucf.assignments;

import java.time.LocalDate;
import java.util.ArrayList;

public class ToDoList {
    private ArrayList<Item> items = new ArrayList<>();

    public int getSize(){
        return items.size();
    }

    public Item getItem(int i){
        return items.get(i);
    }


    public ArrayList<Item> addItem(Item item) {
        //User inputs item description
        //then the user clicks the add button
        //a to-do-list is returned with the new item in the list
        this.items.add(item);
        return items;
    }

    public ArrayList<Item> removeItem(int index) {
        //User clicks item from displayed to-do-list
        //User clicks delete button
        //a to-do-list is returned with the item removed from the list
        this.items.remove(index);
        return items;
    }

    public void clearList() {
        this.items.clear();
    }

    public ArrayList<String> getTitles() {
        //Loops through to do list of items
        //creates new list to display titles items
        ArrayList<String> titleList = new ArrayList<>();
        for (int i = 0; i < items.size(); i++) {
            titleList.add(items.get(i).getItemDescription());
        }
        return titleList;
    }

    public ArrayList<LocalDate> getDates() {
        //Loops through to do list of items
        //creates new list to display dates of items
        ArrayList<LocalDate> dateList = new ArrayList<>();
        for (int i = 0; i < items.size(); i++) {
            dateList.add(items.get(i).getItemDueDate());
        }
        return dateList;
    }
    public ArrayList<Boolean> getComplete() {
        //Loops through to do list of items
        //creates new list to display status of items
        ArrayList<Boolean> completeList = new ArrayList<>();
        for (int i = 0; i < items.size(); i++) {
            completeList.add(items.get(i).getItemStatus());
        }
        return completeList;
    }

    public ArrayList<String> isComplete() {
        //Loops through to do list of items
        //creates new list to display titles of complete items
        ArrayList<String> titleList = new ArrayList<>();
        for (int i = 0; i < items.size(); i++) {
            if (items.get(i).getItemStatus()) {
                titleList.add(items.get(i).getItemDescription());
            }
        }
        return titleList;
    }

    public ArrayList<String> isIncomplete() {
        //Loops through to do list of items
        //creates new list to display titles of incomplete items
        ArrayList<String> titleList = new ArrayList<>();
        for (int i = 0; i < items.size(); i++) {
            if (!items.get(i).getItemStatus()) {
                titleList.add(items.get(i).getItemDescription());
            }
        }
        return titleList;
    }
}
