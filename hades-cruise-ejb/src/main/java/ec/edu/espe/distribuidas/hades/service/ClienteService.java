/*
 * Hades Cruise
 * Aplicaciones Distribuidas
 * NRC: 2434 
 * Tutor: HENRY RAMIRO CORAL CORAL 
 * 2017 (c) Hades Cruise Corp.
 */
package ec.edu.espe.distribuidas.hades.service;

import ec.edu.espe.distribuidas.hades.dao.ClienteFacade;
import ec.edu.espe.distribuidas.hades.model.Cliente;
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
public class ClienteService {

    @EJB
    private ClienteFacade clienteFacade;
    
    public List<Cliente> obtenerTodos() {
        return this.clienteFacade.findAll();
    }
    
    public Cliente obtenerPorIdentificacion(String identificacion) {
        return this.clienteFacade.findByID(identificacion);
    }
    
    public void crear(Cliente cliente) {
        this.clienteFacade.create(cliente);
    }
    
    public void modificar(Cliente cliente) {
        this.clienteFacade.edit(cliente);
    }
    
    public void eliminar(String codigo) {
        Cliente cliente = this.clienteFacade.find(codigo);
        this.clienteFacade.remove(cliente);
    }
}