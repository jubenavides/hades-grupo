/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.distribuidas.hades.model;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;
import java.util.List;
import javax.persistence.Basic;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinColumns;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

/**
 *
 * @author Hendrix
 */
@Entity
@Table(name = "reserva")
@NamedQueries({
    @NamedQuery(name = "Reserva.findAll", query = "SELECT r FROM Reserva r")})
public class Reserva implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 10)
    @Column(name = "COD_RESERVA", nullable = false, length = 10)
    private String codReserva;
    @Basic(optional = false)
    @NotNull
    @Column(name = "COD_TOUR", nullable = false)
    private int codTour;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 10)
    @Column(name = "COD_TIPO_TOUR", nullable = false, length = 10)
    private String codTipoTour;
    @Basic(optional = false)
    @NotNull
    @Column(name = "COD_CRUCERO", nullable = false)
    private int codCrucero;
    @Basic(optional = false)
    @NotNull
    @Column(name = "COD_CAMAROTE", nullable = false)
    private int codCamarote;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 10)
    @Column(name = "COD_TIPO_CAMAROTE", nullable = false, length = 10)
    private String codTipoCamarote;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Basic(optional = false)
    @NotNull
    @Column(name = "VALOR_FINAL", nullable = false, precision = 8, scale = 2)
    private BigDecimal valorFinal;
    @Basic(optional = false)
    @NotNull
    @Column(name = "FECHA_EMISION", nullable = false)
    @Temporal(TemporalType.TIMESTAMP)
    private Date fechaEmision;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 3)
    @Column(name = "ESTADO", nullable = false, length = 3)
    private String estado;
    @OneToMany(mappedBy = "codReserva")
    private List<TuristaReserva> turistaReservaList;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "reserva")
    private List<ValorReserva> valorReservaList;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "reserva")
    private List<Consumo> consumoList;
    @JoinColumn(name = "COD_TIPO_ALIMENTACION", referencedColumnName = "COD_TIPO_ALIMENTACION", nullable = false)
    @ManyToOne(optional = false)
    private TipoAlimentacion codTipoAlimentacion;
    @JoinColumns({
        @JoinColumn(name = "IDENTIFICACION", referencedColumnName = "IDENTIFICACION", nullable = false)
        , @JoinColumn(name = "TIPO_IDENTIFICACION", referencedColumnName = "TIPO_IDENTIFICACION", nullable = false)})
    @ManyToOne(optional = false)
    private Cliente cliente;

    public Reserva() {
    }

    public Reserva(String codReserva) {
        this.codReserva = codReserva;
    }

    public Reserva(String codReserva, int codTour, String codTipoTour, int codCrucero, int codCamarote, String codTipoCamarote, BigDecimal valorFinal, Date fechaEmision, String estado) {
        this.codReserva = codReserva;
        this.codTour = codTour;
        this.codTipoTour = codTipoTour;
        this.codCrucero = codCrucero;
        this.codCamarote = codCamarote;
        this.codTipoCamarote = codTipoCamarote;
        this.valorFinal = valorFinal;
        this.fechaEmision = fechaEmision;
        this.estado = estado;
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

    public List<TuristaReserva> getTuristaReservaList() {
        return turistaReservaList;
    }

    public void setTuristaReservaList(List<TuristaReserva> turistaReservaList) {
        this.turistaReservaList = turistaReservaList;
    }

    public List<ValorReserva> getValorReservaList() {
        return valorReservaList;
    }

    public void setValorReservaList(List<ValorReserva> valorReservaList) {
        this.valorReservaList = valorReservaList;
    }

    public List<Consumo> getConsumoList() {
        return consumoList;
    }

    public void setConsumoList(List<Consumo> consumoList) {
        this.consumoList = consumoList;
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
