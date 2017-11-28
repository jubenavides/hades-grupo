/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.distribuidas.hades.model;

import ec.edu.espe.distribuidas.hades.enums.TipoValorEnum;
import java.util.Objects;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 *
 * @author Eduardo Vera
 */

@Entity
@Table(name = "TIPO_VALOR")
public class TipoValor {
    
    @Id
    @Column(name="COD_TIPO_VALOR", length = 10)
    private String codigo;
    @Column(name="NOMBRE", length = 100, nullable = false)
    private String nombre;
    @Column(name="DESCRIPCION", length = 100, nullable = false)
    private String descripcion;
    
    @Enumerated(EnumType.STRING)
    @Column(name="TIPO_COBRO", length = 3, nullable = false)
    private TipoValorEnum tipoCobro;
    
    @Column(name="ORDEN", length = 3, nullable = false)
    private String orden;

    public TipoValor(String codigo) {
        this.codigo = codigo;
    }

    public TipoValor() {
    }

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

    public TipoValorEnum getTipoCobro() {
        return tipoCobro;
    }

    public void setTipoCobro(TipoValorEnum tipoCobro) {
        this.tipoCobro = tipoCobro;
    }

    public String getOrden() {
        return orden;
    }

    public void setOrden(String orden) {
        this.orden = orden;
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 19 * hash + Objects.hashCode(this.codigo);
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
        final TipoValor other = (TipoValor) obj;
        if (!Objects.equals(this.codigo, other.codigo)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "TipoValor{" + "codigo=" + codigo + ", nombre=" + nombre + ", descripcion=" + descripcion + ", tipoCobro=" + tipoCobro + ", orden=" + orden + '}';
    }

    
}
