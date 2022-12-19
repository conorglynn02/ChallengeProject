import java.util.Scanner;

public class ReceptionistProfiles {
    static Receptionist receptionistA;
    static Receptionist receptionistB;


    public static void createReceptionistA() {
        receptionistA = new Receptionist("Receptionist", "Mary", "Ward", "04/09/1977", 'F', "m.ward@exampleclinic.com", 50_000, 35, false, 2005440);
    }

    public static void createReceptionistB() {
        receptionistB = new Receptionist("Receptionist", "Joe", "O'Donnell", "10/03/1968", 'M', "j.odonnell@examplclinic.com", 50_000, 35, true, 2005441);
    }

    public static void createReceptionists () {
        System.out.println();
        ReceptionistProfiles.createReceptionistA();
        System.out.println(ReceptionistProfiles.receptionistA.toString());
        System.out.println();
        ReceptionistProfiles.createReceptionistB();
        System.out.println(ReceptionistProfiles.receptionistB.toString());
        Scanner input = new Scanner(System.in);
        System.out.println("Press enter to continue...");
        String enter = input.nextLine();
        System.out.println();
    }

}
