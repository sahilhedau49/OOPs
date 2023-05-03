// package sec_prac;

public class employee {
    String name;
    int id;
    int age;
    String des;
    int sal;
    attend[] a = new attend[10];          // Max days is set to 10 for now.
    int days=0;
    private time t = new time(0,0, 0);

    employee(String name, int id, int age, String des, int sal){
        this.name = name;
        this.id = id;
        this.age = age;
        this.des = des;
        this.sal = sal;
    }

    void addAttend(int date, int month, int year, time tin, time tout){
        a[days] = new attend(tin, tout, date, month, year);
        days++;
    }

    void display(){
        System.out.println("\n\nName: "+name);
        System.out.println("ID: "+id);
        System.out.println("Age: "+age);
        System.out.println("Designation: "+des);
        System.out.println("Salary: "+sal);
    }

    time workingHourInMonth(int m){
        time hr = new time(0,0,0);
        for(int i=0;i<days;i++){
            if(a[i].month == m){
                time temp = t.subTime(a[i].time_in, a[i].time_out);
                hr = t.addTime(hr, temp);
            }
        }
        return hr;
    }

    int displayWorkingHoursOnDate(int date, int month, int year){
        for(int i=0;i<days;i++){
            if(date == a[i].date && month == a[i].month && year == a[i].year){
                time tt = t.subTime(a[i].time_in, a[i].time_out);
                System.out.println("\n\nDate: "+date+" "+month+" "+year);
                System.out.print("Working Time: ");
                tt.display(tt);
                return 1;
            }
        }
        return 0;
    }
}
