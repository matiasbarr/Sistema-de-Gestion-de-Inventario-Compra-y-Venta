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
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;

/**
 *
 * @author john-
 */
@Entity
@Table(name = "detalle")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Detalle.findAll", query = "SELECT d FROM Detalle d"),
    @NamedQuery(name = "Detalle.findByIdDetalle", query = "SELECT d FROM Detalle d WHERE d.idDetalle = :idDetalle"),
    @NamedQuery(name = "Detalle.findByCantidad", query = "SELECT d FROM Detalle d WHERE d.cantidad = :cantidad"),
    @NamedQuery(name = "Detalle.findByMontoNeto", query = "SELECT d FROM Detalle d WHERE d.montoNeto = :montoNeto")})
public class Detalle implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id_detalle")
    private Integer idDetalle;
    @Basic(optional = false)
    @NotNull
    @Column(name = "cantidad")
    private double cantidad;
    @Basic(optional = false)
    @NotNull
    @Column(name = "monto_neto")
    private double montoNeto;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "idDetalle")
    private Collection<Compra> compraCollection;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "idDetalle")
    private Collection<Venta> ventaCollection;
    @JoinColumn(name = "id_producto", referencedColumnName = "id_producto")
    @ManyToOne(optional = false)
    private Producto idProducto;

    public Detalle() {
    }

    public Detalle(Integer idDetalle) {
        this.idDetalle = idDetalle;
    }

    public Detalle(Integer idDetalle, double cantidad, double montoNeto) {
        this.idDetalle = idDetalle;
        this.cantidad = cantidad;
        this.montoNeto = montoNeto;
    }

    public Integer getIdDetalle() {
        return idDetalle;
    }

    public void setIdDetalle(Integer idDetalle) {
        this.idDetalle = idDetalle;
    }

    public double getCantidad() {
        return cantidad;
    }

    public void setCantidad(double cantidad) {
        this.cantidad = cantidad;
    }

    public double getMontoNeto() {
        return montoNeto;
    }

    public void setMontoNeto(double montoNeto) {
        this.montoNeto = montoNeto;
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

    public Producto getIdProducto() {
        return idProducto;
    }

    public void setIdProducto(Producto idProducto) {
        this.idProducto = idProducto;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idDetalle != null ? idDetalle.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Detalle)) {
            return false;
        }
        Detalle other = (Detalle) object;
        if ((this.idDetalle == null && other.idDetalle != null) || (this.idDetalle != null && !this.idDetalle.equals(other.idDetalle))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "entidades.Detalle[ idDetalle=" + idDetalle + " ]";
    }
    
}
