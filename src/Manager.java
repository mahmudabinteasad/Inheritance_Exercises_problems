public class Manager extends Employee {
    private double bonus;

    public Manager(String name, double baseSalary, double bonus) {
        super(name, baseSalary);
        this.bonus = bonus;
    }

    @Override
    public double getSalary() {
        return super.getSalary() + bonus; // Total salary includes bonus
    }

    @Override
    public String toString() {
        return "Manager Name: " + getName() + ", Total Salary: $" + getSalary();
    }
}
