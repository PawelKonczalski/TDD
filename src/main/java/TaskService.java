import java.util.Optional;

class TaskService {

    private final EmployeeDB employeeDB;
    private final TaskDB taskDB;

    TaskService(EmployeeDB employeeDB, TaskDB taskDB) {
        this.employeeDB = employeeDB;
        this.taskDB = taskDB;
    }

    void assignTaskToEmployee(long taskId, long employeeId) {
        Optional<Employee> employee = employeeDB.findById(employeeId);
        Optional<Task> task = taskDB.findById(taskId);
        employee.ifPresent(employeeFromDb -> task.ifPresent(employeeFromDb::setTask));
    }

    Optional<Task> getEmployeeTask(long employeeId) {
        return employeeDB.findById(employeeId).map(Employee::getTask);
    }
}
