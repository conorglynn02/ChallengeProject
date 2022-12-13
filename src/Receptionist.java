import java.time.LocalDate;

public class Receptionist extends Staff{
    private int receptionistID;

    public Receptionist(String role, String firstName, String lastName, LocalDate dateOfBirth, char gender, String staffEmail, int salary, int workingHours, boolean isDayOff, int receptionistID) {
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

    }

    public static void scheduleAppointment() {

    }
}
