import javax.xml.namespace.QName;

public class Week4_exp2 {

   public  static class country {
       public String name;
       public String capital;
       public String lead;
       public String continent;

       public int population;

       country(String name, String cont, String capy,String lead, int pop) {
           this.name = name;
           this.capital = capy;
           this.continent = cont;
           this.lead = lead;
           this.population = pop;
       }

       country(String capt, String name) {
           this.capital = capt;
           this.name = name;
       }


       @Override
       public String toString() {
           return "Country " + name + "Capital:" + capital + "Lead by" + lead;
       }

       void full_intro() {

           System.out.print("Capital of " + name + " is: " + capital +
                   " \nWhose lead " + lead +
                   "\nThis country ,located in " +
                   continent + " has population of " + population);

       }

       void president() {

           System.out.print("The leader is " + lead);

       }

       void capital() {

           System.out.print("Its capital is " + capital);

       }
   }
   static class  city extends country{
       String ctyname;
       String State;

city(String city_name,String State ,String country) {
    super("", "", "", "", 0);//country);
    this.ctyname = city_name;
    this.State = State;
}
void city_info(){

    System.out.print("\nCity: "+ctyname+", Of state: "+State+" country: "+name);
   //=country;

}

}
public static void main(String args[]){

 country c1= new country("China","Asia","Beijing","Xi ping",800000);
 country c2= new country("fjkfm","ttt","Tokyo","jrj",5000000);
 c1.full_intro();
   city ct1= new city("Vijayawada","Andhra","India");
ct1.city_info();
   }


}
