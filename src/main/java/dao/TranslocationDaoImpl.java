package dao;

import entities.Translocation;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;
import java.time.LocalDateTime;
import java.util.List;

@Stateless
public class TranslocationDaoImpl implements TranslocationDao {

	@PersistenceContext(name = "policePU")
	EntityManager em;

	@Override
	public List<Translocation> getTranslocations(long vehicleId, LocalDateTime startTime, LocalDateTime endTime) {
		return null;
	}

	@Override
	public Translocation getTranslocation(long id) {
		return em.find(Translocation.class, id);
	}

	@Override
	public void createTranslocation(Translocation translocation) {
		em.persist(translocation);
	}
}
