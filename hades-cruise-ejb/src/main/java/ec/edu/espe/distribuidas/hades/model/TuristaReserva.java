/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.distribuidas.hades.model;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

/**
 *
 * @author Hendrix
 */
@Entity
@Table(name = "turista_reserva")
@NamedQueries({
    @NamedQuery(name = "TuristaReserva.findAll", query = "SELECT t FROM TuristaReserva t")})
public class TuristaReserva implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "COD_TURISTA_RESERVA", nullable = false)
    private Integer codTuristaReserva;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 3)
    @Column(name = "TIPO_IDENTIFICACION", nullable = false, length = 3)
    private String tipoIdentificacion;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 15)
    @Column(name = "IDENTIFICACION", nullable = false, length = 15)
    private String identificacion;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 100)
    @Column(name = "NOMBRE", nullable = false, length = 100)
    private String nombre;
    @Basic(optional = false)
    @NotNull
    @Column(name = "FECHA_NACIMIENTO", nullable = false)
    @Temporal(TemporalType.TIMESTAMP)
    private Date fechaNacimiento;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Basic(optional = false)
    @NotNull
    @Column(name = "PESO_MALETA", nullable = false, precision = 4, scale = 2)
    private BigDecimal pesoMaleta;
    @JoinColumn(name = "COD_RESERVA", referencedColumnName = "COD_RESERVA")
    @ManyToOne
    private Reserva codReserva;

    public TuristaReserva() {
    }

    public TuristaReserva(Integer codTuristaReserva) {
        this.codTuristaReserva = codTuristaReserva;
    }

    public TuristaReserva(Integer codTuristaReserva, String tipoIdentificacion, String identificacion, String nombre, Date fechaNacimiento, BigDecimal pesoMaleta) {
        this.codTuristaReserva = codTuristaReserva;
        this.tipoIdentificacion = tipoIdentificacion;
        this.identificacion = identificacion;
        this.nombre = nombre;
        this.fechaNacimiento = fechaNacimiento;
        this.pesoMaleta = pesoMaleta;
    }

    public Integer getCodTuristaReserva() {
        return codTuristaReserva;
    }

    public void setCodTuristaReserva(Integer codTuristaReserva) {
        this.codTuristaReserva = codTuristaReserva;
    }

    public String getTipoIdentificacion() {
        return tipoIdentificacion;
    }

    public void setTipoIdentificacion(String tipoIdentificacion) {
        this.tipoIdentificacion = tipoIdentificacion;
    }

    public String getIdentificacion() {
        return identificacion;
    }

    public void setIdentificacion(String identificacion) {
        this.identificacion = identificacion;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Date getFechaNacimiento() {
        return fechaNacimiento;
    }

    public void setFechaNacimiento(Date fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }

    public BigDecimal getPesoMaleta() {
        return pesoMaleta;
    }

    public void setPesoMaleta(BigDecimal pesoMaleta) {
        this.pesoMaleta = pesoMaleta;
    }

    public Reserva getCodReserva() {
        return codReserva;
    }

    public void setCodReserva(Reserva codReserva) {
        this.codReserva = codReserva;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (codTuristaReserva != null ? codTuristaReserva.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof TuristaReserva)) {
            return false;
        }
        TuristaReserva other = (TuristaReserva) object;
        if ((this.codTuristaReserva == null && other.codTuristaReserva != null) || (this.codTuristaReserva != null && !this.codTuristaReserva.equals(other.codTuristaReserva))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "ec.edu.espe.distribuidas.hades.model.TuristaReserva[ codTuristaReserva=" + codTuristaReserva + " ]";
    }
    
}
