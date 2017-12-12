/*
 * Hades Cruise
 * Aplicaciones Distribuidas
 * NRC: 2434 
 * Tutor: HENRY RAMIRO CORAL CORAL 
 * 2017 (c) Hades Cruise Corp.
 */
package ec.edu.espe.distribuidas.hades.dao;

import ec.edu.espe.distribuidas.hades.model.Consumo;
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
public class ConsumoFacade extends AbstractFacade<Consumo> {

    @PersistenceContext(unitName = "ec.edu.espe.distribuidas.hades_hades-cruise-ejb_ejb_1PU")
    private EntityManager em;

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }

    public ConsumoFacade() {
        super(Consumo.class);
    }

    public List<Consumo> findByReserva(Integer codItem, String codReserva) {
        Query qry = this.em.createQuery("SELECT obj FROM Consumo obj WHERE obj.consumoPK.codItem =?1 AND obj.consumoPK.codReserva = ?2");
        qry.setParameter(1, codItem);
        qry.setParameter(2, codReserva);
        return qry.getResultList();
    }

    public List<Consumo> findByTour(Integer codTour, String codTipoTour, Integer codCrucero) {
        Query qry = this.em.createQuery("SELECT objC, objR FROM Consumo objC, Reserva objR WHERE "
                + "objC.consumoPK.codReserva = objR.codReserva AND objR.codTour = ?1 "
                + "AND objR.codTipoTour = ?2 AND objR.codCrucero = ?3");
        qry.setParameter(1, codTour);
        qry.setParameter(2, codTipoTour);
        qry.setParameter(3, codCrucero);
        return qry.getResultList();
    }
}
