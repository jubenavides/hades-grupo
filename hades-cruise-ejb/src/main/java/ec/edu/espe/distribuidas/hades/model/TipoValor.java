/*
 * Hades Cruise
 * Aplicaciones Distribuidas
 * NRC: 2434 
 * Tutor: HENRY RAMIRO CORAL CORAL 
 * 2017 (c) Hades Cruise Corp.
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
 * @author Hades Cruise Corp.
 */
@Entity
@Table(name = "tipo_valor")
public class TipoValor implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Column(name = "COD_TIPO_VALOR", nullable = false, length = 10)
    private String codigo;

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
        this.codigo = codTipoValor;
    }

    public String getCodTipoValor() {
        return codigo;
    }

    public void setCodTipoValor(String codTipoValor) {
        this.codigo = codTipoValor;
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
        hash += (codigo != null ? codigo.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        //Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof TipoValor)) {
            return false;
        }
        TipoValor other = (TipoValor) object;
        if ((this.codigo == null && other.codigo != null) || (this.codigo != null && !this.codigo.equals(other.codigo))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "ec.edu.espe.distribuidas.hades.model.TipoValor[ codTipoValor=" + codigo + " ]";
    }
}
