// package 5th_Prac;

public class studentone {
    String name;
    double cgpa;
    String en;
    String password;

    void init_student(String name, double cgpa, String en, String password) throws studentException {
        this.name = name;

        if (cgpa < 0 || cgpa > 10) {
            throw new studentException("Invalid CGPA!");
        } else {
            this.cgpa = cgpa;
        }

        int year = Integer.parseInt(en.substring(2, 4)); // BE22CSU110
        String branch = en.substring(4, 7);
        int roll = Integer.parseInt(en.substring(7, 10));

        if (en.length() != 10) {
            throw new studentException("In Enrollment Number --> Invalid Length!");
        }
        if (!(en.substring(0, 2).equals("BE"))) {
            throw new studentException("In Enrollment Number --> Invalid Degree Name!");
        }
        if (!(year >= 20 && year <= 23)) {
            throw new studentException("In Enrollment Number --> Invalid Academic Year!");
        }
        if (!((branch.equals("CSU") || branch.equals("ENU") || branch.equals("ECU") || branch.equals("EEU")))) {
            throw new studentException("In Enrollment Number --> Invalid Branch Name!");
        }
        if (!(roll >= 1 && roll <= 250)) {
            throw new studentException("In Enrollment Number --> Invalid Roll Number!");
        } else {
            this.en = en;
        }

        if (password.length() < 8) {
            throw new studentException("Invalid Password Length!");
        }
        char[] ch = new char[password.length()];
        for (int i = 0; i < password.length(); i++) {
            ch[i] = password.charAt(i);
        }

        int countsmall = 0;
        int countcapital = 0;
        int countnum = 0;
        int countspecial = 0;

        for (int i = 0; i < password.length(); i++) {
            if (ch[i] <= 'z' && ch[i] >= 'a') {
                countsmall++;
            }
            if (ch[i] <= 'Z' && ch[i] >= 'A') {
                countcapital++;
            }
            if (ch[i] <= '9' && ch[i] >= '0') {
                countnum++;
            }
            if (ch[i] == '!' || ch[i] == '$' || ch[i] == '%' || ch[i] == '*' || ch[i] == '&') {
                countspecial++;
            }
        }

        if (countcapital == 0) {
            throw new studentException("Password don't have Capital Letter");
        } else if (countnum == 0) {
            throw new studentException("Password don't have Number");
        } else if (countsmall == 0) {
            throw new studentException("Password don't have Small Letter");
        } else if (countspecial == 0) {
            throw new studentException("Password don't have Special Letter");
        } else {
            this.password = password;
        }
    }

    void displayInfo() {
        System.out.println("------ Student Information ------");
        System.out.println("Name: " + name);
        System.out.println("CGPA: " + cgpa);
        System.out.println("Enrollment Number: " + en);
        System.out.println("Password: " + password);
    }
}
