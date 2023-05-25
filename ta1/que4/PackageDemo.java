package ta1.que4;
import ta1.que4_arithmetic.arithmetic;

public class PackageDemo {
    public static void main(String[] args) {
        arithmetic a = new arithmetic();
        System.out.println("3+4 = "+a.add(3,4));
        System.out.println("3-4 = "+a.sub(3,4));
    }    
}
