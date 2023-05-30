// package ta1.que6;

public class Time {
    int h, m;

    Time(int hr,int min){
      m = min;
      h = hr;
    }
  
    Time Add(Time A,Time B){
        int min = A.m + B.m;
        int mins = min%60;
        int hs = A.h + B.h + (min/60);
        Time n = new Time(hs,mins);
        return n;
    }
  
    Time Sub(Time A,Time B){
        int t1 = A.h*60*60 + A.m*60;
        int t2 = B.h*60*60 + B.m*60;
        int tot = t1-t2;
        if(tot > 0)
            tot += 0;
        else
            tot *= (-1);
    
        int mins = tot/60;
        int hrs = mins/60;
    
        Time n = new Time(hrs,mins%60);
        return n;
    }
  
    void display(){
        System.out.println(h+":"+m+" (hr:min)");
    }
}
