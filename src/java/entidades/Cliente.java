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
@Table(name = "cliente")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Cliente.findAll", query = "SELECT c FROM Cliente c"),
    @NamedQuery(name = "Cliente.findByIdCliente", query = "SELECT c FROM Cliente c WHERE c.idCliente = :idCliente"),
    @NamedQuery(name = "Cliente.findByRutCliente", query = "SELECT c FROM Cliente c WHERE c.rutCliente = :rutCliente"),
    @NamedQuery(name = "Cliente.findByDvCliente", query = "SELECT c FROM Cliente c WHERE c.dvCliente = :dvCliente"),
    @NamedQuery(name = "Cliente.findByNombreCliente", query = "SELECT c FROM Cliente c WHERE c.nombreCliente = :nombreCliente"),
    @NamedQuery(name = "Cliente.findByApellidoPaternoCliente", query = "SELECT c FROM Cliente c WHERE c.apellidoPaternoCliente = :apellidoPaternoCliente"),
    @NamedQuery(name = "Cliente.findByApellidoMaternoCliente", query = "SELECT c FROM Cliente c WHERE c.apellidoMaternoCliente = :apellidoMaternoCliente"),
    @NamedQuery(name = "Cliente.findByDireccionCliente", query = "SELECT c FROM Cliente c WHERE c.direccionCliente = :direccionCliente"),
    @NamedQuery(name = "Cliente.findByTelefonoCliente", query = "SELECT c FROM Cliente c WHERE c.telefonoCliente = :telefonoCliente"),
    @NamedQuery(name = "Cliente.findByCorreoCliente", query = "SELECT c FROM Cliente c WHERE c.correoCliente = :correoCliente"),
    @NamedQuery(name = "Cliente.findByPasswordCliente", query = "SELECT c FROM Cliente c WHERE c.passwordCliente = :passwordCliente"),
    @NamedQuery(name = "Cliente.findByFechaRegistro", query = "SELECT c FROM Cliente c WHERE c.fechaRegistro = :fechaRegistro")})
public class Cliente implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id_cliente")
    private Integer idCliente;
    @Basic(optional = false)
    @NotNull
    @Column(name = "rut_cliente")
    private int rutCliente;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 2)
    @Column(name = "dv_cliente")
    private String dvCliente;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 50)
    @Column(name = "nombre_cliente")
    private String nombreCliente;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 50)
    @Column(name = "apellido_paterno_cliente")
    private String apellidoPaternoCliente;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 50)
    @Column(name = "apellido_materno_cliente")
    private String apellidoMaternoCliente;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 50)
    @Column(name = "direccion_cliente")
    private String direccionCliente;
    @Basic(optional = false)
    @NotNull
    @Column(name = "telefono_cliente")
    private int telefonoCliente;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 50)
    @Column(name = "correo_cliente")
    private String correoCliente;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 22)
    @Column(name = "password_cliente")
    private String passwordCliente;
    @Basic(optional = false)
    @NotNull
    @Column(name = "fecha_registro")
    @Temporal(TemporalType.TIMESTAMP)
    private Date fechaRegistro;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "idCliente")
    private Collection<Venta> ventaCollection;

    public Cliente() {
    }

    public Cliente(Integer idCliente) {
        this.idCliente = idCliente;
    }

    public Cliente(Integer idCliente, int rutCliente, String dvCliente, String nombreCliente, String apellidoPaternoCliente, String apellidoMaternoCliente, String direccionCliente, int telefonoCliente, String correoCliente, String passwordCliente, Date fechaRegistro) {
        this.idCliente = idCliente;
        this.rutCliente = rutCliente;
        this.dvCliente = dvCliente;
        this.nombreCliente = nombreCliente;
        this.apellidoPaternoCliente = apellidoPaternoCliente;
        this.apellidoMaternoCliente = apellidoMaternoCliente;
        this.direccionCliente = direccionCliente;
        this.telefonoCliente = telefonoCliente;
        this.correoCliente = correoCliente;
        this.passwordCliente = passwordCliente;
        this.fechaRegistro = fechaRegistro;
    }

    public Integer getIdCliente() {
        return idCliente;
    }

    public void setIdCliente(Integer idCliente) {
        this.idCliente = idCliente;
    }

    public int getRutCliente() {
        return rutCliente;
    }

    public void setRutCliente(int rutCliente) {
        this.rutCliente = rutCliente;
    }

    public String getDvCliente() {
        return dvCliente;
    }

    public void setDvCliente(String dvCliente) {
        this.dvCliente = dvCliente;
    }

    public String getNombreCliente() {
        return nombreCliente;
    }

    public void setNombreCliente(String nombreCliente) {
        this.nombreCliente = nombreCliente;
    }

    public String getApellidoPaternoCliente() {
        return apellidoPaternoCliente;
    }

    public void setApellidoPaternoCliente(String apellidoPaternoCliente) {
        this.apellidoPaternoCliente = apellidoPaternoCliente;
    }

    public String getApellidoMaternoCliente() {
        return apellidoMaternoCliente;
    }

    public void setApellidoMaternoCliente(String apellidoMaternoCliente) {
        this.apellidoMaternoCliente = apellidoMaternoCliente;
    }

    public String getDireccionCliente() {
        return direccionCliente;
    }

    public void setDireccionCliente(String direccionCliente) {
        this.direccionCliente = direccionCliente;
    }

    public int getTelefonoCliente() {
        return telefonoCliente;
    }

    public void setTelefonoCliente(int telefonoCliente) {
        this.telefonoCliente = telefonoCliente;
    }

    public String getCorreoCliente() {
        return correoCliente;
    }

    public void setCorreoCliente(String correoCliente) {
        this.correoCliente = correoCliente;
    }

    public String getPasswordCliente() {
        return passwordCliente;
    }

    public void setPasswordCliente(String passwordCliente) {
        this.passwordCliente = passwordCliente;
    }

    public Date getFechaRegistro() {
        return fechaRegistro;
    }

    public void setFechaRegistro(Date fechaRegistro) {
        this.fechaRegistro = fechaRegistro;
    }

    @XmlTransient
    public Collection<Venta> getVentaCollection() {
        return ventaCollection;
    }

    public void setVentaCollection(Collection<Venta> ventaCollection) {
        this.ventaCollection = ventaCollection;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idCliente != null ? idCliente.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Cliente)) {
            return false;
        }
        Cliente other = (Cliente) object;
        if ((this.idCliente == null && other.idCliente != null) || (this.idCliente != null && !this.idCliente.equals(other.idCliente))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "entidades.Cliente[ idCliente=" + idCliente + " ]";
    }
    
}
