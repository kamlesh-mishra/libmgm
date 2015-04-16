package com.pack.mylib.pojo;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.PrimaryKeyJoinColumn;
import javax.persistence.Table;

@Entity
@Table
public class Isbn_details {
	@Id
private int isbn;
	@Column
private String book_name;
	@Column
private int author_id;
	@Column
private int publisher_id;
@Column
private int copies;
public int getCopies() {
	return copies;
}
public void setCopies(int copies) {
	this.copies = copies;
}
public int getIsbn() {
	return isbn;
}
public void setIsbn(int isbn) {
	this.isbn = isbn;
}
public String getBook_name() {
	return book_name;
}
public void setBook_name(String book_name) {
	this.book_name = book_name;
}
public int getAuthor_id() {
	return author_id;
}
public void setAuthor_id(int author_id) {
	this.author_id = author_id;
}
public int getPublisher_id() {
	return publisher_id;
}
public void setPublisher_id(int publisher_id) {
	this.publisher_id = publisher_id;
}
}
