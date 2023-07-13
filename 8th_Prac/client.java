// package 8th_Prac;

import java.util.ArrayList;

class client implements Runnable {
    private final ArrayList<Integer> runs;
    private final int size;

    public client(ArrayList<Integer> runs, int size) {
        this.runs = runs;
        this.size = size;
    }

    public void run() {
        synchronized (runs) {
            while (true) {
                try {
                    runs.wait();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                int score = runs.get(runs.size() - 1);
                System.out.println(Thread.currentThread().getName() + " read -> Scored : " + score);
            }
        }
    }
}
