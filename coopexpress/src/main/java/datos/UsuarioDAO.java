package datos;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class UsuarioDAO {
	
@Id
@Column(name="cedula_usuario")
private String cedula;

@Column(name="nombre_usuario")
private String nombre;

@Column(name="apellido_usuario")
private String apellido;

@Column(name="telefono_usuario")
private String telefono;

@Column(name="direccion_usuario")
private String direccion;

@Column(name="usuario_correo")
private String correo;

	
}
