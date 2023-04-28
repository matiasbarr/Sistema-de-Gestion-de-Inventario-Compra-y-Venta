/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package entidades;

import java.io.Serializable;
import java.util.Collection;
import javax.persistence.Basic;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;

/**
 *
 * @author john-
 */
@Entity
@Table(name = "cargo_empleado")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "CargoEmpleado.findAll", query = "SELECT c FROM CargoEmpleado c"),
    @NamedQuery(name = "CargoEmpleado.findByIdCargoEmpleado", query = "SELECT c FROM CargoEmpleado c WHERE c.idCargoEmpleado = :idCargoEmpleado"),
    @NamedQuery(name = "CargoEmpleado.findByCargoEmpleado", query = "SELECT c FROM CargoEmpleado c WHERE c.cargoEmpleado = :cargoEmpleado")})
public class CargoEmpleado implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id_cargo_empleado")
    private Integer idCargoEmpleado;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 45)
    @Column(name = "cargo_empleado")
    private String cargoEmpleado;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "idCargoEmpleado")
    private Collection<Empleado> empleadoCollection;

    public CargoEmpleado() {
    }

    public CargoEmpleado(Integer idCargoEmpleado) {
        this.idCargoEmpleado = idCargoEmpleado;
    }

    public CargoEmpleado(Integer idCargoEmpleado, String cargoEmpleado) {
        this.idCargoEmpleado = idCargoEmpleado;
        this.cargoEmpleado = cargoEmpleado;
    }

    public Integer getIdCargoEmpleado() {
        return idCargoEmpleado;
    }

    public void setIdCargoEmpleado(Integer idCargoEmpleado) {
        this.idCargoEmpleado = idCargoEmpleado;
    }

    public String getCargoEmpleado() {
        return cargoEmpleado;
    }

    public void setCargoEmpleado(String cargoEmpleado) {
        this.cargoEmpleado = cargoEmpleado;
    }

    @XmlTransient
    public Collection<Empleado> getEmpleadoCollection() {
        return empleadoCollection;
    }

    public void setEmpleadoCollection(Collection<Empleado> empleadoCollection) {
        this.empleadoCollection = empleadoCollection;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idCargoEmpleado != null ? idCargoEmpleado.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof CargoEmpleado)) {
            return false;
        }
        CargoEmpleado other = (CargoEmpleado) object;
        if ((this.idCargoEmpleado == null && other.idCargoEmpleado != null) || (this.idCargoEmpleado != null && !this.idCargoEmpleado.equals(other.idCargoEmpleado))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "entidades.CargoEmpleado[ idCargoEmpleado=" + idCargoEmpleado + " ]";
    }
    
}
