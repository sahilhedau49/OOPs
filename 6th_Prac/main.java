// package 6th_Prac;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class main {
    public static void main(String[] args) throws IOException, ClassNotFoundException {

        // Store Initialization
        product[] pro = new product[10];
        pro[0] = new product(1000, "Car", 10, 500000);
        pro[0].writeToFile();
        pro[1] = new product(1001, "Truck", 10, 200000);
        pro[1].writeToFile();
        pro[2] = new product(1002, "Auto", 10, 100000);
        pro[2].writeToFile();
        pro[3] = new product(1003, "Bike", 10, 60000);
        pro[3].writeToFile();
        pro[4] = new product(1004, "Cycle", 10, 10000);
        pro[4].writeToFile();
        int pro_count = 5;

        // Customer Coming
        BufferedReader console = new BufferedReader(new InputStreamReader(System.in));
        customer c[] = new customer[5];
        int customer_count = -1;
        int flag;
        do {
            System.out.print("\nEnter your choice.\n1 --> Buy\n2 --> Exit\nEnter: ");
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
                    System.out.print("Enter Customer Name: ");
                    String name = console.readLine();
                    c[++customer_count] = new customer(name, n);

                    for (int j = 0; j < n; j++) {
                        System.out.print("\nEnter Product ID: ");
                        s = console.readLine();
                        int pid = Integer.parseInt(s);
                        System.out.print("Enter Product Name: ");
                        s = console.readLine();
                        String pname = s;
                        System.out.print("Enter Quantity: ");
                        s = console.readLine();
                        int q = Integer.parseInt(s);
                        int qua = 0, pri = 0;
                        for (int i = 0; i < pro_count; i++) {
                            if (pro[i].pi == pid) {
                                qua = pro[i].q;
                                pri = pro[i].p;
                            }
                        }
                        p[j] = new product(pid, pname, qua, pri);
                        System.out.println("\nProduct Details -->");
                        p[j].display();
                        c[customer_count].buy(p[j], q);
                    }
                    c[customer_count].writeUserToFile();
                    break;

                case 2:
                    flag = 1;
                default:
                    break;
            }
        } while (flag == 0);
    }
}
