//package sec_prac;

public class main {
    public static void main(String[] args) {

        // Part A

        time t1 = new time(10,10,10);
        time t2 = new time(17,5,5);

        time s = new time(0,0,0);
        System.out.print("Addition of time: ");
        s = s.addTime(t1, t2);
        s.display(s);

        time s1 = new time(0,0,0);
        System.out.print("\nSubtraction of time: ");
        s1 = s1.subTime(t1, t2);
        s1.display(s1);

        // Part B

        attend a = new attend(t1, t2, 30, 12, 2003);
        System.out.print("\n");
        a.display();

        // Part C

        employee[] ea = new employee[5];

        time timein = new time(10, 30, 13);
        time timeout = new time(5, 0, 24);
        ea[0] = new employee("Sahil", 56, 19, "SDE", 50000);
        ea[0].addAttend(1,1,23,timein,timeout);
        ea[0].addAttend(2,1,23,timein,timeout);
        ea[0].addAttend(3,1,23,timein,timeout);
        ea[0].addAttend(4,1,23,timein,timeout);
        ea[0].addAttend(5,1,23,timein,timeout);
        ea[0].display();
        time temp = ea[0].workingHour(1);
        System.out.print("Working Hours in month 1: ");
        temp.display(temp);
    }
}
