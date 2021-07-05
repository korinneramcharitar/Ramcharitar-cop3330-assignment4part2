package ucf.assignments;

import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

public class DeleteListController {
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

    public void DeleteListTextField(ActionEvent actionEvent) {
       //store user input to be used when button is clicked


    }

    public void EnterButtonClicked(ActionEvent actionEvent) {
        //takes in user input from text field
        //converts to string
        //compares variable to stored list names
        //if userinput.equals(list)
        //prompt pop up
        //are you sure you want to delete?
        //if yes, delete To-do-List
        //if no, return to delete list screen
        //else
        //display "that list does not exist

    }
}
