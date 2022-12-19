public class Staff extends Human{
    private String staffEmail;
    private int salary;
    private int workingHours;
    private boolean isDayOff;

    public Staff(String role, String firstName, String lastName, String dateOfBirth, char gender, String staffEmail, int salary, int workingHours, boolean isDayOff) {
        super(role, firstName, lastName, dateOfBirth, gender);
        this.staffEmail = staffEmail;
        this.salary = salary;
        this.workingHours = workingHours;
        this.isDayOff = isDayOff;
    }

    public String getStaffEmail() {
        return staffEmail;
    }
    public void setStaffEmail(String staffEmail) {
        this.staffEmail = staffEmail;
    }

    public int getSalary() {
        return salary;
    }
    public void setSalary(int salary) {
        this.salary = salary;
    }

    public int getWorkingHours() {
        return workingHours;
    }
    public void setWorkingHours(int workingHours) {
        this.workingHours = workingHours;
    }

    public boolean getIsDayOff() {
        return isDayOff;
    }
    public void setDayOff(boolean dayOff) {
        isDayOff = dayOff;
    }
}
