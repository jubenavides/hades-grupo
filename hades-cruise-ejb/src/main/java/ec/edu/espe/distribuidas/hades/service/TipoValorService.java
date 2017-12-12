/*
 * Hades Cruise
 * Aplicaciones Distribuidas
 * NRC: 2434 
 * Tutor: HENRY RAMIRO CORAL CORAL 
 * 2017 (c) Hades Cruise Corp.
 */
package ec.edu.espe.distribuidas.hades.service;

import ec.edu.espe.distribuidas.hades.dao.TipoValorFacade;
import ec.edu.espe.distribuidas.hades.model.TipoValor;
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
public class TipoValorService {

    @EJB
    private TipoValorFacade tipoValorFacade;

    public List<TipoValor> obtenerTodos() {
        return this.tipoValorFacade.findAll();
    }

    public TipoValor obtenerPorCodigo(String codigo) {
        return this.tipoValorFacade.find(codigo);
    }

    public void crear(TipoValor tipoValor) {
        this.tipoValorFacade.create(tipoValor);
    }

    public void modificar(TipoValor tipoTour) {
        this.tipoValorFacade.edit(tipoTour);
    }

    public void eliminar(String codigo) {
        TipoValor tipoValor = this.tipoValorFacade.find(codigo);
        this.tipoValorFacade.remove(tipoValor);
    }
}
