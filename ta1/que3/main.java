// package ta1.que3;

public class main {
    static String toString(int[] d1){
        String str = "{";
        for (int i = 0; i < d1.length-1; i++) {
          str = str + d1[i] + ", ";
        }
        str = str + d1[d1.length-1] + "}";
        return str;
      }

      public static void main(String[] args) {
        int[] d = {1,4,2,8,5,7};
        decimalMultiplier m = new decimalMultiplier(d);
        System.out.println("Whole Number --> "+m.multiplyarray(2));                // 0.142857 * 2 = 0.285714
        System.out.println("Updated Array --> "+toString(m.returnarray()));
    
        System.out.println("Whole Number --> "+m.multiplyarray(5));               // 0.142857 * 5 = 1.428570
        System.out.println("Updated Array --> "+toString(m.returnarray()));
    
        System.out.println("Whole Number --> "+m.multiplyarray(49));              // 0.142857 * 49 = 20.999930
        System.out.println("Updated Array --> "+toString(m.returnarray()));
      }
}
