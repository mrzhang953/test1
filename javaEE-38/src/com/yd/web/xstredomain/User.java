package com.yd.web.xstredomain;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonIgnore;

public class User implements Serializable{
	private int id; 
	private int age; 
	private String name;
	@JsonFormat(pattern= "yyyy-MM-dd")
	private Date birthday; 
	@JsonIgnore// 属性不会生成到json字符串当中： 
	private List<Address> list;
	public User(int id, int age, String name,Date birthday) {
		super();
		this.id = id;
		this.age = age;
		this.name = name;
		this.birthday = birthday;
	}
	public User(int id, int age, String name) {
		super();
		this.id = id;
		this.age = age;
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public Date getBirthday() {
		return birthday;
	}
	public int getId() {
		return id;
	}
	public List<Address> getList() {
		return list;
	}
	public String getName() {
		return name;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public void setBirthday(Date birthday) {
		this.birthday = birthday;
	}
	
	
	public void setId(int id) {
		this.id = id;
	}
	public void setList(List<Address> list) {
		this.list = list;
	}
	public void setName(String name) {
		this.name = name;
	}
	@Override
	public String toString() {
		return "User [id=" + id + ", age=" + age + ", name=" + name + "]";
	}
	public User(int id, int age, String name, Date birthday, List<Address> list) {
		super();
		this.id = id;
		this.age = age;
		this.name = name;
		this.birthday = birthday;
		this.list = list;
	}
	public User() {
		super();
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
}
