package componente;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

import org.openxava.annotations.DescriptionsList;
import org.openxava.annotations.NoCreate;
import org.openxava.annotations.NoModify;
import org.openxava.annotations.Required;
import org.openxava.annotations.View;
import org.openxava.annotations.Views;

@Entity
@Views({ @View(members = "Datos[tipo;serie];Marca[marca;modelo]") })
public class Componente {

	@Id
	private String serie;

	@ManyToOne
	@DescriptionsList
	private Marca marca;

	@ManyToOne
	@DescriptionsList(depends = "marca", condition = "${marca.id} = ?")
	@NoCreate
	@NoModify
	private Modelo modelo;

	@ManyToOne
	@DescriptionsList
	@Required
	@NoCreate
	@NoModify
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
