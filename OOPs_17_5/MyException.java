// package OOPs_17_5;

public class MyException extends Exception {
    String d;
    MyException(String a){
        d = a;
    }
    String displayException(){
        String temp = "MyException ["+d+"]";
        return temp;
    }
}
