package furama_project_101.controller;

import furama_project_101.services.i_services_booking_and_contract.IServicesBookingContract;
import furama_project_101.services.impl.IServicesBookingContractImpl;

import java.util.Scanner;

public class BookingManagement {
    public static void displayBookingManagement() {
        Scanner scanner = new Scanner(System.in);
        String num;
        IServicesBookingContract servicesBookingContract = new IServicesBookingContractImpl();

        do {
            System.out.println("______Booking Management______");
            System.out.println(
                            "1.\tAdd new booking\n" +
                            "2.\tDisplay list booking\n" +
                            "3.\tCreate new contracts\n" +
                            "4.\tDisplay list contracts\n" +
                            "5.\tEdit contracts\n" +
                            "6.\tReturn main menu\n");
            System.out.println("Please enter your choice");
            num = scanner.nextLine();
            switch (num) {
                case "1":
                    servicesBookingContract.addBooking();
                    break;
                case "2":
                    servicesBookingContract.displayBooking();
                    break;
                case "3":
                    servicesBookingContract.creatContract();
                    break;
                case "4":
                    servicesBookingContract.displayContract();
                    break;
                case "5":
                    servicesBookingContract.editContract();
                    break;
                case "6":
                    break;
                default:
                    System.out.println("Please enter again");
                    break;
            }
        } while (!num.equals("6"));
    }
}
