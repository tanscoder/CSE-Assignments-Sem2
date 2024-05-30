public class Main {
  
  static  int  i=facto;  
   static int  factorial=1; 

    public static int  factorial(int facto){ 
      
     
    
    if (facto == 1){ 
        return facto;
       
    }
    else { 

        facto=facto*factorial(facto-1);
        

    }
                                                     
    return facto;                                                                                           
  }
    public static void main(String[] args) {

        int factorial=1;
        for (int i=1;  i<=5;i++ )
        {factorial = factorial*i;}
       System.out.println("factorial:  "+factorial); 
 System.out.print ("factorial by recusive function:  "+ factorial(5)) ;

    }
}
