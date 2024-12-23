public class TestParkingTicket {
    public static void main(String[] args) {
        ParkedCar car = new ParkedCar("BENZ", "Camry", "Blue", "XZZ123", 240);
        ParkingMeter meter = new ParkingMeter(120);
        PoliceOfficer officer = new PoliceOfficer("Danny", "25638");

        ParkingTicket ticket = officer.issueTicket(car, meter);

        if (ticket != null) {
            System.out.println(ticket);
        } else {
            System.out.println("No ticket issued. The car is within the time limit.");
        }
    }
}
