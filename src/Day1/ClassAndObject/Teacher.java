package Day1.ClassAndObject;

public class Teacher {
    int id = 101;
    String name = "Fahim Khan";

   static String universityName = "NSU";

   public Teacher(){
       System.out.println("Id: "+id+"\tname: "+name);
   }

  public String display(){
       return name;
    }

}
