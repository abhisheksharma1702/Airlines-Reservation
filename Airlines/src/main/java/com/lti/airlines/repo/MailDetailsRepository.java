package com.lti.airlines.repo;

import com.lti.airlines.model.MailDetails;

public interface MailDetailsRepository {
	 String sendSimpleMail(MailDetails details);
	 String forgetPassword(String email);
}