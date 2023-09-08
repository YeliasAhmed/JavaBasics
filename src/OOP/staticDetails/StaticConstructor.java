package OOP.staticDetails;

public class StaticConstructor {

    int s_id;
    String name;
   static String institute = "PCIU";

    StaticConstructor(int id, String n) {
        s_id = id;
        name = n;
    }

    void displayInfo() {
        System.out.println("Student ID: "+s_id);
        System.out.println("Student name: "+name);
        System.out.println("Institution name: "+StaticConstructor.institute);
        System.out.println("\n");
    }
}
