/*
 * Hades Cruise
 * Aplicaciones Distribuidas
 * NRC: 2434 
 * Tutor: HENRY RAMIRO CORAL CORAL 
 * 2017 (c) Hades Cruise Corp.
 */
package ec.edu.espe.distribuidas.hades.service;

import ec.edu.espe.distribuidas.hades.dao.MenuFacade;
import ec.edu.espe.distribuidas.hades.model.Menu;
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
public class MenuService {

    @EJB
    private MenuFacade menuFacade;
    
    public List<Menu> obtenerTodos() {
        return this.menuFacade.findAll();
    }
    
    public Menu obtenerPorCodigo(Integer codigo) {
        return this.menuFacade.find(codigo);
    }
    
    public void crear(Menu menu) {
        this.menuFacade.create(menu);
    }
    
    public void modificar(Menu menu) {
        this.menuFacade.edit(menu);
    }
    
    public void eliminar(Integer codigo) {
        Menu menu = this.menuFacade.find(codigo);
        this.menuFacade.remove(menu);
    }
}
