/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.distribuidas.hades.model;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Embeddable;

/**
 *
 * @author Hendrix
 */
@Embeddable
public class TourPK implements Serializable {

    @Column(name = "COD_TOUR", nullable = false)
    private Integer codTour;
    @Column(name = "COD_TIPO_TOUR", nullable = false, length = 10)
    private String codTipoTour;
    @Column(name = "COD_CRUCERO", nullable = false)
    private Integer codCrucero;

    public TourPK() {
    }

    public TourPK(Integer codTour, String codTipoTour, Integer codCrucero) {
        this.codTour = codTour;
        this.codTipoTour = codTipoTour;
        this.codCrucero = codCrucero;
    }

    public Integer getCodTour() {
        return codTour;
    }

    public void setCodTour(Integer codTour) {
        this.codTour = codTour;
    }

    public String getCodTipoTour() {
        return codTipoTour;
    }

    public void setCodTipoTour(String codTipoTour) {
        this.codTipoTour = codTipoTour;
    }

    public Integer getCodCrucero() {
        return codCrucero;
    }

    public void setCodCrucero(Integer codCrucero) {
        this.codCrucero = codCrucero;
    }

    @Override
    public int hashCode() {
        Integer hash = 0;
        hash += (Integer) codTour;
        hash += (codTipoTour != null ? codTipoTour.hashCode() : 0);
        hash += (Integer) codCrucero;
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof TourPK)) {
            return false;
        }
        TourPK other = (TourPK) object;
        if (this.codTour != other.codTour) {
            return false;
        }
        if ((this.codTipoTour == null && other.codTipoTour != null) || (this.codTipoTour != null && !this.codTipoTour.equals(other.codTipoTour))) {
            return false;
        }
        if (this.codCrucero != other.codCrucero) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "ec.edu.espe.distribuidas.hades.model.TourPK[ codTour=" + codTour + ", codTipoTour=" + codTipoTour + ", codCrucero=" + codCrucero + " ]";
    }
    
}
