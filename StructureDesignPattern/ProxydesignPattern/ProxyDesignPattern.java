package ProxydesignPattern;

public class ProxyDesignPattern {
    public static void main(String[] args) {
        try {
            EmployeeDao empTableObj = new EmployeeDaoProxy();
            empTableObj.create("Admin", new EmployeeDo());
            System.out.println("Operation Done.");
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
