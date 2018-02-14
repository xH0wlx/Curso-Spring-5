package com.cursospringangular.datajpa.app.models.dao;

import org.springframework.data.repository.CrudRepository;

import com.cursospringangular.datajpa.app.models.entity.Factura;

public interface IFacturaDao extends CrudRepository<Factura, Long> {

}
