public class Employee {
    int employeeid;
    String employeename;
    String employeecity;
    String employeeaddress;
    public void employee(){
        System.out.println(employeename +"employee is working ");
    }
    public void Showfulldetail(){
        System.out.println("employeeid " +employeeid);
        System.out.println("employeename "+employeename);
        System.out.println("employeecity "+employeecity);
        System.out.println("employeeaddress  "+employeeaddress);
    }
    public static void main(String[] args) {
        Employee emp =new Employee();
            emp.employeeid =321;
            emp.employeename ="Ali";
            emp.employeecity ="karachi";
            emp.employeeaddress ="xyz";
             emp.employee();
            emp.Showfulldetail();
    }
}
