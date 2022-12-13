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

        }
        else if (selection.equals("2")) {

        }
        else if (selection.equals("3")) {

        }
        else if (selection.equals("4")) {

        }
        else if (selection.equals("5")) {

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
            initialSelectionR();
        }
    }
}
