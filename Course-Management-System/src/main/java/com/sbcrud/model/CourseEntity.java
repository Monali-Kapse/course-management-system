package com.sbcrud.model;

public class CourseEntity {

	private int id;
	private String courseName;
	private double fee;
	private String intructor;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getCourseName() {
		return courseName;
	}
	public void setCourseName(String courseName) {
		this.courseName = courseName;
	}
	public double getFee() {
		return fee;
	}
	public void setFee(double fee) {
		this.fee = fee;
	}
	public String getIntructor() {
		return intructor;
	}
	public void setIntructor(String intructor) {
		this.intructor = intructor;
	}
}
