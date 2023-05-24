// package 5th_Prac;

public class main {
    public static void main(String[] args) {

        // Valid
        studentone s = new studentone();
        try{
            System.out.print("\n");
            s.init_student("Sahil",9.7,"BE22CSU110","Sa1aa&aaaa");
            s.displayInfo();
        }   
        catch(studentException e){
            String error = e.displayException();
            System.out.println("Exception Found! --> "+error);
        }

        // Invalid CGPA
        studentone s1 = new studentone();
        try{
            System.out.print("\n");
            s1.init_student("Sahil",10.2,"BE22CSU110","Sa1$aaaa");
            s1.displayInfo();
        }   
        catch(studentException e){
            String error = e.displayException();
            System.out.println("Exception Found! --> "+error);
        }

        // Invalid Roll No. in Enrollment No.
        studentone s2 = new studentone();
        try{
            System.out.print("\n");
            s2.init_student("Sahil",9,"BE22CSU270","Sa1$aaaa");
            s2.displayInfo();
        }   
        catch(studentException e){
            String error = e.displayException();
            System.out.println("Exception Found! --> "+error);
        }

        // Invalid Branch in Enrollment No.
        studentone s3 = new studentone();
        try{
            System.out.print("\n");
            s3.init_student("Sahil",9,"BE22CST210","Sa1$aaaa");
            s3.displayInfo();
        }   
        catch(studentException e){
            String error = e.displayException();
            System.out.println("Exception Found! --> "+error);
        }

        // Invalid Year in Enrollment No.
        studentone s4 = new studentone();
        try{
            System.out.print("\n");
            s4.init_student("Sahil",9,"BE25CSU170","Sa1$aaaa");
            s4.displayInfo();
        }   
        catch(studentException e){
            String error = e.displayException();
            System.out.println("Exception Found! --> "+error);
        }

        // Invalid Password
        studentone s5 = new studentone();
        try{
            System.out.print("\n");
            s5.init_student("Sahil",9,"BE22CSU170","Sa1aaaaa");
            s5.displayInfo();
        }   
        catch(studentException e){
            String error = e.displayException();
            System.out.println("Exception Found! --> "+error+"\n");
        }
    }
}
