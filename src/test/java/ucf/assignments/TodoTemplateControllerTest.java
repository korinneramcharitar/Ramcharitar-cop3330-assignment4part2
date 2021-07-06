package ucf.assignments;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TodoTemplateControllerTest {

    //TableView allows for certain features already included such as sort, so no test method will be provided for it
    //probably need to set certain cell values, not sure yet

    //test to see if user can add tasks
    @Test
    void addTaskButtonClicked() {
        //recieve textfield input text
        //compare TableView info to input text
        //assert input is now displayed in TableView
    }
    //test to see if user can delete tasks
    @Test
    void deleteTaskButtonClicked() {
     //recieve textfield input text
        //compare text to TableView info
        //assert the input is no longer available on TableView

    }
    //test to check if complete tasks will show
    @Test
    void completeTasksButtonClicked() {
        //check if after event tableview colums appearing have checkmarks in CheckBox column


    }
//test to check if incomplete tasks will show
    @Test
    void incompleteTasksButtonClicked() {
        //check if after event tableview colums appearing have no checkmarks in CheckBox column
    }
    //test to check if tasks are editable
    @Test
    void changeTask() {
        //check tableview is editable in Task Column


    }
    //test to check if descriptions are editable
    @Test
    void changeDesrip() {
        //check tableview is editable in Description Column
    }

//test to check if dates are editable
    @Test
    void changeDate() {
        //check tableview is editable in Due Date Column
        //these changes are initiated by user double clicking cells
        //maybe UserClick() neccessary
    }
}