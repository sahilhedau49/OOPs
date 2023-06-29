// package 6th_Prac;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.io.Serializable;

public class customer implements Serializable {
    static int id = 0;
    String ci;
    String name;
    int n;
    product[] p; // Max 5 items can buy at a time

    customer(String name, int n, product[] p) {
        this.ci = "CS" + id;
        this.n = n;
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
