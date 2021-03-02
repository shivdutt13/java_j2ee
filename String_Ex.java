package core.string.stringBuffer.stringBuilder;

// 1.	String object is Immutable. 
		//--> It's value can not be changed. 
		//--> But String reference variable is not immutable.

// 2.	StringBuffer is Mutable. 
		//--> It is Synchronized. That's why it is Thread safe.
		//--> Thread-safe describes a program portion or routine that can be called from multiple 
			//programming threads without unwanted interaction between the threads.
		//--> Every method defined in the StringBuffer Class is synchronized.
		//--> StringBuilder and StringBuffer can be modified again and again without wasting the memory.

// 3.	StringBuilder is not Synchronized. 
		//--> That's why it is faster then StringBuffer.

public class String_Ex {

/* ------------------------>    STRING STARTS    <---------------------*/
	private String s; 
	// 4.	CREATES A REFERENCE VARIABLE.
	
	private String s1="amit";
	 // 5.	CREATES ONE REFERENCE VARIABLE s1 AND ONE OBJECT WITH VALUE AS "amit" IN THE HEAP.
	
	//private String s;
	 // 6.	DUPLICATE INSTANCE VARIABLE
	
	public static void main(String[] args) {

		//		System.out.println("S--> "+s); 
		// 7.	USING s HERE GIVES ERROR, BCZ OF USING NON-STATIC VARIABLE IN STATIC METHOD.
		
		//		private String s; 
		//8.	ILLEGAL MODIFIER. ONLY final IS PERMIT HERE.
		
		String s; 
		// 9.	VARIABLE s IS DEFINED AGAIN HERE, IT IS POSSIBLE BCZ IT IS DEFINED IN THE LOCAL CONTEXT OF THE METHOD.
		
		String s1 = "amit";
		
		s = s1;
		System.out.println("S--> "+s); 
		// 10.	VALUE OF s IS amit.
		
		s = "abc";
		System.out.println("S--> "+s);
		 // 11.	VALUE OF s IS abc.
		
		s=s+"xyz";
		System.out.println("S--> "+s);
		 // 12.	VALUE OF s IS abcxyz.
		
		s.concat("BAT");
		// 13.	THIS STATEMENT CREATES ONE OBJECT INTO HEAP WITH VALUE abcxyzBAT BUT IT WILL 
		//NOT POINT TO ANY REFERENCE VARIABLE
		
		System.out.println("S--> "+s);
		 // 14.	VALUE OF s IS STILL abcxyz BCZ WE HAVE CONCAT "BAT" TO s BUT WE HAVE NOT ASSIGNED IT TO s.
		
		s = s.concat("BAT");
		System.out.println("S--> "+s);
		 // 15.	NOW VALUE OF s IS abcxyzBAT
		
		
		//String  s = new String();
		 // 16.	DUPLICATE LOCAL VARIABLE
		
		String str = new String(); 
		// 17.	CREATES ONE REFERENCE VARIABLE str.
		System.out.println("str--> "+str);
		
		String str1 = new String("amit"); 
		// 18.	CREATES ONE REFERENCE VARIABLE str1 AND ONE OBJECT WITH VALUE AS "amit" IN THE HEAP. 
		//ALSO ONE OBJECT OUTSIDE THE HEAP INTO THE MAIN MEMORY.
		System.out.println("str1--> "+str1);
		
		String name = "bob";
		
		String str4 = "My name is "+ "name";
		// str4 denotes a new String object.
		
/* ------------------------>    STRING ENDS      <---------------------*/		

/* ------------------------>    STRINGBUFFER STARTS      <---------------------*/		
		
		StringBuffer bf = new StringBuffer("Sachin");
		// 19.	CREATES ONE REFERENCE VARIABLE bf OF TYPE STRINGBUFFER AND ONE OBJECT IN HEAP HAVING VALUE AS "Sachin"
		System.out.println("BF--> "+bf);
		
		bf.append("Tendulkar");
		//20.	NOW HERE WE HAVE JUST APPEND ANOTHER STRING TO bf AND NOT ASSIGN IT BACK TO bf. 
		System.out.println("BF--> "+bf);
		// BUT STILL IT PRINTS THE OUTPUT AS "SachinTendulker".
		
/* ------------------------>    STRINGBUFFER ENDS         <---------------------*/		
		
/* ------------------------>    STRINGBUILDER STARTS      <---------------------*/		
		StringBuilder bd = new StringBuilder("rajan");
		// 21.	CREATES ONE REFERENCE VARIABLE bd OF TYPE STRINGBUILDER AND ONE OBJECT IN HEAP HAVING VALUE AS "rajan"
		System.out.println("Bd--> "+bd);
		
		bd.append("Chopra");
		//22.	NOW HERE WE HAVE JUST APPEND ANOTHER STRING TO bd AND NOT ASSIGN IT BACK TO bd. 
		System.out.println("Bd--> "+bd);
		// BUT STILL IT PRINTS THE OUTPUT AS "rajanChopra".
		
/* ------------------------>    STRINGBUILDER ENDS      <---------------------*/		
	}
}