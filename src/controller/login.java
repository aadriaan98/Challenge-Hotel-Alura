package controller;

public class login {

	String usuario;
	String pass;
	
	public login() {	
		usuario = "";
		pass = "";		
	}

	public String getUsuario() {
		return usuario;
	}

	public void setUsuario(String usuario) {
		this.usuario = usuario;
	}

	public String getPass() {
		return pass;
	}

	public void setPass(String pass) {
		this.pass = pass;
	}
	
	public boolean iniciarSesion() {
		if(getPass().equals("9876") && getUsuario().equals("adrian98")) {
			return true;
		}
		return false;
	}
	
}
