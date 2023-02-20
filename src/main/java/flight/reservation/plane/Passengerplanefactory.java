package flight.reservation.plane;

public class Passengerplanefactory {
    public String model;
    public int Airhostesscapacity;
    public int passengerCapacity;
    public int crewCapacity;

    public Passengerplanefactory(String model,int passengerCapacity,int crewCapacity,int Airhostesscapacity){
        this.model = model;
        this.Airhostesscapacity = Airhostesscapacity;
        this.passengerCapacity = passengerCapacity;
        this.crewCapacity = crewCapacity;
    }
}
