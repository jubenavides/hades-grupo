/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.distribuidas.hades.model;

import java.io.Serializable;
import java.util.List;
import javax.persistence.Basic;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

/**
 *
 * @author Hendrix
 */
@Entity
@Table(name = "tipo_valor")
@NamedQueries({
    @NamedQuery(name = "TipoValor.findAll", query = "SELECT t FROM TipoValor t")})
public class TipoValor implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 10)
    @Column(name = "COD_TIPO_VALOR", nullable = false, length = 10)
    private String codTipoValor;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 100)
    @Column(name = "NOMBRE", nullable = false, length = 100)
    private String nombre;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 100)
    @Column(name = "DESCRIPCION", nullable = false, length = 100)
    private String descripcion;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 3)
    @Column(name = "TIPO_COBRO", nullable = false, length = 3)
    private String tipoCobro;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 3)
    @Column(name = "ORDEN", nullable = false, length = 3)
    private String orden;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "tipoValor")
    private List<ValorReserva> valorReservaList;

    public TipoValor() {
    }

    public TipoValor(String codTipoValor) {
        this.codTipoValor = codTipoValor;
    }

    public TipoValor(String codTipoValor, String nombre, String descripcion, String tipoCobro, String orden) {
        this.codTipoValor = codTipoValor;
        this.nombre = nombre;
        this.descripcion = descripcion;
        this.tipoCobro = tipoCobro;
        this.orden = orden;
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

    public String getTipoCobro() {
        return tipoCobro;
    }

    public void setTipoCobro(String tipoCobro) {
        this.tipoCobro = tipoCobro;
    }

    public String getOrden() {
        return orden;
    }

    public void setOrden(String orden) {
        this.orden = orden;
    }

    public List<ValorReserva> getValorReservaList() {
        return valorReservaList;
    }

    public void setValorReservaList(List<ValorReserva> valorReservaList) {
        this.valorReservaList = valorReservaList;
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
