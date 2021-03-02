package core.string.stringBuffer.stringBuilder;

import java.util.StringTokenizer;

public class StringtokenizerImpl {

	public static void main(String ar[]){
		
		// STRING TOKENIZER IMPLEMENTATION
		
		StringTokenizer st = new StringTokenizer("abc,xyz,def",",");
		while(st.hasMoreTokens())
			System.out.println(st.nextToken());
	}
}
