package com.healthcode.common.impl;

import java.util.*;
import javax.mail.*;
import javax.mail.internet.*;
import javax.activation.*;

import com.healthcode.common.NotificationService;

public class EmailNotificationImpl implements NotificationService {

	@Override
	public void sendNotification(String to) {
		
		// Recipient's email ID needs to be mentioned.
		if( to == null)
		{
	      to = "parvath.bingi@gmail.com";
		}

	      // Sender's email ID needs to be mentioned
	      String from = "HealthCodeSystem";
	      
	    
	      // Assuming you are sending email from localhost
	      String host = "smtp.gmail.com";


	      final String username = "healthcode.system@gmail.com";
		  final String password = "HealthCode$3";

			
	      // Get system properties
	      Properties properties = System.getProperties();

	      // Setup mail server
	      properties.setProperty("mail.smtp.host", host);
	      properties.put("mail.smtp.port", "587");
	      properties.put("mail.smtp.auth", "true");
	      properties.put("mail.smtp.starttls.enable", "true");

	      // Get the default Session object.
	      //Session session = Session.getDefaultInstance(properties);
			Session session = Session.getInstance(properties,
					  new javax.mail.Authenticator() {
						protected PasswordAuthentication getPasswordAuthentication() {
							return new PasswordAuthentication(username, password);
						}
					  });


	      try{
	         // Create a default MimeMessage object.
	         MimeMessage message = new MimeMessage(session);

	         // Set From: header field of the header.
	         message.setFrom(new InternetAddress(from));

	         // Set To: header field of the header.
	         message.addRecipient(Message.RecipientType.TO,
	                                  new InternetAddress(to));

	         // Set Subject: header field
	         message.setSubject("Medicine/Appoinment Reminder for you ");

	         // Now set the actual message
	         message.setText("Hello Mr.X, This is a reminder to take X medicine at 9PM");

	         // Send message
	         Transport.send(message);
	         System.out.println("Sent message successfully....");
	      }catch (MessagingException mex) {
		         mex.printStackTrace();
		      }
	}
	
	 public static void main(String [] args)
	   {    
	      // Recipient's email ID needs to be mentioned.
	      String to = "sdarshanam@gmail.com";

	      // Sender's email ID needs to be mentioned
	      String from = "HealthCodeSystem";
	      
	    
	      // Assuming you are sending email from localhost
	      String host = "smtp.gmail.com";


	      final String username = "healthcode.system@gmail.com";
		  final String password = "HealthCode$3";

			
	      // Get system properties
	      Properties properties = System.getProperties();

	      // Setup mail server
	      properties.setProperty("mail.smtp.host", host);
	      properties.put("mail.smtp.port", "587");
	      properties.put("mail.smtp.auth", "true");
	      properties.put("mail.smtp.starttls.enable", "true");


	    //  properties.setProperty("mail.user", "healthcode.system@gmail.com");
	    //  properties.setProperty("mail.password", "HealthCode$3");

	      
	      // Get the default Session object.
	      //Session session = Session.getDefaultInstance(properties);
			Session session = Session.getInstance(properties,
					  new javax.mail.Authenticator() {
						protected PasswordAuthentication getPasswordAuthentication() {
							return new PasswordAuthentication(username, password);
						}
					  });


	      try{
	         // Create a default MimeMessage object.
	         MimeMessage message = new MimeMessage(session);

	         // Set From: header field of the header.
	         message.setFrom(new InternetAddress(from));

	         // Set To: header field of the header.
	         message.addRecipient(Message.RecipientType.TO,
	                                  new InternetAddress(to));

	         // Set Subject: header field
	         message.setSubject("Medicine/Appoinment Reminder for you ");

	         // Now set the actual message
	         message.setText("Hello Mr.X, This is a reminder to take X medicine at 9PM");

	         // Send message
	         Transport.send(message);
	         System.out.println("Sent message successfully....");
	      }catch (MessagingException mex) {
	         mex.printStackTrace();
	      }
	   }


}
