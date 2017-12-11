/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.distribuidas.hades.dao;

import ec.edu.espe.distribuidas.hades.enums.TipoValorEnum;
import ec.edu.espe.distribuidas.hades.enums.OrdenTipoValorEnum;
import ec.edu.espe.distribuidas.hades.model.TipoValor;
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
public class TipoValorFacade extends AbstractFacade<TipoValor> {

    @PersistenceContext(unitName = "ec.edu.espe.distribuidas.hades_hades-cruise-ejb_ejb_1PU")
    private EntityManager em;

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }

    public TipoValorFacade() {
        super(TipoValor.class);
    }
    
    public List<TipoValor> findByTipoCobro(TipoValorEnum tipoCobro) {
        Query qry = this.em.createQuery("SELECT obj FROM TipoValor obj WHERE obj.tipoCobro");
        qry.setParameter(1, tipoCobro);
        return qry.getResultList();
    }
    
    public List<TipoValor> findByOrden(OrdenTipoValorEnum orden) {
        Query qry = this.em.createQuery("SELECT obj FROM TipoValor obj WHERE obj.orden?1");
        qry.setParameter(1, orden);
        return qry.getResultList();
    }
}
