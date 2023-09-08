public class Try {
    public static void main(String[] args) {
        try {
            int a, b;
            a=1;
            b=0;
            System.out.println("Result"+a/b);
        }catch (Exception e){
            System.out.println(e);
        }

        System.out.println("This is after division");
    }
}
