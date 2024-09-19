import java.util.HashMap;
import java.util.Scanner;

public class StudentGrades {
    private HashMap<String, Integer> studentGrades;

    public StudentGrades() {
        studentGrades = new HashMap<>();
    }

    // Method to add a new student and their grade
    public void addStudent(String name, int grade) {
        studentGrades.put(name, grade);
        System.out.println("Added student: " + name + " with grade: " + grade);
    }

    // Method to remove a student
    public void removeStudent(String name) {
        if (studentGrades.containsKey(name)) {
            studentGrades.remove(name);
            System.out.println("Removed student: " + name);
        } else {
            System.out.println("Student not found: " + name);
        }
    }

    // Method to display a student's grade by name
    public void displayGrade(String name) {
        if (studentGrades.containsKey(name)) {
            System.out.println("Grade of " + name + ": " + studentGrades.get(name));
        } else {
            System.out.println("Student not found: " + name);
        }
    }

    public static void main(String[] args) {
        StudentGrades grades = new StudentGrades();
        Scanner scanner = new Scanner(System.in);

        // Sample operations
        grades.addStudent("Anu", 90);
        grades.addStudent("Ani", 85);

        // Display grades
        grades.displayGrade("Anu");
        grades.displayGrade("Ani");

        // Remove a student and try to display their grade
        grades.removeStudent("Ani");
        grades.displayGrade("Ani");

        // Close the scanner
        scanner.close();
    }
}


