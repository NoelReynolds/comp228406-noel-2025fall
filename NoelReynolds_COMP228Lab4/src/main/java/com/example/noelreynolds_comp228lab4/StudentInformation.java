package com.example.noelreynolds_comp228lab4;

import javafx.scene.control.TextField;

public class StudentInformation
{
    private String studentName;
    private String address;
    private String province;
    private String city;
    private String postal;
    private String phone;
    private String email;

    private boolean council;
    private boolean volunteer;

    public enum major
    {
        computerScience,
        business
    }

    private major studentMajor;

    private String[] classes;

    public StudentInformation(String studentName, String address, String province, String city, String postal, String phone,
                              String email, boolean council, boolean volunteer, major _major, String[] classes)
    {
        this.studentName = studentName;
        this.address = address;
        this.province = province;
        this.city = city;
        this.postal = postal;
        this.phone = phone;
        this.email = email;
        this.council = council;
        this.volunteer = volunteer;
        this.studentMajor = _major;
        this.classes = classes;
    }

    @Override
    public String toString() {
        String returnString = "";

        returnString += "Student Name: " + studentName;
        returnString += "\nAddress: " + address;
        returnString += "\nProvince: " + province;
        returnString += "\nCity: " + city;
        returnString += "\nPostal Code: " + postal;
        returnString += "\nPhone: " + phone;
        returnString += "\nEmail: " + email;

        String extraString = "";
        if (council) { extraString += "Student Council"; }
        if (volunteer)
        {
            if (council) { extraString += ", "; }
            extraString += "Volunteer";
        }

        if (council || volunteer) {
            returnString += "\nExtra Activities: " + extraString;
        }
        else {
            returnString += "\nExtra Activities: None";
        }

        String majorString = "";
        if (studentMajor == major.computerScience) {
            majorString = "\nMajor: Computer Science";
        }
        else if (studentMajor == major.business) {
            majorString = "\nMajor: Business";
        }

        if (!majorString.isEmpty()) { returnString += majorString; }

        String classList = "";

        for (String aClass : classes) {
            classList += aClass;
        }

        if (!classList.isEmpty()) { returnString += "\nClasses: " + classList; }

        return returnString;
    }
}
