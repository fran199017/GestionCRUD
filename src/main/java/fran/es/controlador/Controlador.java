package fran.es.controlador;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import fran.es.controlador.entity.Cliente;
import fran.es.dao.ClienteDAO;

@Controller
@RequestMapping("/cliente")
public class Controlador {
	
	//Atributos.
	@Autowired
	private ClienteDAO clienteDAO;

	@RequestMapping("/lista")
	public String listaClientes(Model modelo) {
		
		//Obtener  Clientes desde DAO
		List<Cliente> losClientes= clienteDAO.getClientes();
		
		//Agregar los clientes al model.
		
		modelo.addAttribute("clientes", losClientes);
		
		return "lista-clientes";
	}
	
	
	
}
