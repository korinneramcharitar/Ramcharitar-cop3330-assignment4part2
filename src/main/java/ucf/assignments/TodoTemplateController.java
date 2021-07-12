package ucf.assignments;

import javafx.beans.property.BooleanProperty;
import javafx.beans.property.SimpleIntegerProperty;
import javafx.beans.property.SimpleStringProperty;
import javafx.beans.value.ObservableValue;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.concurrent.Task;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.control.cell.CheckBoxTableCell;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.control.cell.TextFieldTableCell;
import javafx.scene.layout.AnchorPane;
import javafx.stage.FileChooser;
import javafx.stage.Stage;

import java.io.*;
import java.net.URL;
import java.time.LocalDate;
import java.time.Month;
import java.time.format.DateTimeFormatter;
import java.util.Iterator;
import java.util.ResourceBundle;
import java.util.Scanner;
import java.util.function.UnaryOperator;

public class TodoTemplateController implements Initializable {
    @FXML
    public TableView<Tasks> TodoListTable;
    @FXML
    public TableColumn<Tasks, String> TaskColumn;
    @FXML
    public TableColumn<Tasks, String> DescriptionColumn;
    @FXML
    public TableColumn<Tasks, LocalDate> DueDateColumn;
    @FXML
    public TableColumn<Tasks, CheckBox> CheckColumn;
    @FXML
    public TextField AddDescriptionTextField;
    @FXML
    public DatePicker DueDatePicker;
    @FXML
    public TextField AddTaskTextField;
    @FXML
    public TextField TodoListTitle;
    @FXML
    public ToggleButton IncompleteTasksBox;
    @FXML
    public ToggleButton CompleteTasksBox;


    public void initialize(URL location, ResourceBundle resources) {
        //intialize cell values for each column to correspond with TaskModel class

        TaskColumn.setCellValueFactory(new PropertyValueFactory<Tasks, String>("taskName"));
        DescriptionColumn.setCellValueFactory(new PropertyValueFactory<Tasks, String>("taskDescription"));
        DueDateColumn.setCellValueFactory(new PropertyValueFactory<Tasks, LocalDate>("taskDueDate"));
        CheckColumn.setCellValueFactory(new PropertyValueFactory<Tasks, CheckBox>("Checkoff"));

        TodoListTable.setEditable(true);
        TaskColumn.setCellFactory((TextFieldTableCell.forTableColumn()));
        DescriptionColumn.setCellFactory(TextFieldTableCell.forTableColumn());


        TodoListTable.getSelectionModel().setSelectionMode(SelectionMode.MULTIPLE);


    }

    public TextField getTodoListTitle() {
        return TodoListTitle;
    }

    public void setTodoListTitle(TextField todoListTitle) {
        TodoListTitle = todoListTitle;
    }

    //Bring Todolist Title from CreateListController
public void showInformation(String title){
    TodoListTitle.setText(title);


}



    //Add Task Button event
    public void AddTaskButtonClicked(ActionEvent actionEvent) {
        Tasks task = new Tasks(AddTaskTextField.getText(), AddDescriptionTextField.getText(), DueDatePicker.getValue());
        TodoListTable.getItems().add(task);



    }

    //Delete TaskButton Event
// method to remove selected rows
    public void DeleteTaskButtonClicked(ActionEvent actionEvent) {

        //Allow user to Delete Tasks, Description and Due date in Table View
        // create ObservableList to select all rows
        ObservableList<Tasks> selectedRows, allTasks;
        allTasks = TodoListTable.getItems();

        selectedRows = TodoListTable.getSelectionModel().getSelectedItems();

        //remove selected rows from observablelist
        for (Tasks tasks : selectedRows) {
            allTasks.remove(tasks);

        }

    }

    //Save List Button Event
    public void SaveListButtonClicked(ActionEvent actionEvent) {
        String date = DueDatePicker.getValue().format(DateTimeFormatter.ofPattern("yyyy-MM-dd"));
        try {

            FileWriter myWriter = new FileWriter("/Users/korinneramcharitar/Desktop/Output.txt");


            for (Tasks task : TodoListTable.getItems()) {

                    String formatted = String.format("%s, %s, %s, %s", TodoListTitle.getText(), task.getTaskName(), task.getTaskDescription(), date);
                    myWriter.write(formatted);


                    System.out.println(formatted);

            }
            myWriter.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void CompleteTasksButtonClicked(ActionEvent actionEvent) {

        ObservableList<Tasks> CompleteTasks, dataListRemove = FXCollections.observableArrayList();
        CompleteTasks = TodoListTable.getItems();

        for (Tasks tasks : CompleteTasks) {
            //take all tasks marked with checkboxes and display
            if (CompleteTasksBox.isSelected()) {
                dataListRemove.remove(tasks);
            }
        }

        //remove selected rows from observablelist
           /* for(Tasks tasks: CompleteTasks)
            {

                if (tasks.getCheckoff().isSelected()) {
                    dataListRemove.add(Tasks)
                }


            }
            CompleteTasks.removeAll(dataListRemove);
        }
            //all other tasks will not be visible to user
            //function like if(Checkboxes.equals(marked){
            //display results
            //} else
            //hide tasks*/
    }


    public void IncompleteTasksButtonClicked(ActionEvent actionEvent) {
        //take all tasks unmarked in checkboxes and display
        ObservableList<Tasks> IncompleteTasks, dataListRemove = FXCollections.observableArrayList();
        IncompleteTasks = TodoListTable.getItems();


        //remove selected rows from observablelist
        for (Tasks tasks : IncompleteTasks) {

            if (tasks.getCheckoff().isSelected()) {
            }

        }


        //get values of items marked
        //try to show only them

        //do not remove

    }
    //all marked tasks will  not be visible to user


    public void ReturnHomeButtonClicked(ActionEvent actionEvent) {
        try {
            Parent HomeListParent = FXMLLoader.load(getClass().getResource("Welcome.fxml"));
            Scene HomeListScene = new Scene(HomeListParent);
            Stage window = (Stage) ((Node) actionEvent.getSource()).getScene().getWindow();
            window.setScene(HomeListScene);
            window.show();

        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void UploadListButtonClicked(ActionEvent actionEvent) {

        String path = "/Users/korinneramcharitar/Desktop/SampleTodoList";
        String line = "";
        try {
            BufferedReader br = new BufferedReader(new FileReader(path));
                while((line = br.readLine()) != null){
                    String[] values = line.split(",");
                System.out.println(line);
                LocalDate localDate = LocalDate.parse(values[0]);

                final ObservableList<Tasks> data = FXCollections.observableArrayList(
                   new Tasks(values[2], values[1], localDate ));
                TodoListTable.setItems(data);
            }

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }catch (IOException e){
            e.printStackTrace();
        }

    }
}
