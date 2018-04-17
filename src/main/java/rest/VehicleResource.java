package rest;

import entities.Vehicle;
import entities.test;
import services.VehicleService;
import javax.inject.Inject;
import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

@Path("/vehicle")
public class VehicleResource {

	@Inject
	VehicleService vehicleService;

	@GET
	@Path("/get/{id}")
	@Produces(MediaType.APPLICATION_JSON)
	public Response get(@PathParam("id") long id){
		try{
			return Response.ok(
					vehicleService.getVehicle(id)).build();
		}
		catch(Exception e){
			return Response.serverError().build();
		}
	}

	@GET
	@Path("/get/{licensePlate}")
	public Response get(@PathParam("licensePlate") String licensePlate) {
		return Response.noContent().build();
	}

	@PUT
	@Path("/setStolen")
	public Response setVehicleAsStolen(String licensePlate) {
		try {
			vehicleService.setVehicleAsStolen(licensePlate);
			return Response.status(204).build();

		}
		catch(Exception e) {
			return Response.serverError().build();
		}
	}

	@PUT
	@Path("/setFound")
	public Response setVehicleAsFound(String licensePlate){
		return Response.noContent().build();
	}

	@GET
	@Path("/getOwnerHistory/{id}")
	public Response getOwnerHistory(@PathParam("id") long verhicleId) {
		return Response.noContent().build();
	}

	@GET
	@Path("/getTranslocations/{id}")
	public Response getTranslocations(@PathParam("id") long id) {
		return Response.noContent().build();
	}

	@GET
	@Path("/getStolenVehicles")
	public Response getStolenVehicles() {
		return Response.noContent().build();
	}
}
