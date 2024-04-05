public class week3_exp1{
    static class mobile {

      String company;
      String model;
      int price;

     mobile(String comp, String modl, int prc) {

          company = comp;
          model = modl;
          price = prc;
      }

      void fulldata() {
          System.out.print("\n" + "Company: " + company + " " + "\nModel: " + model + " " + "\nPrice: Rs " + price+"/-");
      }
      void Company() {
          System.out.print("\nCompany: " + company);
      }
      void model() {
          System.out.print("\nModel: " + model);
      }
      void price() {
          System.out.print("\nPrice: " + "Rs:"+price+"/-");
      }
  }
  public static void main(String[]args){

   mobile m1= new mobile("Oppo","Reno",55000);
   mobile [] ma= new mobile[3];
   m1.Company();
   m1.model();
   m1.price();
   System.out.print("\n");
   m1.fulldata();
   ma[0]=new mobile("Vivo","F9 pro",45999);
   ma[1]=new mobile("Redmi","Note 10",69999);
   ma[2]=new mobile("Apple","I19 pro",89999);
   System.out.print("\n");
   ma[2].fulldata();
  }

}
