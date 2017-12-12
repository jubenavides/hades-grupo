/*
 * Hades Cruise
 * Aplicaciones Distribuidas
 * NRC: 2434 
 * Tutor: HENRY RAMIRO CORAL CORAL 
 * 2017 (c) Hades Cruise Corp.
 */
package ec.edu.espe.distribuidas.hades.dao;

import ec.edu.espe.distribuidas.hades.model.TuristaReserva;
import java.util.List;
import javax.ejb.LocalBean;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

/**
 *
 * @author Hades Cruise Corp.
 */
@Stateless
@LocalBean
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
        Query qry = this.em.createQuery("SELECT obj FROM TuristaReserva obj WHERE obj.codReserva =?1");
        qry.setParameter(1, codigo);
        return qry.getResultList();
    }
    
}
