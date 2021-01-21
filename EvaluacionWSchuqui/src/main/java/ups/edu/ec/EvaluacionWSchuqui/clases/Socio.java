package ups.edu.ec.EvaluacionWSchuqui.clases;


import java.io.Serializable;
import java.util.Date;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Embeddable;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;

/**
 *
 * @author Ricardo Chuqui
 */
@Entity
public class Socio implements Serializable {

    private static final long serialVersionUID = 1L;


    @Id
    @Column(name = "cedulaSocio")
    private String cedulaSocio;

    @Column(name = "nombreSocio")
    private String nombresSocio;

    @Column(name = "apellidoSocio")
    private String apelidosSocio;

    @Column(name = "ciudadSocio")
    private String ciudadSocio;

 
    @OneToOne(mappedBy = "socio")
    private Cuenta cuenta;

    public Cuenta getCuenta() {
        return cuenta;
    }

    public void setCuenta(Cuenta cuenta) {
        this.cuenta = cuenta;
    }
    

	public String getCedulaSocio() {
        return cedulaSocio;
    }

    public void setCedulaSocio(String cedulaSocio) {
        this.cedulaSocio = cedulaSocio;
    }

    public String getNombresSocio() {
        return nombresSocio;
    }

    public void setNombresSocio(String nombresSocio) {
        this.nombresSocio = nombresSocio;
    }

    public String getApelidosSocio() {
        return apelidosSocio;
    }

    public void setApelidosSocio(String apelidosSocio) {
        this.apelidosSocio = apelidosSocio;
    }


    public String getCiudadSocio() {
        return ciudadSocio;
    }

    public void setCiudadSocio(String ciudadSocio) {
        this.ciudadSocio = ciudadSocio;
    }

	@Override
	public String toString() {
		return "Socio [cedulaSocio=" + cedulaSocio + ", nombresSocio=" + nombresSocio + ", apelidosSocio="
				+ apelidosSocio + ", ciudadSocio=" + ciudadSocio + ", cuenta=" + cuenta + "]";
	}
}
