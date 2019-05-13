//Create a program that reads an unspecified number of integer arguments from the command line and adds them together. For example, suppose that you enter the following:
//java Calculate 1 3 2 10
//The program should display 16 and then exit. The program should display an error message if the user enters only one argument.

class SumCommand {
    public static void main(String[] args) {
	int numArgs = args.length;
        if (numArgs < 2) {
            System.out.println("This program requires two command-line arguments.");
        } 
        else {
	    int sum = 0;
        for (int i = 0; i < numArgs; i++) {
            sum = sum+Integer.valueOf(args[i]).intValue();
	    }

            System.out.println("Result: "+sum);
        }
    }
} 