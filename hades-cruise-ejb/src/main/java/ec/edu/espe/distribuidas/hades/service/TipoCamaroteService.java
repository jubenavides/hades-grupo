/*
 * Hades Cruise
 * Aplicaciones Distribuidas
 * NRC: 2434 
 * Tutor: HENRY RAMIRO CORAL CORAL 
 * 2017 (c) Hades Cruise Corp.
 */
package ec.edu.espe.distribuidas.hades.service;

import ec.edu.espe.distribuidas.hades.dao.TipoCamaroteFacade;
import ec.edu.espe.distribuidas.hades.model.TipoCamarote;
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
public class TipoCamaroteService {

    @EJB
    private TipoCamaroteFacade tipoCamaroteFacade;

    public List<TipoCamarote> obtenerTodos() {
        return this.tipoCamaroteFacade.findAll();
    }

    public TipoCamarote obtenerPorCodigo(String codigo) {
        return this.tipoCamaroteFacade.find(codigo);
    }

    public void crear(TipoCamarote tipoCamarote) {
        this.tipoCamaroteFacade.create(tipoCamarote);
    }

    public void modificar(TipoCamarote tipoCamarote) {
        this.tipoCamaroteFacade.edit(tipoCamarote);
    }

    public void eliminar(String codigo) {
        TipoCamarote tipoCamarote = this.tipoCamaroteFacade.find(codigo);
        this.tipoCamaroteFacade.remove(tipoCamarote);
    }
}
