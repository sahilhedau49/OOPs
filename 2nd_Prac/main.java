//package sec_prac;

public class main {
    public static void main(String[] args) {

        // Part A

        System.out.println("\n----------- Part A -----------");
        time t1 = new time(10,10,10);
        time t2 = new time(17,5,5);
        System.out.print("\nTime 1: ");
        t1.display(t1);
        System.out.print("\nTime 2: ");
        t2.display(t2);

        time s = new time(0,0,0);
        System.out.print("\n\nAddition of time: ");
        s = s.addTime(t1, t2);
        s.display(s);

        time s1 = new time(0,0,0);
        System.out.print("\nSubtraction of time: ");
        s1 = s1.subTime(t1, t2);
        s1.display(s1);

        // Part B

        System.out.println("\n\n----------- Part B -----------");
        attend a = new attend(t1, t2, 30, 12, 2003);
        a.display();

        // Part C

        System.out.println("\n\n----------- Part C -----------");
        employee[] ea = new employee[5];

        time timein = new time(10, 30, 13);
        time timeout = new time(17, 0, 24);
        ea[0] = new employee("Sahil", 56, 19, "SDE", 50000);
        ea[0].addAttend(1,1,23,timein,timeout);
        ea[0].addAttend(2,1,23,timein,timeout);
        ea[0].addAttend(3,1,23,timein,timeout);
        ea[0].addAttend(4,1,23,timein,timeout);
        ea[0].addAttend(5,1,23,timein,timeout);
        ea[0].display();
        time temp = ea[0].workingHourInMonth(1);
        System.out.print("\nWorking Hours in month 1: ");
        temp.display(temp);
        ea[0].displayWorkingHoursOnDate(2,1,23);
    }
}