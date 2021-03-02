package com.creationalPatterns;

import java.sql.Connection;
import java.sql.DriverManager;

/*
	1.	Singleton Class: It can be instantiated once and only once, and that can be achieved by declaring
						 private constructor and providing only one access pass by giving a static method.
	2.	It is used to create a globally accessible object.
 */
class test1
{
	private static test1 obj = null;
	int w=100;
	String t="some value";
	
	// private constructor
	private test1(){ }

	public synchronized  static test1 getInstance()
	{
			if(obj == null)
				obj = new test1();
		return obj;
	}

	public Object clone() throws CloneNotSupportedException{
		throw new CloneNotSupportedException();
	}
	
	// public getter method
	public Connection getConnection(){
		Connection con = null;
		try{
			Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");
			con = DriverManager.getConnection("jdbc:odbc:samvednaa12");
		}catch(Exception e){
			System.out.println(e.getMessage());
			e.printStackTrace();
		}
		return con;
	}
}

class DesignPatterns_Singleton {
	public static void main(String ar[]){
		test1 e =test1.getInstance();
		Connection con = e.getConnection();
		System.out.println("Singlenton object obtained : "+con);
		System.out.println(e.w);
		System.out.println(e.t);
		try {
			test1 t = (test1)e.clone();
		} catch (CloneNotSupportedException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
	}
}



