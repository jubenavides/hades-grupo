/*
 * Hades Cruise
 * Aplicaciones Distribuidas
 * NRC: 2434 
 * Tutor: HENRY RAMIRO CORAL CORAL 
 * 2017 (c) Hades Cruise Corp.
 */
package ec.edu.espe.distribuidas.hades.dao;

import ec.edu.espe.distribuidas.hades.model.Tour;
import java.util.Date;
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
public class TourFacade extends AbstractFacade<Tour>{
    
    @PersistenceContext(unitName = "punit")
    private EntityManager em;
    
    @Override
    protected EntityManager getEntityManager(){
        return em;
    }
    
    public TourFacade(){
        super(Tour.class);
    }
    
    public List<Tour> findByTipo(String tipoTour){
        Query qry=this.em.createQuery("SELECT obj FROM Tour obj WHERE obj.pk.codTipoTour=?1");
        qry.setParameter(1, tipoTour);
        return qry.getResultList();
    } 
    
    public List<Tour> findByCrucero(String crucero){
        Query qry=this.em.createQuery("SELECT obj FROM Tour obj WHERE obj.pk.codCrucero=?1");
        qry.setParameter(1, crucero);
        return qry.getResultList();
    } 
    
    public List<Tour> findByFechas(Date fechaInicio, Date fechaFin) {
        Query qry=this.em.createQuery("SELECT obj FROM Tour obj WHERE obj.fechaInicio BETWEEN ?1 AND ?2");
        qry.setParameter(1, fechaInicio);
        qry.setParameter(2, fechaFin);
        return qry.getResultList();
    }
}