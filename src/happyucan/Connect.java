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
    
    
    private Connection connection;
    private Statement statement;
    private ResultSet resultset;
    
    public void Connect() throws ClassNotFoundException, SQLException  {
        System.out.println("Start of connect class");
        Class.forName("net.ucanaccess.jdbc.UcanaccessDriver");
        System.out.println("Driver loaded");
       
        
        System.out.println("start of connection");
        connection = DriverManager.getConnection("jdbc:ucanaccess://C:\\Users\\KC\\Documents\\NetBeansProjects\\HappyUCan\\src\\happyucan\\DataBase\\wkennel.mdb");
        System.out.println("Database Connected"); 
    }
    
  
    
    public void Display() throws SQLException{
       
        System.out.println("start of query statement");
        statement = connection.createStatement();
        System.out.println("Statement created");
        
        String SQL;
            SQL = "SELECT * FROM GroomingLog WHERE GLDate='2014-10-02 00:00:00.000000' "; // this works '2014-10-02 00:00:00.000000'     GLDate=Date
            
        System.out.println("start of Query execute");
        resultset = statement.executeQuery(SQL);
        System.out.println("Query executed");
        
        int count = 0;
           
        System.out.println("Start of While loop");
        while(resultset.next()){
           
         
            String DESCRIPTION = resultset.getString("GLDescription");
            String GLDATE = resultset.getString("GLDate");
            
            System.out.println(count + " " + GLDATE + " " + DESCRIPTION);
                    
            count++;
        //}
        }
        System.out.println("exit while loop");
        statement.close();
    }
    
    public void Updating() throws SQLException{
        
        statement = connection.createStatement();
        
        String SQL3 = "UPDATE GroomingLog SET GLDescription='update from netbeans' WHERE GLDate='2014-10-02 00:00:00.000000' ";
        
        statement.execute(SQL3);
        statement.executeUpdate(SQL3);
        statement.close();
        
    }
    
    public void Updating(String a) throws SQLException{
        
        statement = connection.createStatement();
        
        String SQL3 = "UPDATE GroomingLog SET GLDescription='" + a + "' WHERE GLDate='2014-10-02 00:00:00.000000' ";
        
        statement.execute(SQL3);
        statement.executeUpdate(SQL3);
        statement.close();
        
    }
    
    public void CloseConn() throws SQLException{
        connection.close();
    }
}
   