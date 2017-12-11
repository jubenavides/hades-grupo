/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.distribuidas.hades.model;

import ec.edu.espe.distribuidas.hades.enums.OrdenTipoValorEnum;
import ec.edu.espe.distribuidas.hades.enums.TipoValorEnum;
import java.io.Serializable;
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
@Table(name = "tipo_valor")
public class TipoValor implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Column(name = "COD_TIPO_VALOR", nullable = false, length = 10)
    private String codTipoValor;
    @Column(name = "NOMBRE", nullable = false, length = 100)
    private String nombre;
    @Column(name = "DESCRIPCION", nullable = false, length = 100)
    private String descripcion;
    @Enumerated(EnumType.STRING)
    @Column(name = "TIPO_COBRO", nullable = false, length = 3)
    private TipoValorEnum tipoCobro;
    @Enumerated(EnumType.STRING)
    @Column(name = "ORDEN", nullable = false, length = 3)
    private OrdenTipoValorEnum orden;

    public TipoValor() {
    }

    public TipoValor(String codTipoValor) {
        this.codTipoValor = codTipoValor;
    }

    public String getCodTipoValor() {
        return codTipoValor;
    }

    public void setCodTipoValor(String codTipoValor) {
        this.codTipoValor = codTipoValor;
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

    public OrdenTipoValorEnum getOrden() {
        return orden;
    }

    public void setOrden(OrdenTipoValorEnum orden) {
        this.orden = orden;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (codTipoValor != null ? codTipoValor.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof TipoValor)) {
            return false;
        }
        TipoValor other = (TipoValor) object;
        if ((this.codTipoValor == null && other.codTipoValor != null) || (this.codTipoValor != null && !this.codTipoValor.equals(other.codTipoValor))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "ec.edu.espe.distribuidas.hades.model.TipoValor[ codTipoValor=" + codTipoValor + " ]";
    }
    
}
