/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.distribuidas.hades.model;

import java.io.Serializable;
import java.math.BigDecimal;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;

/**
 *
 * @author Hendrix
 */
@Entity
@Table(name = "valor_reserva")
@NamedQueries({
    @NamedQuery(name = "ValorReserva.findAll", query = "SELECT v FROM ValorReserva v")})
public class ValorReserva implements Serializable {

    private static final long serialVersionUID = 1L;
    @EmbeddedId
    protected ValorReservaPK valorReservaPK;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Basic(optional = false)
    @NotNull
    @Column(name = "VALOR", nullable = false, precision = 8, scale = 2)
    private BigDecimal valor;
    @JoinColumn(name = "COD_RESERVA", referencedColumnName = "COD_RESERVA", nullable = false, insertable = false, updatable = false)
    @ManyToOne(optional = false)
    private Reserva reserva;
    @JoinColumn(name = "COD_TIPO_VALOR", referencedColumnName = "COD_TIPO_VALOR", nullable = false, insertable = false, updatable = false)
    @ManyToOne(optional = false)
    private TipoValor tipoValor;

    public ValorReserva() {
    }

    public ValorReserva(ValorReservaPK valorReservaPK) {
        this.valorReservaPK = valorReservaPK;
    }

    public ValorReserva(ValorReservaPK valorReservaPK, BigDecimal valor) {
        this.valorReservaPK = valorReservaPK;
        this.valor = valor;
    }

    public ValorReserva(String codReserva, String codTipoValor) {
        this.valorReservaPK = new ValorReservaPK(codReserva, codTipoValor);
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
