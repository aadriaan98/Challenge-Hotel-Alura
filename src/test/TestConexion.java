package test;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import factory.ConnectionFactory;

public class TestConexion {

	public static void main(String[] args) {
		
		ConnectionFactory connectionFactory = new ConnectionFactory();
		Connection cn = null;
		Statement st = null;
		ResultSet rs = null;
		
		try {
			cn = connectionFactory.conectar();
			st = cn.createStatement();
			rs = st.executeQuery("SELECT * FROM reservas");
			
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
