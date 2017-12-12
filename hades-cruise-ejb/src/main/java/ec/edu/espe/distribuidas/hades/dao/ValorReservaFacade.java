/*
 * Hades Cruise
 * Aplicaciones Distribuidas
 * NRC: 2434 
 * Tutor: HENRY RAMIRO CORAL CORAL 
 * 2017 (c) Hades Cruise Corp.
 */
package ec.edu.espe.distribuidas.hades.dao;

import ec.edu.espe.distribuidas.hades.model.ValorReserva;
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
public class ValorReservaFacade extends AbstractFacade<ValorReserva> {

    @PersistenceContext(unitName = "ec.edu.espe.distribuidas.hades_hades-cruise-ejb_ejb_1PU")
    private EntityManager em;

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }

    public ValorReservaFacade() {
        super(ValorReserva.class);
    }
    
    public List<ValorReserva> findByReserva(String codReserva, String codTipoValor) {
        Query qry = this.em.createQuery("SELECT obj FROM ValorReserva obj WHERE obj.valorReservaPK.codReserva =?1 AND obj.valorReservaPK.codTipoValor = ?2");
        qry.setParameter(1, codReserva);
        qry.setParameter(2, codTipoValor);
        return qry.getResultList();
    }

    
}
