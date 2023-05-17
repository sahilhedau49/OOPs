// package 5th_Prac;

public class exception3 extends Exception {
    String d;
    exception3(String s){
        d = s;
    }
    String displayException(){
        String temp = "Password Exception ["+d+"]";
        return temp;
    }
}
