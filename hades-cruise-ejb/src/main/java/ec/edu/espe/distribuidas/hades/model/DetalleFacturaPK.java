/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.distribuidas.hades.model;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Embeddable;
import javax.validation.constraints.NotNull;

/**
 *
 * @author Hendrix
 */
@Embeddable
public class DetalleFacturaPK implements Serializable {

    @Basic(optional = false)
    @NotNull
    @Column(name = "COD_DETALLE", nullable = false)
    private int codDetalle;
    @Basic(optional = false)
    @NotNull
    @Column(name = "COD_FACTURA", nullable = false)
    private int codFactura;

    public DetalleFacturaPK() {
    }

    public DetalleFacturaPK(int codDetalle, int codFactura) {
        this.codDetalle = codDetalle;
        this.codFactura = codFactura;
    }

    public int getCodDetalle() {
        return codDetalle;
    }

    public void setCodDetalle(int codDetalle) {
        this.codDetalle = codDetalle;
    }

    public int getCodFactura() {
        return codFactura;
    }

    public void setCodFactura(int codFactura) {
        this.codFactura = codFactura;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (int) codDetalle;
        hash += (int) codFactura;
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof DetalleFacturaPK)) {
            return false;
        }
        DetalleFacturaPK other = (DetalleFacturaPK) object;
        if (this.codDetalle != other.codDetalle) {
            return false;
        }
        if (this.codFactura != other.codFactura) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "ec.edu.espe.distribuidas.hades.model.DetalleFacturaPK[ codDetalle=" + codDetalle + ", codFactura=" + codFactura + " ]";
    }
    
}