package strings1234;

public class Difference_in_string_builder_buffer {

	public static void main(String[] args) {
		//point 1- string is immutable,builder , buffer mutable
		
		//String
		String a="kalyan";
		a.concat("bhagaya");
		String a1= new String("kalyan");
		a1.concat(" bhagya");
		System.out.println(a1);
		System.out.println(a);
		System.out.println("-------------");
		
		//String-builder
		
		StringBuilder b= new StringBuilder("kalyan");
		b.append(" bhagya");
		System.out.println(b);
		System.out.println("-------------");
		
		//Strring-buffer
		
		StringBuffer a2 = new StringBuffer("kalyan");
		a2.append("bhagya");
	
		System.out.println(a2);
		System.out.println(a2.reverse());
		
// point -2 String consumes more memory than other two caz it  cant allow to add other changes in it 
		// but other 2 allow changes so memory will reduce
// point -3 String is slow to compare other two caz it occupies more memory  than others.

// point -4 Basically Strings re immutable so these are thread safe
		//A StringBuilder is not thread-safe because it is designed for single-threaded operations,
	//StringBuffer is thread-safe because it is synchronized, which means that only one thread can access the object at a time
		
// point -5 Strings are stored in String Constant Pool area
		// buffers and builders created by objects so they are stored in heap ares.
		
// point -6  String and buffer are 1.0 versions but builder is in 1.5 version
		
	}

}
