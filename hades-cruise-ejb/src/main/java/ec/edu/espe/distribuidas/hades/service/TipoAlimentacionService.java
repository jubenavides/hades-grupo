/*
 * Hades Cruise
 * Aplicaciones Distribuidas
 * NRC: 2434 
 * Tutor: HENRY RAMIRO CORAL CORAL 
 * 2017 (c) Hades Cruise Corp.
 */
package ec.edu.espe.distribuidas.hades.service;

import ec.edu.espe.distribuidas.hades.dao.TipoAlimentacionFacade;
import ec.edu.espe.distribuidas.hades.model.TipoAlimentacion;
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
public class TipoAlimentacionService {

    @EJB
    private TipoAlimentacionFacade tipoAlimentacionFacade;
    
    public List<TipoAlimentacion> obtenerTodos() {
        return this.tipoAlimentacionFacade.findAll();
    }
    
    public TipoAlimentacion obtenerPorCodigo(String codigo) {
        return this.tipoAlimentacionFacade.find(codigo);
    }
    
    public void crear(TipoAlimentacion tipoAlimentacion) {
        this.tipoAlimentacionFacade.create(tipoAlimentacion);
    }
    
    public void modificar(TipoAlimentacion tipoAlimentacion) {
        this.tipoAlimentacionFacade.edit(tipoAlimentacion);
    }
    
    public void eliminar(String codigo) {
        TipoAlimentacion tipoAlimentacion = this.tipoAlimentacionFacade.find(codigo);
        this.tipoAlimentacionFacade.remove(tipoAlimentacion);
    }
}
