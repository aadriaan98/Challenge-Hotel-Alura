package model;

import java.sql.Date;

public class ReservaModel {
	private Integer id;
	
	private Date fechaEntrada;
	private Date fechaSalida;
	private String formaPago;
	private String valor;
	
	public ReservaModel(Date fechaEntrada, Date fechaSalida, String formaPago, String valor) {
		super();
		this.fechaEntrada = fechaEntrada;
		this.fechaSalida = fechaSalida;
		this.formaPago = formaPago;
		this.valor = valor;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Date getFechaEntrada() {
		return fechaEntrada;
	}

	public Date getFechaSalida() {
		return fechaSalida;
	}

	public String getFormaPago() {
		return formaPago;
	}

	public String getValor() {
		return valor;
	}
}
