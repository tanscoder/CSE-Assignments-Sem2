public class Main {

 

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
        for (int j=1;  j<=5;j++ )
        {factorial = factorial*j;}
       System.out.println("factorial:  "+factorial); 
 System.out.print ("factorial by recusive function:  "+ factorial(6)) ;

    }
}