import java.util.Calendar;

public class Person {
    String name;
    int[] dob = new int[3];    // Date/Month/Year
    
    Person(String name, int[] dob){     
        this.name = name;
        this.dob = dob;
    }

    int calAge(){
        int age;
        Calendar calendar = Calendar.getInstance();
        age = calendar.get(Calendar.YEAR) - dob[2];
        return age;
    }
}
