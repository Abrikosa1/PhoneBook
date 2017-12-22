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
public class AbonentTest {
    
    public AbonentTest() {
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
    public void testCreateAbonent() {
        System.out.println("test Abonent create Abonent");
        Abonent abonent = new Abonent(1,"firstName","lastName","patronymic");
        
        assertEquals(abonent.getId(),1);
        assertEquals(abonent.getFirstName(), "firstName");
        assertEquals(abonent.getLastName(),"lastName");
        assertEquals(abonent.getPatronymic(),"patronymic");
        
        abonent.setId(2);
        assertEquals(abonent.getId(),2);
        
        abonent.setFirstName("Ivan");
        assertEquals(abonent.getFirstName(),"Ivan");
        
        abonent.setLastName("Ivanov");
        assertEquals(abonent.getLastName(),"Ivanov");  
        
        abonent.setPatronymic("Ivanich");
        assertEquals(abonent.getPatronymic(),"Ivanich"); 
    }
    @Test
    public void testEquals() {
        System.out.println("test Abonent equals");
        Abonent abonent1 = new Abonent(1, "firstName", "lastName","patronymic");
        Abonent abonent2 = new Abonent(1, "firstName", "lastName","patronymic");
        Abonent abonent3 = new Abonent(3, "John", "Johnson","Johnsonovich");
        
        assertTrue(abonent1.equals(abonent2));
        assertFalse(abonent1.equals(abonent3));
    }
}
