// Create a program that is similar to the previous one but has the following differences:
//Instead of reading integer arguments, it reads floating-point arguments.
//It displays the sum of the arguments, using exactly two digits to the right of the decimal point.

import java.text.DecimalFormat;

public class FloatDecimalSum {
    public static void main(String[] args) {
    	int numArgs = args.length;
        if (numArgs < 2) {
            System.out.println("This program requires two command-line arguments.");
        } 
        else {
	   double sum = 0.0;

	    for (int i = 0; i < numArgs; i++) {
                sum  =sum + Double.valueOf(args[i]).doubleValue();
	    }

	   
	    DecimalFormat myFormatter = new DecimalFormat("###,###.##");
	    String result = myFormatter.format(sum);

            System.out.println(result);
        }
    }
}