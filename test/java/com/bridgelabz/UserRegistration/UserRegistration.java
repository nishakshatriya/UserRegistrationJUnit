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
}
