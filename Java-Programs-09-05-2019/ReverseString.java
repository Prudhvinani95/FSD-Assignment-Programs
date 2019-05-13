// Take a string from user at runtime and then print it's reverse

import java.util.*;
class ReverseString{
	public static void main(String[] args) {
		 String n,rev=" ";
	     Scanner scan=new Scanner(System.in);
	     System.out.println("Enter the Input String");
	     n=scan.nextLine();
	     int len=n.length();
	     for(int i=len-1;i>=0;i--){
            rev=rev+n.charAt(i);

	     }
        System.out.print("Reverse of the String:"+rev); 
	}
}