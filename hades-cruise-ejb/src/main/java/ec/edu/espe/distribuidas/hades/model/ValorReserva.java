/*
 * Hades Cruise
 * Aplicaciones Distribuidas
 * NRC: 2434 
 * Tutor: HENRY RAMIRO CORAL CORAL 
 * 2017 (c) Hades Cruise Corp.
 */
package ec.edu.espe.distribuidas.hades.model;

import java.io.Serializable;
import java.math.BigDecimal;
import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

/**
 *
 * @author Hades Cruise Corp.
 */
@Entity
@Table(name = "valor_reserva")
public class ValorReserva implements Serializable {

    private static final long serialVersionUID = 1L;

    @EmbeddedId
    protected ValorReservaPK valorReservaPK;

    @Column(name = "VALOR", nullable = false, precision = 8, scale = 2)
    private BigDecimal valor;

    @ManyToOne
    @JoinColumn(name = "COD_RESERVA", referencedColumnName = "COD_RESERVA", insertable = false, updatable = false)
    private Reserva reserva;

    @ManyToOne
    @JoinColumn(name = "COD_TIPO_VALOR", referencedColumnName = "COD_TIPO_VALOR", insertable = false, updatable = false)
    private TipoValor tipoValor;

    public ValorReserva() {
    }

    public ValorReserva(ValorReservaPK valorReservaPK) {
        this.valorReservaPK = valorReservaPK;
    }

    public ValorReservaPK getValorReservaPK() {
        return valorReservaPK;
    }

    public void setValorReservaPK(ValorReservaPK valorReservaPK) {
        this.valorReservaPK = valorReservaPK;
    }

    public BigDecimal getValor() {
        return valor;
    }

    public void setValor(BigDecimal valor) {
        this.valor = valor;
    }

    public Reserva getReserva() {
        return reserva;
    }

    public void setReserva(Reserva reserva) {
        this.reserva = reserva;
    }

    public TipoValor getTipoValor() {
        return tipoValor;
    }

    public void setTipoValor(TipoValor tipoValor) {
        this.tipoValor = tipoValor;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (valorReservaPK != null ? valorReservaPK.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof ValorReserva)) {
            return false;
        }
        ValorReserva other = (ValorReserva) object;
        if ((this.valorReservaPK == null && other.valorReservaPK != null) || (this.valorReservaPK != null && !this.valorReservaPK.equals(other.valorReservaPK))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "ec.edu.espe.distribuidas.hades.model.ValorReserva[ valorReservaPK=" + valorReservaPK + " ]";
    }
}
