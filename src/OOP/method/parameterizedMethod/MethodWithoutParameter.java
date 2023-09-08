package OOP.method.parameterizedMethod;

import OOP.method.parameterizedMethod.Employees;

public class MethodWithoutParameter {
    public static void main(String[] args) {
        Employees em = new Employees();
        em.id = 819;
        em.name = "Yelias ahmed";
        em.gender = "Male";
        em.phone = 1920834881;
        em.displayInfo();

        Employees e = new Employees();
        e.id = 819;
        e.name = "Naznin";
        e.gender = "Female";
        e.phone = 1925643435;
        e.displayInfo();


    }
}
