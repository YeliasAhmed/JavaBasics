package Day1.ClassAndObject;

class Student{
    int roll=5;
    String sName = "Karim";

}

public class MainClass {
    public static void main(String[] args) {
        Teacher t = new Teacher();
        System.out.println("Teacher's ID: "+t.id +"\tName: "+t.name + "\tUniversity: "+Teacher.universityName);
        String uName=Teacher.universityName;
        System.out.println(uName);
        t.display();

        Student s = new Student();
        System.out.println("Roll: "+s.roll+ "\t Name: "+s.sName);
    }
}
