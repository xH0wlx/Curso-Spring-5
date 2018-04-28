package com.cursospringangular.datajpa.app.models.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.cursospringangular.datajpa.app.models.entity.Usuario;
import org.springframework.stereotype.Repository;

@Repository
public interface IUsuarioDao extends JpaRepository<Usuario, Long>{
	
	public Usuario findByUsername(String username);
}
