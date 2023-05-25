public class Student_ta1 extends Person {
    int roll;
    int sem;
    double[] sgpa;

    Student_ta1(String name, int[] dob, int roll, int sem, double[] sgpa){
        super(name,dob);
        this.roll = roll;
        this.sem = sem;
        this.sgpa = new double[sem];
        this.sgpa = sgpa;
    }

    double calCGPA(){
        double cgpa = 0;
        for(double d : sgpa){
            cgpa += d;
        }
        cgpa /= sem;
        return cgpa;
    }

    void displayInfo(){
        System.out.println("\n--- Student Info ---");
        System.out.println("Name: "+name);
        System.out.println("DOB: "+dob[0]+"/"+dob[1]+"/"+dob[2]);
        System.out.println("Roll No.: "+ roll);
        System.out.println("Current sem: "+(sem+1));
        System.out.println("CGPA: "+String.format("%.2f", calCGPA()));
    }
}
