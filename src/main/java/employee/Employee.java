package employee;

import task.Task;

import java.util.Objects;

public class Employee {
    private long id;
    private String name;
    private Task task;

    public Employee(String name) {
        this.name = name;
    }

    Employee(long id, String name) {
        this.id = id;
        this.name = name;
    }

    String getName() {
        return name;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o)
            return true;
        if (o == null || getClass() != o.getClass())
            return false;
        Employee employee = (Employee) o;
        return id == employee.id;
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }

    long getId() {
        return id;
    }

    public void setTask(Task task) {
        this.task = task;
    }

    public Task getTask() {
        return task;
    }

}
