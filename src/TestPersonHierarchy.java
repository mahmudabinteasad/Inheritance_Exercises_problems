public class TestPersonHierarchy {
    public static void main(String[] args) {
        Student student = new Student("Alice", 2000, "Computer Science");
        Instructor instructor = new Instructor("Bob", 1980, 60000);

        System.out.println(student);
        System.out.println(instructor);
    }
}

