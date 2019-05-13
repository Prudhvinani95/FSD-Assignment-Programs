//Take a string from user at runtime and then check, print whether the string entered is a palindrome or not

import java.util.*;
class Palindrome{
	public static void main(String[] args) {
		 String n,rev=" ";
	     Scanner scan=new Scanner(System.in);
	     System.out.println("Enter the Input String");
	     n=scan.nextLine();
	     int len=n.length();
	     for(int i=len-1;i>=0;i--){
            rev=rev+n.charAt(i);
	     }
	     if(n.equals(rev)){
	     	System.out.println("string is Palindrome");
	     }
	     else{
	     	System.out.println("string is not palindrome");
	     }

	     }
   }
