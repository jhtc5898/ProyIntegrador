package negocio;

import java.util.List;

import javax.ejb.Stateless;
import javax.inject.Inject;

import datos.CuentaDAO;
import datos.TipoCuentaDAO;
import modelo.Cuenta;
import modelo.Tipo_Cuenta;

@Stateless
public class GestionTipoCuentas {

	@Inject
	private TipoCuentaDAO tipocuentaDAO;
	
	public void guardar(Tipo_Cuenta tipo_cuenta) {
		tipocuentaDAO.insertarTipoCuenta(tipo_cuenta);
	}
	
	public void actualizar(Tipo_Cuenta tipo_cuenta) {
		tipocuentaDAO.update(tipo_cuenta);
	}
	
	public void eliminar(int codigo) {
		tipocuentaDAO.remove(codigo);
	}
	
	public List<Tipo_Cuenta> getLibros(){
		return tipocuentaDAO.getTipoCuentas();
	}
	
}
