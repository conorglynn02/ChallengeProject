import java.util.Scanner;

public class Receptionist extends Staff{
    private int receptionistID;

    public Receptionist(String role, String firstName, String lastName, String dateOfBirth, char gender,
                        String staffEmail, int salary, int workingHours, boolean isDayOff, int receptionistID) {
        super(role, firstName, lastName, dateOfBirth, gender, staffEmail, salary, workingHours, isDayOff);
        this.receptionistID = receptionistID;
    }

    public int getReceptionistID() {
        return receptionistID;
    }
    public void setReceptionistID(int receptionistID) {
        this.receptionistID = receptionistID;
    }

    public static void checkInPatient() {
        System.out.println();
        PatientProfiles.createPatientA();
        PatientProfiles.createPatientB();
        PatientProfiles.createPatientC();
        System.out.println(PatientProfiles.patientC.getFullName() + " has an appointment in 10 minutes.");
        System.out.println("Which patient would you like to check in?");
        System.out.println(PatientProfiles.patientA.getFullName() + " [1]");
        System.out.println(PatientProfiles.patientB.getFullName() + " [2]");
        System.out.println(PatientProfiles.patientC.getFullName() + " [3]");
        Scanner input = new Scanner(System.in);
        String answer = input.nextLine();
        if (answer.equals("3")) {
            System.out.println(PatientProfiles.patientC.getFullName() + " has been checked in for her appointment.");
            System.out.println();
            ReceptionistInternal.initialSelectionR();
        }
        else if (answer.equals("1") || answer.equals("2")) {
            System.out.println(ReceptionistInternal.ANSI_RED + "You have selected the wrong patient" + ReceptionistInternal.ANSI_RESET);
            System.out.println("Please try again.");
            checkInPatient();
        }
        else {
            System.out.println(ReceptionistInternal.ANSI_RED + "Error" + ReceptionistInternal.ANSI_RESET);
            System.out.println("Please try again.");
            checkInPatient();
        }
    }

    public static void scheduleAppointment() {
        System.out.println();
        PatientProfiles.createPatientA();
        PatientProfiles.createPatientB();
        PatientProfiles.createPatientC();
        System.out.println(PatientProfiles.patientA.getFullName() + " would like to schedule an appointment.");
        Scanner input = new Scanner(System.in);
        System.out.println("Is Dr. Johnson free on Wednesday, 11th January for Mr. "
                        + PatientProfiles.patientA.getLastName() + "'s  appointment?");
        System.out.println("Please enter \"Yes\" for yes and \"No\" for no.");
        String answer = input.nextLine();

        if (answer.toLowerCase().equals("yes")) {
            System.out.println("Dr. Johnson's calendar has been updated.");
        }
        else if (answer.toLowerCase().equals("no")) {
            System.out.println("You should get back to " + PatientProfiles.patientA.getFirstName()
                    + " as soon as you can about his appointment.");
        }
        else {
            System.out.println();
            System.out.println(ReceptionistInternal.ANSI_RED + "Error" + ReceptionistInternal.ANSI_RESET);
            System.out.println("Please select a correct option.");
            System.out.println();
            scheduleAppointment();
        }

        System.out.println();
        Scanner input2 = new Scanner(System.in);
        System.out.println("Press enter to continue...");
        String enter = input2.nextLine();
        System.out.println();
        ReceptionistInternal.initialSelectionR();
    }

    public String toString() {
        return  getRole() + ": " + "\n" +
                "First Name: " + getFirstName() + "\n" +
                "Last Name: " + getLastName() + "\n" +
                "Doctor ID: " + getReceptionistID() + "\n" +
                "Date of Birth: " + getDateOfBirth() + "\n" +
                "Gender: " + getGender() + "\n" +
                "Staff Email: " + getStaffEmail() + "\n" +
                "Salary: " + getSalary() + "\n" +
                "Working Hours per Week: " + getWorkingHours() + "\n" +
                "Is Day Off: " + getIsDayOff() +
                "\n";
    }

}
