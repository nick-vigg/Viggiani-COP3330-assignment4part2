/*
 *  UCF COP3330 Summer 2021 Assignment 4 Solution
 *  Copyright 2021 Nicholas Viggiani
 */
package ucf.assignments;

import java.util.ArrayList;

public class ToDoList {
    private String toDoTitle;
    private ArrayList<Item> items;

    public String setTitle(String toDoTitle){
        //User inputs a title
        //Title is returned
        return toDoTitle;
    }

    public void getTitle(){
        this.toDoTitle = toDoTitle;
    }

    public void getItems(){
        this.items = items;
    }

    public ArrayList<Item> addItem(Item item){
        //User inputs item description
        //then the user clicks the add button
        //a to-do-list is returned with the new item in the list
        this.items.add(item);
        return items;
    }

    public ArrayList<Item> removeItem(Item item){
        //User clicks item from displayed to-do-list
        //User clicks delete button
        //a to-do-list is returned with the item removed from the list
        this.items.remove(item);
        return items;
    }

    public void clearList(){
        this.items.clear();
    }
}
