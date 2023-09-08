package OOP;

// Java program to demonstrate
// an abstract class

// Abstract parent class
abstract class Books {

    // Abstract method without body
    public abstract void page();
}

// shayar class extends Book class
public class Book extends Books {

    // Declaring the abstract method
    public void page()
    {
        System.out.println("Geek");
    }

    // Driver code
    public static void main(String args[])
    {
        Books obj = new Book();
        obj.page();
    }
}

