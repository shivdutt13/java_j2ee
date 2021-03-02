package core.string.stringBuffer.stringBuilder;

// NoMatchException class defined to throw the exception defined by user.
class NoMatchException extends Exception {

	private static final long serialVersionUID = 8346282276905118889L;
	
	private String str;

    public NoMatchException(String str){
        this.str = str;
    }

    public String toString(){
        return "String is not matching: " + str ;
    }
}

public class UserDefinedException {
	
	// Method that sets the value for comparing the original value.
	static String getValue(){
        return "Display";
    }
	
	public static void main(String[] args) throws Exception {
		
		//get the value to compare.
		 String str = getValue();

	     if (!str.equals("Symbiosis")){
	    	 throw new NoMatchException(str);
	     }else{
	    	 System.out.println("String entered is: " + str);
	    }
	}
}