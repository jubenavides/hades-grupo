/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.distribuidas.hades.enums;

/**
 *
 * @author DAVID
 */
public enum EstadoReservaEnum {
    PRE("PRE-RESERVA"),
    RES("RESERVADO"),
    ANU("ANULADO");
    
    String texto;

    private EstadoReservaEnum(String texto) {
        this.texto = texto;
    }
    
    public String getTexto() {
        return texto;
    }
}
