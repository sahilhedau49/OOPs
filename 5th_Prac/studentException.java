public class studentException extends Exception {
    String d;
    studentException(String s){
        d = s;
    }
    String displayException(){
        String temp = "Student Exception ["+d+"]";
        return temp;
    }
}
