package OOP.staticDetails;

public class StaticTest {
    public static void main(String[] args) {
        StaticConstructor sc = new StaticConstructor(1000, "John");
        sc.displayInfo();
//        System.out.println("Institution name: "+StaticConstructor.institute);


        StaticVariable s1 = new StaticVariable();
        s1.totalNumber();
        StaticVariable s2 = new StaticVariable();
        s2.totalNumber();
        StaticVariable s3 = new StaticVariable();
        s3.totalNumber();

    }
}
