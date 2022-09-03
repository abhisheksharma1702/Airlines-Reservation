package com.lti.airlines.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.stereotype.Service;

import com.lti.airlines.model.MailDetails;
import com.lti.airlines.repo.MailDetailsRepository;

@Service
public class MailDetailsService implements MailDetailsRepository {

	 @Autowired
	 private JavaMailSender javaMailSender;
	 
	    @Value("${spring.mail.username}") 
	    private String sender; 
	    
	    public String sendSimpleMail(MailDetails details)
	    {
	        try {
	 
	            // Creating a simple mail message
	            SimpleMailMessage mailMessage
	                = new SimpleMailMessage();
	 
	            // Setting up necessary details
	            mailMessage.setFrom(sender);
	            mailMessage.setTo(details.getRecipient());
	            mailMessage.setText(details.getMsgBody());
	            mailMessage.setSubject(details.getSubject());
	 
	            // Sending the mail
	            javaMailSender.send(mailMessage);
	            return "Mail Sent Successfully...";
	        }
	        catch (Exception e) {
	            return "Error while Sending Mail";
	        }
	    }
	    
	    public String forgetPassword(String email)
	    {
	    	 try {
	    	 SimpleMailMessage mailMessage= new SimpleMailMessage();
	    	 mailMessage.setFrom(sender);
	         mailMessage.setTo(email);
	         mailMessage.setText("Need to reset your password? No Problem!\n"
	         		+ "Click on the link below and you will be on your way!\n"
	         		+ "http://localhost:4200/forget_password\n"
	         		+ "If you did not make this request please ignore this email!");
	         mailMessage.setSubject("Forget Password ");
	         javaMailSender.send(mailMessage);
	         
	         return "Mail Sent Successfully.......";
	    	 }
		        catch (Exception e) {
		            return "Error while Sending Mail";
		        }
             
	    }
}