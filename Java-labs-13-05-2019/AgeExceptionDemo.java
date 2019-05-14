import java.util.Scanner;
 
class AgeException extends Exception {
 
 public AgeException(String str) {
  System.out.println(str);
 }
}
public class AgeExceptionDemo {
 
 public static void main(String[] args) {
  Scanner scan = new Scanner(System.in);
  System.out.println("Enter ur age :: ");
  int age = scan.nextInt();
  
  try {
   if(age <= 15) 
    throw new AgeException("Invalid age");
   else
    System.out.println("Valid age");
  }
  catch (AgeException a) {
   System.out.println(a);
  }
 }
}