public class InsertElementInArray {
  public static void main(String[] args) {
      int a[]={10,20,30};
      int element=100;
      int pos=3;
      for(int i=0;i<a.length-1;i--){
            a[i]=a[i-1];
      }
      a[pos-1]=element;
      for(int i=0;i<a.length-1;i++){
            System.out.println(a[i]+"");
      }
         }
}
