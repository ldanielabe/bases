/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entidades;

import java.io.Serializable;
import java.util.Collection;
import java.util.Date;
import javax.persistence.Basic;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;

/**
 *
 * @author maquina2
 */
@Entity
@Table(name = "pedido_proveedor")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "PedidoProveedor.findAll", query = "SELECT p FROM PedidoProveedor p")
    , @NamedQuery(name = "PedidoProveedor.findByIdpedidoProveedor", query = "SELECT p FROM PedidoProveedor p WHERE p.idpedidoProveedor = :idpedidoProveedor")
    , @NamedQuery(name = "PedidoProveedor.findByFechaPedido", query = "SELECT p FROM PedidoProveedor p WHERE p.fechaPedido = :fechaPedido")
    , @NamedQuery(name = "PedidoProveedor.findByTotal", query = "SELECT p FROM PedidoProveedor p WHERE p.total = :total")})
public class PedidoProveedor implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "idpedido_proveedor")
    private Integer idpedidoProveedor;
    @Basic(optional = false)
    @Column(name = "fecha_Pedido")
    @Temporal(TemporalType.TIMESTAMP)
    private Date fechaPedido;
    @Basic(optional = false)
    @Column(name = "total")
    private double total;
    @JoinColumn(name = "Usuario_Gerente", referencedColumnName = "cedula")
    @ManyToOne(optional = false)
    private Usuario usuarioGerente;
    @JoinColumn(name = "Usuario_Proveedor", referencedColumnName = "cedula")
    @ManyToOne(optional = false)
    private Usuario usuarioProveedor;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "pedidoProveedor")
    private Collection<PedidoProveedorxproducto> pedidoProveedorxproductoCollection;

    public PedidoProveedor() {
    }

    public PedidoProveedor(Integer idpedidoProveedor) {
        this.idpedidoProveedor = idpedidoProveedor;
    }

    public PedidoProveedor(Integer idpedidoProveedor, Date fechaPedido, double total) {
        this.idpedidoProveedor = idpedidoProveedor;
        this.fechaPedido = fechaPedido;
        this.total = total;
    }

    public Integer getIdpedidoProveedor() {
        return idpedidoProveedor;
    }

    public void setIdpedidoProveedor(Integer idpedidoProveedor) {
        this.idpedidoProveedor = idpedidoProveedor;
    }

    public Date getFechaPedido() {
        return fechaPedido;
    }

    public void setFechaPedido(Date fechaPedido) {
        this.fechaPedido = fechaPedido;
    }

    public double getTotal() {
        return total;
    }

    public void setTotal(double total) {
        this.total = total;
    }

    public Usuario getUsuarioGerente() {
        return usuarioGerente;
    }

    public void setUsuarioGerente(Usuario usuarioGerente) {
        this.usuarioGerente = usuarioGerente;
    }

    public Usuario getUsuarioProveedor() {
        return usuarioProveedor;
    }

    public void setUsuarioProveedor(Usuario usuarioProveedor) {
        this.usuarioProveedor = usuarioProveedor;
    }

    @XmlTransient
    public Collection<PedidoProveedorxproducto> getPedidoProveedorxproductoCollection() {
        return pedidoProveedorxproductoCollection;
    }

    public void setPedidoProveedorxproductoCollection(Collection<PedidoProveedorxproducto> pedidoProveedorxproductoCollection) {
        this.pedidoProveedorxproductoCollection = pedidoProveedorxproductoCollection;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idpedidoProveedor != null ? idpedidoProveedor.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof PedidoProveedor)) {
            return false;
        }
        PedidoProveedor other = (PedidoProveedor) object;
        if ((this.idpedidoProveedor == null && other.idpedidoProveedor != null) || (this.idpedidoProveedor != null && !this.idpedidoProveedor.equals(other.idpedidoProveedor))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "entidades.PedidoProveedor[ idpedidoProveedor=" + idpedidoProveedor + " ]";
    }
    
}
