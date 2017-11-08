package persona;

import javax.persistence.Column;
import javax.persistence.Embedded;
import javax.persistence.Id;
import javax.persistence.MappedSuperclass;

import org.openxava.annotations.Required;
import org.openxava.annotations.Stereotype;
import org.openxava.model.Identifiable;

@MappedSuperclass
public class Persona extends Identifiable {

	@Column(length = 8, unique = true)
	private Long dni;

	@Column(unique = true)
	private String cuil;

	@Embedded
	private Direccion direccion;

	@Required
	private String nombreYApellido;

	@Stereotype("PHOTO")
	private byte[] foto;

	public String getNombreYApellido() {
		return nombreYApellido;
	}

	public void setNombreYApellido(String nombreYApellido) {
		this.nombreYApellido = nombreYApellido;
	}

	public Long getDni() {
		return dni;
	}

	public void setDni(Long dni) {
		this.dni = dni;
	}

	public String getCuil() {
		return cuil;
	}

	public void setCuil(String cuil) {
		this.cuil = cuil;
	}

	public Direccion getDireccion() {
		return direccion;
	}

	public void setDireccion(Direccion direccion) {
		this.direccion = direccion;
	}

	public byte[] getFoto() {
		return foto;
	}

	public void setFoto(byte[] foto) {
		this.foto = foto;
	}

}
