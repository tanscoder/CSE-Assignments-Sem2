import javax.xml.namespace.QName;
//public class week4_exp22 {


     class Week4_exp22 {

        public class country {
            public String name;
            public String capital;
            public String lead;
            public String continent;
            public int population;

            country(String capy, String lead, String cont, int pop, String name) {
                this.capital = capy;
                this.population = pop;
                this.name = name;
                this.lead = lead;
                this.continent = cont;
            }

            country(String capt, String name) {
                this.capital = capt;
                this.name = name;
            }

            @Override
            public String toString() {
                return "Country " + name + " Capital:" + capital + " Lead by" + lead;
            }

            void full_intro() {
                System.out.print("Capital of " + name + " is: " + capital +
                        " \nWhose lead " + lead +
                        "\nThis country ,located in " +
                        continent + " has a population of " + population);
            }

            void president() {
                System.out.print("The leader is " + lead);
            }

            void capital() {
                System.out.print("Its capital is " + capital);
            }
        }

        class city extends country {
            String ctyname;
            String State;

            city(String city_name, String state, String country) {
                super("","",country,0,"");//country);  // Call the constructor of the superclass
                this.ctyname = city_name;
                this.State = state;
            }
        }

        public static void main(String args[]) {
            // Example of using the classes
            Week4_exp22 week4 = new Week4_exp22();
            country country1 = week4.new country("Washington", "Joe Biden", "North America", 331002651, "United States");
            country1.full_intro();

            city city1 = week4.new city("New York", "New York", "United States");
            city1.capital();
        }
    }



