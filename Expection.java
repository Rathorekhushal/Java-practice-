public class Expection {
    public static void main(String[] args) {
        try{
             int n1 =Integer.parseInt(args [0]);
         int n2 =Integer.parseInt(args [1]);
         System.out.println("we have got two numbers");
         int result=(n1/n2);
         System.out.println("Division "+ result);
        }catch(ArithmeticException e){
            System.out.println("n2 can not be zero ");
            System.out.println(e.getMessage());
        }
    }
}
