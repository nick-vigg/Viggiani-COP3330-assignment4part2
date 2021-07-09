/*
 *  UCF COP3330 Summer 2021 Assignment 4 Solution
 *  Copyright 2021 Nicholas Viggiani
 */
package ucf.assignments;

import java.util.ArrayList;

public class ToDoList {
    private String toDoTitle;
    private ArrayList<Item> items = new ArrayList<>();

    public void setTitle(String toDoTitle){
        //user inputs Title from GUI
        this.toDoTitle = toDoTitle;
    }

    public String getTitle(){
        return toDoTitle;
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

    public ArrayList<String> getTitles(){
        //Loops through to do list of items
        //creates new list to display titles items
        ArrayList<String> titleList = new ArrayList<>();
        for(int i = 0; i < items.size(); i++){
            titleList.add(items.get(i).getItemDescription());
        }
        return titleList;
    }

    public ArrayList<String> isComplete(){
        //Loops through to do list of items
        //creates new list to display titles of complete items
        ArrayList<String> titleList = new ArrayList<>();
        for(int i = 0; i < items.size(); i++){
            if(items.get(i).getItemStatus()){
                titleList.add(items.get(i).getItemDescription());
            }
        }
        return titleList;
    }
    public ArrayList<String> isIncomplete(){
        //Loops through to do list of items
        //creates new list to display titles of incomplete items
        ArrayList<String> titleList = new ArrayList<>();
        for(int i = 0; i < items.size(); i++){
            if(!items.get(i).getItemStatus()){
                titleList.add(items.get(i).getItemDescription());
            }
        }
        return titleList;
    }
}
