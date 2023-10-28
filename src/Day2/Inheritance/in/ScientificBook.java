package Day2.Inheritance.in;

public class ScientificBook extends Books{

    String bookName = "Scientific Book";
    void getInformation(){

        System.out.println("Book Name: "+bookName +"\tAuthor name:"+authorName+ "\tTotal Page: "+bookPageNo);
    }

}
