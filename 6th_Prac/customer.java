// package 6th_Prac;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class customer {
    static String id = "CS001";
    String ci;
    String name;
    // product[] p = new product(5); // Max 5 items can buy at a time
    product p;

    customer(String name, product p) {
        this.ci = id;
        this.p = p;
    }

    void writeUserToFile(customer c) throws IOException {
        FileOutputStream f = new FileOutputStream("sales.txt", true);
        ObjectOutputStream o = new ObjectOutputStream(f);
        o.writeObject(c);
        o.flush();
        o.close();
    }
}
