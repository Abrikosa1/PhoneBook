/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package phonebook.DAL;

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
public class PhoneNumberDALTest {
    
    public PhoneNumberDALTest() {
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

    /**
     * Test of selectAll method, of class PhoneNumberDAL.
     */
    @Test
    public void testSelectAll() {
       System.out.println("selectAll");
        PhoneNumberDAL instance = new PhoneNumberDAL();
        List<PhoneNumber> result = instance.selectAll();
        assertTrue(result!=null && result.size()>0);
    }

    /**
     * Test of selectById method, of class PhoneNumberDAL.
     */
    @Test
    public void testSelectById() {
        System.out.println("selectById");
        int id = 4;
        PhoneNumberDAL instance = new PhoneNumberDAL();
        PhoneNumber result = instance.selectById(id);
        assertTrue(result!=null && result.getId()==id);
    }

    /**
     * Test of insert method, of class PhoneNumberDAL.
     */
    @Test
    public void testInsert() {
        assertTrue(false);
    }

    /**
     * Test of update method, of class PhoneNumberDAL.
     */
    @Test
    public void testUpdate() {
        assertTrue(false);
    }


    /**
     * Test of deleteById method, of class PhoneNumberDAL.
     */
    @Test
    public void testDeleteById() {
        System.out.println("deleteById");
        int id = 0;
       PhoneNumberDAL instance = new PhoneNumberDAL();
        PhoneNumber expResult = null;
        PhoneNumber result = instance.deleteById(id);
        assertEquals(expResult, result);
    }

 
  
}
