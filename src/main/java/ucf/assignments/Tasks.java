package ucf.assignments;
/*
 *  UCF COP3330 Summer 2021 Assignment 4 Solution
 *  Copyright 2021 Korinne Ramcharitar
 */

import javafx.beans.property.SimpleStringProperty;
import javafx.scene.control.CheckBox;
import javafx.scene.control.DatePicker;
import java.time.LocalDate;


public class Tasks {
    private SimpleStringProperty taskName;
    private SimpleStringProperty taskDescription;
    private DatePicker taskDueDate;
    private CheckBox Checkoff;


    public Tasks(String taskName, String taskDescription, LocalDate taskDueDate) {
        this.taskName = new SimpleStringProperty(taskName);
        this.taskDescription = new SimpleStringProperty(taskDescription);
        this.taskDueDate = new DatePicker(taskDueDate);
        this.Checkoff = new CheckBox();


    }



    public CheckBox getCheckoff() {
        return Checkoff;
    }

    public void setCheckoff(CheckBox checkoff) {
        Checkoff = checkoff;
    }

    public DatePicker getTaskDueDate() {
        return taskDueDate;
    }

    public void setTaskDueDate(DatePicker taskDueDate) {
        this.taskDueDate = taskDueDate;
    }

    public SimpleStringProperty taskNameProperty() {
        return taskName;
    }

    public void setTaskName(String taskName) {
        this.taskName.set(taskName);
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

    public Object getTaskName() {
        return taskName.get();
    }
}
