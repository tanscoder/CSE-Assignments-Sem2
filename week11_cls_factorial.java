import java.util.*;
public class Main {

 
public static int factorial(int fct){ 
		   int factorial=1;
		    for (int j=1;  j<=fct;j++ ){
                    
			 factorial = factorial*j;}
		
			return factorial; }

    public static int  factorialRec(int facto){ 
                    if (facto == 1){ 
          			 return facto;}

		    else { 
		        facto=facto*factorialRec(facto-1);   }

     			    return facto;                                                                                           
  						}

    public static void main(String[] args) {

        int factorial=1,n;
         Scanner sc = new  Scanner (System.in);

	 System.out.println("enter your digit to find the factorial");

	n=sc.nextInt();
      
       System.out.println("factorial:by  non recursive  "+factorial(n)); 
 System.out.print ("factorial by recusive function:  "+ factorialRec(n)) ;

    }
}
