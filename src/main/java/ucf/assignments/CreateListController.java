package ucf.assignments;
/*
 *  UCF COP3330 Summer 2021 Assignment 4 Solution
 *  Copyright 2021 Korinne Ramcharitar
 */

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

import java.io.IOException;

public class CreateListController {
    @FXML
    public TextField EnterListTextField;
    
    
//sets user back to welcome menu when home button is clicked
    public void HomeButtonClicked(ActionEvent actionEvent) {
        try {
            Parent HomeListParent = FXMLLoader.load(getClass().getResource("Welcome.fxml"));
            Scene HomeListScene = new Scene(HomeListParent);
            Stage window = (Stage) ((Node)actionEvent.getSource()).getScene().getWindow();
            window.setScene(HomeListScene);
            window.show();

        } catch (IOException e) {
            e.printStackTrace();
        }

    }
//takes data from one scene and passes it to the next scene
    public void CreateListEnterButtonClicked(ActionEvent actionEvent) throws IOException {
        FXMLLoader loader = new FXMLLoader(getClass().getResource("TodoTemplate.fxml"));
        Parent root = loader.load();


        TodoTemplateController TodoListScene = loader.getController();
        //takes input from textfield and passes text to next scene where it will be displayed
        TodoListScene.showInformation(EnterListTextField.getText());
        Stage stage = new Stage();
        //next scene will be where user can add tasks to list
        stage.setScene(new Scene(root));
        stage.setTitle("TodoList Data");
        stage.show();


  
    }


}
