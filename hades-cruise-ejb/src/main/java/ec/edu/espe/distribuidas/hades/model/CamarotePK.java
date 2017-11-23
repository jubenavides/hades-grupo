/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.distribuidas.hades.model;

import java.util.Objects;
import javax.persistence.Column;
import javax.persistence.Embeddable;

/**
 *
 * @author Hendrix
 */
@Embeddable
public class CamarotePK {
    
    @Column(name="COD_CRUCERO", length = 5, nullable = false)
    private Integer codCrucero;
    @Column(name="COD_CAMAROTE", length = 5, nullable = false)
    private Integer codCamarote;
    @Column(name="COD_TIPO_CAMAROTE", length = 10, nullable = false)
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
        int hash = 5;
        hash = 29 * hash + Objects.hashCode(this.codCrucero);
        hash = 29 * hash + Objects.hashCode(this.codCamarote);
        hash = 29 * hash + Objects.hashCode(this.codTipoCamarote);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final CamarotePK other = (CamarotePK) obj;
        if (!Objects.equals(this.codTipoCamarote, other.codTipoCamarote)) {
            return false;
        }
        if (!Objects.equals(this.codCrucero, other.codCrucero)) {
            return false;
        }
        if (!Objects.equals(this.codCamarote, other.codCamarote)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "CamarotePK{" + "codCrucero=" + codCrucero + ", codCamarote=" + codCamarote + ", codTipoCamarote=" + codTipoCamarote + '}';
    }
    
    
    
    
}
