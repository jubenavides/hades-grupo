/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.distribuidas.hades.model;

import java.io.Serializable;
import java.math.BigDecimal;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinColumns;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

/**
 *
 * @author 
 */
@Entity
@Table(name = "PRECIO_CAMAROTE")
public class PrecioCamarote implements Serializable {

    private static final long serialVersionUID = 1L;
    
    @Id
    @Column(name = "COD_PRECIO_CAMAROTE", nullable = false)
    private Integer codPrecioCamarote;
    
    @Column(name = "COD_TOUR", nullable = false)
    private Integer codTour;
    
    @Column(name = "COD_TIPO_TOUR", nullable = false, length = 10)
    private String codTipoTour;
    
    @Column(name = "COD_CRUCERO", nullable = false)
    private Integer codCrucero;
    
    @Column(name = "COD_TIPO_CAMAROTE", nullable = false, length = 10)
    private String codTipoCamarote;
    
    @Column(name = "PORCENTAJE_ADICIONAL", nullable = false, precision = 5, scale = 2)
    private BigDecimal porcentajeAdicional;
    
    @Column(name = "PORECENTAJE_PERSONA", nullable = false, precision = 5, scale = 2)
    private BigDecimal porecentajePersona;
    
    @JoinColumns({
        @JoinColumn(name = "COD_TOUR", referencedColumnName = "COD_TOUR", insertable = false, updatable = false)
        , @JoinColumn(name = "COD_TIPO_TOUR", referencedColumnName = "COD_TIPO_TOUR", insertable = false, updatable = false)
        , @JoinColumn(name = "COD_CRUCERO", referencedColumnName = "COD_CRUCERO", insertable = false, updatable = false)})
    @ManyToOne
    private Tour tour;
    
    @JoinColumn(name = "COD_TIPO_CAMAROTE", referencedColumnName = "COD_TIPO_CAMAROTE", insertable = false, updatable = false)
    @ManyToOne
    private TipoCamarote tipoCamarote;

    public PrecioCamarote() {
    }

    public PrecioCamarote(Integer codPrecioCamarote) {
        this.codPrecioCamarote = codPrecioCamarote;
    }

    public Integer getCodPrecioCamarote() {
        return codPrecioCamarote;
    }

    public void setCodPrecioCamarote(Integer codPrecioCamarote) {
        this.codPrecioCamarote = codPrecioCamarote;
    }

    public BigDecimal getPorcentajeAdicional() {
        return porcentajeAdicional;
    }

    public void setPorcentajeAdicional(BigDecimal porcentajeAdicional) {
        this.porcentajeAdicional = porcentajeAdicional;
    }

    public BigDecimal getPorecentajePersona() {
        return porecentajePersona;
    }

    public void setPorecentajePersona(BigDecimal porecentajePersona) {
        this.porecentajePersona = porecentajePersona;
    }

    public Tour getTour() {
        return tour;
    }

    public void setTour(Tour tour) {
        this.tour = tour;
    }

    public Integer getCodTour() {
        return codTour;
    }

    public void setCodTour(Integer codTour) {
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

    public String getCodTipoCamarote() {
        return codTipoCamarote;
    }

    public void setCodTipoCamarote(String codTipoCamarote) {
        this.codTipoCamarote = codTipoCamarote;
    }

    public TipoCamarote getTipoCamarote() {
        return tipoCamarote;
    }

    public void setTipoCamarote(TipoCamarote tipoCamarote) {
        this.tipoCamarote = tipoCamarote;
    }

    

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (codPrecioCamarote != null ? codPrecioCamarote.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof PrecioCamarote)) {
            return false;
        }
        PrecioCamarote other = (PrecioCamarote) object;
        if ((this.codPrecioCamarote == null && other.codPrecioCamarote != null) || (this.codPrecioCamarote != null && !this.codPrecioCamarote.equals(other.codPrecioCamarote))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "ec.edu.espe.distribuidas.hades.model.PrecioCamarote[ codPrecioCamarote=" + codPrecioCamarote + " ]";
    }
    
}
