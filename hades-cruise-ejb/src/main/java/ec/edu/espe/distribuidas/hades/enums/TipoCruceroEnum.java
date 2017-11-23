/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.distribuidas.hades.enums;

/**
 *
 * @author Hendrix
 */
public enum TipoCruceroEnum {
    
    OME("OMEGA"),
    ALF("ALFA");
    
    private String texto;
    
    private TipoCruceroEnum(String texto){
        this.texto = texto;
    }

    public String getTexto() {
        return texto;
    }
    
    
}
