/*
 * Hades Cruise
 * Aplicaciones Distribuidas
 * NRC: 2434 
 * Tutor: HENRY RAMIRO CORAL CORAL 
 * 2017 (c) Hades Cruise Corp.
 */
package ec.edu.espe.distribuidas.hades.model;

import java.util.Objects;
import javax.persistence.Column;
import javax.persistence.Embeddable;

/**
 *
 * @author Eduardo Vera
 */

@Embeddable
public class CajaSucursalFK {
    
    @Column(name="SUC_CODIGO_SUCURSAL", length = 30, nullable = false)
    private String codSucursal;
    
    @Column(name="EMP_CODIGO_EMPRESA", length = 30, nullable = false)
    private String codEmpresa;

    public CajaSucursalFK() {
    }

    public CajaSucursalFK(String codSucursal, String codEmpresa) {
        this.codSucursal = codSucursal;
        this.codEmpresa = codEmpresa;
    }

    public String getCodSucursal() {
        return codSucursal;
    }

    public void setCodSucursal(String codSucursal) {
        this.codSucursal = codSucursal;
    }

    public String getCodEmpresa() {
        return codEmpresa;
    }

    public void setCodEmpresa(String codEmpresa) {
        this.codEmpresa = codEmpresa;
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 73 * hash + Objects.hashCode(this.codSucursal);
        hash = 73 * hash + Objects.hashCode(this.codEmpresa);
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
        final CajaSucursalFK other = (CajaSucursalFK) obj;
        if (!Objects.equals(this.codSucursal, other.codSucursal)) {
            return false;
        }
        if (!Objects.equals(this.codEmpresa, other.codEmpresa)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "CajaSucursalFK{" + "codSucursal=" + codSucursal + ", codEmpresa=" + codEmpresa + '}';
    }

    
    
}
