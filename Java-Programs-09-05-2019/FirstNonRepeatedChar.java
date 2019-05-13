//Write a Java program to find first non repeating character in a string.

public class FirstNonRepeatedChar {
 
    public static void main(String[] args) {
      String str = "ccdddef";
      for (char ch : str.toCharArray()) {
          if (str.indexOf(ch) == str.lastIndexOf(ch)) {
              System.out.println("First non repeated characted in String \""
              + str + "\" is:" + ch);
              break;
          }
      }
    }
}
