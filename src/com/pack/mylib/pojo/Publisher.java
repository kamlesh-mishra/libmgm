package com.pack.mylib.pojo;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table
public class Publisher {
	@Id
	 @GeneratedValue(strategy=GenerationType.AUTO)
private int publisher_id;
	@Column
private String publisher_name;
public int getPublisher_id() {
	return publisher_id;
}
public void setPublisher_id(int publisher_id) {
	this.publisher_id = publisher_id;
}
public String getPublisher_name() {
	return publisher_name;
}
public void setPublisher_name(String publisher_name) {
	this.publisher_name = publisher_name;
}

}
