//Write a Java program to check whether a given string ends with the contents of another string.

class EndsWithString{
	public static void main(String[] args) {
		String str1="welcome to java world";
		String str2="welcome to java word";
		String endchars="world";
	    Boolean s1=str1.endsWith(endchars);
	    Boolean s2=str2.endsWith(endchars);
	    System.out.println(str1 + " ends with " +endchars + " ? " +s1);
        System.out.println(str2 + " ends with " +endchars + " ? " +s2);
	}
}