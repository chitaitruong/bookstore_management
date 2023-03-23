/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ban_vpp_nha_sach_pn;

import java.util.Properties;
import javax.mail.*;    
import javax.mail.internet.*;
/**
 *
 * @author ASUS
 */
public class Mailer{  
    public static void send(String to,String sub,String msg){  
          //Get properties object    
          Properties props = new Properties();    
          props.put("mail.smtp.host", "smtp.gmail.com");    
          props.put("mail.smtp.socketFactory.port", "465");    
          props.put("mail.smtp.socketFactory.class",    
                    "javax.net.ssl.SSLSocketFactory");    
          props.put("mail.smtp.auth", "true");    
          props.put("mail.smtp.port", "465");    
          //get Session   
          Session session = Session.getDefaultInstance(props,    
           new javax.mail.Authenticator() {    
           @Override
           protected PasswordAuthentication getPasswordAuthentication() {    
           return new PasswordAuthentication("taistudymyself.1@gmail.com","refmilulxxnxfbmh");  
           }    
          });    
          //compose message    
          try {    
            MimeMessage message = new MimeMessage(session);    
            message.addRecipient(Message.RecipientType.TO,new InternetAddress(to));    
            message.setSubject(sub);    
            message.setText(msg);    
            //send message  
            Transport.send(message);    
            System.out.println("message sent successfully");    
          } catch (MessagingException e) {throw new RuntimeException(e);}
    }  
}
