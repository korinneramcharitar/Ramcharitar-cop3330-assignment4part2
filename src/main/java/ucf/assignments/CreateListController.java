package ucf.assignments;

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

    public void CreateListEnterButtonClicked(ActionEvent actionEvent) throws IOException {
        FXMLLoader loader = new FXMLLoader(getClass().getResource("TodoTemplate.fxml"));
        Parent root = loader.load();


        TodoTemplateController TodoListScene = loader.getController();
        TodoListScene.showInformation(EnterListTextField.getText());
        Stage stage = new Stage();
        stage.setScene(new Scene(root));
        stage.setTitle("TodoList Data");
        stage.show();


        //takes input from textfield and passes text to next scene where it will be displayed
        //next scene will be where user can add tasks to list
        //stores data in CreateListModel class for list name association to be used later
    }


}
