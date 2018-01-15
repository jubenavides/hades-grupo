/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.distribuidas.hades.model;

import ec.edu.espe.distribuidas.hades.enums.EstadoReservaEnum;
import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinColumns;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 *
 * @author
 */
@Entity
@Table(name = "RESERVA")
public class Reserva implements Serializable {

    @Id
    @Column(name = "COD_RESERVA", nullable = false, length = 10)
    private String codigo;

    @Column(name = "IDENTIFICACION", nullable = false)
    private String identificacion;

    @Column(name = "TIPO_IDENTIFICACION", nullable = false)
    private String tipoIdentificacion;

    @Column(name = "COD_TOUR", nullable = false)
    private Integer codTour;

    @Column(name = "COD_TIPO_TOUR", nullable = false, length = 10)
    private String codTipoTour;

    @Column(name = "COD_CRUCERO", nullable = false)
    private Integer codCrucero;

    @Column(name = "COD_CAMAROTE", nullable = false)
    private Integer codCamarote;

    @Column(name = "COD_TIPO_ALIMENTACION", nullable = false)
    private String codTipoAlimentacion;

    @Column(name = "COD_TIPO_CAMAROTE", nullable = false, length = 10)
    private String codTipoCamarote;

    @Column(name = "VALOR_FINAL", nullable = false, precision = 8, scale = 2)
    private BigDecimal valorFinal;

    @Column(name = "FECHA_EMISION", nullable = false)
    @Temporal(TemporalType.TIMESTAMP)
    private Date fechaEmision;

    @Enumerated(EnumType.STRING)
    @Column(name = "ESTADO", nullable = false, length = 3)
    private EstadoReservaEnum estado;

    @JoinColumn(name = "COD_TIPO_ALIMENTACION", referencedColumnName = "COD_TIPO_ALIMENTACION", insertable = false, updatable = false)
    @ManyToOne
    private TipoAlimentacion tipoAlimentacion;

    @JoinColumns({
        @JoinColumn(name = "IDENTIFICACION", referencedColumnName = "IDENTIFICACION", insertable = false, updatable = false)
        , @JoinColumn(name = "TIPO_IDENTIFICACION", referencedColumnName = "TIPO_IDENTIFICACION", insertable = false, updatable = false)})
    @ManyToOne
    private Cliente cliente;

    @JoinColumns({
        @JoinColumn(name = "COD_TOUR", referencedColumnName = "COD_TOUR", insertable = false, updatable = false)
        , @JoinColumn(name = "COD_TIPO_TOUR", referencedColumnName = "COD_TIPO_TOUR", insertable = false, updatable = false),
        @JoinColumn(name = "COD_CRUCERO", referencedColumnName = "COD_CRUCERO", insertable = false, updatable = false)})
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

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getIdentificacion() {
        return identificacion;
    }

    public void setIdentificacion(String identificacion) {
        this.identificacion = identificacion;
    }

    public String getTipoIdentificacion() {
        return tipoIdentificacion;
    }

    public void setTipoIdentificacion(String tipoIdentificacion) {
        this.tipoIdentificacion = tipoIdentificacion;
    }

    public TipoAlimentacion getTipoAlimentacion() {
        return tipoAlimentacion;
    }

    public void setTipoAlimentacion(TipoAlimentacion tipoAlimentacion) {
        this.tipoAlimentacion = tipoAlimentacion;
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

    public Integer getCodCrucero() {
        return codCrucero;
    }

    public void setCodCrucero(Integer codCrucero) {
        this.codCrucero = codCrucero;
    }

    public Integer getCodCamarote() {
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

    public EstadoReservaEnum getEstado() {
        return estado;
    }

    public void setEstado(EstadoReservaEnum estado) {
        this.estado = estado;
    }

    public String getCodTipoAlimentacion() {
        return codTipoAlimentacion;
    }

    public void setCodTipoAlimentacion(String codTipoAlimentacion) {
        this.codTipoAlimentacion = codTipoAlimentacion;
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

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (codigo != null ? codigo.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Reserva)) {
            return false;
        }
        Reserva other = (Reserva) object;
        if ((this.codigo == null && other.codigo != null) || (this.codigo != null && !this.codigo.equals(other.codigo))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "ec.edu.espe.distribuidas.hades.model.Reserva[ codReserva=" + codigo + " ]";
    }
}
