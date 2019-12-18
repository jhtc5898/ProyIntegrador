package modelo;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Cuenta {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name = "codigo_cuenta")
	private int codigo_cuenta;
	
	@Column(name = "numero_cuenta")
	private String numero_cuenta;
	
	@Column(name = "saldo_cuenta")
	private double saldo_cuenta;

	public int getCodigo_cuenta() {
		return codigo_cuenta;
	}

	public void setCodigo_cuenta(int codigo_cuenta) {
		this.codigo_cuenta = codigo_cuenta;
	}

	public String getNumero_cuenta() {
		return numero_cuenta;
	}

	public void setNumero_cuenta(String numero_cuenta) {
		this.numero_cuenta = numero_cuenta;
	}

	public double getSaldo_cuenta() {
		return saldo_cuenta;
	}

	public void setSaldo_cuenta(double saldo_cuenta) {
		this.saldo_cuenta = saldo_cuenta;
	}

	@Override
	public String toString() {
		return "Cuenta [codigo_cuenta=" + codigo_cuenta + ", numero_cuenta=" + numero_cuenta + ", saldo_cuenta="
				+ saldo_cuenta + "]";
	}
	
	
	

}
