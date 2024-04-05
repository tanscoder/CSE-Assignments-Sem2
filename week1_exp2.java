public class week1_exp2 {
public static class car{
     public String company ;
    public String model;


public  car (String company,String model)
{
     this.company=company;
     this.model= model;
}
 @Override
public String toString(){
    return "Company :" + company+"   "+"Model : "+ model+"\n";
}

public void intro() {
    System.out.print(company + model);
            }
 public static void main (String [] args )
 {
      car cl[] =  new car[3];

      cl[0] = new car ("Toyota","Supra");
      cl[1] = new car ("Honda","City");
      cl[2] = new car ("Tesla","xm");
     int i=0;
      for ( i=0;i<=2;i++)
                  {
              System.out.print(cl[i]);
                  }

     //String s = String.join("\t",cl[]);//cl[0],cl[1],cl[2]);

     //System.out.print(cl[0]+" "+cfl[1]+cl[2]);



}

}
}
