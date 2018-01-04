/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.distribuidas.hades.service;

import ec.edu.espe.distribuidas.hades.dao.TourFacade;
import ec.edu.espe.distribuidas.hades.model.Tour;
import java.util.Date;
import java.util.List;
import javax.ejb.EJB;
import javax.ejb.LocalBean;
import javax.ejb.Stateless;

/**
 *
 * @author Hendrix
 */
@Stateless
@LocalBean
public class TourService {
    
    @EJB
    private TourFacade tourFacade;

    public List<Tour> buscarPorTipo(String tipoTourBusqueda) {
        return this.tourFacade.findByTipo(tipoTourBusqueda);
    }
    
    public List<Tour> buscarPorFechas(Date fechaInicioBusqueda, Date fechaFinBusqueda) {
        return this.tourFacade.findByFechas(fechaInicioBusqueda, fechaFinBusqueda);
    }
    
}
