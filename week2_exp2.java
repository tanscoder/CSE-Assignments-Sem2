public class week2_exp2 {
    public static class car {
        public String company;

        public String model;
         public int maxspd;
        //   constructor
        public car(String company, String model) {
            this.company = company;
            this.model = model;

        }
        public car(String company ,String model,int maxspd){
            this.company=company;
            this.model=model;
            this.maxspd=maxspd;

        }
        // instance method, inside a class
        public void intro() {

            System.out.print("Presenting the legendary" +" "+ company +" "+ model+"\n");
}
     public void intros(){
            System.out.print("Here comes "+company+" "+model+" "+" With  maxspeed"+" "+maxspd+"\n");
     }

    }
public static void main(String args[] ) {

    car car1 = new car("Honda","Civic");
    car car2 = new car ("Lamborghini","Adventor");
    car1.intro() ;
  car2.intro();
  car car1s= new car("Honda","Civic",200);
    car car2s= new car("Lamborghini","Revoulto",350)
            ;
    car1s.intros();
    car2s.intros();

    }

}
