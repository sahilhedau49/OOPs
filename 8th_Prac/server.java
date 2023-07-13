// package 8 th_Prac;

import java.util.ArrayList;
import java.util.Scanner;

public class server implements Runnable {
    Scanner sc = new Scanner(System.in);
    int score = 0;
    int choice;
    int size;
    ArrayList<Integer> runs = new ArrayList<>();

    public server(ArrayList<Integer> runs, int size) {
        this.runs = runs;
        this.score = runs.get(0);
        this.size = size;
    }

    public void run() {
        for (int j = 0; j < 6; j++) {
            synchronized (runs) {
                runs.remove(0);
                System.out.print("\nEnter runs Scored : ");
                choice = sc.nextInt();
                System.out.println("Server -> Runs scored in " + (j + 1) + " ball is : " + choice);
                runs.add(choice);
                runs.notifyAll();
            }
            try {
                Thread.sleep(2000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}
