import java.util.Scanner;

public class LogIn {

    public static final String ANSI_RED = "\u001B[31m";
    public static final String ANSI_RESET = "\u001B[0m";
    static boolean isStaff;
    static boolean isGP;

    public static void username() {
        Scanner input1 = new Scanner(System.in);
        System.out.print("Username:");

        String username = input1.nextLine();

        if (username.equals("doctor")) {
            isStaff = true;
            isGP = true;
            System.out.print("Password:");
            passwordAdmin();
        }
        else if (username.equals("patient")) {
            isStaff = false;
            isGP = false;
            System.out.print("Password:");
            passwordAdmin();
        }
        else if (username.equals("receptionist")) {
            isStaff = true;
            isGP = false;
            System.out.print("Password:");
            passwordAdmin();
        }
        else if (username.equals(CreateUser.currentUsername)) {
            System.out.print("Password:");
            passwordVariable();
        }
        else {
            System.out.println(ANSI_RED + "Username does not exist, please try again."
                    + ANSI_RESET);
            System.out.println("Hint: To create a new user, rerun the application.");
            System.out.println();
            username();
        }
    }

    public static void passwordAdmin () {
        Scanner input2 = new Scanner(System.in);
        String password = input2.nextLine();

        if (password.equals("password")) {
            System.out.println();
            if (isStaff == false) {
                System.out.println("Welcome Patient");
                PatientInternal.initialSelectionP();
            }
            else if (isStaff == true && isGP == true) {
                System.out.println("Welcome GP");
                GPInternal.initialSelectionGP();
            }
            else if (isStaff == true && isGP == false) {
                System.out.println("Welcome Receptionist");
                ReceptionistInternal.initialSelectionR();
            }
        }
        else {
            System.out.println(ANSI_RED + "Username or password is incorrect." + ANSI_RESET);
            System.out.println();
            username();
        }
    }

    public static void passwordVariable() {
        Scanner input2 = new Scanner(System.in);
        String passwordVar = input2.nextLine();

        if (passwordVar.equals(CreateUser.currentPassword)) {
            System.out.println();
            System.out.println("Welcome " + CreateUser.currentUsername);
            loginVariable();
        }
        else {
            System.out.println(ANSI_RED + "Username or password is incorrect." + ANSI_RESET);
            System.out.println();
            username();
        }
    }

    public static void loginVariable() {
        if (isStaff == false) {
            PatientInternal.initialSelectionP();
        }
        else if (isStaff == true && isGP == true) {
            GPInternal.initialSelectionGP();
        }
        else if (isStaff == true && isGP == false) {
            ReceptionistInternal.initialSelectionR();
        }
    }
}
