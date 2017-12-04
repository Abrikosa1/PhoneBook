/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package phonebook.controllers;

import java.util.List;
import phonebook.DAL.AdminDAL;
import phonebook.model.Admin;

/**
 *
 * @author Alex
 */
public class AdminController 
{
    protected AdminDAL adminDal;
    public AdminController() 
    {
        adminDal = new AdminDAL();
    }
    
    public List<Admin> getAllAdmin()
    {
        return adminDal.selectAll();
    }
    
    public Admin getAdminById(int id)
    {
        return adminDal.selectById(id);
    }
     
    public int insertAdmin(Admin admin)
    {
        return adminDal.insert(admin);
    }
      
    public int updateAdmin(Admin admin)
    {
        return adminDal.update(admin);
    }
    
    public Admin deleteAdminById(int id)
    {
        return adminDal.deleteById(id);
    }
}