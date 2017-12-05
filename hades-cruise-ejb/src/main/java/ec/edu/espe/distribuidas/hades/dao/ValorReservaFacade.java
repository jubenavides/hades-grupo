/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.distribuidas.hades.dao;

import ec.edu.espe.distribuidas.hades.model.ValorReserva;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

/**
 *
 * @author Hendrix
 */
@Stateless
public class ValorReservaFacade extends AbstractFacade<ValorReserva> {

    @PersistenceContext(unitName = "ec.edu.espe.distribuidas.hades_hades-cruise-ejb_ejb_1PU")
    private EntityManager em;

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }

    public ValorReservaFacade() {
        super(ValorReserva.class);
    }
    
}
