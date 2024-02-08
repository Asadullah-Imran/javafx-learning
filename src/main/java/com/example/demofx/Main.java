package com.example.demofx;

import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.scene.input.KeyCombination;
import javafx.scene.paint.Color;
import javafx.stage.Stage;

public class Main extends Application {




    public static void main(String[] args) {
    //to call start method we will call launch method
        //launch is a static method
        launch(args);
    }

    @Override
    public void start(Stage stage) throws Exception {

        //Creating root node
        Group root = new Group();

        //we need to add the scene to the stage
        Scene scene = new Scene(root, Color.BLACK); //adding root to the scene
        Image icon = new Image("/icon.png"); //set icon
        stage.getIcons().add(icon);
        stage.setTitle("THis is the title"); //this is the title
        stage.setHeight(420);//set height
        stage.setWidth(420);//set width
        stage.setResizable(false);//set resizable false so that you can not resize it
        //set showing the window in my pc
//        stage.setX(100);
//        stage.setY(100);
        //FULL SCREEN TEST
//        stage.setFullScreen(true); //this take tyou in full screen mode
//        stage.setFullScreenExitHint("You can not escape untill you hit q");
//        stage.setFullScreenExitKeyCombination(KeyCombination.valueOf("q"));


        stage.setScene(scene); //adding scene to the stage
        stage.show();//to show the stage

    }
}