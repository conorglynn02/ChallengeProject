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

        }
        else if (selection.equals("2")) {

        }
        else if (selection.equals("3")) {

        }
        else if (selection.equals("4")) {
            diagnosePatient();
        }
        else if (selection.equals("5")) {
            prescribeMedicine();

        }
        else if (selection.equals("6")) {
            System.out.println();
            System.out.println("You have successfully logged out.");
            System.out.println("Rerun the application to log back in.");
        }
        else {
            System.out.println();
            System.out.println(ANSI_RED + "Error" + ANSI_RESET);
            System.out.println("Please select a correct option.");
            System.out.println();
            initialSelectionGP();
        }


    }

    public static void diagnosePatient() {
        System.out.println();
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter the illness you will diagnose your patient.");
        String illness = input.nextLine();
        System.out.println("You have entered: " + illness + '.');
        System.out.println("Your patient is now diagnosed with " + illness + '.');
        System.out.println();
        Scanner input2 = new Scanner(System.in);
        System.out.println("Press enter to continue...");
        String enter = input2.nextLine();
        System.out.println();
        initialSelectionGP();
    }

    public static void prescribeMedicine() {
        System.out.println();
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter the medicine you wish to prescribe to your patient.");
        String medicine = input.nextLine();
        System.out.println("You have entered: " + medicine + '.');
        System.out.println("Your patient will now take " + medicine + '.');
        System.out.println();
        Scanner input2 = new Scanner(System.in);
        System.out.println("Press enter to continue...");
        String enter = input2.nextLine();
        System.out.println();
        initialSelectionGP();
    }
}
