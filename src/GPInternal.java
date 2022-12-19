import java.util.Scanner;
public class GPInternal {
    public static final String ANSI_RED = "\u001B[31m";
    public static final String ANSI_RESET = "\u001B[0m";
    public static void initialSelectionGP() {
        Scanner choice = new Scanner(System.in);

        System.out.println("Please select an option:");
        System.out.println("View patient records: [1]");
        System.out.println("View your own file: [2]");
        System.out.println("View your colleagues' files: [3]");
        System.out.println("Diagnose a patient: [4]");
        System.out.println("Prescribe medicine: [5]");
        System.out.println("Log Out: [6]");

        String selection = choice.nextLine();

        if (selection.equals("1")) {
            PatientProfiles.createPatients();
            initialSelectionGP();

        }
        else if (selection.equals("2")) {
            System.out.println();
            GPProfiles.createGpB();
            System.out.println(GPProfiles.GpB.toString());
            Scanner input = new Scanner(System.in);
            System.out.println("Press enter to continue...");
            String enter = input.nextLine();
            System.out.println();
            initialSelectionGP();
        }
        else if (selection.equals("3")) {
            System.out.println();
            GPProfiles.createGpA();
            System.out.println(GPProfiles.GpA.toString());
            System.out.println();
            ReceptionistProfiles.createReceptionists();
            initialSelectionGP();
        }
        else if (selection.equals("4")) {
            GP.diagnosePatient();
        }
        else if (selection.equals("5")) {
            GP.prescribeMedicine();

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
            initialSelectionGP();
        }


    }
}
