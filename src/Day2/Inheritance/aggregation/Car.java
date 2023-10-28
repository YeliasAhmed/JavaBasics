package Day2.Inheritance.aggregation;

public class Car{

    String vType;
    Vehicle vehicle; //aggregation //name, price

    public Car(String vType, Vehicle vehicle){
        this.vType = vType;
        this.vehicle = vehicle;
    }

    void display(){
        System.out.println("Vehicle Type:"+vType +"Vehicle name: "+vehicle.vName+ "\tVehicle price: "+vehicle.price);
    }



    public static void main(String[] args) {
        Vehicle v = new Vehicle("Nissan", 5000); //vehicle

        Car c = new Car("Car", v); //car class object
        c.display();

    }

}
