import java.util.*;


class CustomSorting{

	public static void main(String[] args) {
		List list = new ArrayList();
		CustomSorting cs = new CustomSorting();
		Scanner scan = new Scanner(System.in);
		int n;

		System.out.println("Enter the Customer Name :");
        String name = scan.nextLine();
        System.out.println("Enter the Customer Id :");
        int id = scan.nextInt();
        System.out.println("Enter the Customer Age :");
        int age = scan.nextInt();
        System.out.println("Enter the Customer Address :");
        String address = scan.next();
        list.add(new Customer(name,id,age,address));

		do{
	    System.out.println(" 1. Add New Customer(Y/N)\n 2. View all Customers\n 3. Sort by\n 4. Exit ");
         n = scan.nextInt();
        
        switch(n){

    	   case 1 : String ch = scan.next();
    	            if(ch.equalsIgnoreCase("Y"))
    	              {
    	                 System.out.println("Enter the Customer Name :");
                         String name1 = scan.next();
                         scan.nextLine();
                         System.out.println("Enter the Customer Id :");
                         int id1 = scan.nextInt();
                         System.out.println("Enter the Customer Age :");
                         int age1 = scan.nextInt();
                         System.out.println("Enter the Customer Address :");
                         String address1 = scan.next();
                         list.add(new Customer(name1,id1,age1,address1));
                         System.out.println("Customer Details are added");
                       }
                   else
                      {
                         System.out.println("No need of adding customer details....");
                      }
                   break;

           case 2 : for(Object obj : list)
                      {
                        System.out.println(obj);
                      }
                   break;

           case 3 : System.out.println("1. Sort by Customer Id\n   2. Sort by Customer Age\n 3. Sort by Customer Address   4. Sort by Customer First Name\n  5. Sort by Customer Last Name\n"); 
                    int n1 = scan.nextInt();
                    switch(n1){
                    	
                    	case 1 : java.util.Collections.sort(list, new SortByCId());
                    	         System.out.println("contents of list after sorting : " +list);
                    	         break; 

                    	case 2 : java.util.Collections.sort(list, new SortByCAge());
                    	         System.out.println("contents of list after sorting : " +list);
                    	         break;

                    	case 3 : java.util.Collections.sort(list, new SortByCAddress());
                    	         System.out.println("contents of list after sorting : " +list);
                    	         break; 

                    	case 4 : java.util.Collections.sort(list, new SortByFirstName());
                    	         System.out.println("contents of list after sorting : " +list);
                    	         break;

                    	case 5 : java.util.Collections.sort(list, new SortByLastName());
                    	         System.out.println("contents of list after sorting : " +list);
                    	         break;
                  

                        default : System.out.println("Invalid input...");                          
                    }
                    break;

           case 4 : System.out.println("yes i want to come out of loop....\n Thank You !");
                    break; 

           default :System.out.println("Invalid Input...");  

    }
 }while(n!=4);
}

}

class Customer {
	private String cname,firstname,lastname,caddress;
	private String []cnameArr;
	private Integer cid,cage;

	Customer(String cname, Integer cid, Integer cage, String caddress){
		this.cname = cname;
		this.cid = cid;
		this.cage =  cage;
		this.caddress = caddress;

		try
        {
                System.out.println("splitting name");
                cnameArr = cname.split(" "); 
                firstname = cnameArr[0];
                lastname = cnameArr[1];
                System.out.println(firstname+" "+lastname);
        }catch(Exception e)
        {
           System.out.println("Enter valid Employee Name");
        }
    }
	
    @Override		
	public String toString(){
		return "Customer ID: " + this.cid + "\nAge : " + this.cage+"\n Name: "+cname+"\nAddress: "+caddress;
	}
	
	public String getFirstName(){
        return this.firstname;
    }

    public String getLastName(){
        return this.lastname;
    }
 
    public Integer getId(){
        return this.cid;
    }
 
    public Integer getAge(){
        return this.cage;
    }

    public String getAddress(){
        return this.caddress;
    }
}

class SortByFirstName implements java.util.Comparator{
    @Override
    public int compare(Object firstObject, Object secondObject){
       return ((Customer)firstObject).getFirstName().compareTo(((Customer)secondObject).getFirstName()); 
    }
}

class SortByLastName implements java.util.Comparator{
    @Override
    public int compare(Object firstObject, Object secondObject){
       return ((Customer)firstObject).getLastName().compareTo(((Customer)secondObject).getLastName()); 
    }
}

class SortByCId implements java.util.Comparator{
    @Override
    public int compare(Object firstObject, Object secondObject){
       return ((Customer)firstObject).getId().compareTo(((Customer)secondObject).getId()); 
    }
}

class SortByCAge implements java.util.Comparator{
    @Override
    public int compare(Object firstObject, Object secondObject){
       return ((Customer)firstObject).getAge().compareTo(((Customer)secondObject).getAge()); 
    }
}

class SortByCAddress implements java.util.Comparator{
    @Override
    public int compare(Object firstObject, Object secondObject){
       return ((Customer)firstObject).getAddress().compareTo(((Customer)secondObject).getAddress()); 
    }
}