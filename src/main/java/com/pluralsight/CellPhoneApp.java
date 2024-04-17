package com.pluralsight;
import java.util.Scanner;
public class CellPhoneApp {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        CellPhone cellPhone = new CellPhone();

        System.out.print("Please enter the serial number: ");
            int serialNumber = scanner.nextInt(); scanner.nextLine();
                cellPhone.setSerialNumber(serialNumber);
        System.out.print("Please enter the model: ");
            String model = scanner.nextLine();
                cellPhone.setModel(model);
        System.out.print("Please enter the carrier: ");
            String carrier = scanner.nextLine();
                cellPhone.setCarrier(carrier);
        System.out.print("Please enter the phone number: ");
            String phoneNumber = scanner.nextLine();
                cellPhone.setPhoneNumber(phoneNumber);
        System.out.print("Please enter the owner name: ");
            String owner = scanner.nextLine();
                cellPhone.setOwner(owner);


        System.out.println("Serial number: " + cellPhone.getSerialNumber());
        System.out.println("Model: " + cellPhone.getModel());
        System.out.println("Carrier: " + cellPhone.getCarrier());
        System.out.println("Phone number: " + cellPhone.getPhoneNumber());
        System.out.println("Owner: " + cellPhone.getOwner());

    // Exercise 2
        CellPhone cellPhone2 = new CellPhone();

        public static void display(cellPhone2);
    }
}
