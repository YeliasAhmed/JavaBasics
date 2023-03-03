package OOP;
public class Method {
    public static void main(String[] args) {
        int r =sum(5,10);

        System.out.println(r);
        System.out.println(sum(6,10));

    }

    public static int sum(int a, int b) {
        int result = a + b;
        return result;

    }
}
