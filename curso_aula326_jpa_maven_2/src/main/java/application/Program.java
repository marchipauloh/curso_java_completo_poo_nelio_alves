package application;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import entities.People;

public class Program {

	public static void main(String[] args) {
		
		

		People p1 = new People(null, "Carlos da Silva", "carlos@gmail.com");
		People p2 = new People(null, "Joaquim Torres", "joaquim@gmail.com");
		People p3 = new People(null, "Ana Maria", "ana@gmail.com");
		
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("exemplo-jpa");
		EntityManager em = emf.createEntityManager();

// insert
//		em.getTransaction().begin();
//		em.persist(p1);
//		em.persist(p2);
//		em.persist(p3);
//		em.getTransaction().commit();
//		System.out.println("Pronto");
		
		
// find by id
//		People p = em.find(People.class, 2);
//		System.out.println(p);
//		System.out.println("Pronto");
//		
		
// remove (fist find, after remove) - objeto monitorado
//		People p = em.find(People.class, 2);
//		em.getTransaction().begin();
//		em.remove(p);
//		em.getTransaction().commit();
//		System.out.println("Pronto");

		
		em.close();
		emf.close();
		
	}

}
