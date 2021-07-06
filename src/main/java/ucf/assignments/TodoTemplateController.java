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
    public TableView<TaskModel> TodoListTable;
    @FXML
    public TableColumn<TaskModel, String> TaskColumn;
    @FXML
    public TableColumn<TaskModel, String> DescriptionColumn;
    @FXML
    public TableColumn<TaskModel, LocalDate> DueDateColumn;
    @FXML
    public TableColumn<TaskModel, CheckBox> CheckColumn;
    @FXML
    public TextField AddDescriptionTextField;
    @FXML
    public DatePicker DueDatePicker;
    @FXML
    public TextField AddTaskTextField;
    @FXML
    public TextField TodoListTitle;




    public void initialize(URL location, ResourceBundle resources) {
        //intialize cell values for each column to correspond with TaskModel class

        //These are not correct code, just an idea of how to do so!

        // TaskColumn.setCellValueFactory(new PropertyValueFactory<TaskModel, String>("taskName"));

        //DescriptionColumn.setCellValueFactory(new PropertyValueFactory<TaskModel, String>("taskdescription")) ;

        //DueDateColumn.setCellValueFactory(new PropertyValueFactory<TaskModel, LocalDate>("taskDueDate"));

        // CheckColumn.setCellValueFactory(new PropertyValueFactory<TaskModel, CheckBox>("CheckColumn"));

        //Update table to allow for fields to be editable after methods are created below!
        //tableview.seteditable(true)
        //each column needs a .setCellFactory line to allow each individual line to click and change


        //set selection in tableview to multiple
        //tableview.selection.MULTIPLE

    }


//method to allow user to double click on cell and update in TableView

    public void changeTask() {
        //create task selector
        //Task taskSelected = TableView.getselectionModel().getItem
        //taskselected.setTaskName(editedCell.getNewValue().toString());
        //in .fxml i need to associate the method with #On Edit Commit?

    }

    //Method  to allow user to double click on cell and update description in TableView
    public void changeDesrip() {

        //same steps just for the description cell Due Date
    }

    //Method to allow user to double click on cell and update
    public void changeDate() {
        //same steps take into account it is not a string
        //DatePicker conversion?
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
// method to remove selected rows
    public void DeleteTaskButtonClicked(ActionEvent actionEvent) {

        //Allow user to Delete Tasks, Description and Due date in Table View


        //create ObservableList to select all rows

        //remove selected rows from observablelist
    }

//Save List Button Event
    public void SaveListButtonClicked(ActionEvent actionEvent) {


        /*
        Take information stored in TableView Currently showing on scene

        store into ArrayList

         */

        }

        public void CompleteTasksButtonClicked (ActionEvent actionEvent){
            //take all tasks marked with checkboxes and display
            //all other tasks will not be visible to user
            //function like if(Checkboxes.equals(marked){
            //display results
            //} else
            //hide tasks
        }

        public void IncompleteTasksButtonClicked (ActionEvent actionEvent){
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

