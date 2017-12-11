package ec.edu.espe.distribuidas.hades.dao;

import ec.edu.espe.distribuidas.hades.model.Tour;
import java.util.List;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

@Stateless
public class TourFacade extends AbstractFacade<Tour>{
    @PersistenceContext(unitName = "ec.edu.espe.distribuidas.hades_hades-cruise-ejb_ejb_1PU")
    private EntityManager em;
    @Override
    protected EntityManager getEntityManager(){
        return em;
    }
    public TourFacade(){
        super(Tour.class);
    }
    public List<Tour> findByTipo(String tipoTour){
        Query qry=this.em.createQuery("SELECT obj FROM Tour obj WHERE obj.tourPK.codTipoTour");
        qry.setParameter(1, tipoTour);
        return qry.getResultList();
    } 
    public List<Tour> findByCrucero(String crucero){
        Query qry=this.em.createQuery("SELECT obj FROM Tour obj WHERE obj.tourPK.codCrucero");
        qry.setParameter(1, crucero);
        return qry.getResultList();
    } 
}