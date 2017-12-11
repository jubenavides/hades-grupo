/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.distribuidas.hades.model;

import ec.edu.espe.distribuidas.hades.enums.MenuEnum;
import java.io.Serializable;
import java.math.BigDecimal;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 *
 * @author Hendrix
 */
@Entity
@Table(name = "menu")
public class Menu implements Serializable {

    @Id
    @Column(name = "COD_ITEM", nullable = false)
    private Integer codItem;
    @Column(name = "NOMBRE", nullable = false, length = 100)
    private String nombre;
    @Column(name = "DESCRIPCION", length = 300)
    private String descripcion;
    @Column(name = "PRECIO", nullable = false, precision = 8, scale = 2)
    private BigDecimal precio;
    @Enumerated(EnumType.STRING)
    @Column(name = "TIPO", nullable = false, length = 5)
    private MenuEnum tipo;

    public Menu() {
    }

    public Menu(Integer codItem) {
        this.codItem = codItem;
    }


    public Integer getCodItem() {
        return codItem;
    }

    public void setCodItem(Integer codItem) {
        this.codItem = codItem;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public BigDecimal getPrecio() {
        return precio;
    }

    public void setPrecio(BigDecimal precio) {
        this.precio = precio;
    }

    public MenuEnum getTipo() {
        return tipo;
    }

    public void setTipo(MenuEnum tipo) {
        this.tipo = tipo;
    }


    @Override
    public int hashCode() {
        int hash = 0;
        hash += (codItem != null ? codItem.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Menu)) {
            return false;
        }
        Menu other = (Menu) object;
        if ((this.codItem == null && other.codItem != null) || (this.codItem != null && !this.codItem.equals(other.codItem))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "ec.edu.espe.distribuidas.hades.model.Menu[ codItem=" + codItem + " ]";
    }
    
}
