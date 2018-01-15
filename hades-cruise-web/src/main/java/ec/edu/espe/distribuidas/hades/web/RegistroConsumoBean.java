/*
 * Hades Cruise
 * Aplicaciones Distribuidas
 * NRC: 2434 
 * Tutor: HENRY RAMIRO CORAL CORAL 
 * 2017 (c) Hades Cruise Corp.
 */
package ec.edu.espe.distribuidas.hades.web;

import ec.edu.espe.distribuidas.hades.model.Consumo;
import ec.edu.espe.distribuidas.hades.service.ConsumoService;
import java.io.Serializable;
import javax.annotation.PostConstruct;
import javax.faces.view.ViewScoped;
import javax.inject.Inject;
import javax.inject.Named;

/**
 *
 * @author Hades Cruise Corp.
 */
@Named
@ViewScoped
public class RegistroConsumoBean extends BaseBean implements Serializable{
    
    private Consumo consumo;
    
    @Inject
    private ConsumoService consumoService;
    
    @PostConstruct
    public void init()
    {
        
    }

}
