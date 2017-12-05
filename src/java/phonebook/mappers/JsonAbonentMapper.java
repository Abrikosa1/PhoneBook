/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package phonebook.mappers;

import java.io.IOException;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import phonebook.model.Abonent;
import org.codehaus.jackson.map.ObjectMapper;

/**
 * 
 *
 * @author Пользователь
 */
public class JsonAbonentMapper {
    
    public static String toJSON(Abonent abonent)
    {
    try{
            
    ObjectMapper mapper = new ObjectMapper();
    String json=mapper.writeValueAsString(abonent);
    return json;
        }
        catch (IOException ex)
        {
        Logger.getLogger(JsonAbonentMapper.class.getName()).log(Level.SEVERE,null,ex);
        }
        return null;
    }
    
    public static String toJSON(List<Abonent>abonent)
    {
    try {
            ObjectMapper mapper = new ObjectMapper();
            String json=mapper.writeValueAsString(abonent);
            return json;
        } catch (IOException ex) {
            Logger.getLogger(JsonAbonentMapper.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
    }
    public static Abonent fromJSON(String json)  {
        try {
            ObjectMapper mapper = new ObjectMapper();
            Abonent category = mapper.readValue(json, Abonent.class);
            return category;
        } catch (IOException ex) {
            Logger.getLogger(JsonAbonentMapper.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
    }
}
