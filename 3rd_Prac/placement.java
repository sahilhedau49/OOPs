public class placement extends student {
    String industryName;
    int annualPackage;
    int joiningLetterNumber;

    placement(String name, String gender, String DepartmentName, Double CGPA, String industryName, int annualPackage, int joiningLetterNumber){
        super(name, gender, DepartmentName, CGPA);
        this.industryName = industryName;
        this.annualPackage = annualPackage;
        this. joiningLetterNumber = joiningLetterNumber;
    }

    void display(){
        super.display();
        System.out.println("Industry Name: "+ industryName);
        System.out.println("Annual Package: "+ annualPackage);
        System.out.println("Joining Letter Number: "+ joiningLetterNumber);
        System.out.println("");
    }
}
