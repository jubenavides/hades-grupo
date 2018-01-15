/*
 * Hades Cruise
 * Aplicaciones Distribuidas
 * NRC: 2434 
 * Tutor: HENRY RAMIRO CORAL CORAL 
 * 2017 (c) Hades Cruise Corp.
 */
package ec.edu.espe.distribuidas.hades.dao;

import ec.edu.espe.distribuidas.hades.model.Cliente;
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
public class ClienteFacade extends AbstractFacade<Cliente> {

    @PersistenceContext(unitName = "punit")
    private EntityManager em;

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }

    public ClienteFacade() {
        super(Cliente.class);
    }   
    
    public Cliente findByID(String identificacion){
        Query qry=this.em.createQuery("SELECT obj FROM Cliente obj WHERE obj.clientePK.identificacion=?1");
        qry.setParameter(1, identificacion);
        return  (Cliente) qry.getSingleResult();  
    } 
}
