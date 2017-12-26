/*
 * Hades Cruise
 * Aplicaciones Distribuidas
 * NRC: 2434 
 * Tutor: HENRY RAMIRO CORAL CORAL 
 * 2017 (c) Hades Cruise Corp.
 */
package ec.edu.espe.distribuidas.hades.service;

import ec.edu.espe.distribuidas.hades.dao.CruceroFacade;
import ec.edu.espe.distribuidas.hades.model.Crucero;
import java.util.List;
import javax.ejb.EJB;
import javax.ejb.LocalBean;
import javax.ejb.Stateless;

/**
 *
 * @author Hades Cruise Corp.
 */
@Stateless
@LocalBean
public class CruceroService {
    
    @EJB
    private CruceroFacade cruceroFacade;
    
    public List<Crucero> obtenerTodos() {
        return this.cruceroFacade.findAll();
    }
    
    public Crucero obtenerPorCodigo(Integer codigo) {
        return this.cruceroFacade.find(codigo);
    }
    
    public void crear(Crucero crucero) {
        this.cruceroFacade.create(crucero);
    }
    
    public void modificar(Crucero crucero) {
        this.cruceroFacade.edit(crucero);
    }
    
    public void eliminar(Integer codigo) {
        Crucero crucero = this.cruceroFacade.find(codigo);
        this.cruceroFacade.remove(crucero);
    }
}
