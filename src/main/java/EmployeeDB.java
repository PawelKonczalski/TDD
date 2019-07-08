import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

class EmployeeDB {

	private List<Employee> employeeList;

	EmployeeDB() {
		employeeList = new ArrayList<>();
	}

	void add(Employee employee) {
		employeeList.add(employee);

	}

	Iterable<Employee> findAll() {

		return employeeList;
	}

	Iterable<Employee> find(String name) {
		return employeeList.stream()
			.filter(employee -> employee.getName().equals(name))
			.collect(Collectors.toList());
	}
}
