/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package happyucan;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import com.healthmarketscience.jackcess.Database;
import com.healthmarketscience.jackcess.DatabaseBuilder;
import java.util.Date;

/**
 *
 * @author KC
 */
public class HappyUCan {

      
    /**
     * @param args the command line arguments
     * @throws java.lang.ClassNotFoundException
     * @throws java.sql.SQLException
     */
     
     
    public static void main(String[] args) throws ClassNotFoundException, SQLException{
        // TODO code application logic here
     
        Date date = new Date();
        System.out.println(date);
        
    Connection connection;
    Statement statement;
    ResultSet resultset;
  
  
        
    
        
        System.out.println("Start of connect class");
        Class.forName("net.ucanaccess.jdbc.UcanaccessDriver");
        System.out.println("Driver loaded");
       
        System.out.println("start of connection");
        connection = DriverManager.getConnection("jdbc:ucanaccess://C:\\Users\\KC\\Documents\\NetBeansProjects\\HappyUCan\\src\\happyucan\\DataBase\\wkennel.mdb");
        System.out.println("Database Connected");
       
        System.out.println("start of query statement");
        statement = connection.createStatement();
        System.out.println("Statement created");
        String SQL;
            SQL = "SELECT * FROM GroomingLog WHERE GLDate=Date()"; // this works '2014-10-02 00:00:00.000000'
        System.out.println("start of Query execute");
        resultset = statement.executeQuery(SQL);
        System.out.println("Query executed");
                
        System.out.println("start of while loop");
         int count = 0;
         
         
        while(resultset.next()){
          
           //if(getresult.equals(date.toString())){
            String DESCRIPTION = resultset.getString("GLDescription");
            String GLDATE = resultset.getString("GLDate");
            
            System.out.println(count + " " + GLDATE + " " + DESCRIPTION);
                    
            count++;
        //}
        }
        System.out.println("exit while loop 1");
        
    
        
        
        
        
        
        
       }
}
    

