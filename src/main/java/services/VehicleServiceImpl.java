package services;

import dao.VehicleDao;
import entities.Vehicle;

import javax.ejb.Stateless;
import javax.inject.Inject;

@Stateless
public class VehicleServiceImpl implements VehicleService {

	@Inject
	VehicleDao vehicleDao;

	@Override
	public Vehicle getVehicle(long id) {
		return vehicleDao.getVehicle(id);
	}

	@Override
	public boolean setVehicleAsStolen(String licensePlate) {
		return true;
	}


	public void updateVehicle(Vehicle vehicle) {
		vehicleDao.updateVehicle(vehicle);
	}
}
