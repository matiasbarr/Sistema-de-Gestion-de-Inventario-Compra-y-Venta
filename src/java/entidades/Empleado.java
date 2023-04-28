/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package entidades;

import java.io.Serializable;
import java.util.Collection;
import java.util.Date;
import javax.persistence.Basic;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;

/**
 *
 * @author john-
 */
@Entity
@Table(name = "empleado")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Empleado.findAll", query = "SELECT e FROM Empleado e"),
    @NamedQuery(name = "Empleado.findByIdEmpleado", query = "SELECT e FROM Empleado e WHERE e.idEmpleado = :idEmpleado"),
    @NamedQuery(name = "Empleado.findByRutEmpleado", query = "SELECT e FROM Empleado e WHERE e.rutEmpleado = :rutEmpleado"),
    @NamedQuery(name = "Empleado.findByDvEmpleado", query = "SELECT e FROM Empleado e WHERE e.dvEmpleado = :dvEmpleado"),
    @NamedQuery(name = "Empleado.findByNombreEmpleado", query = "SELECT e FROM Empleado e WHERE e.nombreEmpleado = :nombreEmpleado"),
    @NamedQuery(name = "Empleado.findByApellidoPaterno", query = "SELECT e FROM Empleado e WHERE e.apellidoPaterno = :apellidoPaterno"),
    @NamedQuery(name = "Empleado.findByApellidoMaterno", query = "SELECT e FROM Empleado e WHERE e.apellidoMaterno = :apellidoMaterno"),
    @NamedQuery(name = "Empleado.findByTelefonoEmpleado", query = "SELECT e FROM Empleado e WHERE e.telefonoEmpleado = :telefonoEmpleado"),
    @NamedQuery(name = "Empleado.findByCorreoEmpleado", query = "SELECT e FROM Empleado e WHERE e.correoEmpleado = :correoEmpleado"),
    @NamedQuery(name = "Empleado.findByFechaContrato", query = "SELECT e FROM Empleado e WHERE e.fechaContrato = :fechaContrato")})
public class Empleado implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id_empleado")
    private Integer idEmpleado;
    @Basic(optional = false)
    @NotNull
    @Column(name = "rut_empleado")
    private int rutEmpleado;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 2)
    @Column(name = "dv_empleado")
    private String dvEmpleado;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 45)
    @Column(name = "nombre_empleado")
    private String nombreEmpleado;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 45)
    @Column(name = "apellido_paterno")
    private String apellidoPaterno;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 45)
    @Column(name = "apellido_materno")
    private String apellidoMaterno;
    @Basic(optional = false)
    @NotNull
    @Column(name = "telefono_empleado")
    private int telefonoEmpleado;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 45)
    @Column(name = "correo_empleado")
    private String correoEmpleado;
    @Basic(optional = false)
    @NotNull
    @Column(name = "fecha_contrato")
    @Temporal(TemporalType.TIMESTAMP)
    private Date fechaContrato;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "idEmpleado")
    private Collection<Compra> compraCollection;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "idEmpleado")
    private Collection<Venta> ventaCollection;
    @JoinColumn(name = "id_cargo_empleado", referencedColumnName = "id_cargo_empleado")
    @ManyToOne(optional = false)
    private CargoEmpleado idCargoEmpleado;

    public Empleado() {
    }

    public Empleado(Integer idEmpleado) {
        this.idEmpleado = idEmpleado;
    }

    public Empleado(Integer idEmpleado, int rutEmpleado, String dvEmpleado, String nombreEmpleado, String apellidoPaterno, String apellidoMaterno, int telefonoEmpleado, String correoEmpleado, Date fechaContrato) {
        this.idEmpleado = idEmpleado;
        this.rutEmpleado = rutEmpleado;
        this.dvEmpleado = dvEmpleado;
        this.nombreEmpleado = nombreEmpleado;
        this.apellidoPaterno = apellidoPaterno;
        this.apellidoMaterno = apellidoMaterno;
        this.telefonoEmpleado = telefonoEmpleado;
        this.correoEmpleado = correoEmpleado;
        this.fechaContrato = fechaContrato;
    }

    public Integer getIdEmpleado() {
        return idEmpleado;
    }

    public void setIdEmpleado(Integer idEmpleado) {
        this.idEmpleado = idEmpleado;
    }

    public int getRutEmpleado() {
        return rutEmpleado;
    }

    public void setRutEmpleado(int rutEmpleado) {
        this.rutEmpleado = rutEmpleado;
    }

    public String getDvEmpleado() {
        return dvEmpleado;
    }

    public void setDvEmpleado(String dvEmpleado) {
        this.dvEmpleado = dvEmpleado;
    }

    public String getNombreEmpleado() {
        return nombreEmpleado;
    }

    public void setNombreEmpleado(String nombreEmpleado) {
        this.nombreEmpleado = nombreEmpleado;
    }

    public String getApellidoPaterno() {
        return apellidoPaterno;
    }

    public void setApellidoPaterno(String apellidoPaterno) {
        this.apellidoPaterno = apellidoPaterno;
    }

    public String getApellidoMaterno() {
        return apellidoMaterno;
    }

    public void setApellidoMaterno(String apellidoMaterno) {
        this.apellidoMaterno = apellidoMaterno;
    }

    public int getTelefonoEmpleado() {
        return telefonoEmpleado;
    }

    public void setTelefonoEmpleado(int telefonoEmpleado) {
        this.telefonoEmpleado = telefonoEmpleado;
    }

    public String getCorreoEmpleado() {
        return correoEmpleado;
    }

    public void setCorreoEmpleado(String correoEmpleado) {
        this.correoEmpleado = correoEmpleado;
    }

    public Date getFechaContrato() {
        return fechaContrato;
    }

    public void setFechaContrato(Date fechaContrato) {
        this.fechaContrato = fechaContrato;
    }

    @XmlTransient
    public Collection<Compra> getCompraCollection() {
        return compraCollection;
    }

    public void setCompraCollection(Collection<Compra> compraCollection) {
        this.compraCollection = compraCollection;
    }

    @XmlTransient
    public Collection<Venta> getVentaCollection() {
        return ventaCollection;
    }

    public void setVentaCollection(Collection<Venta> ventaCollection) {
        this.ventaCollection = ventaCollection;
    }

    public CargoEmpleado getIdCargoEmpleado() {
        return idCargoEmpleado;
    }

    public void setIdCargoEmpleado(CargoEmpleado idCargoEmpleado) {
        this.idCargoEmpleado = idCargoEmpleado;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idEmpleado != null ? idEmpleado.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Empleado)) {
            return false;
        }
        Empleado other = (Empleado) object;
        if ((this.idEmpleado == null && other.idEmpleado != null) || (this.idEmpleado != null && !this.idEmpleado.equals(other.idEmpleado))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "entidades.Empleado[ idEmpleado=" + idEmpleado + " ]";
    }
    
}
