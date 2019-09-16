package com.yd.jackson;

import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.junit.Test;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.yd.web.xstredomain.User;

public class JacksonDemo {
	/*
	 * jackson 解析器的使用：  
	 * javabean 转换成json
	 * 
	 */
	
	@Test
	public void test1() throws Exception {
		
		//准备一个对象; 
		User user = new User(1001,23,"lisi");
		user.setBirthday(new Date());
		ObjectMapper om = new ObjectMapper(); 
		String strJson = om.writeValueAsString(user);
		System.out.println(strJson);
		
		//将user对象对应的json的字符串类型输出到指定的外部文件当中， 可以使用字节流， 可以使用字符流
	//	om.writeValue(new FileWriter(new File("")), user);
//		{"id":1001,"age":23,"name":"lisi"}
		
		User user2= om.readValue(strJson, User.class);
		System.out.println(user2);
	}
	
	/**
	 * List集合类型转换成json： 
	 * @throws Exception
	 */
	@Test
	public void test2() throws Exception {
		
		//准备一个对象; 
		User user = new User(1001,23,"lisi");
		User user2 = new User(1002,24,"王五");
		User user3 = new User(1003,23,"杜桑");
		List<User> list = new ArrayList<User>();
		list.add(user);
		list.add(user2);
		list.add(user3);
		
		ObjectMapper om = new ObjectMapper(); 
		String strJson = om.writeValueAsString(list);
		System.out.println(strJson);
		
	}
	/**
	 * Map集合类型转换成json： 
	 * @throws Exception
	 */
	@Test
	public void test3() throws Exception {
		User user = new User(1001,23,"lisi");
		User user2 = new User(1002,24,"王五");
		
		//准备一个对象; 
		Map<String,User> map = new HashMap<String,User>(); 
		map.put("user", user);
		map.put("user2", user2);
		
		ObjectMapper om = new ObjectMapper(); 
		String strJson = om.writeValueAsString(map);
		System.out.println(strJson);
		// {"user2":{"id":1002,"age":24,"name":"王五","birthday":null,"list":null},"user":{"id":1001,"age":23,"name":"lisi","birthday":null,"list":null}}

		
	}
	
	
	@Test
	public void test4() throws Exception {
		
		//准备一个对象; 
		Map<String,String> map = new HashMap<String,String>(); 
		map.put("username", "东邪");
		map.put("age", "300");
		map.put("gender", "nan");
		
		ObjectMapper om = new ObjectMapper(); 
		String strJson = om.writeValueAsString(map);
		System.out.println(strJson);
		// {"username":"东邪","age":"300","gender":"nan"}
		
	}
}
