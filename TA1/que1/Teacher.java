public class Teacher extends Person{
    int salary;
    String qua;
    int exp;

    Teacher(String name, int[] dob, String qua, int exp){
        super(name, dob);
        this.qua = qua;
        this.exp = exp;
        this.salary = getSalary();
    }

    int getSalary(){
        int sal = 0;
        if(qua.equals("PG")){
            sal = 60000 + (exp*2000);
        }
        if(qua.equals("PHD")){
            sal = 80000 + (exp*2000);
        }
        return sal;
    }

    void displayInfo(){
        System.out.println("\n--- Teacher Info ---");
        System.out.println("Name: "+name);
        System.out.println("DOB: "+dob[0]+"/"+dob[1]+"/"+dob[2]);
        System.out.println("Qualification: "+ qua);
        System.out.println("Experience (In years): "+exp);
        System.out.println("Salary: "+salary);
    }
}
