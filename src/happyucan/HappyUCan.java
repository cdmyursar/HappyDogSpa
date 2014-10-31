/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package happyucan;

import java.sql.SQLException;
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
        
        Connect connect = new Connect();
        
        connect.Connect();
        
        connect.InnerJoin();
//        connect.Display();
//        connect.Updating();
//        connect.Display();
//        connect.Updating("FROM OBJECT CALL");
//        connect.Display();
        connect.CloseConn();
  
       }
}
    

