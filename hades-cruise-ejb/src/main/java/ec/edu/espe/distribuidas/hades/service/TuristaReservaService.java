/*
 * Hades Cruise
 * Aplicaciones Distribuidas
 * NRC: 2434 
 * Tutor: HENRY RAMIRO CORAL CORAL 
 * 2017 (c) Hades Cruise Corp.
 */
package ec.edu.espe.distribuidas.hades.service;

import ec.edu.espe.distribuidas.hades.dao.TuristaReservaFacade;
import ec.edu.espe.distribuidas.hades.model.TuristaReserva;
import java.util.List;
import javax.ejb.EJB;
import javax.ejb.Stateless;
import javax.ejb.LocalBean;

/**
 *
 * @author Hades Cruise Corp.
 */
@Stateless
@LocalBean
public class TuristaReservaService {

    @EJB
    private TuristaReservaFacade turistaReservaFacade;
    
    public List<TuristaReserva> obtenerTodos() {
        return this.turistaReservaFacade.findAll();
    }

    public void crear(TuristaReserva turista) {
        this.turistaReservaFacade.create(turista);
    }
    
    public void modificar(TuristaReserva turista) {
        this.turistaReservaFacade.edit(turista);
    }
    
    public void eliminar(String codigo) {
        TuristaReserva turista = this.turistaReservaFacade.find(codigo);
        this.turistaReservaFacade.remove(turista);
    }
}