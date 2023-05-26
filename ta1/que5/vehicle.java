// package ta1.que5;

public class vehicle {
    String name;
    String reg_no;
    private String[] states = {"MH","MP","AP","DL","GJ"};

    vehicle(String name, String r) throws vehicleException{
        this.name = name;

        if(r.length() == 13){
            int sc = 0;
            String state = r.substring(0,2);
            for(String x: states){
                if(state.equals(x)){
                    sc++;
                }
            }
            if(sc==0){
                throw new vehicleException("Invalid State!");
            }
            if(r.charAt(2)=='-' && r.charAt(8)=='-'){
                if(isNum(r.charAt(3)) && isNum(r.charAt(4)) && isNum(r.charAt(9)) && isNum(r.charAt(10)) && isNum(r.charAt(11)) && isNum(r.charAt(12))){
                    if(r.charAt(5)==' '){
                        if(isChar(r.charAt(6)) && isChar(r.charAt(7))){
                            this.reg_no = r;
                        }
                        else{
                            throw new vehicleException("Invalid format!");
                        }
                    }
                    else{
                        throw new vehicleException("Invalid format!");
                    }
                }
                else{
                    throw new vehicleException("Invalid format!");
                }
            }
            else{
                throw new vehicleException("Invalid format!");
            }
        }
        else{
            throw new vehicleException("Invalid length!");
        }
    }

    void displayVehicle(){
        System.out.println("\n>> Vehicle Data");
        System.out.println("Name of Vehicle: "+name);
        System.out.println("Registration number: "+reg_no);
    }

    static boolean isNum(char c){
        if(c<='9' && c>='0'){
            return true;
        }
        return false;
    }
    static boolean isChar(char c){
        if(c<='Z' && c>='A'){
            return true;
        }
        return false;
    }
}
