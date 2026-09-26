import java.util.LinkedHashMap;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.Scanner;
import java.util.*;

// ===================== Model =====================

abstract class Student {
    private final int id;
    private String name;
    private String course;
    private double marks;

    Student(int id, String name, String course, double marks) {
        this.id = id;
        this.name = name;
        this.course = course;
        this.marks = marks;
    }

    int getId()        { return id; }
    String getName()   { return name; }
    String getCourse() { return course; }
    double getMarks()  { return marks; }

    void setName(String name)     { this.name = name; }
    void setCourse(String course) { this.course = course; }
    void setMarks(double marks)   { this.marks = marks; }

    // Grade is derived from marks on demand, so it can never be stale
    // and no overridable method is called from a constructor.
    abstract String getGrade();

    abstract String getCategory();

    void display() {
        System.out.println("ID       : " + id);
        System.out.println("Name     : " + name);
        System.out.println("Course   : " + course);
        System.out.println("Category : " + getCategory());
        System.out.printf("Marks    : %.2f%n", marks);
        System.out.println("Grade    : " + getGrade());
        System.out.println("-------------------------");
    }
}

class RegularStudent extends Student {

    RegularStudent(int id, String name, String course, double marks) {
        super(id, name, course, marks);
    }

    @Override
    String getGrade() {
        double m = getMarks();
        if (m >= 90) return "A+";
        if (m >= 80) return "A";
        if (m >= 70) return "B";
        if (m >= 60) return "C";
        if (m >= 50) return "D";
        return "F";
    }

    @Override
    String getCategory() { return "Regular"; }
}

class ScholarshipStudent extends Student {

    ScholarshipStudent(int id, String name, String course, double marks) {
        super(id, name, course, marks);
    }

    @Override
    String getGrade() {
        double m = getMarks();
        if (m >= 85) return "A+";
        if (m >= 75) return "A";
        if (m >= 65) return "B";
        if (m >= 50) return "C";
        return "F";
    }

    @Override
    String getCategory() { return "Scholarship"; }
}

// ===================== Application =====================

public class StudentManagementSystem {

    private static final Map<Integer, Student> students = new LinkedHashMap<>();
    private static final Scanner sc = new Scanner(System.in);

    // ---------- Input helpers (all use nextLine, so no leftover-newline bugs) ----------

    private static int readInt(String prompt) {
        while (true) {
            System.out.print(prompt);
            try {
                return Integer.parseInt(sc.nextLine().trim());
            } catch (NumberFormatException e) {
                System.out.println("Please enter a valid whole number.");
            }
        }
    }

    private static int readPositiveInt(String prompt) {
        while (true) {
            int value = readInt(prompt);
            if (value > 0) return value;
            System.out.println("Value must be greater than 0.");
        }
    }

    private static String readNonEmpty(String prompt) {
        while (true) {
            System.out.print(prompt);
            String value = sc.nextLine().trim();
            if (!value.isEmpty()) return value;
            System.out.println("This field cannot be empty.");
        }
    }

    private static double readMarks(String prompt) {
        while (true) {
            System.out.print(prompt);
            try {
                double marks = Double.parseDouble(sc.nextLine().trim());
                if (Double.isNaN(marks) || marks < 0 || marks > 100) {
                    System.out.println("Marks should be between 0 and 100.");
                } else {
                    return marks;
                }
            } catch (NumberFormatException e) {
                System.out.println("Please enter a valid number.");
            }
        }
    }

    // ---------- Operations ----------

    private static void addStudent() {
        int id = readPositiveInt("Enter Student ID: ");

        if (students.containsKey(id)) {
            System.out.println("Student ID already exists!");
            return;
        }

        String name = readNonEmpty("Enter Name: ");
        String course = readNonEmpty("Enter Course: ");
        double marks = readMarks("Enter Marks (0-100): ");

        System.out.println("Select Student Category:");
        System.out.println("1. Regular Student");
        System.out.println("2. Scholarship Student");
        int category;
        do {
            category = readInt("Enter choice (1 or 2): ");
        } while (category != 1 && category != 2);

        Student student = (category == 1)
                ? new RegularStudent(id, name, course, marks)
                : new ScholarshipStudent(id, name, course, marks);

        students.put(id, student);
        System.out.println("Student added successfully!");
    }

    private static void displayStudents() {
        if (students.isEmpty()) {
            System.out.println("No student records found.");
            return;
        }

        System.out.println("\n===== STUDENT RECORDS =====");
        for (Student s : students.values()) {
            s.display();
        }
    }

    private static void searchStudent() {
        int id = readInt("Enter Student ID to search: ");
        Student s = students.get(id);

        if (s == null) {
            System.out.println("Student not found.");
        } else {
            System.out.println("\nStudent Found:");
            s.display();
        }
    }

    private static void updateStudent() {
        int id = readInt("Enter Student ID to update: ");
        Student s = students.get(id);

        if (s == null) {
            System.out.println("Student not found.");
            return;
        }

        // Collect and validate everything first, then apply,
        // so a bad input never leaves the record half-updated.
        String name = readNonEmpty("Enter new name: ");
        String course = readNonEmpty("Enter new course: ");
        double marks = readMarks("Enter new marks (0-100): ");

        s.setName(name);
        s.setCourse(course);
        s.setMarks(marks);

        System.out.println("Student updated successfully!");
    }

    private static void deleteStudent() {
        int id = readInt("Enter Student ID to delete: ");

        if (students.remove(id) != null) {
            System.out.println("Student deleted successfully!");
        } else {
            System.out.println("Student not found.");
        }
    }

    // ---------- Main menu ----------

    public static void main(String[] args) {
        try {
            int choice;
            do {
                System.out.println("\n==============================");
                System.out.println(" STUDENT MANAGEMENT SYSTEM");
                System.out.println("==============================");
                System.out.println("1. Add Student");
                System.out.println("2. Display Students");
                System.out.println("3. Search Student");
                System.out.println("4. Update Student");
                System.out.println("5. Delete Student");
                System.out.println("6. Exit");
                System.out.println("==============================");

                choice = readInt("Enter your choice: ");

                switch (choice) {
                    case 1 -> addStudent();
                    case 2 -> displayStudents();
                    case 3 -> searchStudent();
                    case 4 -> updateStudent();
                    case 5 -> deleteStudent();
                    case 6 -> System.out.println("Thank you for using Student Management System!");
                    default -> System.out.println("Invalid choice! Please select 1-6.");
                }
            } while (choice != 6);
        } catch (NoSuchElementException e) {
            // Input stream closed (e.g. Ctrl+D / Ctrl+Z)
            System.out.println("\nInput closed. Exiting.");
        } finally {
            sc.close();
        }
    }
}
