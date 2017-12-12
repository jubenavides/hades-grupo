/*
 * Hades Cruise
 * Aplicaciones Distribuidas
 * NRC: 2434 
 * Tutor: HENRY RAMIRO CORAL CORAL 
 * 2017 (c) Hades Cruise Corp.
 */
package ec.edu.espe.distribuidas.hades.dao;

import ec.edu.espe.distribuidas.hades.enums.TipoCruceroEnum;
import ec.edu.espe.distribuidas.hades.model.Crucero;
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
public class CruceroFacade extends AbstractFacade<Crucero> {

    @PersistenceContext(unitName = "punit")
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
