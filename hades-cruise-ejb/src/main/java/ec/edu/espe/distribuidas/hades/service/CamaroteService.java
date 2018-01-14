/*
 * Hades Cruise
 * Aplicaciones Distribuidas
 * NRC: 2434 
 * Tutor: HENRY RAMIRO CORAL CORAL 
 * 2017 (c) Hades Cruise Corp.
 */
package ec.edu.espe.distribuidas.hades.service;

import ec.edu.espe.distribuidas.hades.dao.CamaroteFacade;
import ec.edu.espe.distribuidas.hades.model.Camarote;
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
public class CamaroteService {

    @EJB
    private CamaroteFacade camaroteFacade;

    public List<Camarote> buscarPorTipo(Integer codCruceroBusqueda, String codTipoCamaroteBusqueda ) {
        return this.camaroteFacade.findByCruceroTipo(codCruceroBusqueda,codTipoCamaroteBusqueda);
    }
}
