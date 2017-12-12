/*
 * Hades Cruise
 * Aplicaciones Distribuidas
 * NRC: 2434 
 * Tutor: HENRY RAMIRO CORAL CORAL 
 * 2017 (c) Hades Cruise Corp.
 */
package ec.edu.espe.distribuidas.hades.model;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.Table;

/**
 *
 * @author Hades Cruise Corp.
 */
@Entity
@Table(name = "cliente")
public class Cliente implements Serializable {

    private static final long serialVersionUID = 1L;
    
    @EmbeddedId
    protected ClientePK clientePK;
    
    @Column(name = "NOMBRE", nullable = false, length = 100)
    private String nombre;
    
    @Column(name = "APELLIDO", nullable = false, length = 100)
    private String apellido;
    
    @Column(name = "PAIS", nullable = false, length = 60)
    private String pais;
    
    @Column(name = "DIRECCION", length = 256)
    private String direccion;
    
    @Column(name = "TELEFONO", nullable = false, length = 14)
    private String telefono;
    
    @Column(name = "CORREO_ELECTRONICO", nullable = false, length = 130)
    private String correoElectronico;

    public Cliente() {
    }

    public Cliente(ClientePK clientePK) {
        this.clientePK = clientePK;
    }
    
    public Cliente(String identificacion, String tipoIdentificacion) {
        this.clientePK = new ClientePK(identificacion, tipoIdentificacion);
    }

    public ClientePK getClientePK() {
        return clientePK;
    }

    public void setClientePK(ClientePK clientePK) {
        this.clientePK = clientePK;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getPais() {
        return pais;
    }

    public void setPais(String pais) {
        this.pais = pais;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getCorreoElectronico() {
        return correoElectronico;
    }

    public void setCorreoElectronico(String correoElectronico) {
        this.correoElectronico = correoElectronico;
    }
    
    @Override
    public int hashCode() {
        int hash = 0;
        hash += (clientePK != null ? clientePK.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Cliente)) {
            return false;
        }
        Cliente other = (Cliente) object;
        if ((this.clientePK == null && other.clientePK != null) || (this.clientePK != null && !this.clientePK.equals(other.clientePK))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "ec.edu.espe.distribuidas.hades.model.Cliente[ clientePK=" + clientePK + " ]";
    }  
}
