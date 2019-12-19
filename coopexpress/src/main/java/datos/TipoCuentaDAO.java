package datos;

import java.util.List;

import javax.ejb.Stateless;
import javax.inject.Inject;
import javax.persistence.EntityManager;
import javax.persistence.Query;

import modelo.Cuenta;
import modelo.TipoCuenta;

@Stateless
public class TipoCuentaDAO {

	@Inject
	private EntityManager em;
	
	
	public void insertarTipoCuenta(TipoCuenta tipocuenta  ) {
		em.persist(tipocuenta);
	}
	
	public void update(TipoCuenta tipocuenta) {
		em.merge(tipocuenta);
	}
	
	public void remove(int codigo) {
		em.remove(this.read(codigo));
	}
	
	public TipoCuenta read(int codigo) {
		return em.find(TipoCuenta.class, codigo);
	}
	public List<TipoCuenta> getTipoCuentas(){
		String jpql = "SELECT l FROM TipoCuenta l";
		Query q = em.createQuery(jpql, TipoCuenta.class);
		
		List<TipoCuenta> tipocuentas = q.getResultList();
		
		return tipocuentas;
	}
	
}
