/*
 * Hades Cruise
 * Aplicaciones Distribuidas
 * NRC: 2434 
 * Tutor: HENRY RAMIRO CORAL CORAL 
 * 2017 (c) Hades Cruise Corp.
 */
package ec.edu.espe.distribuidas.hades.dao;

import ec.edu.espe.distribuidas.hades.model.PrecioCamarote;
import java.util.List;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

/**
 *
 * @author
 */
@Stateless
public class PrecioCamaroteFacade extends AbstractFacade<PrecioCamarote> {

    @PersistenceContext(unitName = "punit")
    private EntityManager em;

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }

    public PrecioCamaroteFacade() {
        super(PrecioCamarote.class);
    }
    
    public List<PrecioCamarote> findByTipoCamarote(String codTipoCamarote) {
        Query qry = this.em.createQuery("SELECT obj FROM PrecioCamarote obj WHERE obj.codTipoCamarote=?1");
        qry.setParameter(1, codTipoCamarote);
        return qry.getResultList();
    }

    public List<PrecioCamarote> findByTour(String codTour) {
        Query qry = this.em.createQuery("SELECT obj FROM PrecioCamarote obj WHERE obj.codTour=?1");
        qry.setParameter(1, codTour);
        return qry.getResultList();
    }
}
