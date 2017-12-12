/*
 * Hades Cruise
 * Aplicaciones Distribuidas
 * NRC: 2434 
 * Tutor: HENRY RAMIRO CORAL CORAL 
 * 2017 (c) Hades Cruise Corp.
 */
package ec.edu.espe.distribuidas.hades.model;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

/**
 *
 * @author Hades Cruise Corp.
 */
@Entity
@Table(name = "camarote")
public class Camarote implements Serializable {

    private static final long serialVersionUID = 1L;
    
    @EmbeddedId
    protected CamarotePK camarotePK;
    
    @Column(name = "NUMERO", nullable = false)
    private short numero;
    
    @Column(name = "CAPACIDAD", nullable = false)
    private short capacidad;
    
    @Column(name = "UBICACION", length = 100)
    private String ubicacion;
    
    @JoinColumn(name = "COD_CRUCERO", referencedColumnName = "COD_CRUCERO", nullable = false, insertable = false, updatable = false)
    @ManyToOne(optional = false)
    private Crucero crucero;
    
    @JoinColumn(name = "COD_TIPO_CAMAROTE", referencedColumnName = "COD_TIPO_CAMAROTE", nullable = false, insertable = false, updatable = false)
    @ManyToOne(optional = false)
    private TipoCamarote tipoCamarote;

    public Camarote() {
    }

    public Camarote(CamarotePK camarotePK) {
        this.camarotePK = camarotePK;
    }

    public Camarote(Integer codCrucero, Integer codCamarote, String codTipoCamarote) {
        this.camarotePK = new CamarotePK(codCrucero, codCamarote, codTipoCamarote);
    }

    public CamarotePK getCamarotePK() {
        return camarotePK;
    }

    public void setCamarotePK(CamarotePK camarotePK) {
        this.camarotePK = camarotePK;
    }

    public short getNumero() {
        return numero;
    }

    public void setNumero(short numero) {
        this.numero = numero;
    }

    public short getCapacidad() {
        return capacidad;
    }

    public void setCapacidad(short capacidad) {
        this.capacidad = capacidad;
    }

    public String getUbicacion() {
        return ubicacion;
    }

    public void setUbicacion(String ubicacion) {
        this.ubicacion = ubicacion;
    }

    public Crucero getCrucero() {
        return crucero;
    }

    public void setCrucero(Crucero crucero) {
        this.crucero = crucero;
    }

    public TipoCamarote getTipoCamarote() {
        return tipoCamarote;
    }

    public void setTipoCamarote(TipoCamarote tipoCamarote) {
        this.tipoCamarote = tipoCamarote;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (camarotePK != null ? camarotePK.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Camarote)) {
            return false;
        }
        Camarote other = (Camarote) object;
        if ((this.camarotePK == null && other.camarotePK != null) || (this.camarotePK != null && !this.camarotePK.equals(other.camarotePK))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "ec.edu.espe.distribuidas.hades.model.Camarote[ camarotePK=" + camarotePK + " ]";
    }   
}
