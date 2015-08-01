package org.neos.hibernate.test;

import java.util.List;

import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.neos.hibernate.domain.Region;

public class HibernateRegion {

	private static SessionFactory factory;

	@SuppressWarnings("deprecation")
	public static void main(String[] args) {

		factory = new Configuration().configure().buildSessionFactory();
		HibernateRegion manager = new HibernateRegion();

		manager.listRegions();
		factory.close();
	}

	public void listRegions() {

		Session session = factory.openSession();
		Transaction txt = null;
		try {

			txt = session.beginTransaction();
			@SuppressWarnings("unchecked")
			List<Region> ltsRegions = session.createQuery("FROM Region").list();
			for (Region region : ltsRegions) {
				System.out.println("IdRegion: " + region.getIdRegion());
				System.out.println(" Name: " + region.getNameRegion());
			}
			txt.commit();
		} catch (HibernateException e) {
			txt.rollback();
		} finally {
			session.close();
			System.out.println("CERRANDO CONEXION");
		}

	}

}
