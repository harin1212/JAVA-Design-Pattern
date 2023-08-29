package factory_vehicle;

public class App {
	public static void main(String args[]) {
		VehicleFactory vehicleFactory = new VehicleFactory();

		Vehicle vehicle_car = vehicleFactory.getVehicle(VehicleType.CAR);
		vehicle_car.startEngine();

		Vehicle vehicle1_truck = vehicleFactory.getVehicle(VehicleType.TRUCK);
		vehicle1_truck.startEngine();

		Vehicle vehicle_electric = vehicleFactory.getVehicle(VehicleType.ELECTRIC);
		vehicle_electric.startEngine();

		Vehicle vehicle_hydrogen = vehicleFactory.getVehicle(VehicleType.HYDROGEN);
		vehicle_hydrogen.startEngine();
	}
}