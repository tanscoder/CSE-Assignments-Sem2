import java.beans.BeanProperty;

/*

import java.util.*;

public class week1_exp1 {
//    Demonstrate control statements

    public static void main (String args[]) {
        // fibonacci  series
        Scanner sc= new Scanner(System.in);

        int n1=0;
        int n2=1;
        int N=100;
        int n3;

        // fibobacii using while loop
        for(int i = 0; n2<=100;i++){
                if (n2<80){
                     n3 = n2;
                     System.out.print(n2+",");
                     n2+=n1;
                     n1=n3;

                }
                else{
                     System.out.print(n2);
                     break;
          }
        }
        n1=0;
        n2=1;
        n3=0;
int i=0;
System.out.print("\n fibonacii part 2 : ");
        //  while
        while (n2<100)
         {  if (n2<80){
            n3 = n2;
            System.out.print(n2+",");
            n2+=n1;
            n1=n3;

        }
        else{
            System.out.print(n2+"\n");
            break;
        }}




        // incrementing  using do while
int i2=0;
        do {
           if (i<10){ System.out.print(" "+i2);}
            else{System.out.print("\n");}
            i2++;
        }
        while(i2<=10);





        //  control statements :Switch, Break
        System.out.print("\nFor whom do you choose to cast your vote?\n");
        System.out.print("1.Barrack Obama 2.Hilary  3.Trump 4.Biden 5.John kenedy\n");
        //System.out.print("\nyour vote:\n");
        int i1=sc.nextInt();
        System.out.print("\nyour vote:\n");
        switch (i1) {

            case 1 : System.out.print("\nBarrack Obama ");
                break;
            case 2 : System.out.print("\nHilary  ");
                break;
            case 3 : System.out.print("\nTrump ");
                break;
            case 4 : System.out.print("\nBiden");
                break;
            case 5 : System.out.print("\nJohn kenedy");
                break;
            default: System.out.print("\nNOTA");
                break;
        }
    }}
*/
abstract class Shape {
    // Abstract methodpublic abstract double calculateArea();
    // Concrete method
    public void display() {
        System.out.println("This is a shape.");
    }
}
class Circle extends Shape {
    private double radius;

    // Implementation of the abstract method

    public double calculateArea() {
       //radius=50;
        return Math.PI * radius * radius;
    }
     public static void main(String args[]){
        Circle c1=new Circle();
        System.out.print(c1.calculateArea());
     }
}

