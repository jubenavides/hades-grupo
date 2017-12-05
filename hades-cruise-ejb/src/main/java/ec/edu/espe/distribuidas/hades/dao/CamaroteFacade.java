/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.distribuidas.hades.dao;

import ec.edu.espe.distribuidas.hades.model.Camarote;
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
public class CamaroteFacade extends AbstractFacade<Camarote> {

    @PersistenceContext(unitName = "ec.edu.espe.distribuidas.hades_hades-cruise-ejb_ejb_1PU")
    private EntityManager em;

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }

    public CamaroteFacade() {
        super(Camarote.class);
    }
    
    public List<Camarote> findByCruceroTipo(Integer codCrucero, String codTipoCamarote) {
        Query qry = this.em.createQuery("SELECT obj FROM Camarote obj WHERE obj.camarotePK.codCrucero=?1 AND obj.camarotePK.codTipoCamarote=?2");
        qry.setParameter(1, codCrucero);
        qry.setParameter(2, codTipoCamarote);
        return qry.getResultList();
    }
}
