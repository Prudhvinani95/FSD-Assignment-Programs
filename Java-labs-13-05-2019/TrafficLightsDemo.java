import java.util.Scanner;
class TrafficLightsDemo{
	public static void main(String[] args) {
	 Scanner scan=new Scanner(System.in);
	 System.out.println("Enter the Input String");
	 String n=scan.nextLine();
	 switch(n){
	 	case "red" : System.out.println("stop");
	 	              break;
	 	case "yellow" : System.out.println("ready");
	 	                break;
	 	case "green" : System.out.println("go");
	 	                break;  
	 	case "default" : System.out.println("no msg to display");          
  	 }
	}
}