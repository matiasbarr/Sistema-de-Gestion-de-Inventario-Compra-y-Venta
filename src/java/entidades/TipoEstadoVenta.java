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
@Table(name = "tipo_estado_venta")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "TipoEstadoVenta.findAll", query = "SELECT t FROM TipoEstadoVenta t"),
    @NamedQuery(name = "TipoEstadoVenta.findByIdTipoEstadoVenta", query = "SELECT t FROM TipoEstadoVenta t WHERE t.idTipoEstadoVenta = :idTipoEstadoVenta"),
    @NamedQuery(name = "TipoEstadoVenta.findByTipoEstado", query = "SELECT t FROM TipoEstadoVenta t WHERE t.tipoEstado = :tipoEstado")})
public class TipoEstadoVenta implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id_tipo_estado_venta")
    private Integer idTipoEstadoVenta;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 45)
    @Column(name = "tipo_estado")
    private String tipoEstado;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "idTipoEstadoVenta")
    private Collection<Venta> ventaCollection;

    public TipoEstadoVenta() {
    }

    public TipoEstadoVenta(Integer idTipoEstadoVenta) {
        this.idTipoEstadoVenta = idTipoEstadoVenta;
    }

    public TipoEstadoVenta(Integer idTipoEstadoVenta, String tipoEstado) {
        this.idTipoEstadoVenta = idTipoEstadoVenta;
        this.tipoEstado = tipoEstado;
    }

    public Integer getIdTipoEstadoVenta() {
        return idTipoEstadoVenta;
    }

    public void setIdTipoEstadoVenta(Integer idTipoEstadoVenta) {
        this.idTipoEstadoVenta = idTipoEstadoVenta;
    }

    public String getTipoEstado() {
        return tipoEstado;
    }

    public void setTipoEstado(String tipoEstado) {
        this.tipoEstado = tipoEstado;
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
        hash += (idTipoEstadoVenta != null ? idTipoEstadoVenta.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof TipoEstadoVenta)) {
            return false;
        }
        TipoEstadoVenta other = (TipoEstadoVenta) object;
        if ((this.idTipoEstadoVenta == null && other.idTipoEstadoVenta != null) || (this.idTipoEstadoVenta != null && !this.idTipoEstadoVenta.equals(other.idTipoEstadoVenta))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "entidades.TipoEstadoVenta[ idTipoEstadoVenta=" + idTipoEstadoVenta + " ]";
    }
    
}
