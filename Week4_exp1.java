public class Week4_exp1 {
public static class student{
    String Name;
    String ID;
    double grade;
    int Year;
    student(String name,String id, double grade, int Year) {

        this.Name = name;
        this.ID = id;
        this.grade = grade;
        this.Year = Year;
    }
    student(String name,String id , double grade){
        this.Name =name;
        this.ID = id;
        this.grade=grade;

    }
    student(String id,double grade)
    {
        this.ID=id;
        this.grade=grade;
    }
    void stud_data(){

        System.out.print("\n Name: "+Name+"\n ID: "+ID +"\n Year: "+Year+"\n Grade: "+grade);

    }
    void stud_halfdata(){

        System.out.print("\n ID: "+ID +"\n Grade: "+grade);

    }
    public static void main(String args[]){

        student s1= new student("kiran","23bce20541",6,1);
        student s2= new student("Arjun","23bce8765",8.7,1);
        s1.stud_data();
        System.out.print("\n");
        s2.stud_halfdata();
    }

}



}
