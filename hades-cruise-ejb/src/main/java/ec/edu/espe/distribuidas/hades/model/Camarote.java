/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.distribuidas.hades.model;

import java.util.Objects;
import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

/**
 *
 * @author Hendrix
 */
@Entity
@Table(name="CAMAROTE")
public class Camarote {
    
    @EmbeddedId
    private CamarotePK pk;
    @Column(name="NUMERO", length = 4, nullable = false)
    private Integer numero;
    @Column(name="CAPACIDAD", length = 2, nullable = false)
    private Integer capacidad;
    @Column(name="UBICACION", length = 100)
    private String ubicacion;
    
    @ManyToOne
    @JoinColumn(name="COD_TIPO_CAMAROTE", referencedColumnName = "COD_TIPO_CAMAROTE")
    private TipoCamarote tipoCamarote;
    @ManyToOne
    private Crucero crucero;
    
    
    public Camarote() {
        
    }

    public Camarote(CamarotePK pk) {
        this.pk = pk;
    }

    public CamarotePK getPk() {
        return pk;
    }

    public void setPk(CamarotePK pk) {
        this.pk = pk;
    }

    public Integer getNumero() {
        return numero;
    }

    public void setNumero(Integer numero) {
        this.numero = numero;
    }

    public Integer getCapacidad() {
        return capacidad;
    }

    public void setCapacidad(Integer capacidad) {
        this.capacidad = capacidad;
    }

    public String getUbicacion() {
        return ubicacion;
    }

    public void setUbicacion(String ubicacion) {
        this.ubicacion = ubicacion;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 53 * hash + Objects.hashCode(this.pk);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Camarote other = (Camarote) obj;
        if (!Objects.equals(this.pk, other.pk)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Camarote{" + "pk=" + pk + ", numero=" + numero + ", capacidad=" + capacidad + ", ubicacion=" + ubicacion + '}';
    }
    
    
    
}
