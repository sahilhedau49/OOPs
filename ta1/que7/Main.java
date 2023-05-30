// package ta1.que7;

public class Main {
  public static void main(String[] args) {
    director d = new director();
    System.out.println("\n**** Director ****");
    d.direct();
    d.manage();
    d.work();

    consultantManager cm = new consultantManager();
    System.out.println("\n**** Consultant Manager ****");
    cm.consult();
    cm.manage();
    cm.work();
    cm.temporarywork();

    permanentManager pm = new permanentManager();
    System.out.println("\n**** Permanent Manager ****");
    pm.permanentmanage();
    pm.manage();
    pm.work();
    pm.permanentwork();
    System.out.println();
  }
}
