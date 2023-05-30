// package ta1.que7;

public class permanentEmployee implements employee {
  void permanentwork(){
    System.out.println("Permanent Working");
  }

  @Override
  public void work() {
    System.out.println("Working Employee");
  }
}
