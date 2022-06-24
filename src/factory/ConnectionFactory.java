package factory;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectionFactory {

	private static final String URL = "jdbc:mysql://localhost:3306/alura_hotel";
	private static final String usuario = "root";
	private static final String clave = "R0o79876/adrian";
	
	public Connection conectar() {		
		
		Connection conexion = null;
		
		try {		
			conexion = DriverManager.getConnection(URL, usuario,clave);
			System.out.println("Conexion Ok");
			
		}catch (SQLException e) {
			e.printStackTrace();
			System.out.println("Error de conexion");
		}
		
		return conexion;
	}
	
} 
