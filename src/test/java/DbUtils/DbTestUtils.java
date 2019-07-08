package DbUtils;

import employee.EmployeeDB;
import employee.InMemoryEmployeeDB;
import task.InMemoryTaskDB;
import task.TaskDB;

public class DbTestUtils {
    public static EmployeeDB emptyInMemoryEmployeeDB(){
        return new InMemoryEmployeeDB();
    }

    public static TaskDB emptyInMemoryTaskDB() {
        return new InMemoryTaskDB();
    }
}
