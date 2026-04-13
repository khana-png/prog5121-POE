/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.mavenproject8;

/**
 *
 * @author Student
 */
class ClassLogin {

    private String Name;
    private String Surname;
    private String Phone_number;
    private String Username;
    private String Password;

    // Setters and Getters
    public void setName(String name) {
        this.Name = name;
    }

    public String getName() {
        return Name;
    }

    public void setSurname(String surname) {
        this.Surname = surname;
    }

    public String getSurname() {
        return Surname;
    }

    public void setUserName(String username) {
        this.Username = username;
    }

    public String getUsername() {
        return Username;
    }

    public void setPhone_number(String phone_number) {
        this.Phone_number = phone_number;
    }

    public String getPhone_number() {
        return Phone_number;
    }

    public void setPassword(String password) {
        this.Password = password;
    }

    public String getPassword() {
        return Password;
    }

    // Validation Methods
    public boolean checkUsername(String username) {
        return username.contains("_") && username.length() <= 5;
    }

    public boolean checkPassword(String password) {
        return password.matches("^(?=.*[A-Z])(?=.*[0-9])(?=.*[!@#$%^&*(),.?\":{}|<>]).{8,}$");
    }

    public boolean checkPhoneNumber(String phone_number) {
        return phone_number.startsWith("+27") && phone_number.length() == 12;
    }

    // Registration Message
    public String RegisterUser(String password, String username, String phone_number) {
        
        if (checkUsername(username) && checkPassword(password) && checkPhoneNumber(phone_number)) {
            return "Registration Successful.";
        } else if (!checkUsername(username)) {
            return "Username does not meet requirements.";
        } else {
            return "Password does not meet requirements.";
        }
    }

    // Login check
    public boolean loginUser(String password, String username) {
        return this.Username.equals(username) && this.Password.equals(password);
    }

    public String returnLoginStatus(String Username, String Password) {
        if (checkPassword(Password) && checkUsername(Username)) {
            return "Login Successful.\nWelcome " + getName() + " " + getSurname();
        } else {
            return "Login Unsuccessful. Username or Password incorrect.";
        }
    }
}
