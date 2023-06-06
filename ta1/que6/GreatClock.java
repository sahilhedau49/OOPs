// package ta1.que6;

public class GreatClock extends Time {
    int s,ms;
    GreatClock(int hrs,int mins, int ss, int mss){
        super(hrs, mins);
        s = ss;
        ms = mss;
    }

    GreatClock Add(GreatClock a, GreatClock b){
        int tot1 = a.s*1000 + a.ms + b.s*1000 + b.ms;
        int ms1 = tot1%1000;
        int s1 = (tot1/1000);
        Time x = new Time(0, s1/60);
        Time x1 = a.Add(x, b);
        Time x2 = a.Add(a, x1);
        
        GreatClock r = new GreatClock(x2.h, x2.m, s1%60, ms1);
        return r;
    }

    GreatClock Sub(GreatClock a, GreatClock b){
        int tot1 = a.h*60*60*1000 + a.m*60*1000 + a.s*1000 + a.ms;
        int tot2 = b.h*60*60*1000 + b.m*60*1000 + b.s*1000 + b.ms;

        int tot = tot1 - tot2;
        if(tot > 0)
        tot += 0;
        else
        tot *= (-1);

        int ms1 = tot%1000;
        int s1 = tot/1000;
        int m1 = tot/(1000 * 60);
        int hr1 = tot/(1000 * 60 * 60);

        GreatClock x = new GreatClock(hr1, m1%60, s1%60, ms1);
        return x;
    }

    void display(){
        System.out.println(h+":"+m+":"+s+":"+ms+" (hr:min:sec:ms)");
    }
}
