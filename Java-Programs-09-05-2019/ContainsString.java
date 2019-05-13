//Write a Java program to test if a given string contains the specified sequence of char values.

class ContainsString{
	public static void main(String[] args) {
		String str1="welcome to java world";
		String str2="welcome to ";
	    Boolean result=str1.contains(str2);
		System.out.print(result);
	}
}