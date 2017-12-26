package phonebook.DAL;

import java.util.List;
import org.junit.After;
import org.junit.AfterClass;
import phonebook.model.Abonent;
import org.junit.Test;
import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.BeforeClass;


public class AbonentDalTest {
    
    public AbonentDalTest() {
    }

    @BeforeClass
    public static void setUpClass() throws Exception {
    }

    @AfterClass
    public static void tearDownClass() throws Exception {
    }

    @Before
    public void setUp() throws Exception {
    }

    @After
    public void tearDown() throws Exception {
    }

    /**
     * Test of selectAll method, of class AbonentDal.
     */
    @Test
    public void testSelectAll() {
        System.out.println("AbonentDAL selectAll");
        AbonentDAL instance = new AbonentDAL();
        List<Abonent> result = instance.selectAll();
        assertTrue(result!=null && result.size()>0);
    }

    /**
     * Test of selectById method, of class AbonentDal.
     */
    @Test
    public void testSelectById() {
        System.out.println("selectById");
        int id = 1;
        AbonentDAL instance = new AbonentDAL();
        Abonent result = instance.selectById(id);
        assertTrue(result!=null && result.getId()==id);
    }

    /**
     * Test of update method, of class AbonentDal.
     */
    @Test
    public void testUpdate() {
       assertTrue(false);
    }

    /**
     * Test of insert method, of class AbonentDal.
     */
    @Test
    public void testInsert() {
       assertTrue(false);
    }

    /**
     * Test of delete method, of class AbonentDal.
     */
    @Test
    public void testDelete() {
      assertTrue(false);
    }

    /**
     * Test of deleteById method, of class AbonentDAL.
     */
    @Test
    public void testDeleteById() {
        System.out.println("deleteById");
        int id = 0;
        AbonentDAL instance = new AbonentDAL();
        Abonent expResult = null;
        Abonent result = instance.deleteById(id);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
    
}