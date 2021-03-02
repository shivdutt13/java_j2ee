package core.string.stringBuffer.stringBuilder;

public class StringComparison1 {
	public static void main(String ar[]){
		String name1 = "Bob";
		String name2 = new String("Bob1");
		String name3 = "Bob";
		
		// CASE TO USE == OPERATOR
		
		/*// 1st case
		if(name1 == name2){
			System.out.println("the strings are equal.");
		}else{
			System.out.println("the strings are not equal.");
		}
		
		//2ns case
		if(name1 == name3){
			System.out.println("the strings are equal.");
		}else{
			System.out.println("the strings are not equal.");
		}*/
		
		// CASE TO USE equals() methods
		
		// 1st case
		if(name1.equals(name2)){
			System.out.println("the strings are equal.");
		}else{
			System.out.println("the strings are not equal.");
		}
		
		//2ns case
		if(name1.equals(name3)){
			System.out.println("the strings are equal.");
		}else{
			System.out.println("the strings are not equal.");
		}
		
		// CASE TO USE compareTo() methods
		
		String n1 = "bob";
		String n2 = new String("cob");
		String n3 = "Bob";
		
		//1st case
		if(n1.compareTo(n2) == 0){
			System.out.println("The strings are equals.");
		}else if(n1.compareTo(n2) < 0){
			System.out.println("n2 follows n1");	
		}else{
			System.out.println("n1 follows n2");
		}
		
		//2nd case Comparing Ascii uppercase ill be smaller then lower case
		if(n1.compareTo(n3) ==0){
			System.out.println("The strings are equals.");
		}else if(n1.compareTo(n3) < 0){
			System.out.println("n3 follows n1");
		}else{
			System.out.println("n1 follows n3");
		}
	}
}
