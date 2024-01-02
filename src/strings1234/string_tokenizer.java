package strings1234;

import java.util.StringTokenizer;

public class string_tokenizer {

	
	public static void main(String[] args) {
		
		 StringTokenizer st = new StringTokenizer("this,is,a,test",",");
	     while (st.hasMoreTokens()) {
	         System.out.println(st.nextToken());
	     }
	    
	     StringTokenizer a = new StringTokenizer("i am kalyan rayal");
	     while(a.hasMoreTokens()) {
	    	 System.out.println(a.nextToken());
	    	 
	     }
	     StringTokenizer b= new StringTokenizer("102003040506070809","0");
	     while(b.hasMoreTokens()) {
	    	 System.out.println(b.nextToken());
	     }
	     
	    
	}
}
