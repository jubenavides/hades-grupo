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
import javax.persistence.Embeddable;

/**
 *
 * @author Hades Cruise Corp.
 */
@Embeddable
public class CamarotePK implements Serializable {

    @Column(name = "COD_CRUCERO", nullable = false)
    private Integer codCrucero;
    
    @Column(name = "COD_CAMAROTE", nullable = false)
    private Integer codCamarote;
    
    @Column(name = "COD_TIPO_CAMAROTE", nullable = false, length = 10)
    private String codTipoCamarote;

    public CamarotePK() {
    }

    public CamarotePK(Integer codCrucero, Integer codCamarote, String codTipoCamarote) {
        this.codCrucero = codCrucero;
        this.codCamarote = codCamarote;
        this.codTipoCamarote = codTipoCamarote;
    }

    public Integer getCodCrucero() {
        return codCrucero;
    }

    public void setCodCrucero(Integer codCrucero) {
        this.codCrucero = codCrucero;
    }

    public Integer getCodCamarote() {
        return codCamarote;
    }

    public void setCodCamarote(Integer codCamarote) {
        this.codCamarote = codCamarote;
    }

    public String getCodTipoCamarote() {
        return codTipoCamarote;
    }

    public void setCodTipoCamarote(String codTipoCamarote) {
        this.codTipoCamarote = codTipoCamarote;
    }

    @Override
    public int hashCode() {
        Integer hash = 0;
        hash += (Integer) codCrucero;
        hash += (Integer) codCamarote;
        hash += (codTipoCamarote != null ? codTipoCamarote.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof CamarotePK)) {
            return false;
        }
        CamarotePK other = (CamarotePK) object;
        if (this.codCrucero != other.codCrucero) {
            return false;
        }
        if (this.codCamarote != other.codCamarote) {
            return false;
        }
        if ((this.codTipoCamarote == null && other.codTipoCamarote != null) || (this.codTipoCamarote != null && !this.codTipoCamarote.equals(other.codTipoCamarote))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "ec.edu.espe.distribuidas.hades.model.CamarotePK[ codCrucero=" + codCrucero + ", codCamarote=" + codCamarote + ", codTipoCamarote=" + codTipoCamarote + " ]";
    }  
}
