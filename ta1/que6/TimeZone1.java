// package ta1.que6;

public class TimeZone1 extends GreatClock{
    String name;

    TimeZone1(int hrs, int mins, int ss, int mss) {
        super(hrs, mins, ss, mss);
        name = "UTC";
    }

    void IST(TimeZone1 a){
        GreatClock offset = new GreatClock(5, 30, 0, 0);
        GreatClock result = a.Add(a, offset);
        System.out.print(name+" --> IST ");
        result.display();
    }
}
