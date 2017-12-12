/*
 * Hades Cruise
 * Aplicaciones Distribuidas
 * NRC: 2434 
 * Tutor: HENRY RAMIRO CORAL CORAL 
 * 2017 (c) Hades Cruise Corp.
 */
package ec.edu.espe.distribuidas.hades.model;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;
import java.util.Objects;
import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 *
 * @author Hades Cruise Corp.
 */
@Entity
@Table(name = "tour")
public class Tour implements Serializable {

    private static final long serialVersionUID = 1L;

    @EmbeddedId
    protected TourPK tourPK;

    @Column(name = "NOMBRE", nullable = false, length = 200)
    private String nombre;

    @Column(name = "DURACION", nullable = false)
    private Integer duracion;

    @Column(name = "FECHA_INICIO", nullable = false)
    @Temporal(TemporalType.TIMESTAMP)
    private Date fechaInicio;

    @Column(name = "FECHA_FIN", nullable = false)
    @Temporal(TemporalType.TIMESTAMP)
    private Date fechaFin;

    @Column(name = "PUERTO_EMBARQUE", nullable = false, length = 100)
    private String puertoEmbarque;

    @Column(name = "PUERTO_DESEMBARQUE", nullable = false, length = 100)
    private String puertoDesembarque;

    @Column(name = "PRECIO_BASE", nullable = false, precision = 8, scale = 2)
    private BigDecimal precioBase;

    @Column(name = "PORCENTAJE_MENU", nullable = false)
    private Integer porcentajeMenu;

    @JoinColumn(name = "COD_TIPO_TOUR", referencedColumnName = "COD_TIPO_TOUR", nullable = false, insertable = false, updatable = false)
    @ManyToOne(optional = false)
    private TipoTour tipoTour;

    @JoinColumn(name = "COD_CRUCERO", referencedColumnName = "COD_CRUCERO", nullable = false, insertable = false, updatable = false)
    @ManyToOne(optional = false)
    private Crucero crucero;

    public Tour() {
    }

    public Tour(TourPK tourPK) {
        this.tourPK = tourPK;
    }

    public Tour(Integer codTour, String codTipoTour, Integer codCrucero) {
        this.tourPK = new TourPK(codTour, codTipoTour, codCrucero);
    }

    public TourPK getTourPK() {
        return tourPK;
    }

    public void setTourPK(TourPK tourPK) {
        this.tourPK = tourPK;
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

    public Date getFechaInicio() {
        return fechaInicio;
    }

    public void setFechaInicio(Date fechaInicio) {
        this.fechaInicio = fechaInicio;
    }

    public Date getFechaFin() {
        return fechaFin;
    }

    public void setFechaFin(Date fechaFin) {
        this.fechaFin = fechaFin;
    }

    public String getPuertoEmbarque() {
        return puertoEmbarque;
    }

    public void setPuertoEmbarque(String puertoEmbarque) {
        this.puertoEmbarque = puertoEmbarque;
    }

    public String getPuertoDesembarque() {
        return puertoDesembarque;
    }

    public void setPuertoDesembarque(String puertoDesembarque) {
        this.puertoDesembarque = puertoDesembarque;
    }

    public BigDecimal getPrecioBase() {
        return precioBase;
    }

    public void setPrecioBase(BigDecimal precioBase) {
        this.precioBase = precioBase;
    }

    public Integer getPorcentajeMenu() {
        return porcentajeMenu;
    }

    public void setPorcentajeMenu(Integer porcentajeMenu) {
        this.porcentajeMenu = porcentajeMenu;
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
        int hash = 0;
        hash += (tourPK != null ? tourPK.hashCode() : 0);
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
        if (!Objects.equals(this.nombre, other.nombre)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Tour{" + "tourPK=" + tourPK + ", nombre=" + nombre + ", duracion=" + duracion + ", fechaInicio=" + fechaInicio + ", fechaFin=" + fechaFin + ", puertoEmbarque=" + puertoEmbarque + ", puertoDesembarque=" + puertoDesembarque + ", precioBase=" + precioBase + ", porcentajeMenu=" + porcentajeMenu + ", tipoTour=" + tipoTour + ", crucero=" + crucero + '}';
    }
}
