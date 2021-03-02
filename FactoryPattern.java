package com.creationalPatterns;

class Person { 
	public String name;
	private String gender; 
	
	public String getName() {
		return name;
	}
	public String getGender() {
		return gender;
	}
}

class Male extends Person { 
	public Male(String fullName) {
		System.out.println("Hello Mr. "+fullName);
	} 
}

class Female extends Person { 
	public Female(String fullNname) {
		System.out.println("Hello Ms. "+fullNname);
	} 
}

public class FactoryPattern {
	
	public Person getPerson(String name, String gender) {
		if (gender.equals("M"))
			return new Male(name);
		else if(gender.equals("F"))
			return new Female(name);
		else
			return null;
	}
	
	public static void main(String args[]) {
		FactoryPattern factory = new FactoryPattern();
		factory.getPerson("Neha", "F");
	} 
}