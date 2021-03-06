package com.pack.mylib.pojo;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table
public class Student {
	@Id
	 @GeneratedValue(strategy=GenerationType.AUTO)
private int sid;
	@Column
private String name;
	@Column
private String course;
public int getSid() {
	return sid;
}
public void setSid(int id) {
	this.sid = id;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public String getCourse() {
	return course;
}
public void setCourse(String course) {
	this.course = course;
}
}
