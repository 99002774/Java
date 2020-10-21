package com.lts.constr;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Student {
	String name;
	Integer sid;
	String dept;
	Course course;
	
	@Autowired
	public Student(Course course) {
		this.course = course;
	}
	
	public String getName() {
		return name;
	}
	@Value("${student.name}")
	public void setName(String name) {
		this.name = name;
	}
	public Integer getSid() {
		return sid;
	}
	@Value("${student.sid}")
	public void setSid(Integer sid) {
		this.sid = sid;
	}
	public String getDept() {
		return dept;
	}
	@Value("${student.dept}")
	public void setDept(String dept) {
		this.dept = dept;
	}

	@Override
	public String toString() {
		return "Student [name=" + name + ", sid=" + sid + ", dept=" + dept + ", course=" + course + "]";
	}
	
	
}
