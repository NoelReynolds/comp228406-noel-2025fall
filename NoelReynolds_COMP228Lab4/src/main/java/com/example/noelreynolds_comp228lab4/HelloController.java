package com.example.noelreynolds_comp228lab4;

import javafx.fxml.FXML;
import javafx.scene.control.*;

public class HelloController {
    @FXML
    private TextField nameField, addressField, cityField, provinceField, postalField, phoneField, emailField;

    @FXML
    private CheckBox councilToggle, volunteerToggle;

    //@FXML
    //private ...

    //@FXML
    //private ...

    @FXML
    private Button displayButton;

    @FXML
    private TextArea displayText;

    @FXML
    protected void displayButtonClicked()
    {
        String[] classList = { };

        //Pre-selected computer Science as I don't quite know how to set up the radio buttons to be connected...
        //Likewise with the dropdown adding classes
        StudentInformation studentInformation = new StudentInformation(nameField.getText(), addressField.getText(), cityField.getText(),
                provinceField.getText(), postalField.getText(), phoneField.getText(), emailField.getText(), councilToggle.isSelected(),
                volunteerToggle.isSelected(), StudentInformation.major.computerScience, classList);

        displayText.setText(studentInformation.toString());
    }
}
