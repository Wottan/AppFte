package persona;

import javax.persistence.Column;
import javax.persistence.Embedded;
import javax.persistence.Entity;

import org.openxava.annotations.NoFrame;
import org.openxava.annotations.Required;
import org.openxava.annotations.Stereotype;
import org.openxava.model.Identifiable;

@Entity
public class Persona extends Identifiable {

	@Column(length = 8, unique = true)
	@Required
	private Long dni;

	@Column(length = 11, unique = true)
	@Required
	private String cuil;

	@Embedded
	@NoFrame
	private Direccion direccion;

	@Required
	private String nombreYApellido;

	@Stereotype("PHOTO")
	private byte[] foto;

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

	public String getNombreYApellido() {
		return nombreYApellido;
	}

	public void setNombreYApellido(String nombreYApellido) {
		this.nombreYApellido = nombreYApellido;
	}

	public byte[] getFoto() {
		return foto;
	}

	public void setFoto(byte[] foto) {
		this.foto = foto;
	}

}
