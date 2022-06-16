package Company_System.service;

import Company_System.dao.impl.jdbc.EmployeeJdbcDao;
import Company_System.domain.Employee;

public class EmployeeService {

    private EmployeeJdbcDao dao = new EmployeeJdbcDao();

    public void deleteEmployee(int id) {
        dao.delete(id);
    }

    public Employee addEmployee(Employee employee) {
        return dao.save(employee);
    }

    public Employee updateEmployee(Employee employee) {
        // TODO: change dao to return the updated employee
        dao.update(employee);
        return dao.findOne(employee.getId());
    }
}
