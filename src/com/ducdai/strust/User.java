package com.ducdai.strust;

public class User extends org.apache.struts.action.ActionForm {
private static final long serialVersionUID = 6210614082380637094L;
private String name;
private int age;
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public int getAge() {
	return age;
}
public void setAge(int age) {
	this.age = age;
}
public User(String name, int age) {
	super();
	this.name = name;
	this.age = age;
}
public User() {
	this("",1);
}

}
