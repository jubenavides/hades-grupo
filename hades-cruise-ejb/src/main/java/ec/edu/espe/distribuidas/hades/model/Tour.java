/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.distribuidas.hades.model;

import java.util.Date;
import java.util.List;
import java.util.Objects;
import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.MappedSuperclass;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 *
 * @author Hendrix
 */
@Entity
@Table(name = "TOUR")
public class Tour {
    @EmbeddedId
    private TourPK pk;
    @Column(name = "NOMBRE", length = 200, nullable = false)
    private String nombre;
    @Column(name = "DURACION", length = 3, nullable = false)
    private Integer duracion;
    @Temporal(TemporalType.TIMESTAMP)
    @Column(name = "FECHA_INICIO", nullable = false)
    private Date fechaIncio;
    @Temporal(TemporalType.TIMESTAMP)
    @Column(name = "FECHA_FIN", nullable = false)
    private Date fechaFin;
    
    @ManyToOne
    @JoinColumn(name="COD_TIPO_TOUR", referencedColumnName = "COD_TIPO_TOUR", insertable = false, updatable = false)
    private TipoTour tipoTour;
    @ManyToOne
    @JoinColumn(name="COD_CRUCERO", referencedColumnName = "COD_CRUCERO", insertable = false, updatable = false)
    private Crucero crucero;
    
    @OneToMany(mappedBy = "tour")
    private List<Reserva> reservas;

    public TourPK getPk() {
        return pk;
    }

    public void setPk(TourPK pk) {
        this.pk = pk;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Integer getDuracion() {
        return duracion;
    }

    public void setDuracion(Integer duracion) {
        this.duracion = duracion;
    }

    public Date getFechaIncio() {
        return fechaIncio;
    }

    public void setFechaIncio(Date fechaIncio) {
        this.fechaIncio = fechaIncio;
    }

    public Date getFechaFin() {
        return fechaFin;
    }

    public void setFechaFin(Date fechaFin) {
        this.fechaFin = fechaFin;
    }

    public TipoTour getTipoTour() {
        return tipoTour;
    }

    public void setTipoTour(TipoTour tipoTour) {
        this.tipoTour = tipoTour;
    }

    public Crucero getCrucero() {
        return crucero;
    }

    public void setCrucero(Crucero crucero) {
        this.crucero = crucero;
    }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 29 * hash + Objects.hashCode(this.pk);
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
        final Tour other = (Tour) obj;
        if (!Objects.equals(this.pk, other.pk)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Tour{" + "pk=" + pk + ", nombre=" + nombre + ", duracion=" + duracion + ", fechaIncio=" + fechaIncio + ", fechaFin=" + fechaFin + '}';
    }

    
    
    
    
}
