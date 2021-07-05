package ucf.assignments;

import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

public class WelcomeController {
    public void DeleteListButtonClicked(ActionEvent actionEvent) {
        try {
            Parent deleteListParent = FXMLLoader.load(getClass().getResource("DeleteList.fxml"));
            Scene deleteListScene = new Scene(deleteListParent);
            Stage window = (Stage) ((Node)actionEvent.getSource()).getScene().getWindow();
            window.setScene(deleteListScene);
            window.show();

        } catch (IOException e) {
            e.printStackTrace();
        }
    }

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


    public void EditListButtonClicked(ActionEvent actionEvent) {
        try {
            Parent editListParent = FXMLLoader.load(getClass().getResource("EditList.fxml"));
            Scene editListScene = new Scene(editListParent);
            Stage window = (Stage) ((Node)actionEvent.getSource()).getScene().getWindow();
            window.setScene(editListScene);
            window.show();

        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void UploadListButtonClicked(ActionEvent actionEvent) {
        try {
        Parent uploadListParent = FXMLLoader.load(getClass().getResource("UploadList.fxml"));
        Scene uploadListScene = new Scene(uploadListParent);
        Stage window = (Stage) ((Node)actionEvent.getSource()).getScene().getWindow();
        window.setScene(uploadListScene);
        window.show();

        } catch (IOException e) {
        e.printStackTrace();
        }
        }

    }

