package es.cursojava.web.dao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.Transaction;

import es.cursojava.web.entities.CalculadoraEntity;
import es.cursojava.web.utils.HibernateUtil;

public class CalculadoraDAOImpl implements CalculadoraDAO {

	@Override
	public void insert(CalculadoraEntity calc) {
		
		Session session = HibernateUtil.getSession();
		Transaction tx = session.beginTransaction();
		session.persist(calc);
		tx.commit();

	}

	@Override
	public List<CalculadoraEntity> findAll() {
		Session session = HibernateUtil.getSession();
		List<CalculadoraEntity> lista = session.createQuery("from CalculadoraEntity",CalculadoraEntity.class).list();
		
		return lista;
	}

}
