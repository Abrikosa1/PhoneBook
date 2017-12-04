/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package phonebook.DAL;

import java.util.List;
import phonebook.model.PhoneNumber;
import org.apache.ibatis.session.SqlSession;

/**
 *
 * @author Alex
 */
public class PhoneNumberDAL extends BaseDAL {

    public PhoneNumberDAL() {
        super();
    }
    public List<PhoneNumber> selectAll()
    {
        SqlSession session = sqlSessionFactory.openSession(); 
        List<PhoneNumber> phonenumbers =  session.selectList("phonenumber.selectAll"); 
        session.close(); 
        return phonenumbers;
    }
    
    public PhoneNumber selectById(int id)
    {
        SqlSession session = sqlSessionFactory.openSession(); 
        PhoneNumber phonenumber =  session.selectOne("phonenumber.selectById",id); 
        session.close(); 
        return phonenumber;
    }
    
    public int insert(PhoneNumber phonenumber)
    {
        SqlSession session = sqlSessionFactory.openSession(); 
        int count = session.insert("phonenumber.insert",phonenumber);
        session.commit();
        session.close(); 
        return  count;
    }
     public int update(PhoneNumber phonenumber)
    {
        SqlSession session = sqlSessionFactory.openSession(); 
        int count = session.update("phonenumber.update",phonenumber);
        session.commit();
        session.close(); 
        return  count;
    }
    public int delete(PhoneNumber phonenumber)
    {
        SqlSession session = sqlSessionFactory.openSession(); 
        int count = session.delete("phonenumber.delete",phonenumber);
        session.commit();
        session.close(); 
        return  count;
    }
    public PhoneNumber deleteById(int id)
    {
        SqlSession session = sqlSessionFactory.openSession(); 
        PhoneNumber abonent =  session.selectOne("phonenumber.deleteById",id);
        session.commit();
        session.close(); 
        return abonent;
    }
     
}