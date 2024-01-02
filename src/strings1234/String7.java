package strings1234;

public class String7 {
	public static void main(String[] args) {
		String str1 = "Hello";
		String str2 = "Hello";
		String str3 = new String("Hello");
		String str4 = "world";
		StringBuilder str5 = new StringBuilder("world");
		StringBuffer str6 = new StringBuffer("world");

		System.out.println(str1.equals(str2));
		System.out.println(str1.equals(str3));
		System.out.println(str1.equals(str4));
		System.out.println(str4.equals(str5));

		System.out.println(str4.equals(str6.toString()));
		
		System.out.println((str5.toString()).equals(str6.toString()));  

	}
}