/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.distribuidas.hades.dao;

import ec.edu.espe.distribuidas.hades.model.TipoTour;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import java.util.List;
import javax.persistence.Query;
/**
 *
 * @author Hendrix
 */
@Stateless
public class TipoTourFacade extends AbstractFacade<TipoTour> {

    @PersistenceContext(unitName = "ec.edu.espe.distribuidas.hades_hades-cruise-ejb_ejb_1PU")
    private EntityManager em;

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }

    public TipoTourFacade() {
        super(TipoTour.class);
    }
    
    public List<TipoTour> findByDuracion(Integer durancionMinima, Integer duracionMaxima) {
        Query qry = this.em.createQuery("SELECT obj FROM TipoTour obj WHERE obj.duracion BETWEEN ?1 AND ?2");
        qry.setParameter(1, durancionMinima);
        qry.setParameter(2, duracionMaxima);
        return qry.getResultList();
    }
}
