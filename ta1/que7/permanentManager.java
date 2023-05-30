// package ta1.que7;

public class permanentManager extends permanentEmployee implements manager{
  @Override
  public void manage() {
    System.out.println("Managing Employee");
  }

  void permanentmanage(){
    System.out.println("Managing Employee Permanently");
  }
}
