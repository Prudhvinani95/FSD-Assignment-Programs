import java.util.ArrayList;
import java.util.Scanner;
class Laptop{
    private Integer id, ramSize, hddSize;
    private String brand;
 
    Laptop(int id, int ramSize, int hddSize, String brand ){
        this.id=id;
        this.ramSize = ramSize;
        this.hddSize = hddSize;
        this.brand = brand;
    }
     public String toString(){
     	return this.id + " "  + this.ramSize + " " + this.hddSize + " " + this.brand;
     }
    //Creating the getters
    public Integer getId(){
        return this.id;
    }
    public Integer getRamSize(){
        return this.ramSize;
    }
 
    public Integer getHddSize(){
        return this.hddSize;
    }
 
    public String getBrand(){
        return this.brand;
    }
    public void setId(int id){
        this.id = id;
    }
    public void setRamSize(int ramSize){
        this.ramSize = ramSize;
    }
    public void setHddSize(int hddSize){
        this.hddSize = hddSize;
    }
    public void setBrand(String brand){
        this.brand = brand;
    }
}
 
class LaptopApiUsingCollections{
	public static void main(String[] args) {
		ArrayList list=new ArrayList();
		Scanner  scan=new Scanner(System.in);
		int n;
		do{
		System.out.println(" 1. Enter a new Laptop\n 2. View All Laptop Details\n 3. Search for a Laptop: By (Id, Brand, Ram Size, Hdd Size)\n 4. Delete a Laptop : By(ID)\n  5. Update Laptop Details\n 6. Exit");
		 n=scan.nextInt();
		
		switch(n){
			case 1 : System.out.println("Enter No of laptops :");
		             int temp=scan.nextInt();
		             for(int v=1;v<=temp;v++){
		             System.out.println("Enter ID " +v+ ":");
			         int i=scan.nextInt();
	                 System.out.println("Enter Ram Size " +v+ ":");
	                 int rs=scan.nextInt();
	                 System.out.println("Enter HardDisk Size " +v+ ":");
	                 int hds=scan.nextInt();
	                 System.out.println("Enter Brand " +v+ ":");	
	                 String br=scan.next();
	                 list.add(new Laptop(i,rs,hds,br));
	                 }
	                 System.out.println("All laptop details are added ");
	                 break;
	        case 2 : for(Object obj : list ){
	        	      System.out.println(obj);
	        	     }
	                  break;
	        case 3 : System.out.println("For searching through Id press 1, through Ram Size 2, through HardDisk Size press 3, through Brand press 4");
                     int n1 = scan.nextInt();
                     scan.nextLine();
                     switch(n1)
                           {
                              case 1:System.out.println("Enter the Id to be searched :- ");
                              int i1 = scan.nextInt();
                              for(int v=0; v<list.size(); v++)
                               {
                                  if(i1 == ((Laptop)list.get(v)).getId())
                                     {
                                         System.out.println("Ram : " + ((Laptop)list.get(v)).getRamSize());
                                         System.out.println("HDD Size : " + ((Laptop)list.get(v)).getHddSize());
                                         System.out.println("Brand : " + ((Laptop)list.get(v)).getBrand());
                                     }
                               }
                                break; 
                              case 2:System.out.println("Enter the Ram Size to be searched :- ");
                              int rs1 = scan.nextInt();
                              for(int v=0; v<list.size(); v++)
                               {
                                  if(rs1 == ((Laptop)list.get(v)).getRamSize())
                                     {
                                         System.out.println("ID : " + ((Laptop)list.get(v)).getId());
                                         System.out.println("HDD Size : " + ((Laptop)list.get(v)).getHddSize());
                                         System.out.println("Brand : " + ((Laptop)list.get(v)).getBrand());
                                     }
                               }
                                break; 
                              case 3:System.out.println("Enter the HardDisk Size to be searched :- ");
                              int hds1 = scan.nextInt();
                              for(int v=0; v<list.size(); v++)
                               {
                                  if(hds1 == ((Laptop)list.get(v)).getHddSize())
                                     {
                                         System.out.println("ID : " + ((Laptop)list.get(v)).getId());
                                         System.out.println("Ram Size : " + ((Laptop)list.get(v)).getRamSize());
                                         System.out.println("Brand : " + ((Laptop)list.get(v)).getBrand());
                                     }
                               }
                                break;  
                              case 4:System.out.println("Enter the Brand Size to be searched :- ");
                              String br1 = scan.nextLine();
                              for(int v=0; v<list.size(); v++)
                               {
                                  if(br1== ((Laptop)list.get(v)).getBrand())
                                     {
                                         System.out.println("ID : " + ((Laptop)list.get(v)).getId());
                                         System.out.println("Ram Size : " + ((Laptop)list.get(v)).getRamSize());
                                         System.out.println("HardDisk Size : " + ((Laptop)list.get(v)).getHddSize());
                                     }
                               }
                                break; 
                               default:System.out.println("Invalid Choice ");
                            }   
                     break;               
            case 4 : System.out.println("Enter the Id of the laptop to be deleted :- ");
                     int i2 = scan.nextInt();
                     for(int v=0; v<list.size(); v++)
                      {
                         if(i2 == ((Laptop)list.get(v)).getId())
                           {
                             list.remove(v);
                           }
                     }
                     System.out.println("Deletion Successful...");
                     break;
            case 5  : System.out.println("Enter the Id of the laptop to be updated :- ");
                      int i3 = scan.nextInt();
                      System.out.println("Enter 1 for Rams Size updating, 2 for HDD size updating , 3 for Brand updating");
                      int upd=scan.nextInt();
                      if(upd == 1)
                        {  
                           System.out.println("Enter the new Ram Size :-");
                           int rs2=scan.nextInt();
                           for(int v=0; v<list.size(); v++)
                            {
                              if(i3 == ((Laptop)list.get(v)).getId())
                                {
                                   ((Laptop)list.get(v)).setRamSize(rs2);
                                   System.out.println("Updated...");
                                }
                            }
                        }
                     else if(upd == 2)
                        {
                           System.out.println("Enter the new HDD Size :-");
                           int hds2=scan.nextInt();
                           for(int v=0; v<list.size(); v++)
                            {
                              if(i3 == ((Laptop)list.get(v)).getId())
                               {
                                 ((Laptop)list.get(v)).setHddSize(hds2);
                                  System.out.println("Updated...");
                                }
                            }
                        }
                     else if(upd == 3)
                       {
                          System.out.println("Enter the new Brand Name :-");
                          String br2=scan.next();
                          for(int v=0; v<list.size(); v++)
                           {
                              if(i3 == ((Laptop)list.get(v)).getId())
                               {
                                  ((Laptop)list.get(v)).setBrand(br2);
                                  System.out.println("Updated...");
                               }
                           }
                       }
                     else
                        {
                          System.out.println("Invalid Input...");
                        }
                     break;
            case 6 : System.out.println("yes i want to come out of loop....\n Thank You !");
                     break;
            default :System.out.println("Invalid Input..."); 
                      
            }
	}while(n!=6);
}
}