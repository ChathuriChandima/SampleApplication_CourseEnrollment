package com.component.model;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;
import java.util.stream.Collectors;

public class Student {

	private String studentId;
	private String studentName;
	private String studentEmail;
	private String type;
	private String faculty;
	private String course;
	public static List<Student> studentList = new ArrayList<Student>();
	
	public String getStudentId() {
		return studentId;
	}
	public void setStudentId(String studentId) {
		this.studentId = studentId;
	}
	public String getStudentName() {
		return studentName;
	}
	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}
	public String getStudentEmail() {
		return studentEmail;
	}
	public void setStudentEmail(String studentEmail) {
		this.studentEmail = studentEmail;
	}

	public String getFaculty() {
		return faculty;
	}
	public void setFaculty(String faculty) {
		this.faculty = faculty;
	}
	public String getCourse() {
		return course;
	}
	public void setCourse(String course) {
		this.course = course;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	
	public static class Helper {
		public static String stype ="pg";
		public static void createDummyStudents() {
			Student student1 = new Student();
			student1.setStudentId("STD001");
			student1.setStudentName("John Luke");
			student1.setCourse("Data Analysis");
			student1.setFaculty("Faculty of Science");
			student1.setStudentEmail("testuser1@test.com");
			student1.setType("ug");
			studentList.add(student1);
			
			Student student2 = new Student();
			student2.setStudentId("STD002");
			student2.setStudentName("Marie Moody");
			student2.setCourse("Information Security");
			student2.setFaculty("Faculty of Information Technology");
			student2.setStudentEmail("testuser2@test.com");
			student2.setType("pg");
			studentList.add(student2);
			
			Student student3 = new Student();
			student3.setStudentId("STD003");
			student3.setStudentName("Ben Thomas");
			student3.setCourse("Business Management");
			student3.setFaculty("Faculty of Management");
			student3.setStudentEmail("testuser3@test.com");
			student3.setType("ug");
			studentList.add(student3);
			
			Student student4 = new Student();
			student4.setStudentId("STD004");
			student4.setStudentName("Harry Keinte");
			student4.setCourse("Database Management");
			student4.setFaculty("Faculty of Information Technology");
			student4.setStudentEmail("testusertest.com");
			student4.setType("ug");
			studentList.add(student4);
			
			Student student5 = new Student();
			student5.setStudentId("STD005");
			student5.setStudentName("Kathie Steven");
			student5.setCourse("Micro Biology");
			student5.setFaculty("Faculty of Science");
			student5.setStudentEmail("testuser5test.com");
			student5.setType("pg");
			studentList.add(student5);
		}
		
		public static List<Student> getStudent(int x, String y){
			switch(x){
            case 0: 
    			return studentList;
            case 1: 
            	if(y.equals("Undergraduate")) {
            		stype ="ug";
            	}
            	List<Student> list2 = studentList.stream().filter(std -> std.getType().equals(stype)).collect(Collectors.toList());
    			return list2;
            default: 
                return null;
        }
		}
	}
	
	
}
