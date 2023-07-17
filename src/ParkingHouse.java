import java.util.ArrayList;
import java.util.List;

public class ParkingHouse {
    private List<Vehicle> vehicles = new ArrayList<>();
    private final int capacity;

    public ParkingHouse(int capacity) {
        this.capacity = capacity;
    }

    public void parking(Vehicle vehicle) throws ToMuchException {
        if(capacity <= vehicles.size()){
            throw new ToMuchException();
        }

        vehicles.add(vehicle);
    }

    public void leave(Vehicle vehicle){
        if(!vehicles.remove(vehicle)){
            System.out.println("nem is volt itt");
        }
    }
}
