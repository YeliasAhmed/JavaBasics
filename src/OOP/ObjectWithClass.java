package OOP;


class Teacher {
    int id;
    String name;
    String position;
}


class Student {
    public int id;
    public String name;
    public int age;
    String phone = "0175258995";

}

public class ObjectWithClass {
    public static void main(String[] args) {


        Student student = new Student();
        student.id = 5;
        student.name = "Adam Smith";
        student.age = 20;
        System.out.println("Student Info:");
        System.out.println("ID Number " + student.id);
        System.out.println("Name is " + student.name);
        System.out.println("ID Number " + student.age);
        System.out.println("Name is " + student.phone);

        System.out.println("\n");

        Teacher teacher = new Teacher();
        int idd = teacher.id = 111;
        String s = teacher.name = "Jane Alam";
        String ss = teacher.position = "Software Engineer";


        System.out.println("Teachers Info:");
        System.out.println("Teacher's id is "+idd);
        System.out.println("Teacher's name is "+s);
        System.out.println( ss+ " is his position");


    }
}
