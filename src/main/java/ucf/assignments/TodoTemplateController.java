package ucf.assignments;

import javafx.beans.property.SimpleIntegerProperty;
import javafx.beans.property.SimpleStringProperty;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

import java.io.IOException;
import java.net.URL;
import java.time.LocalDate;
import java.time.Month;
import java.util.ResourceBundle;

public class TodoTemplateController implements Initializable {
    @FXML
    public TableView<TaskModel>TodoListTable;
    @FXML
    public TableColumn<TaskModel, String> TaskColumn;
    @FXML
    public  TableColumn<TaskModel, String> DescriptionColumn;
    @FXML
    public  TableColumn<TaskModel, LocalDate> DueDateColumn;
    @FXML
    public TableColumn<TaskModel, CheckBox> CheckColumn;
    @FXML
    public TextField AddDescriptionTextField;
    @FXML
    public DatePicker DueDatePicker;
    @FXML
    public TextField AddTaskTextField;
    @FXML



    public void initialize(URL location, ResourceBundle resources){
        //intialize cell values for each column to correspond with TaskModel class


        //These are not correct code, just an idea of how to do so!

       // TaskColumn.setCellValueFactory(new PropertyValueFactory<TaskModel, String>("taskName"));

        //DescriptionColumn.setCellValueFactory(new PropertyValueFactory<TaskModel, String>("taskdescription")) ;

        //DueDateColumn.setCellValueFactory(new PropertyValueFactory<TaskModel, LocalDate>("taskDueDate"));

       // CheckColumn.setCellValueFactory(new PropertyValueFactory<TaskModel, CheckBox>("CheckColumn"));



    }

//Add Task Button event
    public void AddTaskButtonClicked(ActionEvent actionEvent) {

//allow user to use text fields to add tasks with descriptions, as well as select due date for each individual task added.
        //CheckBox should appear for each task added since it would be impossible to pre anticipate how check boxes are needed.
       // TaskModel task = new TaskModel(AddTaskTextField.getText(),AddDescriptionTextField.getText(),DueDatePicker.getValue(), CheckColumn.);
        //Take information from text field and add it to the TableView format
      //  TodoListTable.getItems().add(task);

    }
//Delete TaskButton Event
    public void DeleteTaskButtonClicked(ActionEvent actionEvent) {

        //Allow user to Delete Tasks, Description and Due date in Table View
        //Select Task using built in functions from TableView
        //Prompt a pop-up screen for User to confirm they would like to delete Task being selected from row.
        //If yes, clear row from TableView
        //If no, return back to TableView
    }
//Save List Button Event
    public void SaveListButtonClicked(ActionEvent actionEvent) {
        //Take information stored in TableView Currently showing on scene
        //convert information to variables
        //ask user if they want to save to application storage or external storage
        //if user chooses external storage
        //create a file write function
        //take information stored into variables and print to textfile
        //make sure user has access to external storage incase they want to load .txtfile bc it  is a constraint
        //else save list information including title, tasks, description etc data to application

    }

    public void CompleteTasksButtonClicked(ActionEvent actionEvent) {
        //take all tasks marked with checkboxes and display
        //all other tasks will not be visiable to user
        //function like if(Checkboxes.equals(marked){
        //display results
        //} else
        //hide tasks
    }

    public void IncompleteTasksButtonClicked(ActionEvent actionEvent) {
        //take all tasks unmarked in checkboxes and display
        //all marked tasks will  not be visiable to user
        //if(checkboxes.equals(unmarked)
        //make visible to user
        //else
        //hide tasks
    }

    public void ReturnHomeButtonClicked(ActionEvent actionEvent) {
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
    }

