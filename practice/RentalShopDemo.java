import java.util.ArrayList; 
// 1. Interface
interface Rentable {
    double calculateRent(int days);
    boolean isAvailable();
}

// 2. Abstract class
abstract class Vehicle implements Rentable {
    String id;
    String model;
    double dailyRate;
    boolean available = true;

    Vehicle(String id, String model, double dailyRate) {
        this.id = id;
        this.model = model;
        this.dailyRate = dailyRate;
    }

    @Override
    public boolean isAvailable() {
        return available;
    }

    void setAvailable(boolean available) {
        this.available = available;
    }

    String getDetails() {
        return getClass().getSimpleName() + " " + model + " (" + id + ")";
    }
}

// 3. Car
class Car extends Vehicle {
    Car(String id, String model, double dailyRate) {
        super(id, model, dailyRate);
    }

    @Override
    public double calculateRent(int days) {
        return dailyRate * days;
    }
}

// 4. Bike
class Bike extends Vehicle {
    Bike(String id, String model, double dailyRate) {
        super(id, model, dailyRate);
    }

    @Override
    public double calculateRent(int days) {
        double rent = dailyRate * days;

        if (days >= 7) {
            rent = rent * 0.90;
        }

        return rent;
    }
}

// 5. Truck
class Truck extends Vehicle {
    Truck(String id, String model, double dailyRate) {
        super(id, model, dailyRate);
    }

    @Override
    public double calculateRent(int days) {
        return dailyRate * days + 500;
    }
}

// 6. Customer
class Customer {
    String name;
    ArrayList<Rental> history = new ArrayList<>();

    Customer(String name) {
        this.name = name;
    }

    void addRental(Rental rental) {
        history.add(rental);
    }
}

// 7. Rental
class Rental {
    Vehicle vehicle;
    Customer customer;
    int days;
    double totalRent;

    Rental(Vehicle vehicle, Customer customer, int days) {
        this.vehicle = vehicle;
        this.customer = customer;
        this.days = days;
        this.totalRent = vehicle.calculateRent(days);
    }

    void display() {
        System.out.printf(
            "%s rented %s for %d days = %.2f%n",
            customer.name,
            vehicle.getDetails(),
            days,
            totalRent
        );
    }
}

// 8. Rental Shop
class RentalShop {
    ArrayList<Vehicle> fleet = new ArrayList<>();

    void addVehicle(Vehicle vehicle) {
        fleet.add(vehicle);
    }

    void rent(String vehicleId, Customer customer, int days)
            throws Exception {

        Vehicle selected = null;

        for (Vehicle vehicle : fleet) {
            if (vehicle.id.equals(vehicleId)) {
                selected = vehicle;
                break;
            }
        }

        if (selected == null) {
            throw new Exception("Vehicle " + vehicleId + " not found");
        }

        if (!selected.isAvailable()) {
            throw new Exception(
                selected.getDetails() + " is already rented"
            );
        }

        if (days <= 0) {
            throw new Exception("Rental days must be positive");
        }

        Rental rental = new Rental(selected, customer, days);

        selected.setAvailable(false);
        customer.addRental(rental);

        rental.display();
    }

    void giveBack(String vehicleId) throws Exception {
        for (Vehicle vehicle : fleet) {
            if (vehicle.id.equals(vehicleId)) {
                if (vehicle.isAvailable()) {
                    throw new Exception(
                        vehicle.getDetails() + " is not rented"
                    );
                }

                vehicle.setAvailable(true);
                return;
            }
        }

        throw new Exception("Vehicle " + vehicleId + " not found");
    }

    void showAvailable() {
        System.out.println("Available vehicles:");

        for (Vehicle vehicle : fleet) {
            if (vehicle.isAvailable()) {
                System.out.println("  " + vehicle.getDetails());
            }
        }
    }
}

// 9. Main class
public class RentalShopDemo {
    public static void main(String[] args) {
        RentalShop shop = new RentalShop();

        Car car = new Car("C1", "Swift", 2000);
        Bike bike = new Bike("B1", "Activa", 400);
        Truck truck = new Truck("T1", "Tata Ace", 2500);

        shop.addVehicle(car);
        shop.addVehicle(bike);
        shop.addVehicle(truck);

        Customer asha = new Customer("Asha");
        Customer ravi = new Customer("Ravi");

        try {
            shop.rent("B1", asha, 8);
            shop.rent("T1", ravi, 2);

            shop.rent("B1", ravi, 3);
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }

        try {
            shop.giveBack("T1");
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }

        shop.showAvailable();
    }
}


