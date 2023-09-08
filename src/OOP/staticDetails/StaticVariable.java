package OOP.staticDetails;

public class StaticVariable {
    static int count = 0;

    StaticVariable(){
        count++;
    }

    void totalNumber(){
        System.out.println("Total count: "+count);
    }
}
