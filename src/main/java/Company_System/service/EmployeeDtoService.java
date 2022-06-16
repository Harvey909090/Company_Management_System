package Company_System.service;

import Company_System.dao.impl.jdbc.DepartmentJdbcDao;
import Company_System.domain.Department;
import Company_System.domain.Employee;
import Company_System.dto.EmployeeDto;

public class EmployeeDtoService {

    private DepartmentJdbcDao departmentDao = new DepartmentJdbcDao();

    public EmployeeDto mapToDto(Employee employee) {
        EmployeeDto employeeDto = new EmployeeDto(employee.getId(), employee.getFirstName(), employee.getLastName());
        Department department = departmentDao.findOne(employee.getDepartmentId());
        employeeDto.setDepartment(department);
        return employeeDto;
    }
}
