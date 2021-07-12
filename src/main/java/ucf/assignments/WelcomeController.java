package ucf.assignments;

import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

public class WelcomeController {
    

    public void CreateListButtonClicked(ActionEvent actionEvent) {
        try {
            Parent createListParent = FXMLLoader.load(getClass().getResource("CreateList.fxml"));
            Scene createListScene = new Scene(createListParent);
            Stage window = (Stage) ((Node)actionEvent.getSource()).getScene().getWindow();
            window.setScene(createListScene);
            window.show();

        } catch (IOException e) {
            e.printStackTrace();
        }
    }


    
    
    }

