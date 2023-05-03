public class student {
    String name;
    String gender;
    String DepartmentName;
    Double CGPA;

    student(String name, String gender, String DepartmentName, Double CGPA){
        this.name = name;
        this.gender = gender;
        this. DepartmentName = DepartmentName;
        this.CGPA = CGPA;
    }

    void display(){
        System.out.println("Name: "+name);
        System.out.println("Gender: "+gender);
        System.out.println("Department Name: "+DepartmentName);
        System.out.println("CGPA: "+CGPA);
    }
}
