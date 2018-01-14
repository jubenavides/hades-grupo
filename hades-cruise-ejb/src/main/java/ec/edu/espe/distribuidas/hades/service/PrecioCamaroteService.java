/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.distribuidas.hades.service;

import ec.edu.espe.distribuidas.hades.dao.PrecioCamaroteFacade;
import ec.edu.espe.distribuidas.hades.model.PrecioCamarote;
import java.util.List;
import javax.ejb.EJB;
import javax.ejb.LocalBean;
import javax.ejb.Stateless;

/**
 *
 * @author Hades Cruise Corp.
 */
@Stateless
@LocalBean
public class PrecioCamaroteService {
  
    @EJB
    private PrecioCamaroteFacade precioCamaroteFacade;
    
    public List<PrecioCamarote> obtenerTodos() {
        return this.precioCamaroteFacade.findAll();
    }
    
    public PrecioCamarote obtenerPorCodigo(String codigo) {
        return this.precioCamaroteFacade.find(codigo);
    }
       
    public List<PrecioCamarote> buscarPorCamarote (String tipoCamaroteBusqueda){
        return this.precioCamaroteFacade.findByTipoCamarote(tipoCamaroteBusqueda);
    }
    
     public List<PrecioCamarote> buscarPorTour (String tourBusqueda){
        return this.precioCamaroteFacade.findByTour(tourBusqueda);
    }
    
}