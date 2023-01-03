package COM.HIBERNATES.DTO;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import COM.HIBERNATES.CONTROLLER.Hospital;
import COM.HIBERNATES.DAO.HospitalCrudOperation;

public class HospitalMain {

	public static void main(String[] args) {
		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("umesh");
		EntityManager entityManager = entityManagerFactory.createEntityManager();
		EntityTransaction entityTransaction = entityManager.getTransaction();
		
//		Hospital h=new Hospital();
//		h.setId(125);
//		h.setEmail("abc@gmail.cm");
//		h.setAddress("pune");
//		h.setName("umesh");
//		h.setPhone("878954562");
//		
//		entityTransaction.begin();
//		entityManager.persist(h);
//		entityTransaction.commit();
HospitalCrudOperation.getdatabyid(125);
HospitalCrudOperation.deletdat(0);
HospitalCrudOperation.savedata(null);
HospitalCrudOperation.updatedat(null);

}
}