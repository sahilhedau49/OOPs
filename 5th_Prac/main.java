// package 5th_Prac;

public class main {
    public static void main(String[] args) {

        // Valid
        studentone s = new studentone();
        try{
            s.init_student("Sahil",9.7,"BE22CSU110","Sa1$aaaa");
        }   
        catch(exception1 e){
            String exp = e.displayException();
            System.out.println("Exception Found! --> "+exp);
        }   
        catch(exception2 e){
            String exp = e.displayException();
            System.out.println("Exception Found! --> "+exp);
        }
        catch(exception3 e){
            String exp = e.displayException();
            System.out.println("Exception Found! --> "+exp);
        }

        // CGPA
        studentone s1 = new studentone();
        try{
            s1.init_student("Sahil",10.2,"BE22CSU110","Sa1$aaaa");
        }   
        catch(exception1 e){
            String exp = e.displayException();
            System.out.println("Exception Found! --> "+exp);
        }   
        catch(exception2 e){
            String exp = e.displayException();
            System.out.println("Exception Found! --> "+exp);
        }
        catch(exception3 e){
            String exp = e.displayException();
            System.out.println("Exception Found! --> "+exp);
        }

        // EN
        studentone s2 = new studentone();
        try{
            s2.init_student("Sahil",9,"BE22CSU270","Sa1$aaaa");
        }   
        catch(exception1 e){
            String exp = e.displayException();
            System.out.println("Exception Found! --> "+exp);
        }   
        catch(exception2 e){
            String exp = e.displayException();
            System.out.println("Exception Found! --> "+exp);
        }
        catch(exception3 e){
            String exp = e.displayException();
            System.out.println("Exception Found! --> "+exp);
        }

        // Password
        studentone s3 = new studentone();
        try{
            s3.init_student("Sahil",9,"BE22CSU170","Sa1aaaaa");
        }   
        catch(exception1 e){
            String exp = e.displayException();
            System.out.println("Exception Found! --> "+exp);
        }   
        catch(exception2 e){
            String exp = e.displayException();
            System.out.println("Exception Found! --> "+exp);
        }
        catch(exception3 e){
            String exp = e.displayException();
            System.out.println("Exception Found! --> "+exp);
        }
    }
}
