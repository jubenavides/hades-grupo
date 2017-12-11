/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.distribuidas.hades.dao;

import ec.edu.espe.distribuidas.hades.model.Tour;
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
public class TourFacade extends AbstractFacade<Tour> {

    @PersistenceContext(unitName = "ec.edu.espe.distribuidas.hades_hades-cruise-ejb_ejb_1PU")
    private EntityManager em;

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }

    public TourFacade() {
        super(Tour.class);
    }
    
    public List<Tour> findByReserva(String tipoTour) {
        Query qry = this.em.createQuery("SELECT obj FROM Tour obj WHERE obj.tourPK.codTipoTour");
        qry.setParameter(1, tipoTour);
        return qry.getResultList();
    }
    
}
