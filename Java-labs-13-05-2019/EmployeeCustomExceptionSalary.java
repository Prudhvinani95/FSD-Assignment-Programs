import java.util.Scanner;
import com.cg.eis.exception.EmployeeException;

class EmployeeCustomExceptionSalary{
  public static void main(String[] args)throws EmployeeException {
  Scanner scan = new Scanner(System.in);
  System.out.println("Enter your salary:: ");
  int sal = scan.nextInt();
  
   if(sal < 3000) 
    throw new EmployeeException("Your salary is lesser than expected");
   else
    System.out.println("your salary is :" +sal);
  
 }
}