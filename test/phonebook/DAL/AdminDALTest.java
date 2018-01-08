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
import phonebook.model.Admin;

/**
 *
 * @author Пользователь
 */
public class AdminDALTest {
    
    public AdminDALTest() {
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
     * Test of selectAll method, of class AdminDAL.
     */
    @Test
    public void testSelectAll() {
        System.out.println("adminDal selectAll");
        AdminDAL instance = new AdminDAL();
        List<Admin> result = instance.selectAll();
        assertTrue(result!=null && result.size()>0);
    }

    /**
     * Test of selectById method, of class AdminDAL.
     */
    @Test
    public void testSelectById() {
        System.out.println("selectById");
        int id = 2;
        AdminDAL instance = new AdminDAL();
        Admin result = instance.selectById(id);
        assertTrue(result!=null && result.getId()==id);
    }

    /**
     * Test of insert method, of class AdminDAL.
     */
    @Test
    public void testInsert() {
        assertTrue(false);
    }

    /**
     * Test of update method, of class AdminDAL.
     */
    @Test
    public void testUpdate() {
        assertTrue(false);
    }


    /**
     * Test of deleteById method, of class AdminDAL.
     */
    @Test
    public void testDeleteById() {
        System.out.println("deleteById");
        int id = 0;
        AdminDAL instance = new AdminDAL();
        Admin expResult = null;
        Admin result = instance.deleteById(id);
        assertEquals(expResult, result);
    }


    
}
