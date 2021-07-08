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

    public ArrayList<Item> addItem(ArrayList<Item> items, Item item){
        //User inputs item description
        //then the user clicks the add button
        //a to-do-list is returned with the new item in the list
        return items;
    }

    public ArrayList<Item> removeItem(ArrayList<Item> items, Item item){
        //User clicks item from displayed to-do-list
        //User clicks delete button
        //a to-do-list is returned with the item removed from the list
        return items;
    }
}
