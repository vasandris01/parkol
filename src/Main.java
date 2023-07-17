public class Main {
    public static void main(String[] args) {

        ParkingHouse myPlace = new ParkingHouse(2);
        Vehicle kicsiKocsi = new Car();
        Vehicle nagyKocsi = new Truck();
        Vehicle trabi = new Car();

        try {
            myPlace.parking(kicsiKocsi);
        } catch (ToMuchException e) {
            System.out.println("sok volt");
        }

        try {
            myPlace.parking(nagyKocsi);
        } catch (ToMuchException e) {
            System.out.println("sok volt");
        }

        try {
            myPlace.parking(trabi);
        } catch (ToMuchException e) {
            System.out.println("sok volt");
        }
        myPlace.leave(kicsiKocsi);
        try {
            myPlace.parking(trabi);
        } catch (ToMuchException e) {
            System.out.println("sok volt");
        }
    }
}