/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.distribuidas.hades.model;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;
import java.util.Objects;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 *
 * @author Eliana Vasquez
 */
@Entity
@Table(name = "turista_reserva")
public class TuristaReserva implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Column(name = "COD_TURISTA_RESERVA", nullable = false)
    private Integer codigo;
   
    @Column(name = "TIPO_IDENTIFICACION", nullable = false, length = 3)
    private String tipoIdentificacion;
    
    @Column(name = "IDENTIFICACION", nullable = false, length = 15)
    private String identificacion;

    @Column(name = "NOMBRE", nullable = false, length = 100)
    private String nombre;

    @Column(name = "FECHA_NACIMIENTO", nullable = false)
    @Temporal(TemporalType.TIMESTAMP)
    private Date fechaNacimiento;

    @Column(name = "PESO_MALETA", nullable = false, precision = 4, scale = 2)
    private BigDecimal pesoMaleta;

    @ManyToOne
    @JoinColumn(name = "COD_RESERVA", referencedColumnName = "COD_RESERVA")
    private Reserva codReserva;

    public TuristaReserva() {
    }

    public TuristaReserva(Integer codTuristaReserva) {
        this.codigo = codTuristaReserva;
    }

    public Integer getCodigo() {
        return codigo;
    }

    public void setCodigo(Integer codigo) {
        this.codigo = codigo;
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
        int hash = 7;
        hash = 47 * hash + Objects.hashCode(this.codigo);
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
        final TuristaReserva other = (TuristaReserva) obj;
        if (!Objects.equals(this.codigo, other.codigo)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "TuristaReserva{" + "codigo=" + codigo + ", tipoIdentificacion=" + tipoIdentificacion + ", identificacion=" + identificacion + ", nombre=" + nombre + ", fechaNacimiento=" + fechaNacimiento + ", pesoMaleta=" + pesoMaleta + ", codReserva=" + codReserva + '}';
    }

    
    
}
