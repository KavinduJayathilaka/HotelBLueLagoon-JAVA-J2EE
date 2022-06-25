
import java.util.Properties;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.mail.Authenticator;
import javax.mail.Message;
import javax.mail.MessagingException;
import javax.mail.PasswordAuthentication;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.AddressException;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Kavindu
 */
public class JavaMailUtil {
    
    public static void sendMail(String recepient) throws Exception{
        System.out.println("Preparing to send Email");
    
        Properties properties = new Properties();
        
     /*mail.smtp.auth
      mail.smtp.starttls.enable
      mail.setup.host - smtp.gmail.com
      mail.smtp.port - 587
     */
     
     properties.put("mail.smtp.auth", "true");
     properties.put("mail.smtp.starttls.enable", "true");
     properties.put("mail.setup.host", "smtp.gmail.com");
     properties.put("mail.smtp.port", "587");
     
     
     
     String myAccountEmail = "kavindue2264@gmail.com";
     String password = "Kavicreed19187";
     
     Session session = Session.getInstance(properties,new Authenticator(){
     
     @Override
     protected PasswordAuthentication getPasswordAuthentication()
     {
         return new PasswordAuthentication(myAccountEmail,password);
     
     }
     
     });
     
     Message message =  prepareMessage(session , myAccountEmail , recepient);
     
     Transport.send(message);
     System.out.println("Message sent Succesfully");
     }

    private static Message prepareMessage( Session session, String myAccountEmail, String recepient) {
        Message message = new MimeMessage(session);
        try {
            message.setFrom(new InternetAddress(myAccountEmail));
            message.setRecipient(Message.RecipientType.TO, new InternetAddress(recepient));
            message.setSubject("My First Email from Java App");
            message.setText("Hey There. \n Look my email");
            return message;
        } catch (Exception ex) {
            Logger.getLogger(JavaMailUtil.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
    }
}
