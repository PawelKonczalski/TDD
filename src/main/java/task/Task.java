package task;

import employee.Employee;

import java.util.Objects;

public class Task {
    private long id;
    private String title;
    private Employee employee;

    Task() {
    }

    Task(Task task, long id) {
        this.id = id;
        title = task.title;
    }

    public Task(String title) {
        this.title = title;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        Task task = (Task) o;
        return id == task.id;
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }

    long getId() {
        return id;
    }

    public String getTitle() {
        return title;
    }

    void setTitle(String title) {
        this.title = title;
    }

    public void setEmployee(Employee employee) {
        this.employee = employee;
    }

    public Employee getEmployee() {
        return employee;
    }
}
