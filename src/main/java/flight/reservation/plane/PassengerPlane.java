package flight.reservation.plane;

public class PassengerPlane {

    public String model;
    public int passengerCapacity;
    public int crewCapacity;
    public int Airhostesscapacity;

    public PassengerPlane(String model) {
        this.model = model;
        Passengerplanefactory d;
        switch (model) {
            case "A380":
                d = new Passengerplanefactory(model, 500, 42, 11);
                break;
            case "A350":
                d = new Passengerplanefactory(model, 320, 40, 12);
                break;
            case "Embraer 190":
                d = new Passengerplanefactory(model, 25, 5, 1);
                break;
            case "Antonov AN2":
                d = new Passengerplanefactory(model, 15, 3, 1);
                break;
            default:
                throw new IllegalArgumentException(String.format("Model type '%s' is not recognized", model));
        }

        this.passengerCapacity = d.passengerCapacity;
        this.crewCapacity = d.crewCapacity;
        this.Airhostesscapacity = d.Airhostesscapacity;

    }
}
