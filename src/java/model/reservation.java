/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

/**
 *
 * @author Kavindu
 */
public class reservation {
   private int id;  
private String name,email,checkin,checkout,select1,select2,select3,message;  
public int getId() {  
    return id;  
}  
public void setId(int id) {  
    this.id = id;  
}  
public String getName() {  
    return name;  
}  
public void setName(String name) {  
    this.name = name;  
}  
  
public String getEmail() {  
    return email;  
}  
public void setEmail(String email) {  
    this.email = email;  
}  
public String getCheckIn() {  
    return checkin;  
}  
public void setCheckIn(String checkin) {  
    this.checkin = checkin;  
}  
public String getCheckOut() {  
    return checkout;  
}  
public void setCheckOut(String checkout) {  
    this.checkout = checkout;  
} 
public String getAdult() {  
    return select1;  
}  
public void setAdult(String select1) {  
    this.select1 = select1;  
} 
public String getChild() {  
    return select2;  
}  
public void setChild(String select2) {  
    this.select2 = select2;  
} 
public String getRoom() {  
    return select3;  
}  
  
    /**
     *
     * @param select3
     */
    public void setRoom(String select3) {  
    this.select3 = select3;  
    
} 
public String getSpecialRequest() {  
    return message;  
}  
public void setSpecialRequest(String message) {  
    this.message = message;  
} 
}
