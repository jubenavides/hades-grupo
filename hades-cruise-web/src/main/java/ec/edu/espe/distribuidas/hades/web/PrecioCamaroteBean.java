/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.distribuidas.hades.web;

import ec.edu.espe.distribuidas.hades.model.PrecioCamarote;
import ec.edu.espe.distribuidas.hades.model.TipoCamarote;
import ec.edu.espe.distribuidas.hades.service.PrecioCamaroteService;
import ec.edu.espe.distribuidas.hades.service.TipoCamaroteService;
import java.io.Serializable;
import java.util.List;
import javax.annotation.PostConstruct;
import javax.faces.view.ViewScoped;
import javax.inject.Inject;
import javax.inject.Named;

/**
 *
 * @author Hades Cruise Corp.
 */
@Named
@ViewScoped
public class PrecioCamaroteBean extends BaseBean implements Serializable {

    private String filtro;
    private String tipoCamaroteBusqueda;
    private String tipoTourBusqueda;
    private boolean enBusquedaPorTipo;
    private List<TipoCamarote> tiposCamarote;

    private List<PrecioCamarote> preciosCamarote;
    private PrecioCamarote precioCamarote;
    private PrecioCamarote precioCamaroteSel;

    @Inject
    private TipoCamaroteService tipoCamaroteService;

    @Inject
    private PrecioCamaroteService precioCamaroteService;

    @PostConstruct
    public void init() {
        this.filtro = "TIP";
        this.enBusquedaPorTipo = true;
        this.tiposCamarote = this.tipoCamaroteService.obtenerTodos();
    }

    public void cambiarFiltro() {
        this.enBusquedaPorTipo = !this.enBusquedaPorTipo;
        System.out.println("Valor para enbusqueda: " + this.enBusquedaPorTipo);
    }

    public void buscar() {
        if (this.enBusquedaPorTipo) {
            this.preciosCamarote = this.precioCamaroteService.buscarPorCamarote(tipoCamaroteBusqueda);
        } else {
            this.preciosCamarote = this.precioCamaroteService.buscarPorTour(tipoTourBusqueda);
        }
    }

    public void setFiltro(String filtro) {
        this.filtro = filtro;
    }

    public void setTipoCamaroteBusqueda(String tipoCamaroteBusqueda) {
        this.tipoCamaroteBusqueda = tipoCamaroteBusqueda;
    }

    /*public void setTipoTourBusqueda(String tipoTourBusqueda) {
        this.tipoTourBusqueda = tipoTourBusqueda;
    }*/


    public void setPrecioCamarote(PrecioCamarote precioCamarote) {
        this.precioCamarote = precioCamarote;
    }

    public void setPrecioCamaroteSel(PrecioCamarote precioCamaroteSel) {
        this.precioCamaroteSel = precioCamaroteSel;
    }

    public String getFiltro() {
        return filtro;
    }

    public String getTipoCamaroteBusqueda() {
        return tipoCamaroteBusqueda;
    }

    public String getTipoTourBusqueda() {
        return tipoTourBusqueda;
    }

    public boolean isEnBusquedaPorTipo() {
        return enBusquedaPorTipo;
    }

    public List<TipoCamarote> getTiposCamarote() {
        return tiposCamarote;
    }

    public List<PrecioCamarote> getPreciosCamarote() {
        return preciosCamarote;
    }

    public PrecioCamarote getPrecioCamarote() {
        return precioCamarote;
    }

    public PrecioCamarote getPrecioCamaroteSel() {
        return precioCamaroteSel;
    }

}
