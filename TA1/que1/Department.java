// Assumed that each department
// should have only 60 students and 10 teachers.

public class Department {
    String name;
    Student_ta1[] s = new Student_ta1[60];
    int ts=0;
    Teacher[] t = new Teacher[10];
    int tt=0;

    Department(String name){
        this.name = name;
    }

    void addStudent(String name, int[] dob, int roll, int sem, double[] sgpa){
        s[ts] = new Student_ta1(name, dob, roll, sem, sgpa);
        ts++;
    }

    void addTeacher(String name, int[]dob, String qua, int exp){
        t[tt] = new Teacher(name, dob, qua, exp);
        tt++;
    }

    int calMaxAgeOfTeachers(){
        if(tt==0){
            System.out.println("No Teacher Admited");
            return -1;
        }
        int max = 0;
        for(int i=0;i<tt;i++){
            int ta = t[i].calAge();
            if(ta > max){
                max = ta;
            }
        }
        return max;
    }

    int calMinAgeOfTeachers(){
        if(tt==0){
            System.out.println("No Teacher Admited");
            return -1;
        }
        int min = 100;
        for(int i=0;i<tt;i++){
            int ta = t[i].calAge();
            if(ta < min){
                min = ta;
            }
        }
        return min;
    }

    double calAvgAgeOfStd(){
        if(ts==0){
            System.out.println("No Student Admited");
            return -1;
        }
        double avg = 0;
        for(int i=0;i<ts;i++){
            avg += s[i].calAge();
        }
        avg /= ts;
        return avg;
    }

    double calAvgCGPAofSem(int sem){
        double as = 0;
        int c = 0;
        for(int i=0;i<ts;i++){
            if(s[i].sem >= sem){
                as += s[i].sgpa[sem-1];
                c++;
            }
        }
        as /= c;
        return as;
    }
}
