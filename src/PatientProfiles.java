import java.util.Scanner;

public class PatientProfiles {

    static Patient patientA;
    static Patient patientB;
    static Patient patientC;


    public static void createPatientA() {
        patientA = new Patient("Patient", 222445678, "Francis", "O'Brien", "02/12/1980", 'M', "Francis O'Brien", 42, "Bronchitis", true, "House dust", "Bronchodilators", 205, false);
    }

    public static void createPatientB() {
        patientB = new Patient("Patient", 222668134, "Emma", "Murphy", "16/01/2001", 'F', "Emma Murphy", 21, "Cough", false, "N/A", "Cough syrup", 1005, false);
    }

    public static void createPatientC() {
        patientC = new Patient("Patient", 222881690, "Amy", "O'Connor", "10/10/1996", 'F', "Amy O'Connor", 26, "Diabetes", false, "N/A", "Insulin", 499, true);
    }

    public static void createPatients() {
        System.out.println();
        PatientProfiles.createPatientA();
        System.out.println(PatientProfiles.patientA.toString());
        System.out.println();
        PatientProfiles.createPatientB();
        System.out.println(PatientProfiles.patientB.toString());
        System.out.println();
        PatientProfiles.createPatientC();
        System.out.println(PatientProfiles.patientC.toString());
        System.out.println();
        Scanner input = new Scanner(System.in);
        System.out.println("Press enter to continue...");
        String enter = input.nextLine();
        System.out.println();
    }

}
