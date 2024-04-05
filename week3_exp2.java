import java.lang.reflect.Method;

public class week3_exp2 {
     static class srs{
  String director ;
  String series;
  double rating;

 String seriesname;


          srs(String director,String series){
          this.director= director;
          this.series=series;
            }
            srs(String series,double rating) {
                 this.rating = rating;
                 this.series=series;
            }
            srs (String director , String series, double rating){

            this.director=director;
            this.series=series;
            this.rating=rating;
            }


/* void series(){
      System.out.print("\nSeries: "+ series);
 }*/
void director(){
       System.out.print("\nDirected: "+director);}

void intro(){
      System.out.print("\n"+series+"\n Directed by , "+director+"\n"+rating+" Rated ");
     /* if (violence=true) {
          System.out.print("Violence");
      }else if(violence=false){System.out.print("");
      }*/
}


     void  invokemethod(String intro) {
         try {
             Method method = srs.class.getMethod(director);
             method.invoke(this);
         } catch (Exception e){
            e.printStackTrace();
         }
     }

    }

     public static void main(String args []){

          srs s1= new srs("Abinav paul","Hunter",4.2);
          srs s2= new srs("Anand gupta","Kali");
          srs s3=new srs("Serial",5);
          s1.director();
          s2.director();
          s3.director();
          System.out.print("\n");
          s1.intro();
          s2.intro();

     }

}
