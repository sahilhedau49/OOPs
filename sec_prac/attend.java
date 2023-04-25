// package sec_prac;

public class attend {
    time time_in = new time(0,0,0);
    time time_out = new time(0,0,0);
    int date, month, year;

    attend(time time_in, time time_out, int date, int month, int year){
        this.time_in = time_in;
        this.time_out = time_out;
        this.date = date;
        this.month = month;
        this.year = year;
    }

    void display(){
        System.out.print("\nDate: " + date +" "+ month+" " + year);
        System.out.print("\nTime in: ");
        time_in.display(time_in);
        System.out.print("\nTime out: ");
        time_out.display(time_out);
    }
}
