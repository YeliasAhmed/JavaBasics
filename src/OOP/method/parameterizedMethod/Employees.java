package OOP.method.parameterizedMethod;

public class Employees {
    int id, phone;
    String name, gender;

    void setEmployeeInfo(int i, String n, String g, int p) {
        id = i;
        name = n;
        gender = g;
        phone = p;
    }

    void displayInfo() {
        System.out.println("ID: " + id);
        System.out.println("Name: " + name);
        System.out.println("Gender: " + gender);
        System.out.println("Phone: " + phone);
        System.out.println("\n");

    }

}
