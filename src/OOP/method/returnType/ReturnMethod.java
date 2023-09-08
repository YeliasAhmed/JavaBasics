package OOP.method.returnType;


public class ReturnMethod {
    public static void main(String[] args) {
        ReturnValue r = new ReturnValue();

       int result = r.sum(5, 10);
        System.out.println("Sum = "+result);

        double areaResult = r.areaCircle(5.5);
        System.out.println("Area of circle: "+areaResult);


    }

}
