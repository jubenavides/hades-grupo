/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
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
 * @author Hendrix
 */
@Stateless
public class ReservaFacade extends AbstractFacade<Reserva> {

    @PersistenceContext(unitName = "ec.edu.espe.distribuidas.hades_hades-cruise-ejb_ejb_1PU")
    private EntityManager em;

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }

    public ReservaFacade() {
        super(Reserva.class);
    }
     public List<Reserva> findByCliente(Integer identificacion, String codReserva) {
        Query qry = this.em.createQuery("SELECT obj FROM Reserva obj WHERE obj.identificacion =?1 AND obj.codReserva = ?2");
        qry.setParameter(1, identificacion);
        qry.setParameter(2, codReserva);
        return qry.getResultList();
    }
    public List<Reserva> findByTour(Integer codTour, String codTipoTour, Integer codCrucero,String codReserva) {
        Query qry = this.em.createQuery("SELECT obj FROM Reserva obj WHERE "
                + "obj.codReserva = ?1 "
                + "AND obj.codTour = ?2 AND obj.CodTipoTour = ?3"
                + "AND objR.codCrucer = ?4 ");
        qry.setParameter(1, codReserva);
        qry.setParameter(2, codTour);
        qry.setParameter(3, codTipoTour);
        qry.setParameter(4, codCrucero);
        return qry.getResultList();
    }
}
