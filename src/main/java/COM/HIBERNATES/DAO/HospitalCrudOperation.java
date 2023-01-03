package COM.HIBERNATES.DAO;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;



import COM.HIBERNATES.CONTROLLER.Hospital;

public class HospitalCrudOperation {
	static EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("umesh");
	static EntityManager entityManager = entityManagerFactory.createEntityManager();
	static EntityTransaction entityTransaction = entityManager.getTransaction();
	
	public static void savedata(Hospital h)
	{		
		entityTransaction.begin();
		entityManager.persist(h);
		entityTransaction.commit();
		
		
	}
	public static void getdatabyid(int id)
	{
		

		Hospital t  = entityManager.find(Hospital.class , id );
		System.out.println(t);
		
	}
	public static void deletdat(int id)
	{
		Hospital t  = entityManager.find(Hospital.class , id );
		entityTransaction.begin();
		entityManager.remove(t);
		entityTransaction.commit();
		
	}
	public static void updatedat(Hospital t)
	{
		
		entityTransaction.begin();
		entityManager.merge(t);
		entityTransaction.commit();
		
		
	}


}
