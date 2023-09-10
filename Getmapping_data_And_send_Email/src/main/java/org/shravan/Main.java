package org.shravan;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.apache.catalina.User;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import javax.mail.*;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;
import java.util.Arrays;
import java.util.Properties;
import java.util.concurrent.atomic.AtomicReference;

@SpringBootApplication
public class Main {
    public static void main(String[] args) throws JsonProcessingException {


        SpringApplication.run(Main.class, args);
//        Apitest ob=new Apitest();
//        String str=ob.toString();
        ObjectMapper objectMapper = new ObjectMapper();
        String jSon="{api/getMyBean}";
        String User = null;
        try {
            User user = objectMapper.readValue(jSon, User.class);
        }catch (Exception e){
            System.out.println(e);
        }
        String message = String.valueOf((Object) null);
        String subject = "Coder SHRAVAN";
        String to = "shravankm93@gmail.com";
        String from = "shravankumar797988@gmail.com";

        sendEmail(message, subject, to, from);
        //sendAttach(Message,subject,to,from);
    }

            //this is reportable email
            private static void sendEmail(String message , String subject, String to, String from) {
                //Varible for mail
                String host="smtp.gmail.com";

                //get system property
                Properties properties = System.getProperties();
                System.out.println(properties);

                //setting important information properties

                //host
                properties.put("mail.smtp.host",host);
                properties.put("mail.smtp.port","465");
                properties.put("mail.smtp.ssl.enable","true");
                properties.put("mail.smtp.auth","true");

                //set 1:to get the session  object
                Session session=Session.getInstance(properties, new Authenticator(){

                    @Override
                    protected PasswordAuthentication getPasswordAuthentication() {
                        return new PasswordAuthentication("shravankumar797988@gmail.com","mjiqtrdunwsamvls");
                    }
                });
                session.setDebug(true);
                // step 2:compose the message
                //setfrom
                MimeMessage m=new MimeMessage(session);
                try{
                    m.setFrom(from);
                    //add recipient type
                    m.addRecipient(Message.RecipientType.TO,new InternetAddress(to));
                    //set subject
                    m.setSubject(subject);
                    //set text message
                    m.setText(message);
                    //sep 3 :send the message
                    Transport.send(m);
                    System.out.println("send mail........");
                }catch(Exception e){
                    System.out.println(e);
                }
            }
        }




