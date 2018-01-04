/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.distribuidas.hades.web;

import ec.edu.espe.distribuidas.hades.model.TipoTour;
import ec.edu.espe.distribuidas.hades.model.Tour;
import ec.edu.espe.distribuidas.hades.service.TipoTourService;
import ec.edu.espe.distribuidas.hades.service.TourService;
import java.io.Serializable;
import java.util.Date;
import java.util.List;
import javax.annotation.PostConstruct;
import javax.faces.view.ViewScoped;
import javax.inject.Inject;
import javax.inject.Named;

/**
 *
 * @author Hendrix
 */
@Named
@ViewScoped
public class TourAdminBean  extends BaseBean implements Serializable{
    
    private String filtro;
    private String tipoTourBusqueda;
    private boolean enBusquedaPorTipo;
    private List<TipoTour> tiposTour;
    private Date fechaInicioBusqueda;
    private Date fechaFinBusqueda;

    
    private List<Tour> tours;
    private Tour tour;
    private Tour tourSel;
    
    @Inject
    private TipoTourService tipoTourService;
    @Inject
    private TourService tourService;
    
    @PostConstruct
    public void init() {
        this.filtro = "TIP";
        this.enBusquedaPorTipo = true;
        this.tiposTour = this.tipoTourService.obtenerTodos();
    }
    
    public void cambiarFiltro() {
        this.enBusquedaPorTipo = !this.enBusquedaPorTipo;
        System.out.println("Valor para enbusqueda: "+this.enBusquedaPorTipo);
    }
    
    public void buscar() {
        if (this.enBusquedaPorTipo) {
            this.tours = this.tourService.buscarPorTipo(this.tipoTourBusqueda);
        } else {
            this.tours = this.tourService.buscarPorFechas(this.fechaInicioBusqueda, this.fechaFinBusqueda);
        }
        
    }

    public void setFiltro(String filtro) {
        this.filtro = filtro;
    }

    public void setTipoTourBusqueda(String tipoTourBusqueda) {
        this.tipoTourBusqueda = tipoTourBusqueda;
    }

    public void setFechaInicioBusqueda(Date fechaInicioBusqueda) {
        this.fechaInicioBusqueda = fechaInicioBusqueda;
    }

    public void setFechaFinBusqueda(Date fechaFinBusqueda) {
        this.fechaFinBusqueda = fechaFinBusqueda;
    }

    public void setTour(Tour tour) {
        this.tour = tour;
    }

    public void setTourSel(Tour tourSel) {
        this.tourSel = tourSel;
    }

    public String getFiltro() {
        return filtro;
    }

    public String getTipoTourBusqueda() {
        return tipoTourBusqueda;
    }

    public boolean isEnBusquedaPorTipo() {
        return enBusquedaPorTipo;
    }

    public List<TipoTour> getTiposTour() {
        return tiposTour;
    }

    public Date getFechaInicioBusqueda() {
        return fechaInicioBusqueda;
    }

    public Date getFechaFinBusqueda() {
        return fechaFinBusqueda;
    }

    public List<Tour> getTours() {
        return tours;
    }

    public Tour getTour() {
        return tour;
    }

    public Tour getTourSel() {
        return tourSel;
    }
    
    
}
