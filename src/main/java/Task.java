import java.util.Objects;

class Task {
    private long id;
    private String title;
    private Employee employee;

    Task() {
    }

    Task(Task task, long id) {
        this.id = id;
        title = task.title;
    }

    Task(String title) {
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

    String getTitle() {
        return title;
    }

    void setTitle(String title) {
        this.title = title;
    }

    void setEmployee(Employee employee) {
        this.employee = employee;
    }

    Employee getEmployee() {
        return employee;
    }
}
