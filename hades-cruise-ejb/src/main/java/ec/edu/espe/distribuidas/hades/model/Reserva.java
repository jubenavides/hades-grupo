/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.distribuidas.hades.model;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinColumns;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 *
 * @author Hendrix
 */
@Entity
@Table(name = "RESERVA")
public class Reserva implements Serializable {

    
    @Id
    @Column(name = "COD_RESERVA", nullable = false, length = 10)
    private String codReserva;
    @Column(name = "COD_TOUR", nullable = false)
    private Integer codTour;

    @Column(name = "COD_TIPO_TOUR", nullable = false, length = 10)
    private String codTipoTour;

    @Column(name = "COD_CRUCERO", nullable = false)
    private Integer codCrucero;

    @Column(name = "COD_CAMAROTE", nullable = false)
    private Integer codCamarote;

    @Column(name = "COD_TIPO_CAMAROTE", nullable = false, length = 10)
    private String codTipoCamarote;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation

    @Column(name = "VALOR_FINAL", nullable = false, precision = 8, scale = 2)
    private BigDecimal valorFinal;

    @Column(name = "FECHA_EMISION", nullable = false)
    @Temporal(TemporalType.TIMESTAMP)
    private Date fechaEmision;

    @Column(name = "ESTADO", nullable = false, length = 3)
    private String estado;

    @JoinColumn(name = "COD_TIPO_ALIMENTACION", referencedColumnName = "COD_TIPO_ALIMENTACION", insertable = false, updatable = false)
    @ManyToOne
    private TipoAlimentacion codTipoAlimentacion;
    @JoinColumns({
        @JoinColumn(name = "IDENTIFICACION", referencedColumnName = "IDENTIFICACION", insertable = false, updatable = false)
        , @JoinColumn(name = "TIPO_IDENTIFICACION", referencedColumnName = "TIPO_IDENTIFICACION", insertable = false, updatable = false)})
    @ManyToOne
    private Cliente cliente;
    
    @JoinColumns({
        @JoinColumn(name = "COD_TOUR", referencedColumnName = "COD_TOUR", insertable = false, updatable = false)
        , @JoinColumn(name = "COD_TIPO_TOUR", referencedColumnName = "COD_TIPO_TOUR", insertable = false, updatable = false)})
    @ManyToOne
    private Tour tour;
    
    @JoinColumns({
        @JoinColumn(name = "COD_CAMAROTE", referencedColumnName = "COD_CAMAROTE", insertable = false, updatable = false)
        , @JoinColumn(name = "COD_CRUCERO", referencedColumnName = "COD_CRUCERO", insertable = false, updatable = false)
        , @JoinColumn(name = "COD_TIPO_CAMAROTE", referencedColumnName = "COD_TIPO_CAMAROTE", insertable = false, updatable = false)})
    @ManyToOne
    private Camarote camarote;

    public Reserva() {
    }

    public Reserva(String codReserva) {
        this.codReserva = codReserva;
    }



    public String getCodReserva() {
        return codReserva;
    }

    public void setCodReserva(String codReserva) {
        this.codReserva = codReserva;
    }

    public int getCodTour() {
        return codTour;
    }

    public void setCodTour(int codTour) {
        this.codTour = codTour;
    }

    public String getCodTipoTour() {
        return codTipoTour;
    }

    public void setCodTipoTour(String codTipoTour) {
        this.codTipoTour = codTipoTour;
    }

    public int getCodCrucero() {
        return codCrucero;
    }

    public void setCodCrucero(int codCrucero) {
        this.codCrucero = codCrucero;
    }

    public int getCodCamarote() {
        return codCamarote;
    }

    public void setCodCamarote(int codCamarote) {
        this.codCamarote = codCamarote;
    }

    public String getCodTipoCamarote() {
        return codTipoCamarote;
    }

    public void setCodTipoCamarote(String codTipoCamarote) {
        this.codTipoCamarote = codTipoCamarote;
    }

    public BigDecimal getValorFinal() {
        return valorFinal;
    }

    public void setValorFinal(BigDecimal valorFinal) {
        this.valorFinal = valorFinal;
    }

    public Date getFechaEmision() {
        return fechaEmision;
    }

    public void setFechaEmision(Date fechaEmision) {
        this.fechaEmision = fechaEmision;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public Tour getTour() {
        return tour;
    }

    public void setTour(Tour tour) {
        this.tour = tour;
    }

    public Camarote getCamarote() {
        return camarote;
    }

    public void setCamarote(Camarote camarote) {
        this.camarote = camarote;
    }




    public TipoAlimentacion getCodTipoAlimentacion() {
        return codTipoAlimentacion;
    }

    public void setCodTipoAlimentacion(TipoAlimentacion codTipoAlimentacion) {
        this.codTipoAlimentacion = codTipoAlimentacion;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (codReserva != null ? codReserva.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Reserva)) {
            return false;
        }
        Reserva other = (Reserva) object;
        if ((this.codReserva == null && other.codReserva != null) || (this.codReserva != null && !this.codReserva.equals(other.codReserva))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "ec.edu.espe.distribuidas.hades.model.Reserva[ codReserva=" + codReserva + " ]";
    }
    
}
