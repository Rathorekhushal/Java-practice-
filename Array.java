import java.util.Scanner;

public class Array {
   public static void main(String[] args) {
   //  int marks [] = new int[3];
   //  for(int i =0; i<=3; i++){
   //   System.out.print(marks[i]);
   //  }
   // }
   Scanner sc = new Scanner(System.in);
   int size = sc.nextInt();
   int marks[] = new int[size];
   for(int i=0; i<=size;i++){
       marks[i]=sc.nextInt();
   } 
   int x =sc.nextInt();
   for(int i =0; i<=marks.length; i++){
      // System.out.println(marks[i]);
      if(marks[i]==i){
         System.out.println("marks foud at the index number "+i);
      }else{
         System.out.println("marks not found");
      }
   }
   }
}
