public class higherStudies extends student {
    String degreeName;
    String Collegename;
    int admissionLetterNumber;
    double CE_score;

    higherStudies(String name, String gender, String DepartmentName, Double CGPA, String degreeName, String Collegename, int admissionLetterNumber, double CE_score){
        super(name, gender, DepartmentName, CGPA);
        this.degreeName = degreeName;
        this.Collegename = Collegename;
        this.admissionLetterNumber = admissionLetterNumber;
        this.CE_score = CE_score;
    }
    
    void display(){
        super.display();
        System.out.println("Degree Name: "+ degreeName);
        System.out.println("College Name: "+ Collegename);
        System.out.println("Admission Letter Number: "+ admissionLetterNumber);
        System.out.println("CE Score: "+ CE_score);
        System.out.println("");
    }
}
