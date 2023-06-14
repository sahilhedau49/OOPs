
// package 6th_Prac;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.io.Serializable;

public class product implements Serializable {
    int pi;
    String name;
    int q, p;

    product(int pi, String name, int q, int p) {
        this.pi = pi;
        this.name = name;
        this.q = q;
        this.p = p;
    }

    void writeToFile(product p) throws IOException {
        FileOutputStream f = new FileOutputStream("product.txt", true);
        ObjectOutputStream o = new ObjectOutputStream(f);
        o.writeObject(p);
        o.flush();
        o.close();
    }

    void display() {
        System.out.println("Product ID: " + pi);
        System.out.println("Product Name: " + name);
        System.out.println("Quantity: " + q);
        System.out.println("Price: " + p);
        System.out.println("");
    }
}
