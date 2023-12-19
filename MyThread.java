public class MyThread implements Runnable {
    public void run(){
        for(int i=0; i<=10; i++){
            System.out.println(i);
        }
       try {
            Thread.sleep(10000);
        } catch (Exception e) {
            // TODO: handle exception
        }
    }
    public static void main(String[] args) {
        MyThread t1 =new MyThread();
        Thread thr =new Thread(t1);
        thr.start();
    }
}
