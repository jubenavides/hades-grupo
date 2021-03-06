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
public class ValorReservaPK implements Serializable {

    @Column(name = "COD_RESERVA", nullable = false, length = 10)
    private String codReserva;

    @Column(name = "COD_TIPO_VALOR", nullable = false, length = 10)
    private String codTipoValor;

    public ValorReservaPK() {
    }

    public ValorReservaPK(String codReserva, String codTipoValor) {
        this.codReserva = codReserva;
        this.codTipoValor = codTipoValor;
    }

    public String getCodReserva() {
        return codReserva;
    }

    public void setCodReserva(String codReserva) {
        this.codReserva = codReserva;
    }

    public String getCodTipoValor() {
        return codTipoValor;
    }

    public void setCodTipoValor(String codTipoValor) {
        this.codTipoValor = codTipoValor;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (codReserva != null ? codReserva.hashCode() : 0);
        hash += (codTipoValor != null ? codTipoValor.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof ValorReservaPK)) {
            return false;
        }
        ValorReservaPK other = (ValorReservaPK) object;
        if ((this.codReserva == null && other.codReserva != null) || (this.codReserva != null && !this.codReserva.equals(other.codReserva))) {
            return false;
        }
        if ((this.codTipoValor == null && other.codTipoValor != null) || (this.codTipoValor != null && !this.codTipoValor.equals(other.codTipoValor))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "ec.edu.espe.distribuidas.hades.model.ValorReservaPK[ codReserva=" + codReserva + ", codTipoValor=" + codTipoValor + " ]";
    }
}
