package fran.es.conexion;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class ConectorCRUD
 */
@WebServlet("/Conector")
public class Conector extends HttpServlet {
	private static final long serialVersionUID = 1L;

    /**
     * Default constructor. 
     */
    public Conector() {
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		//response.getWriter().append("Served at: ").append(request.getContextPath());
		
	//Declaraciones
		
		String url="jdbc:mysql://localhost:3306/gestionpedidoscrud?useSSL=false";
		
		String user="root";
		
		String password="";
		
		String driver="com.mysql.cj.jdbc.Driver";
		
		try {
			PrintWriter out= response.getWriter();
			
			out.print("Nombre de la BBDD: "+ url + "<br>");
			
			Class.forName(driver);
			
			Connection miCon= DriverManager.getConnection(url, user, password);
			
			out.print("Conectado");
			
			miCon.close();
		}catch(Exception e) {
			e.printStackTrace();
		}
		
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}