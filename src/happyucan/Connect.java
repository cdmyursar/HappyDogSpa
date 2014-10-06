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
public class Connect {
    

    
    public Connection connection;
    public Statement statement;
    public ResultSet resultset;
    
    public void Connect() throws ClassNotFoundException, SQLException {
    
   
       
        
        System.out.println("Start of connect class");
        Class.forName("net.ucanaccess.jdbc.UcanaccessDriver");
        System.out.println("Driver loaded");
       
        System.out.println("start of connection");
        connection = DriverManager.getConnection("jdbc:ucanaccess://C:/Users/KC/Documents/NetBeansProjects/HappyUCan/src/happyucan/DataBase/wkennel.mdb");
        System.out.println("Database Connected");
        
//        statement = connection.createStatement();
//        String SQL;
//            SQL = "SELECT GLDescription FROM GroomingLog";
//        resultset = statement.executeQuery(SQL);
//        System.out.println("Query executed");
//                
//        
//        while(resultset.next()){
//            int count = 0;
//            String DATE = resultset.getString("GLDescription");
//            
//            System.out.println(count + " " + DATE);
//        
//            count++;
//        }
//        }
//        catch(ClassNotFoundException | SQLException X)
//        {
//            
//        }
        }
       
        
      
        
    
}
 
    
