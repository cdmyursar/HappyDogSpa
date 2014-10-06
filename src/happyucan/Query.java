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
public class Query extends Connect {
    
    public void Query() throws SQLException
    {
  
        try
        {
        statement = connection.createStatement();
        String SQL;
            SQL = "SELECT GLDescription FROM GroomingLog";
        resultset = statement.executeQuery(SQL);
        
        
        
        while(resultset.next()){
            int count = 0;
            String DATE = resultset.getString("GLDate");
            
            System.out.println(count + " " + DATE);
        
            count++;
            }
        }
        catch(Exception X)
                {
                    System.out.println(X);
                }
        
          
                
    }
}
