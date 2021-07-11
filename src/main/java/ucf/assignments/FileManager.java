package ucf.assignments;

import javafx.collections.ObservableList;
import javafx.stage.FileChooser;

import java.io.*;
import java.util.ArrayList;

public class FileManager {
    public static String promptFile(){
        FileChooser fileChooser = new FileChooser();
        FileChooser.ExtensionFilter extFilter =
                new FileChooser.ExtensionFilter("TEXT files (*.txt)", "*.txt");
        fileChooser.getExtensionFilters().add(extFilter);
        fileChooser.setTitle("Open Resource File");
        File file = fileChooser.showSaveDialog(null);
        if (file == null){
            return file.getAbsolutePath();
        }
        return "";
    }

    public static void writeToFile(String path, ObservableList<Item> list){
        try{
            BufferedWriter bw = new BufferedWriter(new FileWriter(path));
            for(int i=0; i<list.size(); i++){
                bw.write(list.get(i).toString()+"\n");
            }
            bw.close();
        }catch(IOException e){
            System.out.println(e);
        }
    }

    public static ArrayList<String> readFromFile(String path){
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
