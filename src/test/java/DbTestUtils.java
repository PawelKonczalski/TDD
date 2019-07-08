class DbTestUtils {
    static EmployeeDB emptyInMemoryEmployeeDB(){
        return new InMemoryEmployeeDB();
    }

    static TaskDB emptyInMemmoryTaskDB() {
        return new InMemoryTaskDB();
    }
}
