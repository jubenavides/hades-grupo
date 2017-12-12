/*
 * Hades Cruise
 * Aplicaciones Distribuidas
 * NRC: 2434 
 * Tutor: HENRY RAMIRO CORAL CORAL 
 * 2017 (c) Hades Cruise Corp.
 */
package ec.edu.espe.distribuidas.hades.dao;

import ec.edu.espe.distribuidas.hades.model.TipoTour;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import java.util.List;
import javax.ejb.LocalBean;
import javax.persistence.Query;
/**
 *
 * @author Hades Cruise Corp.
 */
@Stateless
@LocalBean
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
