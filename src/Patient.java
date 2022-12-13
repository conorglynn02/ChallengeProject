import java.time.LocalDate;

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

    public Patient(String role,int patientID, String firstName, String lastName, LocalDate dateOfBirth, char gender, String fullName, int age, String illness, boolean hasAllergies, String allergies, String prescriptions, int daysOnSystem, boolean hasSeriousIllness) {
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

    public boolean isHasAllergies() {
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

    public boolean isHasSeriousIllness() {
        return hasSeriousIllness;
    }
    public void setHasSeriousIllness(boolean hasSeriousIllness) {
        this.hasSeriousIllness = hasSeriousIllness;
    }

    public static void requestAppointment() {

    }

    public static void takePrescription() {

    }
}
