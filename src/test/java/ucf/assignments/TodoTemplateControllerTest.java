package ucf.assignments;

import javafx.beans.property.SimpleStringProperty;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.scene.control.*;
import org.junit.jupiter.api.Test;

import java.io.*;
import java.time.LocalDate;
import java.time.Month;
import java.time.format.DateTimeFormatter;

import static org.junit.jupiter.api.Assertions.*;

class TodoTemplateControllerTest {

    @FXML
    public TableColumn<ucf.assignments.Tasks, LocalDate> DueDateColumn;
    @FXML
    public TableView<ucf.assignments.Tasks> TodoListTable;
    @FXML
    public TextField TodoListTitle;


    public class Task {
        private SimpleStringProperty taskName;
        private SimpleStringProperty taskDescription;


        public Task(String taskName, String taskDescription) {
            this.taskName = new SimpleStringProperty(taskName);
            this.taskDescription = new SimpleStringProperty(taskDescription);

        }



        public String getTaskDescription() {
            return taskDescription.get();
        }

        public SimpleStringProperty taskDescriptionProperty() {
            return taskDescription;
        }

        public void setTaskDescription(String taskDescription) {
            this.taskDescription.set(taskDescription);
        }

        public String getTaskName() {
            return taskName.get();
        }

        public SimpleStringProperty taskNameProperty() {
            return taskName;
        }

        public void setTaskName(String taskName) {
            this.taskName.set(taskName);
        }

    }

    public class Tasks {
        private SimpleStringProperty taskTitle;

        public Tasks(String taskTitle) {
            this.taskTitle = new SimpleStringProperty(taskTitle);

        }


        public String getTaskTitle() {
            return taskTitle.get();
        }

        public SimpleStringProperty taskTitleProperty() {
            return taskTitle;
        }

        public void setTaskTitle(String taskTitle) {
            this.taskTitle.set(taskTitle);
        }
    }

    @Test
    public void showInformation() {

        Tasks task = new Tasks("WatchList");
    }

    @Test
    void saveListButtonClicked() {

        try {
            Task task = new Task("Buy groceries", "Buy lemons");

            FileWriter myWriter = new FileWriter("/Users/korinneramcharitar/Desktop/Output.txt");


                String formatted = String.format("%s, %s",  task.getTaskName(), task.getTaskDescription());
                myWriter.write(formatted);


                System.out.println(formatted);


            myWriter.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
        @Test
    void uploadListButtonClicked() {
        String path = "/Users/korinneramcharitar/Desktop/SampleTodoList";
        String line = "";
        try {
            BufferedReader br = new BufferedReader(new FileReader(path));
            while ((line = br.readLine()) != null) {
                String[] values = line.split(",");
                System.out.println(line);
                LocalDate localDate = LocalDate.parse(values[0]);
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}