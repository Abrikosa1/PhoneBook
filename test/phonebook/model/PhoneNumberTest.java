/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package phonebook.model;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Пользователь
 */
public class PhoneNumberTest {
    
    public PhoneNumberTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

     @Test
    public void testCreatePhoneNumber() {
        System.out.println("test PhoneNumber create PhoneNumber");
        PhoneNumber phoneNumber = new PhoneNumber(1,"phoneNum");
        
        assertEquals(phoneNumber.getId(),1);
        assertEquals(phoneNumber.getPhoneNum(), "phoneNum");
        
        phoneNumber.setId(2);
        assertEquals(phoneNumber.getId(),2);
        
        phoneNumber.setPhoneNum("8(983)1167453");
        assertEquals(phoneNumber.getPhoneNum(),"8(983)1167453");

       
    }
    @Test
    public void testEquals() {
        System.out.println("test PhoneNumber equals");
        PhoneNumber phoneNumber1 = new PhoneNumber(1,"phoneNum");
        PhoneNumber phoneNumber2 = new PhoneNumber(1,"phoneNum");
        PhoneNumber phoneNumber3 = new PhoneNumber(3,"8(983)1167453");
 
        
        assertTrue(phoneNumber1.equals(phoneNumber2));
        assertFalse(phoneNumber1.equals(phoneNumber3));
    }

    
}
