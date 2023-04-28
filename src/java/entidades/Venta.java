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
@Table(name = "venta")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Venta.findAll", query = "SELECT v FROM Venta v"),
    @NamedQuery(name = "Venta.findByIdVenta", query = "SELECT v FROM Venta v WHERE v.idVenta = :idVenta"),
    @NamedQuery(name = "Venta.findByRutCliente", query = "SELECT v FROM Venta v WHERE v.rutCliente = :rutCliente")})
public class Venta implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id_venta")
    private Integer idVenta;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 45)
    @Column(name = "rut_cliente")
    private String rutCliente;
    @JoinColumn(name = "id_tipo_origen_venta", referencedColumnName = "id_tipo_origen_venta")
    @ManyToOne(optional = false)
    private TipoOrigenVenta idTipoOrigenVenta;
    @JoinColumn(name = "id_tipo_estado_venta", referencedColumnName = "id_tipo_estado_venta")
    @ManyToOne(optional = false)
    private TipoEstadoVenta idTipoEstadoVenta;
    @JoinColumn(name = "id_cliente", referencedColumnName = "id_cliente")
    @ManyToOne(optional = false)
    private Cliente idCliente;
    @JoinColumn(name = "id_empleado", referencedColumnName = "id_empleado")
    @ManyToOne(optional = false)
    private Empleado idEmpleado;
    @JoinColumn(name = "id_tipo_documento_transaccion", referencedColumnName = "id_tipo_documento_transaccion")
    @ManyToOne(optional = false)
    private TipoDocumentoTransaccion idTipoDocumentoTransaccion;
    @JoinColumn(name = "id_detalle", referencedColumnName = "id_detalle")
    @ManyToOne(optional = false)
    private Detalle idDetalle;

    public Venta() {
    }

    public Venta(Integer idVenta) {
        this.idVenta = idVenta;
    }

    public Venta(Integer idVenta, String rutCliente) {
        this.idVenta = idVenta;
        this.rutCliente = rutCliente;
    }

    public Integer getIdVenta() {
        return idVenta;
    }

    public void setIdVenta(Integer idVenta) {
        this.idVenta = idVenta;
    }

    public String getRutCliente() {
        return rutCliente;
    }

    public void setRutCliente(String rutCliente) {
        this.rutCliente = rutCliente;
    }

    public TipoOrigenVenta getIdTipoOrigenVenta() {
        return idTipoOrigenVenta;
    }

    public void setIdTipoOrigenVenta(TipoOrigenVenta idTipoOrigenVenta) {
        this.idTipoOrigenVenta = idTipoOrigenVenta;
    }

    public TipoEstadoVenta getIdTipoEstadoVenta() {
        return idTipoEstadoVenta;
    }

    public void setIdTipoEstadoVenta(TipoEstadoVenta idTipoEstadoVenta) {
        this.idTipoEstadoVenta = idTipoEstadoVenta;
    }

    public Cliente getIdCliente() {
        return idCliente;
    }

    public void setIdCliente(Cliente idCliente) {
        this.idCliente = idCliente;
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
        hash += (idVenta != null ? idVenta.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Venta)) {
            return false;
        }
        Venta other = (Venta) object;
        if ((this.idVenta == null && other.idVenta != null) || (this.idVenta != null && !this.idVenta.equals(other.idVenta))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "entidades.Venta[ idVenta=" + idVenta + " ]";
    }
    
}
