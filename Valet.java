public class Valet implements HotelService {
    @Override
    public void service() {
        // Implementation for valet service
    }

    public void pickUpVehicle(String plateNumber) {
        System.out.println("Picking up vehicle with plate number: " + plateNumber);
    }
}