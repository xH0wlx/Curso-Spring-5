package com.cursospringangular.datajpa.app.models.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;

import org.springframework.stereotype.Repository;
import com.cursospringangular.datajpa.app.models.entity.Cliente;

@Repository("clienteDaoJpa")
public class ClienteDaoImpl implements IClienteDao {

	@PersistenceContext
	private EntityManager em;
	
	@Override
	public List<Cliente> findAll() {
		TypedQuery<Cliente> query = em.createQuery("from Cliente", Cliente.class);
		List<Cliente> results = query.getResultList();
		return results;
	}

	@Override
	public Cliente findOne(Long id) {
		return em.find(Cliente.class, id);
	}
	
	@Override
	public void save(Cliente cliente) {
		if( cliente.getId() != null && cliente.getId() > 0 ) {
			em.merge(cliente);
		}else {
			em.persist(cliente);			
		}
	}

	@Override
	public void delete(Long id) {
		Cliente cliente = findOne(id);
		em.remove(cliente);
	}

}
