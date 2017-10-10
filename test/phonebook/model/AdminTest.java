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
public class AdminTest {
    
    public AdminTest() {
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
    public void testCreateAdmin() {
        System.out.println("test Admin create Admin");
       Admin admin = new Admin(1,"login", "password");
        
        assertEquals(admin.getId(),1);
        assertEquals(admin.getLogin(), "login");
        assertEquals(admin.getPassword(),"password");
        
        admin.setId(2);
        assertEquals(admin.getId(),2);
        
        admin.setLogin("Vasyan007");
        assertEquals(admin.getLogin(),"Vasyan007");
        
        admin.setPassword("1234567");
        assertEquals(admin.getPassword(),"1234567");
       
    }
    
    @Test
    public void testEquals() {
       System.out.println("test Admin equals");
        Admin admin1 = new Admin(1,"login", "password");
        Admin admin2 = new Admin(1,"login", "password");
        Admin admin3 = new Admin(3,"Vasyam007", "1234567");
        
        assertTrue(admin1.equals(admin2));
        assertFalse(admin1.equals(admin3));
    }

    
}
