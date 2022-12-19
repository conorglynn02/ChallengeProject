import java.util.Scanner;

public class Patient extends Human{
    private String fullName;
    private int patientID;
    private int age;
    private String illness;
    private boolean hasAllergies;
    private String allergies;
    private String prescriptions;
    private int daysOnSystem;
    private boolean hasSeriousIllness;

    public Patient(String role,int patientID, String firstName, String lastName, String dateOfBirth, char gender,
                   String fullName, int age, String illness, boolean hasAllergies, String allergies,
                   String prescriptions, int daysOnSystem, boolean hasSeriousIllness) {
        super(role, firstName, lastName, dateOfBirth, gender);
        this.fullName = fullName;
        this.patientID = patientID;
        this.age = age;
        this.illness = illness;
        this.hasAllergies = hasAllergies;
        this.allergies = allergies;
        this.prescriptions = prescriptions;
        this.daysOnSystem = daysOnSystem;
        this.hasSeriousIllness = hasSeriousIllness;
    }

    public String getFullName() {
        return fullName;
    }
    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public int getPatientID() {
        return patientID;
    }
    public void setPatientID() {
        this.patientID = patientID;
    }

    public int getAge() {
        return age;
    }
    public void setAge(int age) {
        this.age = age;
    }

    public String getIllness() {
        return illness;
    }
    public void setIllness(String illness) {
        this.illness = illness;
    }

    public boolean getHasAllergies() {
        return hasAllergies;
    }
    public void setHasAllergies(boolean hasAllergies) {
        this.hasAllergies = hasAllergies;
    }

    public String getAllergies() {
        return allergies;
    }
    public void setAllergies(String allergies) {
        this.allergies = allergies;
    }

    public String getPrescriptions() {
        return prescriptions;
    }
    public void setPrescriptions(String prescriptions) {
        this.prescriptions = prescriptions;
    }

    public int getDaysOnSystem() {
        return daysOnSystem;
    }
    public void setDaysOnSystem(int daysOnSystem) {
        this.daysOnSystem = daysOnSystem;
    }

    public boolean getHasSeriousIllness() {
        return hasSeriousIllness;
    }
    public void setHasSeriousIllness(boolean hasSeriousIllness) {
        this.hasSeriousIllness = hasSeriousIllness;
    }

    public static void requestAppointment() {
        String x = "";
        System.out.println();
        Scanner input = new Scanner(System.in);
        System.out.println("Your doctor is Dwayne Johnson.");
        System.out.println("Would Wednesday, 11th January suit you for an appointment?");
        System.out.println("Please enter \"Yes\" for yes and \"No\" for no.");
        String answer = input.nextLine();
        if (answer.toLowerCase().equals("yes")) {
            System.out.println("Your appointment has been made.");
            System.out.println("We will see you on Wednesday 11th January.");
        }
        else if (answer.toLowerCase().equals("no")) {
            System.out.println("Our receptionists will get back to you as soon as they have any more available appointments.");
        }
        else {
            System.out.println();
            System.out.println(PatientInternal.ANSI_RED + "Error" + PatientInternal.ANSI_RESET);
            System.out.println("Please select a correct option.");
            System.out.println();
            requestAppointment();
        }

        System.out.println();
        Scanner input2 = new Scanner(System.in);
        System.out.println("Press enter to continue...");
        String enter = input2.nextLine();
        System.out.println();
        PatientInternal.initialSelectionP();
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
            System.out.println(PatientInternal.ANSI_RED + "Error" + PatientInternal.ANSI_RESET);
            System.out.println("Please select a correct option.");
            System.out.println();
            takePrescriptions();
        }

        System.out.println();
        Scanner input2 = new Scanner(System.in);
        System.out.println("Press enter to continue...");
        String enter = input2.nextLine();
        System.out.println();
        PatientInternal.initialSelectionP();
    }

    public String toString() {
        return getRole() + ": " + "\n" +
                "First Name: " + getFirstName() + "\n" +
                "Last Name: " + getLastName() + "\n" +
                "Full Name: " + getFullName() + "\n" +
                "Patient ID: " + getPatientID() + "\n" +
                "Date of Birth: " + getDateOfBirth() + "\n" +
                "Gender: " + getGender() + "\n" +
                "Age: " + getAge() + "\n" +
                "Illness: " + getIllness() + "\n" +
                "Has Allergies: " + getHasAllergies() + "\n" +
                "Allergies: " + getAllergies() + "\n" +
                "Prescriptions: " + getPrescriptions() + "\n" +
                "Days on the system: " + getDaysOnSystem() + "\n" +
                "Has Serious Illness: " + getHasSeriousIllness() +
                "\n";
    }
}
