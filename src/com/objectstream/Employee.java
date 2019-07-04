package com.objectstream;
/*
 * 只有支持java.io.Serializable接口的对象才能写入流中或从流中读出。
 */
import java.io.Serializable;

class Employee implements Serializable { //必须实现Serializable序列化接口
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	int id;
	String name;
	double salary;
	public Employee(int i, String n, double s) {
		id = i;
		name = n;
		salary = s;
	}

}
