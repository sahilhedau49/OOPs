// package TA1.que1;

public class main {
    public static void main(String[] args) {

        // Outputs of all methods
        Department d1 = new Department("CSE");
        System.out.println("\n>> Sample outputs of all methods derived.");

        // For Students
        int[] date1 = {30,12,2003};
        double[] sgpa1 = {8.84, 9.4, 9.6};
        d1.addStudent("Sahil", date1, 56, 3, sgpa1);

        int[] date2 = {4,6,2004};
        double[] sgpa2 = {7.84, 8.4, 9.0};
        d1.addStudent("Samrat", date2, 57, 3, sgpa2);

        int[] date3 = {10,4,2002};
        double[] sgpa3 = {8.54, 8.6, 10.0};
        d1.addStudent("Smit", date3, 64, 3, sgpa3);

        // Calculate Age and CGPA
        int age1 = d1.s[0].calAge();
        System.out.println("\n"+d1.s[0].name+" --> "+age1+" (Age)");
        double cgpa1 = d1.s[0].calCGPA();
        System.out.println(d1.s[0].name+" --> "+String.format("%.2f", cgpa1)+" (CGPA)");
    
        // Average Age of Students
        double avgAge1 = d1.calAvgAgeOfStd();
        System.out.println("\nStudents Average Age of "+d1.name+" --> "+String.format("%.2f", avgAge1)+" (Average Age)");
    
        // For Teachers
        int[] date11 = {30,12,1971};
        d1.addTeacher("Aman Sir", date11, "PHD", 4);

        int[] date12 = {3,1,1980};
        d1.addTeacher("Shreyash Sir", date12, "PG", 4);

        int[] date13 = {13,2,1961};
        d1.addTeacher("Sarang Sir", date13, "PHD", 10);

        // Salary of Teacher
        int sal1 = d1.t[0].getSalary();
        System.out.println("\nSalary of \" "+d1.t[0].name+" \" --> "+ sal1+" Rs.");

        // Max and Min Age of Teachers
        int minTA = d1.calMinAgeOfTeachers();
        System.out.println("Min Teacher Age of "+d1.name+" --> "+minTA+" (Age)");
        int maxTA = d1.calMaxAgeOfTeachers();
        System.out.println("Max Teacher Age of "+d1.name+" --> "+maxTA+" (Age)");
    
        // Average of CGPA for a given semester
        double avgCGPA = d1.calAvgCGPAofSem(2);
        System.out.println("\nAverage of CGPA for a 2nd semester --> "+String.format("%.2f", avgCGPA));

        // --------------------------------------------------------------------------

        // Output of Info.
        Department d2 = new Department("CSE");
        System.out.println("\n-----------------------------------------------\n\n>> Proper Outputs of Studnets and Teachers Info.");
        
        // Setting Students Data
        int[] sd1 = {30,12,2003};                           // sd stands for "Student DOB"
        double[] sml1 = {8.84, 9.4, 9.6};                   // sml stands for "Student mark list"
        d2.addStudent("Sahil", sd1, 56, 3, sml1);
        d2.s[0].displayInfo();

        int[] sd2 = {4,6,2004};
        double[] sml2 = {7.84, 8.4, 9.0};
        d2.addStudent("Samrat", sd2, 57, 3, sml2);
        d2.s[1].displayInfo();

        int[] sd3 = {10,4,2002};
        double[] sml3 = {8.54, 8.6, 10.0};
        d2.addStudent("Smit", sd3, 64, 3, sml3);
        d2.s[2].displayInfo();


        // Setting Teachers Data
        int[] td1 = {30,12,1971};
        d2.addTeacher("Aman Sir", td1, "PHD", 4);
        d2.t[0].displayInfo();

        int[] td2 = {3,1,1980};
        d2.addTeacher("Shreyash Sir", td2, "PG", 4);
        d2.t[0].displayInfo();

        int[] td3 = {13,2,1961};
        d2.addTeacher("Sarang Sir", td3, "PHD", 10);
        d2.t[0].displayInfo();
    }
}
