package com.objectstream;
/*
 * ֻ��֧��java.io.Serializable�ӿڵĶ������д�����л�����ж�����
 */
import java.io.Serializable;

class Employee implements Serializable { //����ʵ��Serializable���л��ӿ�
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
