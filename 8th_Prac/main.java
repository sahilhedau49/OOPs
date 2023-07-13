// package 8th_Prac;

import java.util.ArrayList;

public class main {
    public static void main(String[] args) throws InterruptedException {
        // double runs = 0;
        ArrayList<Integer> runs = new ArrayList<>();
        runs.add(1);
        int size = 6;

        Thread client_1 = new Thread(new client(runs, size), "Client 1");
        Thread client_2 = new Thread(new client(runs, size), "Client 2");
        Thread client_3 = new Thread(new client(runs, size), "Client 3");
        Thread server = new Thread(new server(runs, size), "Server");
        client_1.start();
        client_2.start();
        client_3.start();
        server.start();
    }
}
