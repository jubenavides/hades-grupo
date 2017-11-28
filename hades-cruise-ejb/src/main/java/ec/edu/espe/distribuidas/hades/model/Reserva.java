/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.distribuidas.hades.model;

import javax.persistence.Column;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinColumns;
import javax.persistence.ManyToOne;

/**
 *
 * @author Hendrix
 */
public class Reserva {
    
    @Id
    private String codigo;
    
    @Column(name="COD_CRUCERO", length = 5, nullable = false)
    private Integer codCrucero;
    @Column(name="COD_TIPO_TOUR", length = 10, nullable = false)
    private String codTipoTour;
    @Column(name="COD_TOUR", length = 5, nullable = false)
    private Integer codTour;

    @ManyToOne
    @JoinColumns({
        @JoinColumn(name="COD_TOUR", referencedColumnName = "COD_TOUR", insertable = false, updatable = false),
        @JoinColumn(name="COD_TIPO_TOUR", referencedColumnName = "COD_TIPO_TOUR", insertable = false, updatable = false),
        @JoinColumn(name="COD_CRUCERO", referencedColumnName = "COD_CRUCERO", insertable = false, updatable = false)
    })
    private Tour tour;

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public Integer getCodCrucero() {
        return codCrucero;
    }

    public void setCodCrucero(Integer codCrucero) {
        this.codCrucero = codCrucero;
    }

    public String getCodTipoTour() {
        return codTipoTour;
    }

    public void setCodTipoTour(String codTipoTour) {
        this.codTipoTour = codTipoTour;
    }

    public Integer getCodTour() {
        return codTour;
    }

    public void setCodTour(Integer codTour) {
        this.codTour = codTour;
    }

    public Tour getTour() {
        return tour;
    }

    public void setTour(Tour tour) {
        this.tour = tour;
    }
    
    
}
