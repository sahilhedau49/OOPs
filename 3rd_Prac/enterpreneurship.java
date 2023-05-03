public class enterpreneurship extends student {
    String companyName;
    String sector;
    int num_of_employee;
    int annualTurnover;

    enterpreneurship(String name, String gender, String DepartmentName, Double CGPA, String companyName, String sector, int num_of_employee, int annualTurnover){
        super(name, gender, DepartmentName, CGPA);
        this.companyName = companyName;
        this.sector = sector;
        this.num_of_employee = num_of_employee;
        this.annualTurnover = annualTurnover;
    }
    
    void display(){
        super.display();
        System.out.println("Company Name: "+ companyName);
        System.out.println("Sector: "+ sector);
        System.out.println("Number of employees working in the company: "+ num_of_employee);
        System.out.println("Annual Turnover: "+ annualTurnover);
        System.out.println("");
    }    
}
