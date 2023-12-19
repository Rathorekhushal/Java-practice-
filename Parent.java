public class Parent {
    public void m1(){
        System.out.println("i am m1 method of parent class");
    }
}
// method overiding 
class Child extends Parent{
    public void m1(){
        System.out.println("iam m1 method of child");
    }
 public static void main(String[] args) {
    Child ch1 = new Child();
    ch1.m1();
 }
}