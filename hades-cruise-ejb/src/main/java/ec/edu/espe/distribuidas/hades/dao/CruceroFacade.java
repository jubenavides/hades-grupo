/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.distribuidas.hades.dao;

import ec.edu.espe.distribuidas.hades.enums.TipoCruceroEnum;
import ec.edu.espe.distribuidas.hades.model.Crucero;
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
public class CruceroFacade extends AbstractFacade<Crucero> {

    @PersistenceContext(unitName = "ec.edu.espe.distribuidas.hades_hades-cruise-ejb_ejb_1PU")
    private EntityManager em;

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }

    public CruceroFacade() {
        super(Crucero.class);
    }
    
    public List<Crucero> findByTipo(TipoCruceroEnum tipo) {
        Query qry = this.em.createQuery("SELECT obj FROM Crucero obj WHERE obj.tipo=?1");
        qry.setParameter(1, tipo);
        return qry.getResultList();
    }
    
    public List<Crucero> findByNombre(String nombre) {
        Query qry = this.em.createQuery("SELECT obj FROM Crucero obj WHERE obj.nombre=?1");
        qry.setParameter(1, nombre);
        return qry.getResultList();
    }
}