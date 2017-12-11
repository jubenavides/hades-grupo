/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.distribuidas.hades.model;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Embeddable;
/**
 *
 * @author Hendrix
 */
@Embeddable
public class ClientePK implements Serializable {
    @Column(name = "IDENTIFICACION", nullable = false, length = 15)
    private String identificacion;
    @Column(name = "TIPO_IDENTIFICACION", nullable = false, length = 3)
    private String tipoIdentificacion;

    public ClientePK() {
    }

    public ClientePK(String identificacion, String tipoIdentificacion) {
        this.identificacion = identificacion;
        this.tipoIdentificacion = tipoIdentificacion;
    }

    public String getIdentificacion() {
        return identificacion;
    }

    public void setIdentificacion(String identificacion) {
        this.identificacion = identificacion;
    }

    public String getTipoIdentificacion() {
        return tipoIdentificacion;
    }

    public void setTipoIdentificacion(String tipoIdentificacion) {
        this.tipoIdentificacion = tipoIdentificacion;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (identificacion != null ? identificacion.hashCode() : 0);
        hash += (tipoIdentificacion != null ? tipoIdentificacion.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof ClientePK)) {
            return false;
        }
        ClientePK other = (ClientePK) object;
        if ((this.identificacion == null && other.identificacion != null) || (this.identificacion != null && !this.identificacion.equals(other.identificacion))) {
            return false;
        }
        if ((this.tipoIdentificacion == null && other.tipoIdentificacion != null) || (this.tipoIdentificacion != null && !this.tipoIdentificacion.equals(other.tipoIdentificacion))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "ec.edu.espe.distribuidas.hades.model.ClientePK[ identificacion=" + identificacion + ", tipoIdentificacion=" + tipoIdentificacion + " ]";
    }
    
}
