// package ta1.que5;

import java.util.Scanner;

public class main {
    public static void main(String[] args){

        Scanner scan = new Scanner(System.in);

        System.out.print("Enter vehicle name: ");
        String name = scan.nextLine();
        System.out.print("Enter vehicle registration no.: ");
        String reg = scan.nextLine();

        try{
            vehicle v1 = new vehicle(name, reg);
            v1.displayVehicle();

        }catch(vehicleException e){
            String error = e.displayException();
            System.out.println("Exception Found! --> "+error);
        }

        scan.close();
    }

}
