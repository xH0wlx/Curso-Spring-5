package com.cursospringangular.datajpa.app.models.dao;

import org.springframework.data.jpa.repository.Query;
//import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.PagingAndSortingRepository;

import com.cursospringangular.datajpa.app.models.entity.Cliente;
import org.springframework.stereotype.Repository;

@Repository
public interface IClienteDao extends PagingAndSortingRepository<Cliente, Long>{

	@Query("select c from Cliente c left join fetch c.facturas f where c.id=?1")
	public Cliente fetchByIdWithFacturas(Long id);
	
}
