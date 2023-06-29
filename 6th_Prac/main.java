// package 6th_Prac;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.ObjectInputStream;

public class main {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        // System.out.println("Hello World!");

        // Store Initialization
        product[] pro = new product[10];
        pro[0] = new product(1000, "Car", 10, 500000);
        pro[0].writeToFile(pro[0]);
        pro[1] = new product(1001, "Truck", 10, 200000);
        pro[1].writeToFile(pro[1]);
        pro[2] = new product(1002, "Auto", 10, 100000);
        pro[2].writeToFile(pro[2]);
        pro[3] = new product(1003, "Bike", 10, 60000);
        pro[3].writeToFile(pro[3]);
        pro[4] = new product(1004, "Cycle", 10, 10000);
        pro[4].writeToFile(pro[4]);

        // Customer Coming
        BufferedReader console = new BufferedReader(new InputStreamReader(System.in));
        customer c[] = new customer[5];
        int customer_count = -1;
        int flag;
        do {
            System.out.print("Enter your choice.\n1 --> Buy\n2 --> Exit\nEnter: ");
            String s = console.readLine();
            int ch = Integer.parseInt(s);
            flag = 0;
            switch (ch) {
                case 1:
                    String s1;
                    System.out.print("Enter number of products: ");
                    s1 = console.readLine();
                    int n = Integer.parseInt(s1);
                    product p[] = new product[n];
                    System.out.print("Enter Customer name: ");
                    String name = console.readLine();
                    for (int j = 0; j < n; j++) {
                        System.out.print("Enter Product id: ");
                        s = console.readLine();
                        int pi = Integer.parseInt(s);
                        System.out.print("Enter Product Name: ");
                        s = console.readLine();
                        String pname = s;
                        System.out.print("Enter Quantity: ");
                        s = console.readLine();
                        int q = Integer.parseInt(s);
                        p[j] = new product(pi, pname, q, 0);
                    }
                    c[++customer_count] = new customer(name, n, p);
                    c[customer_count].writeUserToFile(c[customer_count]);
                    break;

                case 2:
                    flag = 1;
                default:
                    break;
            }
        } while (flag == 0);

        // Deserialization
        File f = new File("product.txt");
        FileInputStream fis = new FileInputStream(f);
        ObjectInputStream ois = new ObjectInputStream(fis);
        product t1 = (product) ois.readObject();
        ois.close();
        t1.display();

    }

}
