package employee;

import java.util.Optional;

public interface EmployeeDB {

    /**
     * Adds a new employee.
     *
     * @param employee an employee to add
     * @return the generated id
     */
    long add(Employee employee) throws EmployeeDbException;

    Iterable<Employee> findAll() throws EmployeeDbException;

    Iterable<Employee> findAllByName(String name) throws EmployeeDbException;

    Optional<Employee> findById(long id) throws EmployeeDbException;

}
