//Take a string from user at runtime and then check, print the number of vowels in the string

import java.util.*;
class CountVowels{
	public static void main(String[] args) {
		String str;
	    Scanner scan=new Scanner(System.in);
	    System.out.println("Enter the Input String");
        str=scan.nextLine();
        System.out.print(" Number of vowels in the string: " +countVowels(str)+"\n");
       }

  static int countVowels(String str){
        int count = 0;
        for (int i = 0; i < str.length(); i++)
        {
            if (str.charAt(i) == 'a' || str.charAt(i) == 'e' || str.charAt(i) == 'i'
                    || str.charAt(i) == 'o' || str.charAt(i) == 'u')
            {
                count++;
            }
        }
        return count;
    }
 }    