package FilterDemo;

public class Employees {

    private String name;
    private long salary;

    public Employees(String name, long salary) {
        this.name = name;
        this.salary = salary;
    }

    public Employees() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public long getSalary() {
        return salary;
    }

    public void setSalary(long salary) {
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "Employees{" +
                "name='" + name + '\'' +
                ", salary=" + salary +
                '}';
    }
}
