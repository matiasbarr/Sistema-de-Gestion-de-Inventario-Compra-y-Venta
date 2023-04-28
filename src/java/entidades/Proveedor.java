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
@Table(name = "proveedor")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Proveedor.findAll", query = "SELECT p FROM Proveedor p"),
    @NamedQuery(name = "Proveedor.findByIdProveedor", query = "SELECT p FROM Proveedor p WHERE p.idProveedor = :idProveedor"),
    @NamedQuery(name = "Proveedor.findByRazonSocial", query = "SELECT p FROM Proveedor p WHERE p.razonSocial = :razonSocial"),
    @NamedQuery(name = "Proveedor.findByDireccionProveedor", query = "SELECT p FROM Proveedor p WHERE p.direccionProveedor = :direccionProveedor"),
    @NamedQuery(name = "Proveedor.findByCorreoProveedor", query = "SELECT p FROM Proveedor p WHERE p.correoProveedor = :correoProveedor"),
    @NamedQuery(name = "Proveedor.findByTelefonoProveedor", query = "SELECT p FROM Proveedor p WHERE p.telefonoProveedor = :telefonoProveedor"),
    @NamedQuery(name = "Proveedor.findByDescripcionProveedor", query = "SELECT p FROM Proveedor p WHERE p.descripcionProveedor = :descripcionProveedor"),
    @NamedQuery(name = "Proveedor.findByGiro", query = "SELECT p FROM Proveedor p WHERE p.giro = :giro"),
    @NamedQuery(name = "Proveedor.findByFechaRegistro", query = "SELECT p FROM Proveedor p WHERE p.fechaRegistro = :fechaRegistro")})
public class Proveedor implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id_proveedor")
    private Integer idProveedor;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 45)
    @Column(name = "razon_social")
    private String razonSocial;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 45)
    @Column(name = "direccion_proveedor")
    private String direccionProveedor;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 45)
    @Column(name = "correo_proveedor")
    private String correoProveedor;
    @Basic(optional = false)
    @NotNull
    @Column(name = "telefono_proveedor")
    private int telefonoProveedor;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 45)
    @Column(name = "descripcion_proveedor")
    private String descripcionProveedor;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 45)
    @Column(name = "giro")
    private String giro;
    @Basic(optional = false)
    @NotNull
    @Column(name = "fecha_registro")
    @Temporal(TemporalType.TIMESTAMP)
    private Date fechaRegistro;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "idProveedor")
    private Collection<Compra> compraCollection;

    public Proveedor() {
    }

    public Proveedor(Integer idProveedor) {
        this.idProveedor = idProveedor;
    }

    public Proveedor(Integer idProveedor, String razonSocial, String direccionProveedor, String correoProveedor, int telefonoProveedor, String descripcionProveedor, String giro, Date fechaRegistro) {
        this.idProveedor = idProveedor;
        this.razonSocial = razonSocial;
        this.direccionProveedor = direccionProveedor;
        this.correoProveedor = correoProveedor;
        this.telefonoProveedor = telefonoProveedor;
        this.descripcionProveedor = descripcionProveedor;
        this.giro = giro;
        this.fechaRegistro = fechaRegistro;
    }

    public Integer getIdProveedor() {
        return idProveedor;
    }

    public void setIdProveedor(Integer idProveedor) {
        this.idProveedor = idProveedor;
    }

    public String getRazonSocial() {
        return razonSocial;
    }

    public void setRazonSocial(String razonSocial) {
        this.razonSocial = razonSocial;
    }

    public String getDireccionProveedor() {
        return direccionProveedor;
    }

    public void setDireccionProveedor(String direccionProveedor) {
        this.direccionProveedor = direccionProveedor;
    }

    public String getCorreoProveedor() {
        return correoProveedor;
    }

    public void setCorreoProveedor(String correoProveedor) {
        this.correoProveedor = correoProveedor;
    }

    public int getTelefonoProveedor() {
        return telefonoProveedor;
    }

    public void setTelefonoProveedor(int telefonoProveedor) {
        this.telefonoProveedor = telefonoProveedor;
    }

    public String getDescripcionProveedor() {
        return descripcionProveedor;
    }

    public void setDescripcionProveedor(String descripcionProveedor) {
        this.descripcionProveedor = descripcionProveedor;
    }

    public String getGiro() {
        return giro;
    }

    public void setGiro(String giro) {
        this.giro = giro;
    }

    public Date getFechaRegistro() {
        return fechaRegistro;
    }

    public void setFechaRegistro(Date fechaRegistro) {
        this.fechaRegistro = fechaRegistro;
    }

    @XmlTransient
    public Collection<Compra> getCompraCollection() {
        return compraCollection;
    }

    public void setCompraCollection(Collection<Compra> compraCollection) {
        this.compraCollection = compraCollection;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idProveedor != null ? idProveedor.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Proveedor)) {
            return false;
        }
        Proveedor other = (Proveedor) object;
        if ((this.idProveedor == null && other.idProveedor != null) || (this.idProveedor != null && !this.idProveedor.equals(other.idProveedor))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "entidades.Proveedor[ idProveedor=" + idProveedor + " ]";
    }
    
}
