package datos;

import java.util.List;

import javax.ejb.Stateless;
import javax.inject.Inject;
import javax.persistence.EntityManager;
import javax.persistence.Query;

import modelo.Cuenta;

@Stateless
public class CuentaDAO {

	@Inject
	private EntityManager em;
	
	public void insert(Cuenta cuenta) {
		em.persist(cuenta);
	}
	
	public void update(Cuenta cuenta) {
		em.merge(cuenta);
		
	}
	
	public void remove(int codigo) {
		Cuenta cuenta  = this.read(codigo);
		em.remove(cuenta);
	}
	public Cuenta read(int codigo) {
		Cuenta c = em.find(Cuenta.class, codigo);
		return c;
	}
	
	public List<Cuenta> getCuentas(){
		String jpql = "SELECT c FROM cuenta";
		Query q = em.createQuery(jpql,Cuenta.class);
		
		List<Cuenta> cuentas = q.getResultList();
		return cuentas;
	}
	
	public Cuenta getCuentaNombre(int numeroCuenta){
		String jpql = "SELECT c FROM Cuenta c WHERE numero_cuenta LIKE ?1";
		Query q = em.createQuery(jpql,Cuenta.class);
		
		Cuenta c = (Cuenta) q.getSingleResult();
		
		return c;
	}
	
}
