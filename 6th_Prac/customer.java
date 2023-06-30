// package 6th_Prac;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.Serializable;

public class customer implements Serializable {
    static int id = 0;
    String ci;
    String name;
    int n;
    int total = 0;
    int product_count = 0;
    product[] p = new product[5]; // Max 5 items can buy at a time

    customer(String name, int n) {
        this.ci = "CS" + Integer.toString(id++);
        this.name = name;
        this.n = n;
    }

    void writeUserToFile() {
        FileWriter w1;
        try {
            w1 = new FileWriter("sales.txt", true);
            BufferedWriter bw1 = new BufferedWriter(w1);
            bw1.write("*******************************\n");
            bw1.write("Customer Name: " + name + "\nCustomer ID: " + id + "\n\nProducts Parchased --> \n");
            bw1.write("\n");
            for (product p1 : p) {
                if (p1 != null) {
                    bw1.write("Name: " + p1.name + "\n");
                    bw1.write("ID: " + p1.pi + "\n");
                    bw1.write("Quantity: " + p1.q + "\n");
                    bw1.write("Price: " + p1.p + "\n\n");
                }
            }
            bw1.write("Total: " + total + "\n\n");
            bw1.close();
            w1.close();

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    void buy(product p1, int q) {
        if (p1.q < q) {
            System.out.println("Sorry, " + p1.name + " is out of stock!!!");
            return;
        }
        total += (p1.p * q);
        p[product_count] = p1;
        product.updateproduct(p[product_count], (p1.q - q));
        p[product_count].q = q;
        // p[product_count].display();
        product_count++;
    }
}
