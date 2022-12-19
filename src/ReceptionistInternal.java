import java.util.Scanner;

public class ReceptionistInternal {
    public static final String ANSI_RED = "\u001B[31m";
    public static final String ANSI_RESET = "\u001B[0m";
    public static void initialSelectionR() {
        Scanner choice = new Scanner(System.in);

        System.out.println("Please select an option:");
        System.out.println("View patient records: [1]");
        System.out.println("View your own file: [2]");
        System.out.println("View your colleagues' files: [3]");
        System.out.println("Check in a patient: [4]");
        System.out.println("Schedule an appointment: [5]");
        System.out.println("Log Out: [6]");

        String selection = choice.nextLine();

        if (selection.equals("1")) {
            PatientProfiles.createPatients();
            initialSelectionR();
        }
        else if (selection.equals("2")) {
            System.out.println();
            ReceptionistProfiles.createReceptionistA();
            System.out.println(ReceptionistProfiles.receptionistA.toString());
            Scanner input = new Scanner(System.in);
            System.out.println("Press enter to continue...");
            String enter = input.nextLine();
            System.out.println();
            initialSelectionR();
        }
        else if (selection.equals("3")) {
            System.out.println();
            ReceptionistProfiles.createReceptionistB();
            System.out.println(ReceptionistProfiles.receptionistB.toString());
            System.out.println();
            GPProfiles.createGPs();
            initialSelectionR();
        }
        else if (selection.equals("4")) {
            Receptionist.checkInPatient();
        }
        else if (selection.equals("5")) {
            Receptionist.scheduleAppointment();
        }
        else if (selection.equals("6")) {
            System.out.println();
            System.out.println("You have successfully logged out.");
            System.out.println("Rerun the application to log back in.");
            System.exit(0);
        }
        else {
            System.out.println();
            System.out.println(ANSI_RED + "Error" + ANSI_RESET);
            System.out.println("Please select a correct option.");
            System.out.println();
            initialSelectionR();
        }
    }
}
