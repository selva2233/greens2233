package string;

public class stringDefined {
	public static void main(String[] args) {
		String x="Java";
		String x1="java";
		String x2="welcome to java";
		String x3="     welcome to java";
		int a = x.length();
		System.out.println(a);
		String upperCase = x.toUpperCase();
		System.out.println(upperCase);
		String lowerCase = x.toLowerCase();
		System.out.println(lowerCase);
		
		//first occured
		int indexOf = x.indexOf("a");
		System.out.println(indexOf);
		
		//last occured
		int lastIndexOf = x.lastIndexOf("a");
		System.out.println(lastIndexOf);
		
		//to find particular letter using index position
		char charAt = x.charAt(2);
		System.out.println(charAt);
		
		//case sensitive
		boolean equals = x.equals(x1);
		System.out.println(equals);
		
		//non csae sensitive
		boolean equalsIgnoreCase = x.equalsIgnoreCase(x1);
		System.out.println(equalsIgnoreCase);
		
		
	}

}
