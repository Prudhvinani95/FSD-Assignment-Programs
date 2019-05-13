//Write a java program to compare two strings lexicographically, ignoring case differences

class CompareString{
	public static void main(String[] args) {
		String str1="welcome to java world and python";
		String str2="welcome to java world ";
	     int result=str1.compareToIgnoreCase(str2);
		System.out.print(result);
	}
}