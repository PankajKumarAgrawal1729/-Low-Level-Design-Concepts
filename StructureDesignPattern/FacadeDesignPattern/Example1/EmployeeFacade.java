package FacadeDesignPattern.Example1;

public class EmployeeFacade {
    EmployeeDao employeeDao;

    EmployeeFacade(){
        employeeDao = new EmployeeDao();
    }

    void insert(){
        employeeDao.insert();
    }
}
