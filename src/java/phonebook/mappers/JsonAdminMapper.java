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
import phonebook.model.Admin;
import org.codehaus.jackson.map.ObjectMapper;

/**
 * 
 *
 * @author Пользователь
 */
public class JsonAdminMapper {
    
    public static String toJSON(Admin admin)
    {
        try{
    ObjectMapper mapper = new ObjectMapper();
    String json=mapper.writeValueAsString(admin);
    return json;
        }
        catch (IOException ex)
        {
        Logger.getLogger(JsonAdminMapper.class.getName()).log(Level.SEVERE,null,ex);
        }
        return null;
    }
    
    public static String toJSON(List<Admin>admin)
    {
    try {
            ObjectMapper mapper = new ObjectMapper();
            String json=mapper.writeValueAsString(admin);
            return json;
        } catch (IOException ex) {
            Logger.getLogger(JsonAdminMapper.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
    }
    public static Admin fromJSON(String json)  {
        try {
            ObjectMapper mapper = new ObjectMapper();
            Admin category = mapper.readValue(json, Admin.class);
            return category;
        } catch (IOException ex) {
            Logger.getLogger(JsonAdminMapper.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
    }
}
