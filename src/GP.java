import java.util.Scanner;

public class GP extends Staff{
    private int doctorID;
    private String specialty;
    private int yearsOfExperience;

    public GP(String role, String firstName, String lastName, String dateOfBirth, char gender, String staffEmail,
              int salary, int workingHours, boolean isDayOff, int doctorID, String specialty, int yearsOfExperience) {
        super(role, firstName, lastName, dateOfBirth, gender, staffEmail, salary, workingHours, isDayOff);
        this.doctorID = doctorID;
        this.specialty = specialty;
        this.yearsOfExperience = yearsOfExperience;
    }

    public int getDoctorID() {
        return doctorID;
    }
    public void setDoctorID(int doctorID) {
        this.doctorID = doctorID;
    }

    public String getSpecialty() {
        return specialty;
    }
    public void setSpecialty(String specialty) {
        this.specialty = specialty;
    }

    public int getYearsOfExperience() {
        return yearsOfExperience;
    }
    public void setYearsOfExperience(int yearsOfExperience) {
        this.yearsOfExperience = yearsOfExperience;
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
        GPInternal.initialSelectionGP();
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
        GPInternal.initialSelectionGP();
    }

    public String toString() {
        return  getRole() + ": " + "\n" +
                "First Name: " + getFirstName() + "\n" +
                "Last Name: " + getLastName() + "\n" +
                "Doctor ID: " + getDoctorID() + "\n" +
                "Specialty: " + getSpecialty() + "\n" +
                "Date of Birth: " + getDateOfBirth() + "\n" +
                "Gender: " + getGender() + "\n" +
                "Staff Email: " + getStaffEmail() + "\n" +
                "Salary: " + getSalary() + "\n" +
                "Working Hours per Week: " + getWorkingHours() + "\n" +
                "Is Day Off: " + getIsDayOff() + "\n" +
                "Years of Experience: " + getYearsOfExperience() +
                "\n";
    }

}
