
// package 6th_Prac;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;

public class product {
    int pi;
    String name;
    int q, p;

    product(int pi, String name, int q, int p) {
        this.pi = pi;
        this.name = name;
        this.q = q;
        this.p = p;
    }

    void writeToFile() {
        try {
            FileWriter w = new FileWriter("product.txt", true);
            BufferedWriter bw = new BufferedWriter(w);
            bw.write("name: " + name + "\n");
            bw.write("id: " + pi + "\n");
            bw.write("quantity: " + q + "\n");
            bw.write("price: " + p + "\n");
            bw.write("\n");
            bw.close();
            w.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static void updateproduct(product p, int qan) {
        String oldString = "name: " + p.name + "\n" + "id: " + p.pi + "\n" + "quantity: " + p.q + "\n" + "price: "
                + p.p;
        String updatedString = "name: " + p.name + "\n" + "id: " + p.pi + "\n" + "quantity: " + qan + "\n" + "price: "
                + p.p;
        try {
            FileReader r = new FileReader("product.txt");
            BufferedReader br = new BufferedReader(r);
            String newline = br.readLine(), prev = "";
            while (newline != null) {
                prev = prev + newline + "\n";
                newline = br.readLine();
            }
            String updatedContent = prev.replace(oldString, updatedString);
            FileWriter w1 = new FileWriter("product.txt");
            BufferedWriter bw1 = new BufferedWriter(w1);
            bw1.write(updatedContent);
            bw1.close();
            w1.close();
            br.close();
            r.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    void display() {
        System.out.println("Product ID: " + pi);
        System.out.println("Product Name: " + name);
        System.out.println("Available Quantity: " + q);
        System.out.println("Price: " + p);
    }
}
