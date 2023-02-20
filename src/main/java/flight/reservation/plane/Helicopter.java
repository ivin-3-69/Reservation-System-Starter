package flight.reservation.plane;

public class Helicopter {
    private final String model;
    private final int passengerCapacity;

    Helicopterfactory d;

    public Helicopter(String model) {
        this.model = model;
        if (model.equals("H1")) {
            d = new Helicopterfactory(model, 4);
        } else if (model.equals("H2")) {
            d = new Helicopterfactory(model, 6);
        } else {
            throw new IllegalArgumentException(String.format("Model type '%s' is not recognized", model));
        }

        this.passengerCapacity = d.passengerCapacity;
    }

    public String getModel() {
        return model;
    }

    public int getPassengerCapacity() {
        return passengerCapacity;
    }
}
