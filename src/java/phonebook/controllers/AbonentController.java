/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package phonebook.controllers;

import java.util.List;
import phonebook.DAL.AbonentDAL;
import phonebook.model.Abonent;


public class AbonentController 
{
    protected AbonentDAL abonentDal;
    public AbonentController() 
    {
        abonentDal = new AbonentDAL();
    }
    
    public List<Abonent> getAllAbonent()
    {
        return abonentDal.selectAll();
    }
    
    public Abonent getAbonentById(int id)
    {
        return abonentDal.selectById(id);
    }
     
    public int insertAbonent(Abonent abonent)
    {
        return abonentDal.insert(abonent);
    }
      
    public int updateAbonent(Abonent abonent)
    {
        return abonentDal.update(abonent);
    }
    
    public Abonent deleteAbonentById(int id)
    {
        return abonentDal.deleteById(id);
    }
}