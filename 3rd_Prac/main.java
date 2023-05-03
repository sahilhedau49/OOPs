public class main{
    public static void main(String[] args) {
        student[] s = new student[5];

        // Student ---> Placement
        System.out.println("\n>>> Student going for placement");
        s[0] = new placement("sahil", "male", "CSE", 9.28, "IT", 1000000, 4956); // TypeCGPA
        s[0].display();

        // Student ---> Higher Studies
        System.out.println(">>> Student going for Higher Studies");
        s[1] =  new higherStudies("samrat", "male", "CSE", 8.9, "Mtech", "IIT Bomaby", 5710, 98.4);
        s[1].display();

        // Student ---> Enterpreneurship
        System.out.println(">>> Student going for Enterpreneurship");
        s[2] = new enterpreneurship("smit", "male", "CSE", 9.9, "TechCompany", "IT", 95, 1000000);
        s[2].display();

    }
}
