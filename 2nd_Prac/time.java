//package sec_prac;

public class time {
    int hrs,min,sec;

    time(int hrs,int min, int sec){
        this.hrs = hrs;
        this.min = min;
        this.sec = sec;
    }

    time addTime(time a, time b){
        time c = new time(0,0,0);

        c.hrs = a.hrs+b.hrs;

        int temp_min = a.min+b.min;
        if(temp_min >= 60){
            c.hrs += 1;
            temp_min -= 60;
        }
        
        c.min = temp_min;

        int temp_sec = a.sec+b.sec;
        if(temp_sec >= 60){
            c.min += 1;
            temp_sec -= 60;
        }

        c.sec = temp_sec;
        return c;
    }

    void display(time a){
        System.out.print(a.hrs + " hrs " + a.min + " min " + a.sec + " sec ");
    }

    time subTime(time a, time b){
        time max = new time(0,0,0);
        time mini = new time(0,0,0);
        time ans = new time(0,0,0);

        if(a.hrs < b.hrs){
            max = b;
            mini = a;
        }
        else{
            max = a;
            mini = b;
        }

        ans.hrs = max.hrs - mini.hrs;
        if(max.min >= mini.min){
            ans.min = max.min - mini.min;
        }
        else{
            ans.hrs--;
            ans.min = 60 - mini.min;
        }

        if(max.sec >= mini.sec){
            ans.sec = max.sec - mini.sec;
        }
        else{
            ans.min--;
            ans.sec = 60 - max.sec;
        }

        return ans;
    }
}