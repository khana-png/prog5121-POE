/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.mavenproject8;
import java.util.Scanner;

/**
 *
 * @author Student
 */
public class Mavenproject8 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        ClassLogin use = new ClassLogin();
        
        
           System.out.print(" Do you want to login? (Yes/No): ");
        String choice = input.nextLine();

        if (choice.equalsIgnoreCase("no")) {
            System.out.println("Program stoped.");
             
        } 
        else if (choice.equalsIgnoreCase("yes")) {

        
        //System.out.println("===== USER REGISTRATION =====");
        System.out.println(" Hello and welcome ");
        System.out.print(" Please enter your name ");
        String name = input.nextLine();
        use.setName(name);

        System.out.print(" Enter your surname ");
        String surname = input.nextLine();
        use.setSurname(surname);

        System.out.print(" Enter your phone number (e.g. +27831234567) ");
        String phone_number = input.nextLine();
        use.setPhone_number(phone_number);

        while (!use.checkPhoneNumber(phone_number)) {
            System.out.println(" Phone number incorrectly formatted or missing international code.");
            System.out.print(" Please enter again (e.g. +27831234567) ");
            phone_number = input.nextLine();
            use.setPhone_number(phone_number);
        }
        System.out.println("Phone number successfully captured.");

        System.out.print("Enter your username (must contain _ and be ≤ 5 characters) ");
        String username = input.nextLine();
        use.setUserName(username);

        while (!use.checkUsername(username)) {
            System.out.println(" Username incorrectly formatted.");
            System.out.print(" Ensure it contains '_' and is no more than 5 characters ");
            username = input.nextLine();
            use.setUserName(username);
        }
        System.out.println(" Username successfully captured.");

        System.out.print(" Enter your password (Min 8 chars, with capital letter, number, and special character): ");
        String password = input.nextLine();
        use.setPassword(password);

        while (!use.checkPassword(password)) {
            System.out.println(" Password does not meet complexity requirements.");
            System.out.print(" Try again: ");
            password = input.nextLine();
            use.setPassword(password);
        }
        System.out.println(" Password successfully captured.");

        // Show registration message
        //System.out.println(use.RegisterUser(password, username));

        // Login Section
        System.out.println("\n===== USER LOGIN =====");

        System.out.print(" Enter your username: ");
        String loginUsername = input.nextLine();

        System.out.print(" Enter your password: ");
        String loginPassword = input.nextLine();

        while (!use.loginUser(loginPassword, loginUsername)) {
            System.out.println(" Username or password is incorrect, please try again.");

            System.out.print(" Enter your username: ");
            loginUsername = input.nextLine();

            System.out.print(" Enter your password: ");
            loginPassword = input.nextLine();
        }

        
        System.out.println(use.returnLoginStatus(loginUsername, loginPassword));

        
        
    }
}
}
