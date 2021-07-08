/*
 *  UCF COP3330 Summer 2021 Assignment 4 Solution
 *  Copyright 2021 Nicholas Viggiani
 */
package ucf.assignments;

import java.util.Date;

public class Item {
    private boolean itemStatus;
    private String itemDescription;
    private Date itemDueDate;

    public boolean editStatus(boolean itemStatus){
        //Controller determines if item is marked as complete
        //if the item is marked
        //then the item is complete
        //if not then the item is marked incomplete
        return false;
    }

    public String editDescription(String itemDescription){
        //User will type the description to itemDescription
        //The description is returned
        return null;
    }

    public Date editDueDate(Date itemDueDate){
        //User will select a date
        //The date will be returned
        return itemDueDate;
    }

}
