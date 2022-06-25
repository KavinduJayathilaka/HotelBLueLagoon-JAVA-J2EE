 /*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Kavindu
 */
public class bookingdbCon {

    /**
     *
     * @return
     * @throws ClassNotFoundException
     * @throws SQLException
     */
    public static Connection createConnection() throws ClassNotFoundException, SQLException
            {
                Class.forName("com.mysql.jdbc.Driver");
                Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3307/hotelbluelagoondb","root","");
                return con;
                
            }
   

    

   
/**
     *
     * @param name
     * @param email
     * @param checkin
     * @param checkout
     * @param adult
     * @param child
     * @param room_type
     * @param message
     * @return
     * @throws ClassNotFoundException
     * @throws SQLException
     */
    public boolean bookRoom(String name, String email, String checkin, String checkout, String adult, String child, String room_type, String message) throws ClassNotFoundException, SQLException
    {
       
        PreparedStatement ps = createConnection().prepareStatement("insert into room_booking(customer_name,customer_email,check_in,check_out,adult,child,room_type,message)values(?,?,?,?,?,?,?,?)");
                    ps.setString(1, name);
                    ps.setString(2, email);
                    ps.setString(3, checkin);
                    ps.setString(4, checkout);
                    ps.setString(5, adult);
                    ps.setString(6, child);
                    ps.setString(7, room_type);
                    ps.setString(8, message);
   
 
                    
                    int i = ps.executeUpdate();

                    if(i > 0) 
                        return true;
                      else
                        return false;
    }
    
    
    public static List<reservation> getAllEmployees() {
       List<reservation> list=new ArrayList<>();  
          
        try{  
            Connection con= bookingdbCon.createConnection();  
            PreparedStatement ps=con.prepareStatement("select * from room_booking");  
            ResultSet rs=ps.executeQuery();  
            while(rs.next()){  
                reservation e=new reservation();  
                e.setId(rs.getInt(1));  
                e.setName(rs.getString(2));  
                e.setEmail(rs.getString(3));  
                e.setCheckIn(rs.getString(4));  
                e.setCheckOut(rs.getString(5));  
                e.setAdult(rs.getString(6));  
                e.setChild(rs.getString(7));  
                e.setRoom(rs.getString(8));  
                e.setSpecialRequest(rs.getString(9));  
                list.add(e);  
            }  
            con.close();  
        }catch(Exception e){e.printStackTrace();}  
          
        return list;  
    }
    
    public static int delete(int id){  
        int status=0;  
        try{  
            Connection con=bookingdbCon.createConnection();  
            PreparedStatement ps=con.prepareStatement("delete from room_booking where booking_id=?");  
            ps.setInt(1,id);  
            status=ps.executeUpdate();  
              
            con.close();  
        }catch(Exception e){e.printStackTrace();}  
          
        return status;  
    }  

    public boolean getFeedback(String feedback) throws ClassNotFoundException, SQLException
    {
       
        PreparedStatement ps = createConnection().prepareStatement("insert into feedback(feedback_description)values(?)");
                    ps.setString(1, feedback);
                  
   
 
                    
                    int i = ps.executeUpdate();

                    if(i > 0) 
                        return true;
                      else
                        return false;
    }
    
   
    
    
    }


