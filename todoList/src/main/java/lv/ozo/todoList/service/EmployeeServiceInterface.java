package lv.ozo.todoList.service;

import lv.ozo.todoList.model.Employee;

import java.util.List;

public interface EmployeeServiceInterface {
    List<Employee> getAllEmployees();
    Employee save(Employee employee);
    Employee update(Employee employee);
    Employee findByID(Long id);
    void delete(Long id);
}
