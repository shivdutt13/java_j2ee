package core.string.stringBuffer.stringBuilder;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/*
 1.	TRANSIENT (instance variable) can not be part of serialized object.
 2.	STATIC variables are NEVER saved as part of object's state. Because they do not belong to the object,
    they purely are class variables.
 3.	When you serialize an object, Java serialization takes care of saving the object's entire "object graph".
    That means a deep copy of everything the saved object need to be restored.
 4. If a superclass is serializable, then according to normal java interface rules, all subclasses of that class
    automatically implement Serializable implicitly.
 5. Serializable is a marker interface, it has no methods to implement. 
 */

class Person implements Serializable{

	private static final long serialVersionUID = 1L;

	private String name;
	private int age;
	
	public Person (String name,int age){
		this.name=name;
		this.age=age;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}
}

class PersonPersist{
	@SuppressWarnings("unchecked")
	public static void setPerson(){
		Person p1 = new Person("Vikas",25);
		Person p2 = new Person("Amit",26);
		List list = new ArrayList();
		list.add(p1);
		list.add(p2);
		try {
			ObjectOutputStream ous = new ObjectOutputStream(new FileOutputStream("C:\\Download\\Person.txt"));
			ous.writeObject(list);
			ous.close();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}

public class Serialization_Ex {
	@SuppressWarnings("unchecked")
	public static void main(String ar[]){
		
		PersonPersist.setPerson();
		
		try{
			ObjectInputStream ois = new ObjectInputStream(new FileInputStream("C:\\Download\\Person.txt"));
			List list = (ArrayList)ois.readObject();
			for(Iterator i=list.iterator();i.hasNext();){
				Person o = (Person)i.next();
				System.out.println("Name: "+o.getName());
				System.out.println("Age: "+o.getAge());
			}
			ois.close();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
	}
}