package com.component.ui;

import com.component.model.Student;
import com.component.model.User;

public class Starter {

	public static void main(String[] args) {
		User.Helper.createDummyUsers();
		Student.Helper.createDummyStudents();
		Login login = new Login();
        login.setVisible(true);
	}

}
