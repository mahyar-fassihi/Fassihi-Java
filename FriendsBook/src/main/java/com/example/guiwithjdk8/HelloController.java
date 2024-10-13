package com.example.guiwithjdk8;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.*;
import javafx.scene.input.MouseEvent;
import javafx.scene.control.Alert;
public class HelloController
{


    public Button addFriendButton;
    public TextField phoneNumberTextField;
    public TextField jobTextField;
    public TextField nameTextField;
    public RadioButton bestFriendRadio;
    public ListView<Friend> friendsList = new ListView<>();
    public Label friendsListLabel;
    public Label nameLabel;
    public Label phoneNumberLabel;
    public Label jobLabel;
    public Button deleteFriendButton;

    // requires: actionEvent is triggered by pressing the addFriendButton (non-null)
    // modifies: friendsList, nameTextField, phoneNumberTextField, jobTextField
    // effects: adds a new Friend (with the given name, phone number, and job) to the friendsList.
    //          Clears the input fields for name, phone number, and job after adding the friend.
    public void addFriend(ActionEvent actionEvent)
    {
        String name = nameTextField.getText();

        // We need a name to display in the list!
        if (name.isEmpty())
        {
            showAlert("Name is empty.", "You need a name!!");
            return;
        }

        String phoneNumber = phoneNumberTextField.getText();
        String job = jobTextField.getText();

        // Check if the phone number contains only digits
        if (!phoneNumber.matches("\\d+") && !phoneNumber.isEmpty())
        {
            // Display an error message
            showAlert("Invalid Phone Number", "Phone number should contain only digits.");
            return;
        }

        Friend temp = new Friend(name, phoneNumber, job);

        friendsList.getItems().add(temp);

        nameTextField.setText("");
        phoneNumberTextField.setText("");
        jobTextField.setText("");
    }

    // requires: mouseEvent is triggered by selecting an item from friendsList (non-null)
    // modifies: nameLabel, phoneNumberLabel, jobLabel
    // effects: updates the labels to show the selected Friend’s name, phone number, and job.
    //          If no friend is selected, no labels are updated.
    public void showFriend(MouseEvent mouseEvent)
    {
       Friend temp;
       temp = friendsList.getSelectionModel().getSelectedItem();
       if (temp != null)
       {
           nameLabel.setText(temp.getName());
           phoneNumberLabel.setText(temp.getPhoneNumber());
           jobLabel.setText(temp.getJob());
       }
    }

    // requires: actionEvent is triggered by pressing the deleteFriendButton (non-null)
    // modifies: friendsList, nameLabel, phoneNumberLabel, jobLabel
    // effects: removes the selected Friend from friendsList. Clears the name, phone number,
    //          and job labels after deletion. If no friend is selected, nothing is removed.
    public void deleteFriend(ActionEvent actionEvent)
    {
        // Get the selected item
        Friend selectedFriend = friendsList.getSelectionModel().getSelectedItem();

        // Check if an item is selected
        if (selectedFriend != null)
        {

            friendsList.getItems().remove(selectedFriend);
            nameLabel.setText("");
            phoneNumberLabel.setText("");
            jobLabel.setText("");
        }
    }

    // requires: title and message are non-null strings
    // modifies: non
    // effects: shows an error alert with the specified title and message to the user,
    //          halting execution until the user dismisses the alert
    private void showAlert(String title, String message)
    {
        Alert alert = new Alert(Alert.AlertType.ERROR);
        alert.setTitle(title);
        alert.setHeaderText(null);
        alert.setContentText(message);
        alert.showAndWait();
    }
}