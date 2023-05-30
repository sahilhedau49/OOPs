// package ta1.que6;

import java.util.TimeZone;

public class main {
    public static void main(String[] args) {
        Time a = new Time(6, 12);
        System.out.print("\nTime1 --> ");
        a.display();
        Time b = new Time(9,51);
        System.out.print("Time2 --> ");
        b.display();

        Time c = a.Add(a, b);
        System.out.print("\nSum of Time1 and Time2 --> ");
        c.display();
        Time d = a.Sub(a, b);
        System.out.print("Difference of Time1 and Time2 --> ");
        d.display();
    
        GreatClock x = new GreatClock(6, 18, 59, 14);
        System.out.print("\nGreatTime1 --> ");
        x.display();
        GreatClock y = new GreatClock(22, 23, 1, 799);
        System.out.print("GreatTime2 --> ");
        y.display();
        GreatClock z = x.Add(x, y);
        System.out.print("\nSum of GreatTime1 and GreatTime2 --> ");
        z.display();
        GreatClock n = x.Sub(x, y);
        System.out.print("Difference of GreatTime1 and GreatTime2 --> ");
        n.display();
    
        TimeZone1 t1 = new TimeZone1(9, 30, 10, 7);
        System.out.print("\nTime of UTC --> ");
        t1.display();
        t1.IST(t1);
      }
}
