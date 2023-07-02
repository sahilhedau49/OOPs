public class Student implements Comparable<Student> {
    int roll;
    String name;
    int semester;
    String city;
    String contact;

    Student(int roll, String name, int semester, String city, String contact) throws IncompleteDataException {
        if (name.isEmpty() || city.isEmpty() || contact.isEmpty()) {
            throw new IncompleteDataException("Student data is incomplete.");
        }
        this.roll = roll;
        this.name = name;
        this.semester = semester;
        this.city = city;
        this.contact = contact;
    }

    public int compareTo(Student other) {
        if (semester == other.semester) {
            return roll - other.roll;
        }
        return semester - other.semester;
    }

    public String toString() {
        return "Roll: " + roll + ", Name: " + name + ", Semester: " + semester + ", City: " + city + ", Contact: "
                + contact;
    }
}