package fran.es.dao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import fran.es.controlador.entity.Cliente;

@Repository
public class ClassClienteDAO implements ClienteDAO {
	
	
	//Atributos.
	@Autowired
	private SessionFactory sessionFactory;

	//Metodos
	@Override
	@Transactional
	public List<Cliente> getClientes() {
		//Obtener la session
		
		Session miSession= sessionFactory.getCurrentSession();
		//Crear la query.
		Query<Cliente> miConsulta= miSession.createQuery("from Cliente", Cliente.class);
		
		//Ejecutar la query y devolver resultados.
		List<Cliente> clientes= miConsulta.getResultList();
		
		return clientes;
	}

	
}
