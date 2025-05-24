package com.github.max;

import java.io.IOException;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;


public class Main extends Application {
    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(javafx.stage.Stage primaryStage) {
        try{
            Parent root = FXMLLoader.load(getClass().getResource("/view/mainView.fxml"));
            primaryStage.setTitle("Notizblock");
            primaryStage.setScene(new Scene(root, 300, 200));
            primaryStage.show();
        }
        catch(IOException e)
        {
            System.out.println("the root couldn't be initialized because the file couldn't be loaded");
        }
       
        

    }
}