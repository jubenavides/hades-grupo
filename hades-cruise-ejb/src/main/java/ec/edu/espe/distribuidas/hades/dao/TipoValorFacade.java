/*
 * Hades Cruise
 * Aplicaciones Distribuidas
 * NRC: 2434 
 * Tutor: HENRY RAMIRO CORAL CORAL 
 * 2017 (c) Hades Cruise Corp.
 */
package ec.edu.espe.distribuidas.hades.dao;

import ec.edu.espe.distribuidas.hades.enums.OrdenTipoValorEnum;
import ec.edu.espe.distribuidas.hades.model.TipoValor;
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
public class TipoValorFacade extends AbstractFacade<TipoValor> {

    @PersistenceContext(unitName = "punit")
    private EntityManager em;

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }

    public TipoValorFacade() {
        super(TipoValor.class);
    }
     
    public List<TipoValor> findByOrden(OrdenTipoValorEnum orden) {
        Query qry = this.em.createQuery("SELECT obj FROM TipoValor obj WHERE obj.orden=?1");
        qry.setParameter(1, orden);
        return qry.getResultList();
    }
}
