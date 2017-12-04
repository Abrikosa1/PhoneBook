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
import phonebook.model.PhoneNumber;
import org.codehaus.jackson.map.ObjectMapper;

/**
 * 
 *
 * @author Пользователь
 */
public class JsonPhoneNumberMapper {
    
    public static String toJSON(PhoneNumber phonenumber)
    {
        try{
    ObjectMapper mapper = new ObjectMapper();
    String json=mapper.writeValueAsString(phonenumber);
    return json;
        }
        catch (IOException ex)
        {
        Logger.getLogger(JsonPhoneNumberMapper.class.getName()).log(Level.SEVERE,null,ex);
        }
        return null;
    }
    
    public static String toJSON(List<PhoneNumber>phonenumber)
    {
    try {
            ObjectMapper mapper = new ObjectMapper();
            String json=mapper.writeValueAsString(phonenumber);
            return json;
        } catch (IOException ex) {
            Logger.getLogger(JsonPhoneNumberMapper.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
    }
    public static PhoneNumber fromJSON(String json)  {
        try {
            ObjectMapper mapper = new ObjectMapper();
            PhoneNumber category = mapper.readValue(json, PhoneNumber.class);
            return category;
        } catch (IOException ex) {
            Logger.getLogger(JsonPhoneNumberMapper.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
    }
}
