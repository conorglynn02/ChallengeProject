import java.time.LocalDate;

public class GP extends Staff{
    private int doctorID;
    private String specialty;
    private int yearsOfExperience;

    public GP(String role, String firstName, String lastName, LocalDate dateOfBirth, char gender, String staffEmail, int salary, int workingHours, boolean isDayOff, int doctorID, String specialty, int yearsOfExperience) {
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

    }

    public static void prescribeMedicine() {

    }
}
