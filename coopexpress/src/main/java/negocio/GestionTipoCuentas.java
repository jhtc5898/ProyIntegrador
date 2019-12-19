package negocio;

import java.util.List;

import javax.ejb.Stateless;
import javax.inject.Inject;

import datos.CuentaDAO;
import datos.TipoCuentaDAO;
import modelo.Cuenta;
import modelo.TipoCuenta;

@Stateless
public class GestionTipoCuentas {

	@Inject
	private TipoCuentaDAO tipocuentaDAO;
	
	public void guardar(TipoCuenta tipocuenta) {
		tipocuentaDAO.insertarTipoCuenta(tipocuenta);
	}
	
	public void actualizar(TipoCuenta tipocuenta) {
		tipocuentaDAO.update(tipocuenta);
	}
	
	public void eliminar(int codigo) {
		tipocuentaDAO.remove(codigo);
	}
	
	public List<TipoCuenta> getLibros(){
		return tipocuentaDAO.getTipoCuentas();
	}
	
}
