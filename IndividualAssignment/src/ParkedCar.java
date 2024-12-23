class ParkedCar {
    private String make;
    private String model;
    private String color;
    private String licenseNumber;
    private int minutesParked;

    public ParkedCar(String make, String model, String color, String licenseNumber, int minutesParked) {
        this.make = make;
        this.model = model;
        this.color = color;
        this.licenseNumber = licenseNumber;
        this.minutesParked = minutesParked;
    }

    public String getMake() {
        return make;
    }

    public String getModel() {
        return model;
    }

    public String getColor() {
        return color;
    }

    public String getLicenseNumber() {
        return licenseNumber;
    }

    public int getMinutesParked() {
        return minutesParked;
    }
}

// ParkingMeter class
class ParkingMeter {
    private int minutesPurchased;

    public ParkingMeter(int minutesPurchased) {
        this.minutesPurchased = minutesPurchased;
    }

    public int getMinutesPurchased() {
        return minutesPurchased;
    }
}

// ParkingTicket class
class ParkingTicket {
    private String carDetails;
    private String officerDetails;
    private double fine;

    public ParkingTicket(ParkedCar car, PoliceOfficer officer, double fine) {
        this.carDetails = "Car [Make=" + car.getMake() + ", Model=" + car.getModel() + ", Color=" + car.getColor() + ", License=" + car.getLicenseNumber() + "]";
        this.officerDetails = "Officer [Name=" + officer.getName() + ", Badge=" + officer.getBadgeNumber() + "]";
        this.fine = fine;
    }

    @Override
    public String toString() {
        return carDetails + "\n" + officerDetails + "\nFine: " + fine;
    }
}

// PoliceOfficer class
class PoliceOfficer {
    private String name;
    private String badgeNumber;

    public PoliceOfficer(String name, String badgeNumber) {
        this.name = name;
        this.badgeNumber = badgeNumber;
    }

    public String getName() {
        return name;
    }

    public String getBadgeNumber() {
        return badgeNumber;
    }

    public ParkingTicket issueTicket(ParkedCar car, ParkingMeter meter) {
        int overTime = car.getMinutesParked() - meter.getMinutesPurchased();
        if (overTime > 0) {
            double fine = 25.0 + 10.0 * ((overTime - 1) / 60);
            return new ParkingTicket(car, this, fine);
        }
        return null;
    }
}
