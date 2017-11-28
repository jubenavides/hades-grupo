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
public class TourPK {
    
    @Column(name="COD_CRUCERO", length = 5, nullable = false)
    private Integer codCrucero;
    @Column(name="COD_TIPO_TOUR", length = 10, nullable = false)
    private String codTipoTour;
    @Column(name="COD_TOUR", length = 5, nullable = false)
    private Integer codTour;

    public Integer getCodCrucero() {
        return codCrucero;
    }

    public void setCodCrucero(Integer codCrucero) {
        this.codCrucero = codCrucero;
    }

    public String getCodTipoTour() {
        return codTipoTour;
    }

    public void setCodTipoTour(String codTipoTour) {
        this.codTipoTour = codTipoTour;
    }

    public Integer getCodTour() {
        return codTour;
    }

    public void setCodTour(Integer codTour) {
        this.codTour = codTour;
    }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 23 * hash + Objects.hashCode(this.codCrucero);
        hash = 23 * hash + Objects.hashCode(this.codTipoTour);
        hash = 23 * hash + Objects.hashCode(this.codTour);
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
        final TourPK other = (TourPK) obj;
        if (!Objects.equals(this.codTipoTour, other.codTipoTour)) {
            return false;
        }
        if (!Objects.equals(this.codCrucero, other.codCrucero)) {
            return false;
        }
        if (!Objects.equals(this.codTour, other.codTour)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "TourPK{" + "codCrucero=" + codCrucero + ", codTipoTour=" + codTipoTour + ", codTour=" + codTour + '}';
    }
    
    
    
    
    
}
