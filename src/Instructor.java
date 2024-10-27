public class Instructor extends Person {
    private double salary;

    public Instructor(String name, int birthYear, double salary) {
        super(name, birthYear);
        this.salary = salary;
    }

    @Override
    public String toString() {
        return super.toString() + ", Salary: $" + salary;
    }
}
