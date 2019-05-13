// Write a program that computes your initials from your full name and displays them.

import java.util.*;
class InitialsDisplay{
	public static void main(String[] args) {
		String str;
		char ch;
		int len;
	     Scanner scan=new Scanner(System.in);
	     System.out.println("Enter the Input String");
	     str=scan.nextLine();
	     str=" "+str; 
         str=str.toUpperCase(); 
         len=str.length(); 
         System.out.print("Output = ");
         for(int i=0;i<len;i++){
         ch=str.charAt(i); 
         if(ch==' ') 
         System.out.print(str.charAt(i+1)+" ");
}
}
}
     