// package ta1.que5;

public class vehicleException extends Exception{
    String d;
    vehicleException(String s){
        d = s;
    }
    String displayException(){
        String temp = "Vehicle Exception ["+d+"]";
        return temp;
    }
}
