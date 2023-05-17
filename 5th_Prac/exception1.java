// package 5th_Prac;

public class exception1 extends Exception{
    String d;
    exception1(String s){
        d = s;
    }
    String displayException(){
        String temp = "CGPA Exception ["+d+"]";
        return temp;
    }
}
