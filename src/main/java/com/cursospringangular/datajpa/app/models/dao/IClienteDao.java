package com.cursospringangular.datajpa.app.models.dao;

import org.springframework.data.repository.CrudRepository;

import com.cursospringangular.datajpa.app.models.entity.Cliente;

public interface IClienteDao extends CrudRepository<Cliente, Long>{

}
