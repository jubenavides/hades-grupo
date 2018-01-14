/*
 * Hades Cruise
 * Aplicaciones Distribuidas
 * NRC: 2434 
 * Tutor: HENRY RAMIRO CORAL CORAL 
 * 2017 (c) Hades Cruise Corp.
 */
package ec.edu.espe.distribuidas.hades.web;

import ec.edu.espe.distribuidas.hades.model.TipoValor;
import ec.edu.espe.distribuidas.hades.model.ValorReserva;
import ec.edu.espe.distribuidas.hades.service.TipoValorService;
import ec.edu.espe.distribuidas.hades.service.ValorReservaService;
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
public class ValorReservaBean extends BaseBean implements Serializable{
    
    private String codigoReserva;
    private String tipoValorBusqueda;
    private List<ValorReserva> valorReservaList;
    private List<TipoValor> tiposValor;
    private ValorReserva valorReserva;
    private ValorReserva valorReservaSel;
    
    @Inject
    private ValorReservaService valorReservaService;
    @Inject 
    private TipoValorService tipoValorService;

    @PostConstruct
    public void init() {
        this.valorReservaList = this.valorReservaService.obtenerTodos();
        this.tiposValor = this.tipoValorService.obtenerTodos();
    }
    
    public String getCodigoReserva() {
        return codigoReserva;
    }

    public void setCodigoReserva(String codigoReserva) {
        this.codigoReserva = codigoReserva;
    }
    
    public void buscar(){
        this.valorReservaList = this.valorReservaService.buscarPorReserva(this.codigoReserva, this.tipoValorBusqueda);
    }

    public String getTipoValorBusqueda() {
        return tipoValorBusqueda;
    }

    public void setTipoValorBusqueda(String tipoValorBusqueda) {
        this.tipoValorBusqueda = tipoValorBusqueda;
    }

    public List<ValorReserva> getValorReservaList() {
        return valorReservaList;
    }

    public List<TipoValor> getTiposValor() {
        return tiposValor;
    }

    public ValorReserva getValorReserva() {
        return valorReserva;
    }

    public void setValorReserva(ValorReserva valorReserva) {
        this.valorReserva = valorReserva;
    }

    public ValorReserva getValorReservaSel() {
        return valorReservaSel;
    }

    public void setValorReservaSel(ValorReserva valorReservaSel) {
        this.valorReservaSel = valorReservaSel;
    }
            
}
