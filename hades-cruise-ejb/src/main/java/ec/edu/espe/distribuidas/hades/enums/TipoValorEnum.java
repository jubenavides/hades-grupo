/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.distribuidas.hades.enums;

/**
 *
 * @author Eduardo Vera
 */
public enum TipoValorEnum {
    
    POR("PORCENTAJE"),
    VAL("VALOR");
    
    private String texto;
    
    private TipoValorEnum(String texto){
        this.texto = texto;
    }

    public String getTexto() {
        return texto;
    }
    
}
