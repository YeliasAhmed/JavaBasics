package OOP.method.parameterizedMethod;

import OOP.method.parameterizedMethod.Employees;

public class MethodWithParameter {
    public static void main(String[] args) {
        Employees e1 = new Employees();
        e1.setEmployeeInfo(819, "Yelias ahmed", "Male", 1920834881);
        e1.displayInfo();

        Employees e2 = new Employees();
        e2.setEmployeeInfo(811, "Jannatul Ferdous", "Female", 1920834881);
        e2.displayInfo();

        Employees e3 = new Employees();
        e3.setEmployeeInfo(810, "Isra", "Female", 1920834881);
        e3.displayInfo();
    }
}
