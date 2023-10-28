package Day2.Inheritance.in;


public class JavaBook extends Books{

    String bookName ="Introduction to Java";

    void display(){
        System.out.println("Book Name: "+bookName +"\tAuthor name:"+authorName+ "\tTotal Page: "+bookPageNo);
    }
}
