import java.util.*;

public class test2 { 
   public  static void main (String [] args) { 

  ArrayList<Integer> A1 = new ArrayList<>(Arrays.asList (1,2,3,4));
  Iterator <Integer> it =  A1.iterator( );

  A1.add(5);
  A1.set(3,7);
  int i=0;



   while (it.hasNext()){ 

             System.out.println(" element at  " +i+" : "  + it.next() );
                                 	i+=1;			               
                                         }

System.out.print(" all the elements  : "+ A1);    

it= A1.iterator();



     while(it.hasNext( )){ 
         
          if (it.next()%2!=0){ 

                    it.remove();

                             }  

                 }
 
         }
}
