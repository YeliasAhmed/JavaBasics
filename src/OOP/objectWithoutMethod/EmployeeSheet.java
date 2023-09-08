package OOP.objectWithoutMethod;

public class EmployeeSheet {
    public static void main(String[] args) {

        Employee employee1 = new Employee();
        employee1.id = 100;
        employee1.Name = "Yelias Ahmed";
        employee1.gender = "Male";
        employee1.position = "SQA Engineer";
        employee1.phone = 1920834881;

        System.out.println("ID: "+employee1.id);
        System.out.println("Name: "+employee1.Name);
        System.out.println("Gender: "+employee1.gender);
        System.out.println("Position: "+employee1.position);
        System.out.println("Phone: "+employee1.phone);
        System.out.println("\n");


        Employee e2 = new Employee();
        e2.id = 101;
        e2.Name = "Jannatul Ferdous";
        e2.gender = "Female";
        e2.position = "Psychologist";
        e2.phone = 1925677881;

        System.out.println("ID: "+e2.id);
        System.out.println("Name: "+e2.Name);
        System.out.println("Gender: "+e2.gender);
        System.out.println("Position: "+e2.position);
        System.out.println("Phone: "+e2.phone);

    }
}
