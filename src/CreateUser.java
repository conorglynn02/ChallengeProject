import java.util.Scanner;

public class CreateUser {

    public static final String ANSI_RED = "\u001B[31m";
    public static final String ANSI_RESET = "\u001B[0m";
    public static String currentUsername;
    public static String currentPassword;
    //static boolean isPatient;#
    static boolean isStaff;
    static boolean isGP;


    public static void createNewUser() {
        Scanner input1 = new Scanner(System.in);
        System.out.println();
        System.out.print("Enter a username: ");
        String newUsername = input1.nextLine();

        if (newUsername.equals("doctor") | newUsername.equals("patient") || newUsername.equals("receptionist")) {
            System.out.println();
            System.out.println(ANSI_RED + "This username is already in use." + ANSI_RESET);
            System.out.println("Please try again.");
            createNewUser();
        }
        else if (newUsername.length() < 6) {
            System.out.println();
            System.out.println(ANSI_RED + "Username must be more than 6 characters in length."
                    + ANSI_RESET);
            System.out.println("Please try again.");
            createNewUser();
        }
        else {
            currentUsername = newUsername;
            createNewPassword();
            //System.out.println(currentUsername);
        }
    }

    public static void createNewPassword() {
        Scanner input2 = new Scanner(System.in);
        System.out.print("Enter a password: ");
        String newPassword = input2.nextLine();

        if (newPassword.equals(currentUsername)) {
            System.out.println();
            System.out.println(ANSI_RED + "Username and password cannot be identical." + ANSI_RESET);
            System.out.println("Please try again.");
            System.out.println();
            createNewPassword();
            System.out.println();
        }
        else if (newPassword.length() < 6) {
            System.out.println();
            System.out.println(ANSI_RED + "Password must be more than 6 characters." + ANSI_RESET);
            System.out.println("Please try again.");
            System.out.println();
            createNewPassword();
            System.out.println();
        }
        else {
            currentPassword = newPassword;
            System.out.println();
            isPatientOrStaff();
            //System.out.println("Press enter to Log In.");
            //LogInClass.username();

        }
    }

    public static void isPatientOrStaff() {
        Scanner patientOrStaff = new Scanner(System.in);
        System.out.println("Patient: [1]");
        System.out.println("GP: [2]");
        System.out.println("Receptionist: [3]");
        System.out.println("Please enter either 1, 2 or 3 if you are a patient or staff.");
        String answer = patientOrStaff.nextLine();

        if (answer.equals("1")) {
            System.out.println("You have selected patient.");
            isStaff = false;
            isGP = false;
            //System.out.println("Press enter to Log In.");
            successfulAccount();
            //Patient class and patient(); method
        }
        else if (answer.equals("2")) {
            System.out.println("You have selected GP.");
            isStaff = true;
            isGP = true;
            //System.out.println("Press enter to Log In.");
            successfulAccount();
            //staff superclass (of person) and staff method?
            //probably asks user if they are doctor or receptionist
        }
        else if (answer.equals("3")) {
            System.out.println("You have selected receptionist.");
            isStaff = true;
            isGP = false;
            successfulAccount();
        }
        else {
            System.out.println();
            System.out.println(ANSI_RED + "Error" + ANSI_RESET);
            System.out.println("Please select a correct option.");
            isPatientOrStaff();
        }
    }

    public static void successfulAccount() {
        System.out.println();
        System.out.println("Your account has been made successfully.");
        System.out.println("Your username is: " + currentUsername + '.');
        System.out.println("Your password is: " + currentPassword + '.');
        if (isStaff == false) {
            System.out.println("You are a patient.");
        }
        else if (isStaff == true && isGP == true) {
            System.out.println("You are a GP.");
            LogIn.isStaff = true;
            LogIn.isGP = true;
        }
        else if (isStaff == true && isGP == false) {
            System.out.println("You are a receptionist.");
            LogIn.isStaff = true;
            LogIn.isGP = false;
        }
        System.out.println();
        LogIn.username();
    }

}
