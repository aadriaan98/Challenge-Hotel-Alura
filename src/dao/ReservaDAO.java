package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import javax.swing.JOptionPane;

import factory.ConnectionFactory;
import model.ReservaModel;
import views.Reservas;

public class ReservaDAO {

	private Connection con;
	
	public ReservaDAO (Connection con) {
		this.con = con;
	}
	
	public void guardarReserva(ReservaModel reserva) {
		
		try {
			String sql = "INSERT INTO reservas (fecha_entrada, fecha_salida, valor, forma_pago) VALUES (?, ?, ?, ?)";
			try(PreparedStatement pt = con.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS)) {
				
				pt.setDate(1, reserva.getFechaEntrada());
				pt.setDate(2, reserva.getFechaSalida());
				pt.setString(3, reserva.getValor());
				pt.setString(4, reserva.getFormaPago());
				
				pt.executeUpdate();
				
				try(ResultSet rs = pt.getGeneratedKeys()){
					
					while (rs.next()) {
						
						reserva.setId(rs.getInt(1));
						
					}
				}
				
			} 
			
		}catch(SQLException e) {
			e.printStackTrace();
		}
		
	}
	
}
