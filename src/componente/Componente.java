package componente;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;


@Entity
public class Componente {

	@Id
	private String serie;

	@ManyToOne
	private Marca marca;

	@ManyToOne
	private Modelo modelo;

	@ManyToOne
	private TipoComponente tipo;

	public String getSerie() {
		return serie;
	}

	public void setSerie(String serie) {
		this.serie = serie;
	}

	public Marca getMarca() {
		return marca;
	}

	public void setMarca(Marca marca) {
		this.marca = marca;
	}

	public Modelo getModelo() {
		return modelo;
	}

	public void setModelo(Modelo modelo) {
		this.modelo = modelo;
	}

	public TipoComponente getTipo() {
		return tipo;
	}

	public void setTipo(TipoComponente tipo) {
		this.tipo = tipo;
	}

}
