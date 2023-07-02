import java.util.*;

public class main {
    public static void main(String[] args) {
        try {
            StudentPhoneDirectory directoryObj = new StudentPhoneDirectory();

            // Adding students
            directoryObj.addStudent(new Student(56, "Sahil", 4, "Nagpur", "9021806733"));
            directoryObj.addStudent(new Student(64, "Smit", 4, "Katol", "9845671547"));
            directoryObj.addStudent(new Student(57, "Samrat", 4, "Kolkata", "9756483412"));
            directoryObj.addStudent(new Student(62, "Shreyash", 4, "Nagpur", "7890123456"));
            directoryObj.addStudent(new Student(69, "Raju", 3, "Panvel", "9468478945"));
            directoryObj.addStudent(new Student(40, "Rohit", 3, "Nagpur", "9414479935"));

            // Displaying all students
            System.out.println("All Students:");
            for (Student student : directoryObj.directory) {
                System.out.println(student);
            }

            // Displaying students by city
            System.out.println("\nStudents in Nagpur:");
            List<Student> studentsInCity = directoryObj.getStudentsByCity("Nagpur");
            for (Student student : studentsInCity) {
                System.out.println(student);
            }

            // Removing a student
            List<Student> directoryList = directoryObj.getDirectoryList();
            Student studentToRemove = directoryList.get(4);
            directoryObj.removeStudent(studentToRemove);

            System.out.println("\nAfter removing a student:");
            for (Student student : directoryObj.directory) {
                System.out.println(student);
            }
        } catch (IncompleteDataException e) {
            System.out.println("\nError --> " + e.getMessage());
        }

        try {
            StudentPhoneDirectory directoryObj2 = new StudentPhoneDirectory();
            directoryObj2.addStudent(new Student(58, "Sarang", 4, "Nagpur", ""));
        } catch (IncompleteDataException e) {
            System.out.println("\nError --> " + e.getMessage());
        }
    }
}
