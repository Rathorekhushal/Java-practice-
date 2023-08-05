import java.util.Scanner;

public class Stringbuilder {
    public static void main(String[] args) {
        // Scanner sc = new Scanner(System.in);
        // String name = sc.next();
        
        //  string at the position  or the index 

        // System.out.println(sb.charAt(0));
        // // change at the index 
        // System.out.println(sb.setCharAt(0, "p"););
        // sb.setCharAt(0, 'p');
        // System.out.println(sb);
         StringBuilder sb = new StringBuilder("tony ");
         sb.insert(2,'n');
        
         sb.delete(2 , 3);
         sb.append("k");
           sb.append("u");
             sb.append("m");
      sb.append("nothing will be added ");
    //   sb.deleteCharAt(2,5);
          System.out.println(sb);

    }
}
// String are immulated its means eiditable 
// all functions applies on stringbuilder is here 

