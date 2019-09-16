package com.yd.web.xstream;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import com.thoughtworks.xstream.XStream;
import com.yd.web.xstredomain.Address;
import com.yd.web.xstredomain.User;

public class XStreamDemo {
	public static void main(String[] args) {
		//准备了一个javaBean对象： 
		User user = new User(1001,23,"lisi");
		user.setBirthday(new Date());
		
		Address add = new Address(); 
		add.setProvince("sd"); 
		add.setCity("qd");
		Address add1 = new Address(); 
		add1.setProvince("sc"); 
		add1.setCity("重庆");
		List<Address> list = new ArrayList<Address>();
		list.add(add);
		list.add(add1);
		
		
		//将list集合设置到User当中： 
	    user.setList(list);
		
		//将user对象当中的数据转换成一个xml格式的数据： 
		
		/*
		 * （1）copy jar： 
		 * （2）创建一个对象： XStream xstream = new XStream(); 
		 * (3) toXML(javaBean);返回的是一个xml格式的字符串类型： 
		 */
		
		
		 XStream xstream = new XStream(); 
		 //设置别名; 
		 xstream.alias("user", User.class);
		 xstream.alias("address", Address.class);
		 //忽略某个属性： 
		 xstream.omitField(User.class, "birthday");
		 
		 //将实体类的属性不要默认生成标签的子标签。而是生成标签的属性： 
		 xstream.useAttributeFor(User.class,"id");
		 
		 
		//默认情况： 集合类型会自动生成一层标签： 如果不需要使用该层标签，， 可以将Collection集合的层标签去掉： 
		 xstream.addImplicitCollection(User.class, "list");//去掉User类当中list属性： 生成的标签
		 
		 String xml = xstream.toXML(user);
		 System.out.println(xml);
		 
		 
//		 xstream.toXML(obj, out); 将obj封装的数据写到外部的文件当中： 
	}
}
