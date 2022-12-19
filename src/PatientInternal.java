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
            System.out.println();
            PatientProfiles.createPatientB();
            System.out.println(PatientProfiles.patientB.toString());
            Scanner input = new Scanner(System.in);
            System.out.println("Press enter to continue...");
            String enter = input.nextLine();
            System.out.println();
            initialSelectionP();
        }
        else if (selection.equals("2")) {
            Patient.requestAppointment();
        }
        else if (selection.equals("3")) {
            Patient.takePrescriptions();
        }
        else if (selection.equals("4")) {
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
            initialSelectionP();
        }
    }

}
