/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package phonebook.DAL;

import java.util.List;
import phonebook.model.Admin;
import org.apache.ibatis.session.SqlSession;

/**
 *
 * @author Alex
 */
public class AdminDAL extends BaseDAL {

    public AdminDAL() {
        super();
    }
    public List<Admin> selectAll()
    {
        SqlSession session = sqlSessionFactory.openSession(); 
        List<Admin> admins =  session.selectList("admin.selectAll"); 
        session.close(); 
        return admins;
    }
    
    public Admin selectById(int id)
    {
        SqlSession session = sqlSessionFactory.openSession(); 
        Admin admin =  session.selectOne("admin.selectById",id); 
        session.close(); 
        return admin;
    }
    
    public int insert(Admin admin)
    {
        SqlSession session = sqlSessionFactory.openSession(); 
        int count = session.insert("admin.insert",admin);
        session.commit();
        session.close(); 
        return  count;
    }
     public int update(Admin admin)
    {
        SqlSession session = sqlSessionFactory.openSession(); 
        int count = session.update("admin.update",admin);
        session.commit();
        session.close(); 
        return  count;
    }
    public int delete(Admin admin)
    {
        SqlSession session = sqlSessionFactory.openSession(); 
        int count = session.delete("admin.delete",admin);
        session.commit();
        session.close(); 
        return  count;
    }
public Admin deleteById(int id)
    {
        SqlSession session = sqlSessionFactory.openSession(); 
        Admin abonent =  session.selectOne("admin.deleteById",id);
        session.commit();
        session.close(); 
        return abonent;
    }    
     
}