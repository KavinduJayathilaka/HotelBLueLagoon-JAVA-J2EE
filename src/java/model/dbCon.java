/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;
import java.sql.*;
public class dbCon 
     {
    
    
            public Connection createConnection() throws ClassNotFoundException, SQLException
            {
                Class.forName("com.mysql.jdbc.Driver");
                Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3307/hotelbluelagoondb","root","");
                return con;
                
            }
         
    /**
     *
     * @param name
     * @param email
     * @param subject
     * @param message
     * @return
     * @throws ClassNotFoundException
     * @throws SQLException
     */
    public  boolean regUser(String name, String email,String subject, String message) throws ClassNotFoundException, SQLException 
                {
                    PreparedStatement ps = createConnection().prepareStatement("insert into contact values(?,?,?,?)");
                    ps.setString(1, name);
                    ps.setString(2, email);
                    ps.setString(3, subject);
                    ps.setString(4, message);
                    int i = ps.executeUpdate();

                    if(i > 0) 
                        return true;
                      else
                        return false;
                    
                }
    
    

                
                
                
}
