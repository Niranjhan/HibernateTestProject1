package com.hibernatete.testproject;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class User {
@Id
private int userid;
private String userName;
public int getUserid() {
	return userid;
}
public void setUserid(int userid) {
	this.userid = userid;
}
public String getUserName() {
	return userName;
}
public void setUserName(String userName) {
	this.userName = userName;
}

}
