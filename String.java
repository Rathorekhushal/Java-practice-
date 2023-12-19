public class String {
    public static void main(String[] args) {
        StringBuilder sb =new StringBuilder("tony");
        System.out.println(sb);
        // char at string 
        System.out.println(sb.charAt(0));
        sb.setCharAt(0, 'd');
        System.out.println(sb);
    }
}
