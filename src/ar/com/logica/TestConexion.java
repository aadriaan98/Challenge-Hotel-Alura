package ar.com.logica;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class TestConexion {

	public static void main(String[] args) {
		
		Conexion conexion = new Conexion();
		Connection cn = null;
		Statement st = null;
		ResultSet rs = null;
		
		try {
			cn = conexion.conectar();
			st = cn.createStatement();
			rs = st.executeQuery("SELECT * FROM huespedes");
			
			while (rs.next()) {
				
				int idUsuario = rs.getInt(1);
				String nombre = rs.getString(2);
				String apellido = rs.getString(3);
				
				System.out.println(idUsuario + " " + nombre + " " + apellido);
				
			}
			
		} catch (SQLException e) {
			
			e.printStackTrace();
			
		} finally {
			try {
				if (rs != null) {
					rs.close();
				}
				if (st != null) {
					st.close();
				}
				if (cn != null) {
					cn.close();
				}
				
			} catch (Exception e2) {
				e2.printStackTrace();
			}
		}
		
	}
	
}
