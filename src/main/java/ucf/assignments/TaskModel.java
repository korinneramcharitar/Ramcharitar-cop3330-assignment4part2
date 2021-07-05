package ucf.assignments;

import javafx.beans.property.BooleanProperty;
import javafx.beans.property.SimpleStringProperty;
import javafx.scene.control.CheckBox;

import java.time.LocalDate;

public class TaskModel {

    public TaskModel(String text, String text1, LocalDate converter, CheckBox complete) {
        //sets variable parameters so Controller knows what values specifically its looking for

    }



    public class Task{
        //Declare Variables to store data
        private SimpleStringProperty taskName;
        private SimpleStringProperty taskDescription;
        private LocalDate taskDueDate;
        private CheckBox CheckColumn;



//next few lines are getters and setters
        public String getTaskDescription() {
            return taskDescription.get();
        }

        public SimpleStringProperty taskDescriptionProperty() {
            return taskDescription;
        }

        public void setTaskDescription(String taskDescription) {
            this.taskDescription.set(taskDescription);
        }

        public void setComplete(CheckBox CheckColumn) {
            this.CheckColumn = CheckColumn;
        }

        public CheckBox getCheckColumn(){
            return CheckColumn;

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

        public LocalDate getTaskDueDate() {
            return taskDueDate;
        }

        public void setTaskDueDate(LocalDate taskDueDate) {
            this.taskDueDate = taskDueDate;
        }

        public Task(String taskName, String taskDescription, LocalDate taskDueDate, CheckBox complete){
            //handles data transfer for controller class

            //this.taskName = new SimpleStringProperty(taskName);

            //this.taskDescription = new SimpleStringProperty(taskDescription);
           // this.taskDueDate = taskDueDate;
           // this.CheckColumn = new CheckBox();
        }
    }
}
