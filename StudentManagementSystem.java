// Custom exception for age validation
class AgeNotWithinRangeException extends Exception {
    public AgeNotWithinRangeException(String message) {
        super(message);
    }
}

// Custom exception for name validation
class NameNotValidException extends Exception {
    public NameNotValidException(String message) {
        super(message);
    }
}

// Student class
class Student {
    private int rollNo;
    private String name;
    private int age;
    private String course;

    // Parameterized constructor
    public Student(int rollNo, String name, int age, String course) throws AgeNotWithinRangeException, NameNotValidException {
        if (age < 15 || age > 21) {
            throw new AgeNotWithinRangeException("Age must be between 15 and 21.");
        }
        if (!isValidName(name)) {
            throw new NameNotValidException("Name contains invalid characters.");
        }

        this.rollNo = rollNo;
        this.name = name;
        this.age = age;
        this.course = course;
    }

    // Method to validate name
    private boolean isValidName(String name) {
        return name.matches("[a-zA-Z ]+"); // only allows letters and spaces
    }

    // Getters
    public int getRollNo() {
        return rollNo;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String getCourse() {
        return course;
    }

    @Override
    public String toString() {
        return "Student{" +
                "rollNo=" + rollNo +
                ", name='" + name + '\'' +
                ", age=" + age +
                ", course='" + course + '\'' +
                '}';
    }
}

// Main class to test the Student class
public class StudentManagementSystem {
    public static void main(String[] args) {
        try {
            Student student1 = new Student(1, "Anu", 20, "Electronics and communication");
            System.out.println(student1);
            Student student2 = new Student(2, "Navi", 20, "Electronics and communication");
            System.out.println(student2);
            //Scenario 1: Age not within range exception, Uncommenting the next two lines will throw Age not within the range exception
            //Student student3 = new Student(3, "Pinky", 22, "Electronics and communication");
           // System.out.println(student3);
            // Scenario 2:  Name not valid exception, Uncommenting the next two lines will throw Name not valid exception
           // Student student4 = new Student(4, "p@nty", 20, "Electronics and communication");
           // System.out.println(student4);


            // Uncommenting the next line will throw AgeNotWithinRangeException
            // Student student2 = new Student(2, "Jane Smith", 22, "Mathematics");

            // Uncommenting the next line will throw NameNotValidException
            // Student student3 = new Student(3, "Invalid@Name", 19, "Physics");

        } catch (AgeNotWithinRangeException | NameNotValidException e) {
            System.out.println("Exception: " + e.getMessage());
        }
    }
}

