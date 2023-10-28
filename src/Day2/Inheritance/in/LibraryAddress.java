package Day2.Inheritance.in;

public class LibraryAddress {
    String location ="Nilkhet";
    int street = 5;

    void LibraryAddress(String location, int street){
        this.location = location;
        this.street = street;
    }

    void display2(){
        System.out.println("This is a Library Address class");
    }
}
