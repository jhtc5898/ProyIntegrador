package vista;


import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import javax.inject.Inject;


import modelo.Tipo_Cuenta;


import negocio.GestionTipoCuentas;

@ManagedBean
@SessionScoped
public class GestionTipoCuentasBean {

	@Inject
	private GestionTipoCuentas gtc;
	
	private Tipo_Cuenta tipo_cuenta = new Tipo_Cuenta();
	
	public String guardar() {
		gtc.guardar(tipo_cuenta);
		return null;
	}

	public GestionTipoCuentas getGtc() {
		return gtc;
	}

	public void setGtc(GestionTipoCuentas gtc) {
		this.gtc = gtc;
	}

	public Tipo_Cuenta getTipocuenta() {
		return tipo_cuenta;
	}

	public void setTipocuenta(Tipo_Cuenta tipocuenta) {
		this.tipo_cuenta = tipocuenta;
	}
	

	
	
}
