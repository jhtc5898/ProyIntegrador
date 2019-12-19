package vista;


import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import javax.inject.Inject;


import modelo.TipoCuenta;


import negocio.GestionTipoCuentas;

@ManagedBean
@SessionScoped
public class GestionTipoCuentasBean {

	@Inject
	private GestionTipoCuentas gtc;
	
	private TipoCuenta tipocuenta = new TipoCuenta();
	
	public String guardar() {
		gtc.guardar(tipocuenta);
		return null;
	}

	public GestionTipoCuentas getGtc() {
		return gtc;
	}

	public void setGtc(GestionTipoCuentas gtc) {
		this.gtc = gtc;
	}

	public TipoCuenta getTipocuenta() {
		return tipocuenta;
	}

	public void setTipocuenta(TipoCuenta tipocuenta) {
		this.tipocuenta = tipocuenta;
	}
	

	
	
}
