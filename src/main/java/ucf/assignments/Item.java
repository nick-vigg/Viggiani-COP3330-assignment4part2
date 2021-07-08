/*
 *  UCF COP3330 Summer 2021 Assignment 4 Solution
 *  Copyright 2021 Nicholas Viggiani
 */
package ucf.assignments;

import java.time.LocalDate;
import java.util.Date;

public class Item {
    private boolean itemStatus;
    private String itemDescription;
    private LocalDate itemDueDate;

    public void getItemStatus(){
        //use GUI to set status from User
        this.itemStatus = itemStatus;
    }

    public boolean setItemStatus(boolean itemStatus){
        return itemStatus;
    }

    public void getItemDescription(){
        //User sets description from GUI
        this.itemDescription = itemDescription;
    }

    public String setItemDescription(String itemDescription){
        return itemDescription;
    }

    public void getItemDueDate(){
        //User sets due date from GUI DatePicker
        this.itemDueDate = itemDueDate;
    }

    public LocalDate setItemDueDate(LocalDate itemDueDate){
        return itemDueDate;
    }

}
