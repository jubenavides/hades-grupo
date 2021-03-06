/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.distribuidas.hades.service;

import ec.edu.espe.distribuidas.hades.dao.ConsumoFacade;
import ec.edu.espe.distribuidas.hades.dao.TourFacade;
import ec.edu.espe.distribuidas.hades.model.Consumo;
import ec.edu.espe.distribuidas.hades.model.Crucero;
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
public class ConsumoService {
    
    @EJB
    private ConsumoFacade consumoFacade;
    
    public void crear(Consumo consumo) {
        this.consumoFacade.create(consumo);
    }
     
    public void modificar(Consumo consumo) {
        this.consumoFacade.edit(consumo);
    }
    
}
