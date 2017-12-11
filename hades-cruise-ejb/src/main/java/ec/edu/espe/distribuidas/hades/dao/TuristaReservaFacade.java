/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.distribuidas.hades.dao;

import ec.edu.espe.distribuidas.hades.model.TuristaReserva;
import java.util.List;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

/**
 *
 * @author Hendrix
 */
@Stateless
public class TuristaReservaFacade extends AbstractFacade<TuristaReserva> {

    @PersistenceContext(unitName = "ec.edu.espe.distribuidas.hades_hades-cruise-ejb_ejb_1PU")
    private EntityManager em;

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }

    public TuristaReservaFacade() {
        super(TuristaReserva.class);
    }
     public List<TuristaReserva> findByReserva(String codigo) {
        Query qry = this.em.createQuery("SELECT obj FROM Reserva obj WHERE obj.cod_reserva=?1");
        qry.setParameter(1, codigo);
        return qry.getResultList();
    }
    
}