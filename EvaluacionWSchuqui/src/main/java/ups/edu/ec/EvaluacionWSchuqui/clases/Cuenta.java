package ups.edu.ec.EvaluacionWSchuqui.clases;


import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;


/**
 *
 * @author Ricardo Chuqui
 */


@Entity
public class Cuenta implements Serializable{
    
    
    
    private static final long serialVersionUID = 1L;
    
    @Id
    @Column (name="idCuenta")
    private String idCuenta;
  
    @Column (name="tipoCuenta")
    private String tipoCuenta;
    
    @Column (name="fechaRegistroCuenta")
    private Date fechaRegistroCuenta;
    
     
     @OneToOne 
     @JoinColumn(name="cedulaSocio")
    //@JoinColumn(name="idSocio")
   //  @Column (name="CedulaFK")
    private Socio socio;
     
     @Column(name="saldo")
     private double saldo;
     
     @Column(name="mesesPlazo")
     private  int mesesPlazo;
    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public String getIdCuenta() {
        return idCuenta;
    }

    public void setIdCuenta(String idCuenta) {
        this.idCuenta = idCuenta;
    }

    public String getTipoCuenta() {
        return tipoCuenta;
    }

    public void setTipoCuenta(String tipoCuenta) {
        this.tipoCuenta = tipoCuenta;
    }

    public Date getFechaRegistroCuenta() {
        return fechaRegistroCuenta;
    }

    public void setFechaRegistroCuenta(Date fechaRegistroCuenta) {
        this.fechaRegistroCuenta = fechaRegistroCuenta;
    }

    public Socio getSocio() {
        return socio;
    }

    public void setSocio(Socio socio) {
        this.socio = socio;
    }

    
	public int getMesesPlazo() {
		return mesesPlazo;
	}

	public void setMesesPlazo(int mesesPlazo) {
		this.mesesPlazo = mesesPlazo;
	}

	@Override
	public String toString() {
		return "Cuenta [idCuenta=" + idCuenta + ", tipoCuenta=" + tipoCuenta + ", fechaRegistroCuenta="
				+ fechaRegistroCuenta + ", socio=" + socio + ", saldo=" + saldo + "]";
	}

	//método ingreso
    public boolean ingreso(double n) {
        boolean ingresoCorrecto = true;
        if (n < 0) {
            ingresoCorrecto = false;
        } else {
            saldo = saldo + n;
        }
        return ingresoCorrecto;
    }
  
}
