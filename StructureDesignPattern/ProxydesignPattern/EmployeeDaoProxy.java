package ProxydesignPattern;

public class EmployeeDaoProxy implements EmployeeDao {
    EmployeeDao employeeDao;
    EmployeeDaoProxy(){
        employeeDao = new EmployeeDaoImpl();
    }
    public void create(String client, EmployeeDo obj) throws Exception{
        if(client.equals("Admin")){
            employeeDao.create(client, obj);
            return;
        }
        throw new Exception("Access denied for user "+ client);
    }

    @Override
    public void delete(String client, int employeeId) throws Exception {
        if(client.equals("Admin")){
            employeeDao.delete(client, employeeId);
            return;
        }
        throw new Exception("Access denied for user "+ client);
    }

    @Override
    public EmployeeDo get(String client, int employeeId) throws Exception {
        if(client.equals("Admin") || client.equals("User")){
            return employeeDao.get(client, employeeId);
        }
        throw new Exception("Access denied for user "+ client);
    }
}
