package myApp;

// Generated 21-feb-2015 12:11:17 by Hibernate Tools 3.4.0.CR1

import java.util.HashSet;
import java.util.Set;

/**
 * Universidad generated by hbm2java
 */
public class Universidad implements java.io.Serializable {

	private Integer idUniversidad;
	private String nombreUniversidad;
	private String descripcion;
	private String paginaWeb;
	private Set centros = new HashSet(0);

	public Universidad() {
	}

	public Universidad(String nombreUniversidad) {
		this.nombreUniversidad = nombreUniversidad;
	}

	public Universidad(String nombreUniversidad, String descripcion,
			String paginaWeb, Set centros) {
		this.nombreUniversidad = nombreUniversidad;
		this.descripcion = descripcion;
		this.paginaWeb = paginaWeb;
		this.centros = centros;
	}

	public Integer getIdUniversidad() {
		return this.idUniversidad;
	}

	public void setIdUniversidad(Integer idUniversidad) {
		this.idUniversidad = idUniversidad;
	}

	public String getNombreUniversidad() {
		return this.nombreUniversidad;
	}

	public void setNombreUniversidad(String nombreUniversidad) {
		this.nombreUniversidad = nombreUniversidad;
	}

	public String getDescripcion() {
		return this.descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	public String getPaginaWeb() {
		return this.paginaWeb;
	}

	public void setPaginaWeb(String paginaWeb) {
		this.paginaWeb = paginaWeb;
	}

	public Set getCentros() {
		return this.centros;
	}

	public void setCentros(Set centros) {
		this.centros = centros;
	}

}
