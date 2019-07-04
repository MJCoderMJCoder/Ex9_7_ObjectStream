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
		ObjectOutputStream out = new ObjectOutputStream(fos); //创建输出对象流
		out.writeObject(e1); //写入对象
		out.close();
		FileInputStream fis = new FileInputStream("./object.dat");
		ObjectInputStream in = new ObjectInputStream(fis); //创建输入对象流
		Employee e2 = (Employee) in.readObject(); //readObject():读取并重构对象
		System.out.println("ID：" + e2.id);
		System.out.println("Name：" + e2.name);
		System.out.println("Salary：" + e2.salary);
		in.close();
	}

}
