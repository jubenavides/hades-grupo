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
 * @author Hendrix
 */
@Entity
@Table(name="CRUCERO")
public class Crucero {
    
    @Id
    @Column(name="COD_CRUCERO", length = 5)
    private Integer codigo;
    @Column(name="REGISTRO", length = 10, nullable = false)
    private String registro;
    @Column(name="NOMBRE", length = 100, nullable = false)
    private String nombre;
    
    @Enumerated(EnumType.STRING)
    @Column(name="TIPO", length = 3, nullable = false)
    private TipoCruceroEnum tipo;
    
    @Column(name="CAPACIDAD", precision = 7, scale =2)
    private BigDecimal capacidad;

    public Crucero() {
        
    }
    public Crucero(Integer codigo) {
        this.codigo = codigo;
    }

    public Integer getCodigo() {
        return codigo;
    }

    public void setCodigo(Integer codigo) {
        this.codigo = codigo;
    }

    public String getRegistro() {
        return registro;
    }

    public void setRegistro(String registro) {
        this.registro = registro;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public TipoCruceroEnum getTipo() {
        return tipo;
    }

    public void setTipo(TipoCruceroEnum tipo) {
        this.tipo = tipo;
    }

    

    public BigDecimal getCapacidad() {
        return capacidad;
    }

    public void setCapacidad(BigDecimal capacidad) {
        this.capacidad = capacidad;
    }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 89 * hash + Objects.hashCode(this.codigo);
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
        final Crucero other = (Crucero) obj;
        if (!Objects.equals(this.codigo, other.codigo)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Crucero{" + "codigo=" + codigo + ", registro=" + registro + ", nombre=" + nombre + ", tipo=" + tipo + '}';
    }
    
    
    
}
