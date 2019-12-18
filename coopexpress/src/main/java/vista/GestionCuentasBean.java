package vista;

import javax.annotation.PostConstruct;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import javax.inject.Inject;

import modelo.Cuenta;
import modelo.Usuario;
import negocio.GestionCuentas;

@ManagedBean
@SessionScoped
public class GestionCuentasBean {

	@Inject
	private GestionCuentas gc;
	
	private Cuenta cuenta = new Cuenta();
	
	public String guardar() {
		gc.guardar(cuenta);
		return null;
	}
	
	@PostConstruct
	public void init() {
		cuenta = new Cuenta();
		cuenta.setUsuario(new Usuario());
		
	}
	
	
	

	public Cuenta getCuenta() {
		return cuenta;
	}

	public void setCuenta(Cuenta cuenta) {
		this.cuenta = cuenta;
	}
	
	
}
