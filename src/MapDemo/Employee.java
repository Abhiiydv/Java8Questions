package MapDemo;

import java.util.List;
import java.util.Objects;


public class Employee {

    private long id;
    private String name;
    private String lastName;
    private List<String> courses;

    public Employee() {
    }

    public long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getLastName() {
        return lastName;
    }

    public List<String> getCourses() {
        return courses;
    }

    public void setId(long id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setCourses(List<String> courses) {
        this.courses = courses;
    }

    public Employee(long id, String name, String lastName, List<String> courses) {
        this.id = id;
        this.name = name;
        this.lastName = lastName;
        this.courses = courses;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", lastName='" + lastName + '\'' +
                ", courses=" + courses +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Employee employee = (Employee) o;
        return id == employee.id && Objects.equals(name, employee.name) && Objects.equals(lastName, employee.lastName) && Objects.equals(courses, employee.courses);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name, lastName, courses);
    }
}
