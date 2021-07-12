# Ramcharitar-cop3330-assignment4part2
HELP FILE DEDICATED TO REY
thank you Rey?
User will start by creating a title for todolist. 
After this step, user can create task names, descriptions and due dates. 
They will also be able to continously add and delete tasks. 
Deletion is completed by selecting the row of the task they would like to delete and selecting the delete button.
The user can edit task name, title, description and due date by double clicking any of the fields and submitting enter once satisfied with changes.
They are able to essentially cancel whatever they are doing by using the home button. Once this button is clicked, nothing will be saved!
They may save the list using the savelist button however the file path is set to my own. If they wish to change it they will have to go  into the TodoTemplateController Class under SaveListButtonClicked and set the path to their own directory.
The same goes for uploading a list. The directory must be changed under the buttonevent for uploadlistbuttonclicked to their own directory.
The show complete tasks and incomplete tasks buttons do not work. They will be released in the next update. The checkboxes are for personal use to let the user know they have completed tasks.

If using upload file button, the file must be in format similar as "2021-08-08, Milk Soda Cereal and Eggs, Buy Groceries, ListTwo". The filereader goes through the columns as "DatePicker, String taskDescription, String taskName, String taskTitle"
It will not read properly in any other format!!!!
