package phonebook.DAL;

import java.util.List;
import phonebook.model.Abonent;
import org.junit.Test;
import static org.junit.Assert.*;


public class AbonentDalTest {
    
    public AbonentDalTest() {
    }

    /**
     * Test of selectAll method, of class AbonentDal.
     */
    @Test
    public void testSelectAll() {
        System.out.println("AbonentDal selectAll");
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
        Abonent result = instance.selectAbonentById(id);
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
    
}