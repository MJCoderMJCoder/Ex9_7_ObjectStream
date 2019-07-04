package com.objectstream;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class ObjectStream {

	public static void main(String[] args) throws IOException, ClassNotFoundException {
		Employee e1 = new Employee(1001, "Wang", 5678.50);
		FileOutputStream fos = new FileOutputStream("./object.dat");
		ObjectOutputStream out = new ObjectOutputStream(fos); //�������������
		out.writeObject(e1); //д�����
		out.close();
		FileInputStream fis = new FileInputStream("./object.dat");
		ObjectInputStream in = new ObjectInputStream(fis); //�������������
		Employee e2 = (Employee) in.readObject(); //readObject():��ȡ���ع�����
		System.out.println("ID��" + e2.id);
		System.out.println("Name��" + e2.name);
		System.out.println("Salary��" + e2.salary);
		in.close();
	}

}
