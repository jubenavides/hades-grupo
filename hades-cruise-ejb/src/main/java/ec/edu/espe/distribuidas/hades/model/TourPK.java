/*
 * Hades Cruise
 * Aplicaciones Distribuidas
 * NRC: 2434 
 * Tutor: HENRY RAMIRO CORAL CORAL 
 * 2017 (c) Hades Cruise Corp.
 */
package ec.edu.espe.distribuidas.hades.model;

import java.io.Serializable;
import java.util.Objects;
import javax.persistence.Column;
import javax.persistence.Embeddable;

/**
 *
 * @author Hades Cruise Corp.
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

        if (!Objects.equals(this.codTour, other.codTour)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "TourPK{" + "codTour=" + codTour + ", codTipoTour=" + codTipoTour + ", codCrucero=" + codCrucero + '}';
    }
}
