/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package phonebook.api;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Пользователь
 */
public class GetAllAbonentTest {
    
    public GetAllAbonentTest() {
    }
    
     @Test
    public void testDoGet() throws Exception {
        // TODO request respons create error
        System.out.println("doGet");
        HttpServletRequest request = null;
        HttpServletResponse response = null;
        GetAllAbonent instance = new GetAllAbonent();
        instance.doGet(request, response);
        assertEquals(response.toString(), " ");
     }
    
}
