package com.gradedAssignment.Q1;

import java.io.Serializable;

public class Employee implements Serializable{
String id;
String Name;
String phno;
String city;
int salary;
public Employee(String id, String name, String phno, String city, int salary) {
	super();
	this.id = id;
	Name = name;
	this.phno = phno;
	this.city = city;
	this.salary = salary;
}
@Override
public String toString() {
	return "[Employee id=" + id + ", Name=" + Name + ", phno=" + phno + ", city=" + city + ", salary=" + salary + "]";
}
public String getId() {
	return id;
}
public void setId(String id) {
	this.id = id;
}
public String getName() {
	return Name;
}
public void setName(String name) {
	Name = name;
}
public String getPhno() {
	return phno;
}
public void setPhno(String phno) {
	this.phno = phno;
}
public String getCity() {
	return city;
}
public void setCity(String city) {
	this.city = city;
}
public int getSalary() {
	return salary;
}
public void setSalary(int salary) {
	this.salary = salary;
}
public Employee() {
	super();
	// TODO Auto-generated constructor stub
}

}
