package core.string.stringBuffer.stringBuilder;
/*
A.	OVERRIDING: 
		1.	Any time you have a class that inherits a method from a superclass, you have the opportunity to override
			the method, unless the method marked final.
		2.	Abstract method are the methods, you are forced to override unless the subclass is also abstract.
		3.	Argument list must exactly match.
		4.	The return type must be same as, or the sub-type of the return type.
		5.	The access level can't be more restrictive.
		6.	The overriding method can throw any unchecked exception (Runtime).
		7.	The overriding method must not throw any checked exception (Compile time).
		8.	You can not override final and static method.
		9.	If a method can't be inherited, you can not override it.  
		
B.	OVERLOADING:
		1.	can change return type.
		2.	can change exception.
		3.	can change access modifiers.
		4.	must change arguments.
		5.	Invocation happens at compile time. Reference type determines which overloaded version is selected. 
		
//--------------------------------------------------------------------------------------------------------------//

		METHOD INVOCATION CODE				RESULT

1.		Animal a = new Animal();			Generic Animal.
 		a.eat();
 		
2.		Horse h = new Horse();				Horse eating.
 		h.eat();	
 		
3.		Animal a = new Horse();				Horse eating. (Polymorphism works)
 		a.eat();
 		
4.		Horse h = new Horse();				Horse eating apples.
 		h.eat("Apples");

5.		Animal a = new Animal();			COMPILE ERROR !! --> Animal class doesn't have eat method.
		a.eat("Treats");

6.		Animal a = new Horse();				COMPILE ERROR!! -->	Compiles still looks only at the reference, and sees 
		a.eat("Carrot");					that Animal doesn't have eat() method that takes a string. 

//--------------------------------------------------------------------------------------------------------------//
 */

class Animal{
	private void eat(){
		System.out.println("Animal can eat.");
	}
}
class Horse extends Animal{}

class TestAnimal{
	public static void main(String ar[]){
		Horse h = new Horse();
//		h.eat();					// Not leagl because Horse did't inherit eat(); --> PROVED POINT 9
	}
}

public class Polymorphism_Overloading_Overriding {

}
