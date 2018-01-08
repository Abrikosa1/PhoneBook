/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package phonebook.controllers;

import java.util.List;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;
import phonebook.model.PhoneNumber;

/**
 *
 * @author Пользователь
 */
public class PhoneNumberControllerTest {
    
    public PhoneNumberControllerTest() {
    }
    
    @Test
    public void testGetAllPhoneNumber() {
        System.out.println("PhoneNumberController getAllPhoneNumber");
        PhoneNumberController instance = new PhoneNumberController();
        List<PhoneNumber> result = instance.getAllPhoneNumber();
        assertTrue(result!=null && result.size()>0);

    }

 
    @Test
    public void testGetPhoneNumberById() {
        System.out.println("PhoneNumberController getPhoneNumberById");
        int id = 2;
        PhoneNumberController instance = new PhoneNumberController();
        PhoneNumber result = instance.getPhoneNumberById(id);
        assertTrue(result!=null && result.getId()==2);
    }
    
}
