package com.fx.sample;

import java.util.Date;

public class RegistrationDetails {

	String Name ,Email_Id,Course,Course_Duretion,Phone_no,course_start_date,amount_to_pay;
	
	Date date;
	@Override
	public String toString() {
		System.out.println("hhhh");
		return "RegistrationDeails [Name=" + Name + ", Email_Id=" + Email_Id + ", Course=" + Course
				+ ", Course_Duretion=" + Course_Duretion + ", Phone_no=" + Phone_no + ", date=" + date
				+ ", course_start_date=" + course_start_date + ", amount_to_pay=" + amount_to_pay + "]";
	}
	public String getName() {
		return Name;
	}
	public void setName(String name) {
		Name = name;
	}
	public String getEmail_Id() {
		return Email_Id;
	}
	public void setEmail_Id(String email_Id) {
		Email_Id = email_Id;
	}
	public String getCourse() {
		return Course;
	}
	public void setCourse(String course) {
		Course = course;
	}
	public String getCourse_Duretion() {
		return Course_Duretion;
	}
	public void setCourse_Duretion(String course_Duretion) {
		Course_Duretion = course_Duretion;
	}
	public String getPhone_no() {
		return Phone_no;
	}
	public void setPhone_no(String phone_no) {
		Phone_no = phone_no;
	}
	public String getCourse_start_date() {
		return course_start_date;
	}
	public void setCourse_start_date(String course_start_date) {
		this.course_start_date = course_start_date;
	}
	public String getAmount_to_pay() {
		return amount_to_pay;
	}
	public void setAmount_to_pay(String amount_to_pay) {
		this.amount_to_pay = amount_to_pay;
	}
	public Date getDate() {
		return date;
	}
	public void setDate(Date date) {
		this.date = date;
	} 
	
	
}
