/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package happyucan;

import java.sql.*;

/**
 *
 * @author KC
 */
public class Display extends Connect{
 
    public void Display() throws SQLException{
        
        try
        {
        int count = 0;
        
        while(resultset.next()){
            String DATE = resultset.getString("GLDate");
            
            System.out.println(count + " " + DATE);
        
            count++;
            }
        }
        catch(Exception X)
        {
        }
    }
}
