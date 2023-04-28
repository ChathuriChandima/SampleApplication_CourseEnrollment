package com.component.model;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class EmailValidatorServiceProvider{
	
	private static final Pattern EMAIL_PATTERN = Pattern.compile("^(?=.{1,64}@)[A-Za-z0-9_-]+(\\.[A-Za-z0-9_-]+)*@"
			+ "[^-][A-Za-z0-9-]+(\\.[A-Za-z0-9-]+)*(\\.[A-Za-z]{2,})$", Pattern.CASE_INSENSITIVE);
	   
	   public static boolean validate(String email) {
	      if (email == null || email.isEmpty()) {
	         return false;
	      }
	      
	      Matcher m = EMAIL_PATTERN.matcher(email);
	      return m.matches();
	   }

}
