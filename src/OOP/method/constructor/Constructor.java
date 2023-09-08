package OOP.method.constructor;

public class Constructor {
    int id, phone;
    String name, gender;


    Constructor(int i, String n, String g, int ph){
        id = i;
        name = n;
        gender = g;
        phone = ph;

    }
    void displayInfo() {
        System.out.println("ID: " + id);
        System.out.println("Name: " + name);
        System.out.println("Gender: " + gender);
        System.out.println("Phone: " +phone);
        System.out.println("\n");

    }
}
