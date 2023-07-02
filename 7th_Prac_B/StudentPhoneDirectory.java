import java.util.ArrayList;
import java.util.List;
import java.util.TreeSet;

public class StudentPhoneDirectory {
    TreeSet<Student> directory;

    StudentPhoneDirectory() {
        directory = new TreeSet<>();
    }

    void addStudent(Student student) {
        directory.add(student);
    }

    void removeStudent(Student student) {
        directory.remove(student);
    }

    List<Student> getStudentsByCity(String city) {
        List<Student> studentsByCity = new ArrayList<>();
        for (Student student : directory) {
            if (student.city.equalsIgnoreCase(city)) {
                studentsByCity.add(student);
            }
        }
        return studentsByCity;
    }

    List<Student> getDirectoryList() {
        return new ArrayList<Student>(directory);
    }
}