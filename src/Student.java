public class Student extends Person {
    private String major;

    public Student(String name, int birthYear, String major) {
        super(name, birthYear);
        this.major = major;
    }

    @Override
    public String toString() {
        return super.toString() + ", Major: " + major;
    }
}
