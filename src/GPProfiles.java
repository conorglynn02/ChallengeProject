import java.util.Scanner;

public class GPProfiles {
    static GP GpA;
    static GP GpB;


    public static void createGpA() {
        GpA = new GP("GP", "Jarlath", "Power", "30/06/1965", 'M', "j.power@exampleclinic.com", 100_000, 45, false, 1005431, "Cardiology", 30);
    }

    public static void createGpB() {
        GpB = new GP("GP", "Dwayne", "Johnson", "02/05/1972", 'M', "d.johnson@exampleclinic.com", 150_000, 55, false, 1005432, "Sports Medicine", 25);
    }

    public static void createGPs () {
        System.out.println();
        GPProfiles.createGpA();
        System.out.println(GPProfiles.GpA.toString());
        System.out.println();
        GPProfiles.createGpB();
        System.out.println(GPProfiles.GpB.toString());
        Scanner input = new Scanner(System.in);
        System.out.println("Press enter to continue...");
        String enter = input.nextLine();
        System.out.println();
    }

}
