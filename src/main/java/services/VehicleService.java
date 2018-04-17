package services;

import entities.Vehicle;

public interface VehicleService {
	/**
	 * Get vehicle by id.
	 * @param id
	 * @return vehicle
	 */
	Vehicle getVehicle(long id);

	/**
	 * set a vehicle as stolen.
	 * @param licensePlate
	 */
	boolean setVehicleAsStolen(String licensePlate);
}
