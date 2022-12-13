import java.util.Scanner;
public class PatientInternal {
    public static final String ANSI_RED = "\u001B[31m";
    public static final String ANSI_RESET = "\u001B[0m";

    public static void initialSelectionP() {
        Scanner choice = new Scanner(System.in);

        System.out.println("Please select an option:");
        System.out.println("View your own file: [1]");
        System.out.println("Request an appointment: [2]");
        System.out.println("Take prescription: [3]");
        System.out.println("Log Out [4]");

        String selection = choice.nextLine();

        if (selection.equals("1")) {

        }
        else if (selection.equals("2")) {
            requestAppointment();
        }
        else if (selection.equals("3")) {
            takePrescriptions();
        }
        else if (selection.equals("4")) {
            System.out.println();
            System.out.println("You have successfully logged out.");
            System.out.println("Rerun the application to log back in.");
        }
        else {
            System.out.println();
            System.out.println(ANSI_RED + "Error" + ANSI_RESET);
            System.out.println("Please select a correct option.");
            System.out.println();
            initialSelectionP();
        }
    }

    public static void requestAppointment() {
        String x = "";
        System.out.println();
        Scanner input = new Scanner(System.in);
        //System.out.println("When would you like an appointment for?");
        System.out.println("Would Wednesday, 11th January suit you for an appointment?");
        System.out.println("Please enter \"Yes\" for yes and \"No\" for no.");
        String answer = input.nextLine();
        if (answer.toLowerCase().equals("yes")) {
            System.out.println("Your appointment has been made.");
        }
        else if (answer.toLowerCase().equals("no")) {
            System.out.println("Our receptionists will get back to you if they have any available appointments.");
        }
        else {
            System.out.println();
            System.out.println(ANSI_RED + "Error" + ANSI_RESET);
            System.out.println("Please select a correct option.");
            System.out.println();
            requestAppointment();
        }

        System.out.println();
        Scanner input2 = new Scanner(System.in);
        System.out.println("Press enter to continue...");
        String enter = input2.nextLine();
        System.out.println();
        initialSelectionP();
    }
    public static void takePrescriptions() {
        System.out.println();
        Scanner input = new Scanner(System.in);
        System.out.println("Which prescription would you like to take: ");
        System.out.println("Here are your medicines: ");
        String x = "Penicillin";
        String y = "Cough syrup";
        String z = "Eye drops";
        System.out.println(x + " [1]");
        System.out.println(y +" [2]");
        System.out.println(z + " [3]");
        String medicine = input.nextLine();

        if (medicine.equals("1")) {
            System.out.println("You have entered: " + x.toLowerCase() + '.');
            System.out.println("You are now taking " + x.toLowerCase() + '.');
        }
        else if (medicine.equals("2")) {
            System.out.println("You have entered: " + y.toLowerCase() + '.');
            System.out.println("You are now taking your " + y.toLowerCase() + '.');
        }
        else if (medicine.equals("3")) {
            System.out.println("You have entered: " + z.toLowerCase() + '.');
            System.out.println("You are now taking your " + z.toLowerCase() + '.');
        }
        else {
            System.out.println();
            System.out.println(ANSI_RED + "Error" + ANSI_RESET);
            System.out.println("Please select a correct option.");
            System.out.println();
            takePrescriptions();
        }

        System.out.println();
        Scanner input2 = new Scanner(System.in);
        System.out.println("Press enter to continue...");
        String enter = input2.nextLine();
        System.out.println();
        initialSelectionP();
    }

}
