package datos;

import javax.ejb.Stateless;
import javax.inject.Inject;
import javax.persistence.EntityManager;

@Stateless
public class TipoCuentaDAO {

	@Inject
	private EntityManager em;
	
	public void insertarTipoCuenta() {
		
	}
}
