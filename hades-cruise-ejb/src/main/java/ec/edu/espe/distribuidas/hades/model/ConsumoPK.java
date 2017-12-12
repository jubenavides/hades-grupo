/*
 * Hades Cruise
 * Aplicaciones Distribuidas
 * NRC: 2434 
 * Tutor: HENRY RAMIRO CORAL CORAL 
 * 2017 (c) Hades Cruise Corp.
 */
package ec.edu.espe.distribuidas.hades.model;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Embeddable;

/**
 *
 * @author Hades Cruise Corp.
 */
@Embeddable
public class ConsumoPK implements Serializable {

    @Column(name = "COD_ITEM", nullable = false)
    private Integer codItem;

    @Column(name = "COD_RESERVA", nullable = false, length = 10)
    private String codReserva;

    public ConsumoPK() {
    }

    public ConsumoPK(int codItem, String codReserva) {
        this.codItem = codItem;
        this.codReserva = codReserva;
    }

    public Integer getCodItem() {
        return codItem;
    }

    public void setCodItem(Integer codItem) {
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
