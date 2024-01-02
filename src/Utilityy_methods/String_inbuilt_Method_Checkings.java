package Utilityy_methods;

public class String_inbuilt_Method_Checkings {
	public static void main(String[] args) {
		String a = "ab@cdefghijklmn";
		String b = "ABCFDEF";
		String c = "ef";
		String d = "Hello planet earth, you are a great planet.";
		String []e= {"ka","vijay","bharath"};
		String []f= {"kalyan"};
		String g= "pineapple ant an ant aeroplane";
		String h[]= g.split("\\a");
		
		
		
	//	System.out.println(c);
		System.out.println(a.length()); //total length 
		System.out.println("----------");
		System.out.println(b.charAt(2)); // to check the char in specified index
		System.out.println("----------");
		System.out.println(a==b);  //compare the index values
		System.out.println("----------");
		System.out.println(a.equalsIgnoreCase(b)); // check the content exclude the case senstice. and give true
		System.out.println(a.equalsIgnoreCase(c)); // check the content exclude the case senstice. and give true
		System.out.println("----------");
		System.out.println(a.trim()); // remove spaces  as leading and tailing places
		
		System.out.println("----------");
		System.out.println(b.substring(5)); // given no is starting index
		System.out.println("----------");
		System.out.println(b.substring(0, 5));  // stsrting index and indix
		System.out.println("----------");
		System.out.println(c.toUpperCase());   // captial the total string
		System.out.println("----------");
		System.out.println(b.toLowerCase());   // complete string low case
		System.out.println("----------");
	    System.out.println(d.indexOf("planet earth, you are a great planet"));
	    System.out.println("----------");
	    System.out.println(b.indexOf('D'));  // must use single cuotes while use given charecter
	    System.out.println("----------");
	    System.out.println(b.indexOf('F', 4));  // by using purticular  given index  starting position number we find the charecter index position.
	    System.out.println("----------");
	    System.out.println(a.indexOf(c, 0));   // checking another string position from one string .
	    System.out.println("----------");
	    System.out.println(a.concat(b));
	    System.out.println("----------");
	    System.out.println(a.contains(c));    //  check one string have another one in it and give retuens in boolean format
	    System.out.println("----------");
	  System.out.println(h);
	    
	    
	
	}
}
