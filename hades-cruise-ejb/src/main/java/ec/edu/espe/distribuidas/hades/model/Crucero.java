/*
 * Hades Cruise
 * Aplicaciones Distribuidas
 * NRC: 2434 
 * Tutor: HENRY RAMIRO CORAL CORAL 
 * 2017 (c) Hades Cruise Corp.
 */
package ec.edu.espe.distribuidas.hades.model;

import ec.edu.espe.distribuidas.hades.enums.TipoCruceroEnum;
import java.io.Serializable;
import java.math.BigDecimal;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 *
 * @author Hades Cruise Corp.
 */
@Entity
@Table(name = "crucero")
public class Crucero implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    @Column(name = "COD_CRUCERO", nullable = false)
    private Integer codigo;

    @Column(name = "REGISTRO", nullable = false, length = 10)
    private String registro;

    @Column(name = "NOMBRE", nullable = false, length = 100)
    private String nombre;

    @Enumerated(EnumType.STRING)
    @Column(name = "TIPO", nullable = false, length = 3)
    private TipoCruceroEnum tipo;

    @Column(name = "CAPACIDAD", precision = 7, scale = 2)
    private BigDecimal capacidad;

    public Crucero() {
    }

    public Crucero(Integer codCrucero) {
        this.codigo = codCrucero;
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
        int hash = 0;
        hash += (codigo != null ? codigo.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Crucero)) {
            return false;
        }
        Crucero other = (Crucero) object;
        if ((this.codigo == null && other.codigo != null) || (this.codigo != null && !this.codigo.equals(other.codigo))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "ec.edu.espe.distribuidas.hades.model.Crucero[ codCrucero=" + codigo + " ]";
    }
}
