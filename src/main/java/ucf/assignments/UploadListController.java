package ucf.assignments;

import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

public class UploadListController {

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


    public void SearchListButtonClicked(ActionEvent actionEvent) {
        //set file chooser function
        //set pathway for user to look in their external storage in function
        //when user selects file from pathway pop up
        //take file and store in ArrayList for user to be able to access later
        //not sure if thats how to go about it
        //do more research
    }
}
