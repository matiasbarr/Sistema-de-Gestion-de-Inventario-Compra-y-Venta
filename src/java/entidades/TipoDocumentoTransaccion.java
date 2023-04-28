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
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;

/**
 *
 * @author john-
 */
@Entity
@Table(name = "tipo_documento_transaccion")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "TipoDocumentoTransaccion.findAll", query = "SELECT t FROM TipoDocumentoTransaccion t"),
    @NamedQuery(name = "TipoDocumentoTransaccion.findByIdTipoDocumentoTransaccion", query = "SELECT t FROM TipoDocumentoTransaccion t WHERE t.idTipoDocumentoTransaccion = :idTipoDocumentoTransaccion"),
    @NamedQuery(name = "TipoDocumentoTransaccion.findByNumeroDocumento", query = "SELECT t FROM TipoDocumentoTransaccion t WHERE t.numeroDocumento = :numeroDocumento"),
    @NamedQuery(name = "TipoDocumentoTransaccion.findByMontoNeto", query = "SELECT t FROM TipoDocumentoTransaccion t WHERE t.montoNeto = :montoNeto"),
    @NamedQuery(name = "TipoDocumentoTransaccion.findByMontoImpuesto", query = "SELECT t FROM TipoDocumentoTransaccion t WHERE t.montoImpuesto = :montoImpuesto"),
    @NamedQuery(name = "TipoDocumentoTransaccion.findByMontoTotal", query = "SELECT t FROM TipoDocumentoTransaccion t WHERE t.montoTotal = :montoTotal"),
    @NamedQuery(name = "TipoDocumentoTransaccion.findByFechaTransaccion", query = "SELECT t FROM TipoDocumentoTransaccion t WHERE t.fechaTransaccion = :fechaTransaccion")})
public class TipoDocumentoTransaccion implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id_tipo_documento_transaccion")
    private Integer idTipoDocumentoTransaccion;
    @Basic(optional = false)
    @NotNull
    @Column(name = "numero_documento")
    private int numeroDocumento;
    @Basic(optional = false)
    @NotNull
    @Column(name = "monto_neto")
    private double montoNeto;
    @Basic(optional = false)
    @NotNull
    @Column(name = "monto_impuesto")
    private double montoImpuesto;
    @Basic(optional = false)
    @NotNull
    @Column(name = "monto_total")
    private double montoTotal;
    @Basic(optional = false)
    @NotNull
    @Column(name = "fecha_transaccion")
    @Temporal(TemporalType.TIMESTAMP)
    private Date fechaTransaccion;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "idTipoDocumentoTransaccion")
    private Collection<Compra> compraCollection;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "idTipoDocumentoTransaccion")
    private Collection<Venta> ventaCollection;
    @JoinColumn(name = "id_tipo_pago", referencedColumnName = "id_tipo_pago")
    @ManyToOne(optional = false)
    private TipoPago idTipoPago;
    @JoinColumn(name = "id_tipo_documento", referencedColumnName = "id_tipo_documento")
    @ManyToOne(optional = false)
    private TipoDocumento idTipoDocumento;

    public TipoDocumentoTransaccion() {
    }

    public TipoDocumentoTransaccion(Integer idTipoDocumentoTransaccion) {
        this.idTipoDocumentoTransaccion = idTipoDocumentoTransaccion;
    }

    public TipoDocumentoTransaccion(Integer idTipoDocumentoTransaccion, int numeroDocumento, double montoNeto, double montoImpuesto, double montoTotal, Date fechaTransaccion) {
        this.idTipoDocumentoTransaccion = idTipoDocumentoTransaccion;
        this.numeroDocumento = numeroDocumento;
        this.montoNeto = montoNeto;
        this.montoImpuesto = montoImpuesto;
        this.montoTotal = montoTotal;
        this.fechaTransaccion = fechaTransaccion;
    }

    public Integer getIdTipoDocumentoTransaccion() {
        return idTipoDocumentoTransaccion;
    }

    public void setIdTipoDocumentoTransaccion(Integer idTipoDocumentoTransaccion) {
        this.idTipoDocumentoTransaccion = idTipoDocumentoTransaccion;
    }

    public int getNumeroDocumento() {
        return numeroDocumento;
    }

    public void setNumeroDocumento(int numeroDocumento) {
        this.numeroDocumento = numeroDocumento;
    }

    public double getMontoNeto() {
        return montoNeto;
    }

    public void setMontoNeto(double montoNeto) {
        this.montoNeto = montoNeto;
    }

    public double getMontoImpuesto() {
        return montoImpuesto;
    }

    public void setMontoImpuesto(double montoImpuesto) {
        this.montoImpuesto = montoImpuesto;
    }

    public double getMontoTotal() {
        return montoTotal;
    }

    public void setMontoTotal(double montoTotal) {
        this.montoTotal = montoTotal;
    }

    public Date getFechaTransaccion() {
        return fechaTransaccion;
    }

    public void setFechaTransaccion(Date fechaTransaccion) {
        this.fechaTransaccion = fechaTransaccion;
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

    public TipoPago getIdTipoPago() {
        return idTipoPago;
    }

    public void setIdTipoPago(TipoPago idTipoPago) {
        this.idTipoPago = idTipoPago;
    }

    public TipoDocumento getIdTipoDocumento() {
        return idTipoDocumento;
    }

    public void setIdTipoDocumento(TipoDocumento idTipoDocumento) {
        this.idTipoDocumento = idTipoDocumento;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idTipoDocumentoTransaccion != null ? idTipoDocumentoTransaccion.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof TipoDocumentoTransaccion)) {
            return false;
        }
        TipoDocumentoTransaccion other = (TipoDocumentoTransaccion) object;
        if ((this.idTipoDocumentoTransaccion == null && other.idTipoDocumentoTransaccion != null) || (this.idTipoDocumentoTransaccion != null && !this.idTipoDocumentoTransaccion.equals(other.idTipoDocumentoTransaccion))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "entidades.TipoDocumentoTransaccion[ idTipoDocumentoTransaccion=" + idTipoDocumentoTransaccion + " ]";
    }
    
}
