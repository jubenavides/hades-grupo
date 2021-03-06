/*
 * Hades Cruise
 * Aplicaciones Distribuidas
 * NRC: 2434 
 * Tutor: HENRY RAMIRO CORAL CORAL 
 * 2017 (c) Hades Cruise Corp.
 */
package ec.edu.espe.distribuidas.hades.dao;

import ec.edu.espe.distribuidas.hades.model.Camarote;
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
public class CamaroteFacade extends AbstractFacade<Camarote> {

    @PersistenceContext(unitName = "punit")
    private EntityManager em;

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }

    public CamaroteFacade() {
        super(Camarote.class);
    }
    
    public List<Camarote> findByCruceroTipo(Integer codCrucero, String codTipoCamarote) {
        Query qry = this.em.createQuery("SELECT obj FROM Camarote obj WHERE obj.pk.codCrucero=?1 AND obj.pk.codTipoCamarote=?2");
        qry.setParameter(1, codCrucero);
        qry.setParameter(2, codTipoCamarote);
        return qry.getResultList();
    }
    
    public List<Camarote> findByCrucero(Integer codCrucero) {
        Query qry = this.em.createQuery("SELECT obj FROM Camarote obj WHERE obj.pk.codCrucero=?1");
        qry.setParameter(1, codCrucero);
        return qry.getResultList();
    }
    
    public Camarote findCodTipCamarote(Integer codCrucero, Integer numCamarote){
        Query qry=this.em.createQuery("SELECT obj FROM Camarote obj WHERE obj.pk.codCrucero=?1 and obj.numero=?2");
        qry.setParameter(1, codCrucero);
        qry.setParameter(2, numCamarote);
        
        return  (Camarote) qry.getSingleResult();  
    }     
}
