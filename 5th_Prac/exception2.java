// package 5th_Prac;

public class exception2 extends Exception {
    String d;
    exception2(String s){
        d = s;
    }
    String displayException(){
        String temp = "Enrollment Number Exception ["+d+"]";
        return temp;
    }
}
