package ucf.assignments;

import javafx.event.ActionEvent;

import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

import java.io.IOException;

public class EditListController {

    public TextField EnterListTextField;

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


    public void EnterButtonClicked(ActionEvent actionEvent) {
        //recieves user input
        //Takes variable and does comparison of all list names saved in application and database
        //if variable.equals(user input)
        //prompt for To-Do-List to appear on screen
        //else return
        //list does not exist
        //only prompts to change name of list, because tableview supports edit of cells
        //most likely new prompt will ask user if they want to edit inside List after allowing user to change name of List
    }
}
