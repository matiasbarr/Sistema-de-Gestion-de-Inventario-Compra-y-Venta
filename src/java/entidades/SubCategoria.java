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
@Table(name = "sub_categoria")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "SubCategoria.findAll", query = "SELECT s FROM SubCategoria s"),
    @NamedQuery(name = "SubCategoria.findByIdSubCategoria", query = "SELECT s FROM SubCategoria s WHERE s.idSubCategoria = :idSubCategoria"),
    @NamedQuery(name = "SubCategoria.findBySubCategoria", query = "SELECT s FROM SubCategoria s WHERE s.subCategoria = :subCategoria")})
public class SubCategoria implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id_sub_categoria")
    private Integer idSubCategoria;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 45)
    @Column(name = "sub_categoria")
    private String subCategoria;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "idSubCategoria")
    private Collection<Producto> productoCollection;

    public SubCategoria() {
    }

    public SubCategoria(Integer idSubCategoria) {
        this.idSubCategoria = idSubCategoria;
    }

    public SubCategoria(Integer idSubCategoria, String subCategoria) {
        this.idSubCategoria = idSubCategoria;
        this.subCategoria = subCategoria;
    }

    public Integer getIdSubCategoria() {
        return idSubCategoria;
    }

    public void setIdSubCategoria(Integer idSubCategoria) {
        this.idSubCategoria = idSubCategoria;
    }

    public String getSubCategoria() {
        return subCategoria;
    }

    public void setSubCategoria(String subCategoria) {
        this.subCategoria = subCategoria;
    }

    @XmlTransient
    public Collection<Producto> getProductoCollection() {
        return productoCollection;
    }

    public void setProductoCollection(Collection<Producto> productoCollection) {
        this.productoCollection = productoCollection;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idSubCategoria != null ? idSubCategoria.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof SubCategoria)) {
            return false;
        }
        SubCategoria other = (SubCategoria) object;
        if ((this.idSubCategoria == null && other.idSubCategoria != null) || (this.idSubCategoria != null && !this.idSubCategoria.equals(other.idSubCategoria))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "entidades.SubCategoria[ idSubCategoria=" + idSubCategoria + " ]";
    }
    
}
