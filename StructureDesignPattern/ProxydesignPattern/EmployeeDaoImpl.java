package ProxydesignPattern;

public class EmployeeDaoImpl implements EmployeeDao{
    public void create(String client, EmployeeDo obj) throws Exception{
        System.out.println("New Employee Created");
    }

    public void delete(String client, int employeeId) throws Exception{
        System.out.println("Employee Deleted");
    }

    public EmployeeDo get(String client, int employeeId) throws Exception {
        System.out.println("Get Employee");
        return new EmployeeDo();
    }
}
