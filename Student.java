public class Student {
      int id ;
      String studentname;
      String StudentCity;



      public void study(){
      System.out.println(studentname+"my name is ");
      System.out.println(StudentCity+"my city is ");
      }
      public void showstudentfulldetail(){
            System.out.println(studentname+"");
            System.out.println(StudentCity+"");
            System.out.println(id+"");
      }
   public static void main(String[] args) {
      Student st1 = new Student();
      st1.StudentCity="karachi";
      st1.studentname="khushal";
      st1.id=123;
      st1.study();
      st1.showstudentfulldetail();

   }   
      
}
