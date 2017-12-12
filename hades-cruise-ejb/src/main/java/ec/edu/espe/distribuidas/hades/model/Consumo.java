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
import java.util.Date;
import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 *
 * @author Hades Cruise Corp.
 */
@Entity
public class Consumo implements Serializable {

    private static final long serialVersionUID = 1L;
    
    @EmbeddedId
    protected ConsumoPK consumoPK;
    
    @Column(name = "CANTIDAD")
    private Integer cantidad;
    
    @Column(name = "VALOR", precision = 8, scale = 2)
    private BigDecimal valor;
    
    @Column(name = "FECHA")
    @Temporal(TemporalType.TIMESTAMP)
    private Date fecha;
    
    @Column(name = "REFERENCIA", length = 100)
    private String referencia;
    
    @JoinColumn(name = "COD_ITEM", referencedColumnName = "COD_ITEM", nullable = false, insertable = false, updatable = false)
    @ManyToOne(optional = false)
    private Menu menu;
    
    @JoinColumn(name = "COD_RESERVA", referencedColumnName = "COD_RESERVA", nullable = false, insertable = false, updatable = false)
    @ManyToOne(optional = false)
    private Reserva reserva;

    public Consumo() {
    }

    public Consumo(ConsumoPK consumoPK) {
        this.consumoPK = consumoPK;
    }

    public Consumo(Integer codItem, String codReserva) {
        this.consumoPK = new ConsumoPK(codItem, codReserva);
    }

    public ConsumoPK getConsumoPK() {
        return consumoPK;
    }

    public void setConsumoPK(ConsumoPK consumoPK) {
        this.consumoPK = consumoPK;
    }

    public Integer getCantidad() {
        return cantidad;
    }

    public void setCantidad(Integer cantidad) {
        this.cantidad = cantidad;
    }

    public BigDecimal getValor() {
        return valor;
    }

    public void setValor(BigDecimal valor) {
        this.valor = valor;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public String getReferencia() {
        return referencia;
    }

    public void setReferencia(String referencia) {
        this.referencia = referencia;
    }

    public Menu getMenu() {
        return menu;
    }

    public void setMenu(Menu menu) {
        this.menu = menu;
    }

    public Reserva getReserva() {
        return reserva;
    }

    public void setReserva(Reserva reserva) {
        this.reserva = reserva;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (consumoPK != null ? consumoPK.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Consumo)) {
            return false;
        }
        Consumo other = (Consumo) object;
        if ((this.consumoPK == null && other.consumoPK != null) || (this.consumoPK != null && !this.consumoPK.equals(other.consumoPK))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "ec.edu.espe.distribuidas.hades.model.Consumo[ consumoPK=" + consumoPK + " ]";
    }

}
