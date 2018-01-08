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
import phonebook.model.Admin;

/**
 *
 * @author Пользователь
 */
public class AdminControllerTest {
    
    public AdminControllerTest() {
    }
    
    @Test
    public void testGetAllAdmin() {
        System.out.println("AdminController getAllAdmin");
        AdminController instance = new AdminController();
        List<Admin> result = instance.getAllAdmin();
        assertTrue(result!=null && result.size()>0);

    }

 
    @Test
    public void testGetAdminById() {
        System.out.println("AdminController getAdminById");
        int id = 2;
        AdminController instance = new AdminController();
        Admin result = instance.getAdminById(id);
        assertTrue(result!=null && result.getId()==2);
    }
    
}
