/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package com.mycompany.mavenproject8;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author Student
 */
public class ClassLoginTest {
    
    public ClassLoginTest() {
    }
    
    

    /**
     * Test of setName method, of class ClassLogin.
     */
    @Test
    public void testSetName() {
        System.out.println("setName");
        String name = "nnapap";
        ClassLogin instance = new ClassLogin();
        instance.setName(name);
        }

    /**
     * Test of getName method, of class ClassLogin.
     */
    @Test
    public void testGetName() {
        System.out.println("getName");
        ClassLogin instance = new ClassLogin();
        String expResult = "";
        String result = instance.getName();
        assertEquals(expResult, result);
        }

    /**
     * Test of setSurname method, of class ClassLogin.
     */
    @Test
    public void testSetSurname() {
        System.out.println("setSurname");
        String surname = "mmoyylylylyly";
        ClassLogin instance = new ClassLogin();
        instance.setSurname(surname);
        }

    /**
     * Test of getSurname method, of class ClassLogin.
     */
    @Test
    public void testGetSurname() {
        System.out.println("getSurname");
        ClassLogin instance = new ClassLogin();
        String expResult = "";
        String result = instance.getSurname();
        assertEquals(expResult, result);
        }

    /**
     * Test of setUserName method, of class ClassLogin.
     */
    @Test
    public void testSetUserName() {
        System.out.println("setUserName");
        String username = "rrr";
        ClassLogin instance = new ClassLogin();
        instance.setUserName(username);
          }

    /**
     * Test of getUsername method, of class ClassLogin.
     */
    @Test
    public void testGetUsername() {
        System.out.println("getUsername");
        ClassLogin instance = new ClassLogin();
        String expResult = "";
        String result = instance.getUsername();
        assertEquals(expResult, result);
        }

    /**
     * Test of setPhone_number method, of class ClassLogin.
     */
    @Test
    public void testSetPhone_number() {
        System.out.println("setPhone_number");
        String phone_number = "2121";
        ClassLogin instance = new ClassLogin();
        instance.setPhone_number(phone_number);
        }

    /**
     * Test of getPhone_number method, of class ClassLogin.
     */
    @Test
    public void testGetPhone_number() {
        System.out.println("getPhone_number");
        ClassLogin instance = new ClassLogin();
        String expResult = "";
        String result = instance.getPhone_number();
        assertEquals(expResult, result);
        }

    /**
     * Test of setPassword method, of class ClassLogin.
     */
    @Test
    public void testSetPassword() {
        System.out.println("setPassword");
        String password = "";
        ClassLogin instance = new ClassLogin();
        instance.setPassword(password);
          }

    /**
     * Test of getPassword method, of class ClassLogin.
     */
    @Test
    public void testGetPassword() {
        System.out.println("getPassword");
        ClassLogin instance = new ClassLogin();
        String expResult = "wewe";
        String result = instance.getPassword();
        assertEquals(expResult, result);
        }

    /**
     * Test of checkUsername method, of class ClassLogin.
     */
    @Test
    public void testCheckUsername() {
        System.out.println("checkUsername");
        String username = "";
        ClassLogin instance = new ClassLogin();
        boolean expResult = false;
        boolean result = instance.checkUsername(username);
        assertEquals(expResult, result);
        }

    /**
     * Test of checkPassword method, of class ClassLogin.
     */
    @Test
    public void testCheckPassword() {
        System.out.println("checkPassword");
        String password = "";
        ClassLogin instance = new ClassLogin();
        boolean expResult = false;
        boolean result = instance.checkPassword(password);
        assertEquals(expResult, result);
       }

    /**
     * Test of checkPhoneNumber method, of class ClassLogin.
     */
    @Test
    public void testCheckPhoneNumber() {
        System.out.println("checkPhoneNumber");
        String phone_number = "333";
        ClassLogin instance = new ClassLogin();
        boolean expResult = false;
        boolean result = instance.checkPhoneNumber(phone_number);
        assertEquals(expResult, result);
        }

    /**
     * Test of RegisterUser method, of class ClassLogin.
     */
    @Test
    public void testRegisterUser() {
        System.out.println("RegisterUser");
        String password = "Nnao@2004";
        String username = "Kyl_1";
        String phone_number = "+27842632439";
        ClassLogin instance = new ClassLogin();
        String expResult = "";
        String result = instance.RegisterUser(password, username, phone_number);
        assertEquals(expResult, result);
        
    }

    /**
     * Test of loginUser method, of class ClassLogin.
     */
    @Test
    public void testLoginUser() {
        System.out.println("loginUser");
        String password = "";
        String username = "";
        ClassLogin instance = new ClassLogin();
        boolean expResult = false;
        boolean result = instance.loginUser(password, username);
        assertEquals(expResult, result);
        
    }

    /**
     * Test of returnLoginStatus method, of class ClassLogin.
     */
    @Test
    public void testReturnLoginStatus() {
        System.out.println("returnLoginStatus");
        String Username = "";
        String Password = "";
        ClassLogin instance = new ClassLogin();
        String expResult = "";
        String result = instance.returnLoginStatus(Username, Password);
        assertEquals(expResult, result);
        
    }
    
}
