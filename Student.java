public class Student {
    int Studentid;
    String Studentname;
    String Studentcity;
// here i create a non per: constructor which is given bellow and
// constructor is used for intilize object
    public Student(){
        System.out.println("This is non per: constructor");
    }
    public Student(int id){
    System.out.println("student id is .....");
}
public void Study(){
    System.out.println(Studentname + "is studying" );
}
public void Showfulldetail(){
    System.out.println( "Studentname" + Studentname);
    System.out.println("my id is " + Studentid);
    System.out.println("my city is " + Studentcity);
}
public static void main(String[] args) {
    Student st1 = new Student();
     st1.Studentname = "Ram";
    st1.Studentid = 564;
    st1.Studentcity ="Karachi";
   st1.Study();
   st1.Showfulldetail();
   Student st2 = new Student(32);
   st2.Studentid =321;
   st2.Studentname ="shayam";
   st2.Studentcity ="karachi";
   st2.Showfulldetail();
}
}