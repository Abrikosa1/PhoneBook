/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package phonebook.controllers;

import java.util.List;
import phonebook.DAL.PhoneNumberDAL;
import phonebook.model.PhoneNumber;

/**
 *
 * @author Alex
 */
public class PhoneNumberController 
{
    protected PhoneNumberDAL phonenumberDal;
    public PhoneNumberController() 
    {
        phonenumberDal = new PhoneNumberDAL();
    }
    
    public List<PhoneNumber> getAllPhoneNumber()
    {
        return phonenumberDal.selectAll();
    }
    
    public PhoneNumber getPhoneNumberById(int id)
    {
        return phonenumberDal.selectById(id);
    }
     
    public int insertPhoneNumber(PhoneNumber phonenumber)
    {
        return phonenumberDal.insert(phonenumber);
    }
      
    public int updatePhoneNumber(PhoneNumber phonenumber)
    {
        return phonenumberDal.update(phonenumber);
    }
    
    public PhoneNumber deletePhoneNumberById(int id)
    {
        return phonenumberDal.deleteById(id);
    }
}