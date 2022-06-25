import java.util.Properties;
import javax.mail.*;
import javax.mail.internet.*;



public class SendMailBySite {
public static void main(String[] args) { 
    

    String host="smtp.gmail.com";
final String user="kavindue2264@gmail.com";//change accordingly
final String password="Kavicreed19187";//change accordingly

String to="kavindue2264@gmail.com";//change accordingly

//Get the session object
Properties props = new Properties();
props.put("mail.smtp.host",host);
props.put("mail.smtp.auth", "true");
props.put("mail.smtp.port", "587");
props.put("mail.smtp.starttls.enable", "true");

   /*  properties.put("mail.smtp.auth", "true");
     properties.put("mail.smtp.starttls.enable", "true");
     properties.put("mail.setup.host", "smtp.gmail.com");
     properties.put("mail.smtp.port", "587"); */

   //session created 
   Session session = Session.getDefaultInstance(props,
new javax.mail.Authenticator() {
protected PasswordAuthentication getPasswordAuthentication() {
return new PasswordAuthentication(user,password);
}
});

//Compose the message

   try {
MimeMessage message = new MimeMessage(session);
 message.setFrom(new InternetAddress(user));
 message.addRecipient(Message.RecipientType.TO,new InternetAddress(to));
 message.setSubject("You have reserved your room successfully.Thank You!!!");
 message.setText("Your Booking Complete... ThankYou!");
 


//send the message
Transport.send(message);
System.out.println("message sent successfully...");
} catch (MessagingException e) {e.printStackTrace();}

}
}