import java.util.Scanner;

public class Main {
    public static final String ANSI_RED = "\u001B[31m";
    public static final String ANSI_RESET = "\u001B[0m";

    public static void main(String[] args) {

        logInOrSignUp();

    }

    public static void logInOrSignUp() {
        Scanner logInQ = new Scanner(System.in);
        System.out.println("Hint: use username: \"doctor\"/\"receptionist\"/\"patient\" with the " +
                "\npassword: password to log in without making an account.");
        System.out.println();
        System.out.println("Log In: [1]");
        System.out.println("Sign up: [2]");
        System.out.println("Please enter either 1 or 2 to log in or sign up.");
        String choice = logInQ.nextLine();

        if (choice.equals("1")) {
            LogIn.username();
        }
        else if (choice.equals("2")) {
            CreateUser.createNewUser();
        }
        else {
            System.out.println();
            System.out.println(ANSI_RED + "Error" + ANSI_RESET);
            System.out.println("Please select a correct option.");
            logInOrSignUp();
        }
    }
}
