package ucf.assignments;

import javafx.stage.FileChooser;

import java.io.*;
import java.util.ArrayList;

public class FileManager {
    public static String promptOpenFile(){
        //prompts user for file to open in GUI
        //files are filtered to only .txt
        FileChooser fileChooser = new FileChooser();
        FileChooser.ExtensionFilter extFilter =
                new FileChooser.ExtensionFilter("TEXT files (*.txt)", "*.txt");
        fileChooser.getExtensionFilters().add(extFilter);
        fileChooser.setTitle("Open Resource File");
        File file = fileChooser.showOpenDialog(null);
        if (file != null){
            return file.getAbsolutePath();
        }
        return "";
    }

    public static String promptSaveFile(){
        //prompts user to save file from GUI
        //files are filtered to only .txt
        FileChooser fileChooser = new FileChooser();
        FileChooser.ExtensionFilter extFilter =
                new FileChooser.ExtensionFilter("TEXT files (*.txt)", "*.txt");
        fileChooser.getExtensionFilters().add(extFilter);
        fileChooser.setTitle("Save File");
        File file = fileChooser.showSaveDialog(null);
        if (file != null){
            return file.getAbsolutePath();
        }
        return "";
    }

    public static void writeToFile(String path, ToDoList list){
        //Data stored in ToDoList is written to a file given by the user
        try{
            BufferedWriter bw = new BufferedWriter(new FileWriter(path));
            String complete;
            for(int i=0; i<list.getSize(); i++){
                if (list.getItem(i).getItemStatus()){
                   complete = "Complete";
                } else {
                     complete = "Incomplete";
                }
                bw.write(String.format("%-10s %-2s %-10s %-2s %-10s %-2s \n",
                        list.getItem(i).getItemDescription(), "|",
                        complete, "|",
                        list.getItem(i).getItemDueDate(), "|"));
            }
            bw.close();
        }catch(IOException e){
            System.out.println(e);
        }
    }

    public static ArrayList<String> readFromFile(String path){
        //Data read from file in lines of data
        ArrayList<String> ret = new ArrayList<>();
        try{
            BufferedReader br =  new BufferedReader(new FileReader(path));
            String line = br.readLine();
            while(line != null){
                ret.add(line);
                line = br.readLine();
            }
            br.close();
        } catch(IOException e){
            return new ArrayList<>();
        }
        return ret;
    }
}
