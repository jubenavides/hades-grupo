/*
 * Hades Cruise
 * Aplicaciones Distribuidas
 * NRC: 2434 
 * Tutor: HENRY RAMIRO CORAL CORAL 
 * 2017 (c) Hades Cruise Corp.
 */
package ec.edu.espe.distribuidas.hades.service;

import ec.edu.espe.distribuidas.hades.dao.ReservaFacade;
import ec.edu.espe.distribuidas.hades.model.Reserva;
import javax.ejb.EJB;
import javax.ejb.Stateless;
import javax.ejb.LocalBean;

/**
 *
 * @author Hades Cruise Corp.
 */
@Stateless
@LocalBean
public class ReservaService {

    @EJB
    private ReservaFacade reservaFacade;
    
    public void crear(Reserva reserva) {
        this.reservaFacade.create(reserva);
    }
    
    public void modificar(Reserva reserva) {
        this.reservaFacade.edit(reserva);
    }
}
