import java.util.*;
public  class week12 <T> { 




public static void main (String[ ] args  ){ 

   ArrayList<T> al1= new ArrayList<T>(5);
  
Scanner sc= new Scanner(System.in);

boolean b=false;
while (b==false){

System.out.println("please enter the function you need");
System.out.println("\toptions \n 1.Insert \n2.Display\n3.\n4.");

String input =sc.nextLine();
 b=input.equals("stop");


switch (input){ 
    
   case "Insert" :
	System.out.println("please enter the the elements to be added upto 5 elements ");
	for (int i = 0;i<5;i++){
      		 int i1=sc.nextInt();
	         al1.add(i1); 
        	System.out.println(" sucefully added to the list ");}
		System.out.println("elements aded succesfully");
	break;

   case "Display":

             System.out.println("please enter the value to be displayed");
             int ind=sc.nextInt();
       	      
             try{ System.out.println( al1.get(ind));
			}catch(Exception e){
			       System.out.print( "OOps ! no object found at that index ,please enter a valid index"); }
         break;

case "delete":

	        System.out.println("please enter the index of the value to be deleted from the ArrayList"); 	
	 	try {int ind2=sc.nextInt();al1.remove(ind2);
   
                }catch(ArrayIndexOutOfBoundsExceptions e){System.out.print("OOps ! no object found at that index ,please enter a valid index");
									}
                
	        break;
       
     }

   }
System.out.print( "program stopped");
}}
//"D:\VITAP.sem2.All PDFs\CSE2005.sem2\CSE2005_assignment2\week12.java"
