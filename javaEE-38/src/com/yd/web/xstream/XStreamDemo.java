package com.yd.web.xstream;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import com.thoughtworks.xstream.XStream;
import com.yd.web.xstredomain.Address;
import com.yd.web.xstredomain.User;

public class XStreamDemo {
	public static void main(String[] args) {
		//׼����һ��javaBean���� 
		User user = new User(1001,23,"lisi");
		user.setBirthday(new Date());
		
		Address add = new Address(); 
		add.setProvince("sd"); 
		add.setCity("qd");
		Address add1 = new Address(); 
		add1.setProvince("sc"); 
		add1.setCity("����");
		List<Address> list = new ArrayList<Address>();
		list.add(add);
		list.add(add1);
		
		
		//��list�������õ�User���У� 
	    user.setList(list);
		
		//��user�����е�����ת����һ��xml��ʽ�����ݣ� 
		
		/*
		 * ��1��copy jar�� 
		 * ��2������һ������ XStream xstream = new XStream(); 
		 * (3) toXML(javaBean);���ص���һ��xml��ʽ���ַ������ͣ� 
		 */
		
		
		 XStream xstream = new XStream(); 
		 //���ñ���; 
		 xstream.alias("user", User.class);
		 xstream.alias("address", Address.class);
		 //����ĳ�����ԣ� 
		 xstream.omitField(User.class, "birthday");
		 
		 //��ʵ��������Բ�ҪĬ�����ɱ�ǩ���ӱ�ǩ���������ɱ�ǩ�����ԣ� 
		 xstream.useAttributeFor(User.class,"id");
		 
		 
		//Ĭ������� �������ͻ��Զ�����һ���ǩ�� �������Ҫʹ�øò��ǩ���� ���Խ�Collection���ϵĲ��ǩȥ���� 
		 xstream.addImplicitCollection(User.class, "list");//ȥ��User�൱��list���ԣ� ���ɵı�ǩ
		 
		 String xml = xstream.toXML(user);
		 System.out.println(xml);
		 
		 
//		 xstream.toXML(obj, out); ��obj��װ������д���ⲿ���ļ����У� 
	}
}
