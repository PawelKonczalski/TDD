package employee;

import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.Arrays;
import java.util.Collections;
import java.util.Optional;
import java.util.stream.Collectors;

public class FileEmployeeDb implements EmployeeDB {
    private final Path path;
    private final Charset charset;

    public FileEmployeeDb(Path path, Charset charset) {
        this.path = path;
        this.charset = charset;
    }

    private static Employee apply(String line) {
        String[] employeeData = line.split(",");
        return new Employee(Long.parseLong(employeeData[0]), employeeData[1]);
    }

    @Override
    public long add(Employee employee) {
        try {
            long id = Files.readAllLines(path).size();
            Employee employeeCopy = new Employee(id, employee.getName());
            Files.write(path, Collections.singletonList(employeeCopy.asLine()), charset);
            return id;
        } catch (IOException e) {
            throw new EmployeeDbException(String.format("fail to add new employee %s",
                    employee), e);
        }
    }

    @Override
    public Iterable<Employee> findAll() {
        try {
            return Files.lines(path, charset).map(FileEmployeeDb::apply).collect(Collectors.toList());
        } catch (IOException e) {
            throw new EmployeeDbException("Can not find employees", e);
        }
    }

    @Override
    public Iterable<Employee> findAllByName(String name) {
        return null;
    }

    @Override
    public Optional<Employee> findById(long id) {
        return Optional.empty();
    }
}
