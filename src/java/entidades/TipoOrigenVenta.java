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
@Table(name = "tipo_origen_venta")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "TipoOrigenVenta.findAll", query = "SELECT t FROM TipoOrigenVenta t"),
    @NamedQuery(name = "TipoOrigenVenta.findByIdTipoOrigenVenta", query = "SELECT t FROM TipoOrigenVenta t WHERE t.idTipoOrigenVenta = :idTipoOrigenVenta"),
    @NamedQuery(name = "TipoOrigenVenta.findByTipoOrigen", query = "SELECT t FROM TipoOrigenVenta t WHERE t.tipoOrigen = :tipoOrigen")})
public class TipoOrigenVenta implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id_tipo_origen_venta")
    private Integer idTipoOrigenVenta;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 45)
    @Column(name = "tipo_origen")
    private String tipoOrigen;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "idTipoOrigenVenta")
    private Collection<Venta> ventaCollection;

    public TipoOrigenVenta() {
    }

    public TipoOrigenVenta(Integer idTipoOrigenVenta) {
        this.idTipoOrigenVenta = idTipoOrigenVenta;
    }

    public TipoOrigenVenta(Integer idTipoOrigenVenta, String tipoOrigen) {
        this.idTipoOrigenVenta = idTipoOrigenVenta;
        this.tipoOrigen = tipoOrigen;
    }

    public Integer getIdTipoOrigenVenta() {
        return idTipoOrigenVenta;
    }

    public void setIdTipoOrigenVenta(Integer idTipoOrigenVenta) {
        this.idTipoOrigenVenta = idTipoOrigenVenta;
    }

    public String getTipoOrigen() {
        return tipoOrigen;
    }

    public void setTipoOrigen(String tipoOrigen) {
        this.tipoOrigen = tipoOrigen;
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
        hash += (idTipoOrigenVenta != null ? idTipoOrigenVenta.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof TipoOrigenVenta)) {
            return false;
        }
        TipoOrigenVenta other = (TipoOrigenVenta) object;
        if ((this.idTipoOrigenVenta == null && other.idTipoOrigenVenta != null) || (this.idTipoOrigenVenta != null && !this.idTipoOrigenVenta.equals(other.idTipoOrigenVenta))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "entidades.TipoOrigenVenta[ idTipoOrigenVenta=" + idTipoOrigenVenta + " ]";
    }
    
}
