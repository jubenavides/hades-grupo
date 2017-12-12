/*
 * Hades Cruise
 * Aplicaciones Distribuidas
 * NRC: 2434 
 * Tutor: HENRY RAMIRO CORAL CORAL 
 * 2017 (c) Hades Cruise Corp.
 */
package ec.edu.espe.distribuidas.hades.dao;

import ec.edu.espe.distribuidas.hades.model.Reserva;
import java.util.List;
import javax.ejb.Stateless;
import javax.persistence.Query;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

/**
 *
 * @author Hades Cruise Corp.
 */
@Stateless
public class ReservaFacade extends AbstractFacade<Reserva> {

    @PersistenceContext(unitName = "punit")
    private EntityManager em;

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }

    public ReservaFacade() {
        super(Reserva.class);
    }
     public List<Reserva> findByCliente(Integer identificacion, String codReserva) {
        Query qry = this.em.createQuery("SELECT obj FROM Reserva obj WHERE obj.cliente.clientePK.identificacion =?1 AND obj.codigo = ?2");
        qry.setParameter(1, identificacion);
        qry.setParameter(2, codReserva);
        return qry.getResultList();
    }
    public List<Reserva> findByTour(Integer codTour, String codTipoTour, Integer codCrucero,String codReserva) {
        Query qry = this.em.createQuery("SELECT obj FROM Reserva obj WHERE obj.codigo = ?1 AND obj.codTour = ?2 AND obj.codTipoTour = ?3 AND obj.codCrucero = ?4 ");
        qry.setParameter(1, codReserva);
        qry.setParameter(2, codTour);
        qry.setParameter(3, codTipoTour);
        qry.setParameter(4, codCrucero);
        return qry.getResultList();
    }
}
