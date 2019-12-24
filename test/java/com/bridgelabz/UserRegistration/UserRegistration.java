package com.bridgelabz.UserRegistration;
public class UserRegistration {

    public String validatingUserName(String firstname) {
        if (firstname.matches("^[A-Z]{1}[a-zA-Z]{2,}$"))
            return "Valid" ;
        else
            return "Invalid" ;
    }

    public String validatingUserLastName(String lastname) {
        if(lastname.matches("^[A-Z]{1}[a-zA-Z]{2,}$"))
            return "Valid";
        else
            return "Invalid";
    }

    public String validatingEmailId(String id) {
        if(id.matches("^[a-zA-Z0-9]{1,}[.]?[a-zA-Z0-9]{1,}[@][a-zA-Z0-9]{1,}([.][a-zA-Z]{2,4}){1,3}$"))
            return "Valid";
        else
            return "Invalid";
    }

    public String validatingMobileNumberFormat(String number_format) {
        if(number_format.matches("^[+]?([0-9]{2})?[ ]?[0-9]{10}$"))
            return "Valid";
        else
            return "Invalid";
    }

    public String validatingPassword(String pswd) {
    if(pswd.matches("(?=.*[A-Z])(?=.*[0-9])(?=.*[a-z])(?=.*[+@#$%^&*!.()-]).{8,}"))
        return  "Valid";
    else
        return "Invalid";

    }
}
