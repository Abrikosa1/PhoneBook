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
import phonebook.model.Abonent;

/**
 *
 * @author Пользователь
 */
public class AbonentControllerTest {
    
    public AbonentControllerTest() {
    }
    
    @Test
    public void testGetAllAbonent() {
        System.out.println("AbonentController getAllAbonent");
        AbonentController instance = new AbonentController();
        List<Abonent> result = instance.getAllAbonent();
        assertTrue(result!=null && result.size()>0);

    }

 
    @Test
    public void testGetAbonentById() {
        System.out.println("AbonentController getAbonentById");
        int id = 2;
        AbonentController instance = new AbonentController();
        Abonent result = instance.getAbonentById(id);
        assertTrue(result!=null && result.getId()==2);
    }
}
