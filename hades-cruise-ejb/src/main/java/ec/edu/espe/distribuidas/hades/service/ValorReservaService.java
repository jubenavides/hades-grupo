/*
 * Hades Cruise
 * Aplicaciones Distribuidas
 * NRC: 2434 
 * Tutor: HENRY RAMIRO CORAL CORAL 
 * 2017 (c) Hades Cruise Corp.
 */
package ec.edu.espe.distribuidas.hades.service;

import ec.edu.espe.distribuidas.hades.dao.ValorReservaFacade;
import ec.edu.espe.distribuidas.hades.model.ValorReserva;
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
public class ValorReservaService {
    
    @EJB
    private ValorReservaFacade valorReservaFacade;
    
    public List<ValorReserva> buscarPorReserva(String codReserva, String codTipoValor){
        return this.valorReservaFacade.findByReserva(codReserva, codTipoValor);
    }
    
    public List<ValorReserva> obtenerTodos(){
        return this.valorReservaFacade.findAll();
    }
    
    
}
