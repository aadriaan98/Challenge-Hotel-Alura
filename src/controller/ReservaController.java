package controller;

import java.sql.Connection;

import dao.ReservaDAO;
import factory.ConnectionFactory;
import model.ReservaModel;

public class ReservaController {
	
	private ReservaDAO reservaDao;
	
	public ReservaController() {
		
		Connection con = new ConnectionFactory().conectar();
		this.reservaDao = new ReservaDAO(con);
		
	}

	
	public void guardar (ReservaModel reserva) {
		this.reservaDao.guardarReserva(reserva);
	}
	
	
}
