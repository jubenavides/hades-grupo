/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.distribuidas.hades.model;

import ec.edu.espe.distribuidas.hades.enums.TipoCruceroEnum;
import java.math.BigDecimal;
import java.util.Objects;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 *
 * @author h201m05
 */
@Entity
@Table(name="TIPO_TOUR")
public class TipoTour {
    @Id
    @Column(name="COD_TIPO_TOUR", length = 10)
    private String codigo;
    @Column(name="NOMBRE", length = 100, nullable = false)
    private String nombre;
    @Column(name="DESCRIPCION", length = 500, nullable = false)
    private String descripcion;
    @Column(name="DURACION", length = 3, nullable = false)
    private Integer duracion;

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public Integer getDuracion() {
        return duracion;
    }

    public void setDuracion(Integer duracion) {
        this.duracion = duracion;
    }

    public TipoTour() {
    }

    public TipoTour(String codigo) {
        this.codigo = codigo;
       
    }

    @Override
    public String toString() {
        return "TipoTour{" + "codigo=" + codigo + ", nombre=" + nombre + ", descripcion=" + descripcion + ", duracion=" + duracion + '}';
    }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 67 * hash + Objects.hashCode(this.codigo);
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
        final TipoTour other = (TipoTour) obj;
        if (!Objects.equals(this.codigo, other.codigo)) {
            return false;
        }
        return true;
    }
     
}
