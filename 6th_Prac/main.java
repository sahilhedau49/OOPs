// package 6th_Prac;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class main {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        // System.out.println("Hello World!");

        // Store Initialization
        product p1 = new product(1000, "Car", 10, 500000);
        p1.writeToFile(p1);
        product p2 = new product(1001, "Truck", 10, 200000);
        p2.writeToFile(p2);
        product p3 = new product(1002, "Auto", 10, 100000);
        p3.writeToFile(p3);
        product p4 = new product(1003, "Bike", 10, 60000);
        p4.writeToFile(p4);
        product p5 = new product(1004, "Cycle", 10, 10000);
        p5.writeToFile(p5);

        // Deserialization
        File f = new File("product.txt");
        FileInputStream fis = new FileInputStream(f);
        ObjectInputStream ois = new ObjectInputStream(fis);
        product t1 = (product) ois.readObject();
        ois.close();
        t1.display();

    }

}
