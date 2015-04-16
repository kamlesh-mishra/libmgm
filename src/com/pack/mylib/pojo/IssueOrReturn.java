package com.pack.mylib.pojo;


import java.util.Date;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.PrimaryKeyJoinColumn;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
@Entity
@Table
public class IssueOrReturn {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
private int slno;
	@Column
private int book_id;
	@Column
private int sid;
	@Column
private int eid;
	 @Temporal(TemporalType.DATE)
	 @Column
private Date issue_date;
	 @Temporal(TemporalType.DATE)
	 @Column
private Date return_date;
public int getSlno() {
	return slno;
}
public void setSlno(int slno) {
	this.slno = slno;
}
public int getBook_id() {
	return book_id;
}
public void setBook_id(int book_id) {
	this.book_id = book_id;
}
public int getSid() {
	return sid;
}
public void setSid(int sid) {
	this.sid = sid;
}
public int getEid() {
	return eid;
}
public void setEid(int eid) {
	this.eid = eid;
}
public Date getIssue_date() {
	return issue_date;
}
public void setIssue_date(Date issue_date) {
	this.issue_date = issue_date;
}
public Date getReturn_date() {
	return return_date;
}
public void setReturn_date(Date return_date) {
	this.return_date = return_date;
}
}
