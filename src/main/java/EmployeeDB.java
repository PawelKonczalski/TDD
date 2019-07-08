import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

class EmployeeDB {

    private List<Employee> employeeList;

    EmployeeDB() {
        employeeList = new ArrayList<>();
    }

    long add(Employee employee) {
        long id = generateId();
        Employee employeeCopy = new Employee(id, employee.getName());
        employeeList.add(employeeCopy);
        return id;
    }

    Iterable<Employee> findAll() {
        return employeeList;
    }

    Iterable<Employee> find(String name) {
        return employeeList.stream()
                .filter(employee -> employee.getName().equals(name))
                .collect(Collectors.toList());
    }

    private long generateId() {
        return employeeList.size() + 1;
    }

    Optional<Employee> findById(long employeeId) {
        return employeeList.stream().filter(employee -> employee.getId() == employeeId).findAny();
    }
}
