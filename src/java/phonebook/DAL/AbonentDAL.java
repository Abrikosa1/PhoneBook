
package phonebook.DAL;

import java.util.List;
import phonebook.model.Abonent;
import org.apache.ibatis.session.SqlSession;

public class AbonentDAL extends BaseDAL {

    public AbonentDAL() {
        super();
    }
    public List<Abonent> selectAll()
    {
        SqlSession session = sqlSessionFactory.openSession(); 
        List<Abonent> abonents =  session.selectList("abonent.selectAll"); 
        session.close(); 
        return abonents;
    }
    
    public Abonent selectById(int id)
    {
        SqlSession session = sqlSessionFactory.openSession(); 
        Abonent abonent =  session.selectOne("abonent.selectById",id); 
        session.close(); 
        return abonent;
    }
    
    public int insert(Abonent abonent)
    {
        SqlSession session = sqlSessionFactory.openSession(); 
        int count = session.insert("abonent.insert",abonent);
        session.commit();
        session.close(); 
        return  count;
    }
     public int update(Abonent abonent)
    {
        SqlSession session = sqlSessionFactory.openSession(); 
        int count = session.update("abonent.update",abonent);
        session.commit();
        session.close(); 
        return  count;
    }
    public int delete(Abonent abonent)
    {
        SqlSession session = sqlSessionFactory.openSession(); 
        int count = session.delete("abonent.delete",abonent);
        session.commit();
        session.close(); 
        return  count;
    }
     public Abonent deleteById(int id)
    {
        SqlSession session = sqlSessionFactory.openSession(); 
        Abonent abonent =  session.selectOne("abonent.deleteById",id);
        session.commit();
        session.close(); 
        return abonent;
    }
     
}