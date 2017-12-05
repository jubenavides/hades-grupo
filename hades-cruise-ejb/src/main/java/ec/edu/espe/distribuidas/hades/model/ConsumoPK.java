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
import javax.validation.constraints.Size;

/**
 *
 * @author Hendrix
 */
@Embeddable
public class ConsumoPK implements Serializable {

    @Basic(optional = false)
    @NotNull
    @Column(name = "COD_ITEM", nullable = false)
    private int codItem;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 10)
    @Column(name = "COD_RESERVA", nullable = false, length = 10)
    private String codReserva;

    public ConsumoPK() {
    }

    public ConsumoPK(int codItem, String codReserva) {
        this.codItem = codItem;
        this.codReserva = codReserva;
    }

    public int getCodItem() {
        return codItem;
    }

    public void setCodItem(int codItem) {
        this.codItem = codItem;
    }

    public String getCodReserva() {
        return codReserva;
    }

    public void setCodReserva(String codReserva) {
        this.codReserva = codReserva;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (int) codItem;
        hash += (codReserva != null ? codReserva.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof ConsumoPK)) {
            return false;
        }
        ConsumoPK other = (ConsumoPK) object;
        if (this.codItem != other.codItem) {
            return false;
        }
        if ((this.codReserva == null && other.codReserva != null) || (this.codReserva != null && !this.codReserva.equals(other.codReserva))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "ec.edu.espe.distribuidas.hades.model.ConsumoPK[ codItem=" + codItem + ", codReserva=" + codReserva + " ]";
    }
    
}
