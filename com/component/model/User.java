package com.component.model;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

public class User {
	
	private String userId;
	private String userName;
	private String userEmail;
	private String password;
	public static List<User> userList = new ArrayList<User>();

	public String getUserId() {
		return userId;
	}

	public void setUserId(String userId) {
		this.userId = userId;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getUserEmail() {
		return userEmail;
	}

	public void setUserEmail(String userEmail) {
		this.userEmail = userEmail;
	}
	
	public static class Helper {
		public static void createDummyUsers() {
			User user1 = new User();
			user1.setUserId(UUID.randomUUID().toString());
			user1.setUserName("testuser1");
			user1.setUserEmail("testuser1.com");
			user1.setPassword("testuser1123");
			userList.add(user1);
			
			User user2 = new User();
			user2.setUserId(UUID.randomUUID().toString());
			user2.setUserName("testuser2");
			user2.setUserEmail("testuser2.com");
			user2.setPassword("testuser2123");
			userList.add(user2);
			
			User user3 = new User();
			user3.setUserId(UUID.randomUUID().toString());
			user3.setUserName("testuser3");
			user3.setUserEmail("testuser3.com");
			user3.setPassword("testuser3123");
			userList.add(user3);
		}
		
		public static boolean validateLogin(String userName, String password) {
	        boolean validUser = userList.stream().anyMatch(user -> user.getUserName().equals(userName) && user.getPassword().equals(password));
	        return validUser;

	    }
	}

}
