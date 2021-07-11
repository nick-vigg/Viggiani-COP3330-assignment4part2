/*
 *  UCF COP3330 Summer 2021 Assignment 4 Solution
 *  Copyright 2021 Nicholas Viggiani
 */
package ucf.assignments;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Arrays;

public class Item {
    private boolean itemStatus;
    private String itemDescription;
    private LocalDate itemDueDate;

    public void setItemStatus(boolean itemStatus){
        //use GUI to set status from User
        this.itemStatus = itemStatus;
    }

    public boolean getItemStatus(){
        return itemStatus;
    }

    public void setItemDescription(String itemDescription){
        //use GUI to set Description from User
        this.itemDescription = itemDescription;
    }

    public String getItemDescription(){
        return itemDescription;
    }

    public void setItemDueDate(LocalDate itemDueDate){
        //use GUI to set Date from User
        this.itemDueDate = itemDueDate;
    }

    public LocalDate getItemDueDate(){
        return itemDueDate;
    }

    public void fileToItem(ArrayList<String> list, int i){
            String[] splitArray = list.get(i).split("\\|");
            setItemDescription(splitArray[0].trim());
            if(splitArray[1].trim().equals("Complete")){
                setItemStatus(true);
            } else {
                setItemStatus(false);
            }
            setItemDueDate(LocalDate.parse(splitArray[2].trim()));
        }
}
