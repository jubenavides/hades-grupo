/*
 * Hades Cruise
 * Aplicaciones Distribuidas
 * NRC: 2434 
 * Tutor: HENRY RAMIRO CORAL CORAL 
 * 2017 (c) Hades Cruise Corp.
 */
package ec.edu.espe.distribuidas.hades.service;

import ec.edu.espe.distribuidas.hades.dao.TipoTourFacade;
import ec.edu.espe.distribuidas.hades.model.TipoTour;
import java.util.List;
import javax.ejb.EJB;
import javax.ejb.Stateless;
import javax.ejb.LocalBean;

/**
 *
 * @author Hades Cruise Corp.
 */
@Stateless
@LocalBean
public class TipoTourService {

    @EJB
    private TipoTourFacade tipoTourFacade;

    public List<TipoTour> obtenerTodos() {
        return this.tipoTourFacade.findAll();
    }

    public TipoTour obtenerPorCodigo(String codigo) {
        return this.tipoTourFacade.find(codigo);
    }

    public void crear(TipoTour tipoTour) {
        this.tipoTourFacade.create(tipoTour);
    }

    public void modificar(TipoTour tipoTour) {
        this.tipoTourFacade.edit(tipoTour);
    }

    public void eliminar(String codigo) {
        TipoTour tipoTour = this.tipoTourFacade.find(codigo);
        this.tipoTourFacade.remove(tipoTour);
    }

    
}
