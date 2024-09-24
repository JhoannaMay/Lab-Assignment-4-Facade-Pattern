public class FrontDesk {
    private Valet valet;
    private HouseKeeping houseKeeping;
    private Cart cart;

    public FrontDesk() {
        valet = new Valet();
        houseKeeping = new HouseKeeping();
        cart = new Cart();
    }

    public void requestService(String serviceType, String detail) {
        switch (serviceType) {
            case "valet":
                valet.pickUpVehicle(detail);
                break;
            case "housekeeping":
                houseKeeping.cleanRoom(Integer.parseInt(detail));
                break;
            case "cart":
                cart.requestCart(Integer.parseInt(detail));
                break;
            default:
                System.out.println("Service not available.");
        }
    }
}