/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package entidades;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author john-
 */
@Entity
@Table(name = "compra")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Compra.findAll", query = "SELECT c FROM Compra c"),
    @NamedQuery(name = "Compra.findByIdCompra", query = "SELECT c FROM Compra c WHERE c.idCompra = :idCompra"),
    @NamedQuery(name = "Compra.findByRolProveedor", query = "SELECT c FROM Compra c WHERE c.rolProveedor = :rolProveedor"),
    @NamedQuery(name = "Compra.findByRutEncargado", query = "SELECT c FROM Compra c WHERE c.rutEncargado = :rutEncargado")})
public class Compra implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id_compra")
    private Integer idCompra;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 45)
    @Column(name = "rol_proveedor")
    private String rolProveedor;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 45)
    @Column(name = "rut_encargado")
    private String rutEncargado;
    @JoinColumn(name = "id_proveedor", referencedColumnName = "id_proveedor")
    @ManyToOne(optional = false)
    private Proveedor idProveedor;
    @JoinColumn(name = "id_empleado", referencedColumnName = "id_empleado")
    @ManyToOne(optional = false)
    private Empleado idEmpleado;
    @JoinColumn(name = "id_tipo_documento_transaccion", referencedColumnName = "id_tipo_documento_transaccion")
    @ManyToOne(optional = false)
    private TipoDocumentoTransaccion idTipoDocumentoTransaccion;
    @JoinColumn(name = "id_detalle", referencedColumnName = "id_detalle")
    @ManyToOne(optional = false)
    private Detalle idDetalle;

    public Compra() {
    }

    public Compra(Integer idCompra) {
        this.idCompra = idCompra;
    }

    public Compra(Integer idCompra, String rolProveedor, String rutEncargado) {
        this.idCompra = idCompra;
        this.rolProveedor = rolProveedor;
        this.rutEncargado = rutEncargado;
    }

    public Integer getIdCompra() {
        return idCompra;
    }

    public void setIdCompra(Integer idCompra) {
        this.idCompra = idCompra;
    }

    public String getRolProveedor() {
        return rolProveedor;
    }

    public void setRolProveedor(String rolProveedor) {
        this.rolProveedor = rolProveedor;
    }

    public String getRutEncargado() {
        return rutEncargado;
    }

    public void setRutEncargado(String rutEncargado) {
        this.rutEncargado = rutEncargado;
    }

    public Proveedor getIdProveedor() {
        return idProveedor;
    }

    public void setIdProveedor(Proveedor idProveedor) {
        this.idProveedor = idProveedor;
    }

    public Empleado getIdEmpleado() {
        return idEmpleado;
    }

    public void setIdEmpleado(Empleado idEmpleado) {
        this.idEmpleado = idEmpleado;
    }

    public TipoDocumentoTransaccion getIdTipoDocumentoTransaccion() {
        return idTipoDocumentoTransaccion;
    }

    public void setIdTipoDocumentoTransaccion(TipoDocumentoTransaccion idTipoDocumentoTransaccion) {
        this.idTipoDocumentoTransaccion = idTipoDocumentoTransaccion;
    }

    public Detalle getIdDetalle() {
        return idDetalle;
    }

    public void setIdDetalle(Detalle idDetalle) {
        this.idDetalle = idDetalle;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idCompra != null ? idCompra.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Compra)) {
            return false;
        }
        Compra other = (Compra) object;
        if ((this.idCompra == null && other.idCompra != null) || (this.idCompra != null && !this.idCompra.equals(other.idCompra))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "entidades.Compra[ idCompra=" + idCompra + " ]";
    }
    
}
