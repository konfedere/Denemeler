package deneme;
import java.util.ArrayList;

public class VehiclePolymorphism {
    public static void main (String []args) {
        ArrayList<Object> vehicles = new ArrayList<Object>();

        Object bus = new Bus("Mercedes",6,30,"75B");
        Object auto = new Automobile("Volkswagen",4,5,220);
        Object plane = new Plane("Boeing",3,120,"Lufthansa",5.2);

        vehicles.add(bus);
        vehicles.add(auto);
        vehicles.add(plane);

        printProperties(vehicles);
    }

    public static void printProperties(ArrayList<Object> vehicles) {
        for(int i=0; i<vehicles.size();i++){
            Object o = vehicles.get(i);

            if (o instanceof Bus) {
                System.out.println("\n--Bus--");
                System.out.println(((Bus) o).lineCode + " is line code of the bus");
                System.out.println(((Bus) o).seatNumber + " is number of seats of the bus.");
            }else if (o instanceof Automobile) {
                System.out.println("\n--Automobile--");
                System.out.println(((Automobile)o).brand + " is brand of the car.");
                System.out.println(((Automobile)o).topSpeed + " is top speed of the car");
            }else if (o instanceof Plane) {
                System.out.println("\n--Plane--");
                System.out.println(((Plane)o).airLine + " is name of the airline.");
                System.out.println(((Plane)o).seatNumber + " is total seat number of the plane.");
                System.out.println(((Plane)o).tonnageCapacity + " is maximum capacity by tons.");
            }
        }
    }
}

class Vehicle extends Object {
    String brand;
    Integer wheelNumber;
    Integer seatNumber;

    public Vehicle (String brand, Integer wheelNumber, Integer seatNumber) {
        this.brand = brand;
        this.wheelNumber = wheelNumber;
        this.seatNumber = seatNumber;
    }
}

class Bus extends Vehicle {
    String lineCode;

    public Bus (String brand, Integer wheelNumber, Integer seatNumber, String lineCode) {
        super(brand,wheelNumber,seatNumber);
        this.lineCode = lineCode;
    }
}

class Automobile extends Vehicle {
    Integer topSpeed;

    public Automobile (String brand, Integer wheelNumber, Integer seatNumber, Integer topSpeed){
        super(brand, wheelNumber, seatNumber);
        this.topSpeed = topSpeed;
    }
}

class Plane extends Vehicle {
    String airLine;
    Double tonnageCapacity;

    public Plane (String brand, Integer wheelNumber, Integer seatNumber, String airLine, Double tonnageCapacity) {
        super(brand, wheelNumber, seatNumber);
        this.airLine = airLine;
        this.tonnageCapacity = tonnageCapacity;
    }
}