/*
 *  UCF COP3330 Summer 2021 Assignment 4 Solution
 *  Copyright 2021 Nicholas Viggiani
 */
package ucf.assignments;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.application.Application;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

import static javafx.application.Application.launch;

public class App extends Application{
    @Override
    public void start(Stage stage) {
        Parent root1 = null;
        Parent root2 = null;
        try {
            root1 = FXMLLoader.load(getClass().getResource("ass4.fxml"));
            Scene scene1 = new Scene(root1);
            stage.setTitle("To-Do-Lists");
            stage.setScene(scene1);
            stage.show();
           /* root2 = FXMLLoader.load(getClass().getResource("item.fxml"));
            Scene scene2 = new Scene(root2);
            stage.setTitle("Items");
            stage.setScene(scene2);
            stage.show(); */

        } catch (IOException e) {
            e.printStackTrace();
        }


    }
    public static void main(String[] args) { launch(args); }

}
