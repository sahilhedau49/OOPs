// package ta1.que7;

public class director implements manager {
    @Override
    public void work() {
      System.out.println("Working Employee");
    }

    @Override
    public void manage() {
      System.out.println("Managing Employee");
    }

    void direct(){
      System.out.println("Directing Employee");
    }
}