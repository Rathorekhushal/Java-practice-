public class Thread {
    

}
class Test extends Thread{
    public void run(){
        for(int i=0;i<=10;i++){
            System.out.println("value of  "+i);
        }
    }
    public static void main(String[] args) {
        Test t =new Test();
        t.run();

         
    }
}
