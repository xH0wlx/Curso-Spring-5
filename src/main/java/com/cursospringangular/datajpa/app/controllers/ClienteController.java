package com.cursospringangular.datajpa.app.controllers;

import java.util.Map;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.SessionAttributes;
import org.springframework.web.bind.support.SessionStatus;

//import com.cursospringangular.datajpa.app.models.dao.IClienteDao;
import com.cursospringangular.datajpa.app.models.entity.Cliente;
import com.cursospringangular.datajpa.app.models.service.IClienteService;

@Controller
// USO DE SESIÓN PARA ACTUALIZAR UN CLIENTE
@SessionAttributes("cliente")
public class ClienteController {

	//@Autowired
	//@Qualifier("clienteDaoJpa") // Cuando hay más de un componente el autowired genera ambigüedad.
	//private IClienteDao clienteDao;
	
	@Autowired
	private IClienteService clienteService;

	@RequestMapping(value = "listar", method = RequestMethod.GET)
	public String listar(Model model) {

		model.addAttribute("titulo", "Listado de clientes");
		model.addAttribute("clientes", clienteService.findAll());

		return "listar";
	}

	/* En este método se usa un map */
	@RequestMapping(value = "/form")
	public String crear(Map<String, Object> model) {
		Cliente cliente = new Cliente();
		model.put("cliente", cliente);
		model.put("titulo", "Formulario de Cliente");
		return "form";
	}
	
	@RequestMapping(value="/form/{id}")
	public String editar(@PathVariable(value="id") Long id, Map<String, Object> model) {
		Cliente cliente = null;
		
		if(id > 0) {
			cliente = clienteService.findOne(id);
		}else {
			return "redirect:/listar";
		}
		model.put("cliente", cliente);
		model.put("titulo", "Editar Clientes");
		return "form";
	}

	@RequestMapping(value = "/form", method = RequestMethod.POST)
	public String guardar(@Valid Cliente cliente, BindingResult result, Model model, SessionStatus status) {
		if (result.hasErrors()) {
			model.addAttribute("titulo", "Formulario de Cliente");
			return "form";
		}
		clienteService.save(cliente);
		status.setComplete();
		return "redirect:listar";
	}
	
	@RequestMapping(value="/eliminar/{id}")
	public String eliminar(@PathVariable(value="id") Long id) {
		if( id > 0 ) {
			clienteService.delete(id);
		}
		return "redirect:/listar";
	}
}
