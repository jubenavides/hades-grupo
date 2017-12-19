/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.distribuidas.hades.web;

import ec.edu.espe.distribuidas.hades.model.TipoAlimentacion;
import ec.edu.espe.distribuidas.hades.service.TipoAlimentacionService;
import java.io.Serializable;
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
public class TipoAlimentacionBean implements Serializable{
    
    private List<TipoAlimentacion> tiposAlimentacion;
    private boolean enAgregar;
    
    private TipoAlimentacion tipoAlimentacion;
    
    @Inject
    private TipoAlimentacionService tipoAlimentacionService;
    
    @PostConstruct
    public void init() {
        this.tiposAlimentacion = this.tipoAlimentacionService.obtenerTodos();
        this.tipoAlimentacion = new TipoAlimentacion();
    }

    public List<TipoAlimentacion> getTiposAlimentacion() {
        return tiposAlimentacion;
    }
    
    
    public void agregar() {
        this.tipoAlimentacion = new TipoAlimentacion();
        this.enAgregar = true;
        
    }
    
    public void cancelar() {
        this.enAgregar = false;
    }
    
    public void guardar() {
        this.tipoAlimentacionService.crear(this.tipoAlimentacion);
        this.enAgregar = false;
        this.tiposAlimentacion = this.tipoAlimentacionService.obtenerTodos();
    }

    public boolean isEnAgregar() {
        return enAgregar;
    }

    public TipoAlimentacion getTipoAlimentacion() {
        return tipoAlimentacion;
    }

    public void setTipoAlimentacion(TipoAlimentacion tipoAlimentacion) {
        this.tipoAlimentacion = tipoAlimentacion;
    }

    
}
