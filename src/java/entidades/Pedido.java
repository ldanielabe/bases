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
@Table(name = "pedido")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Pedido.findAll", query = "SELECT p FROM Pedido p")
    , @NamedQuery(name = "Pedido.findByIdPedido", query = "SELECT p FROM Pedido p WHERE p.idPedido = :idPedido")
    , @NamedQuery(name = "Pedido.findByFechaPedido", query = "SELECT p FROM Pedido p WHERE p.fechaPedido = :fechaPedido")
    , @NamedQuery(name = "Pedido.findByTotal", query = "SELECT p FROM Pedido p WHERE p.total = :total")})
public class Pedido implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "idPedido")
    private Integer idPedido;
    @Basic(optional = false)
    @Column(name = "fecha_pedido")
    @Temporal(TemporalType.TIMESTAMP)
    private Date fechaPedido;
    @Basic(optional = false)
    @Column(name = "total")
    private double total;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "pedido")
    private Collection<Delivery> deliveryCollection;
    @JoinColumn(name = "Usuario_vendedor", referencedColumnName = "cedula")
    @ManyToOne(optional = false)
    private Usuario usuariovendedor;
    @JoinColumn(name = "Usuario_comprador", referencedColumnName = "cedula")
    @ManyToOne(optional = false)
    private Usuario usuariocomprador;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "pedido")
    private Collection<Productoxpedido> productoxpedidoCollection;

    public Pedido() {
    }

    public Pedido(Integer idPedido) {
        this.idPedido = idPedido;
    }

    public Pedido(Integer idPedido, Date fechaPedido, double total) {
        this.idPedido = idPedido;
        this.fechaPedido = fechaPedido;
        this.total = total;
    }

    public Integer getIdPedido() {
        return idPedido;
    }

    public void setIdPedido(Integer idPedido) {
        this.idPedido = idPedido;
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

    @XmlTransient
    public Collection<Delivery> getDeliveryCollection() {
        return deliveryCollection;
    }

    public void setDeliveryCollection(Collection<Delivery> deliveryCollection) {
        this.deliveryCollection = deliveryCollection;
    }

    public Usuario getUsuariovendedor() {
        return usuariovendedor;
    }

    public void setUsuariovendedor(Usuario usuariovendedor) {
        this.usuariovendedor = usuariovendedor;
    }

    public Usuario getUsuariocomprador() {
        return usuariocomprador;
    }

    public void setUsuariocomprador(Usuario usuariocomprador) {
        this.usuariocomprador = usuariocomprador;
    }

    @XmlTransient
    public Collection<Productoxpedido> getProductoxpedidoCollection() {
        return productoxpedidoCollection;
    }

    public void setProductoxpedidoCollection(Collection<Productoxpedido> productoxpedidoCollection) {
        this.productoxpedidoCollection = productoxpedidoCollection;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idPedido != null ? idPedido.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Pedido)) {
            return false;
        }
        Pedido other = (Pedido) object;
        if ((this.idPedido == null && other.idPedido != null) || (this.idPedido != null && !this.idPedido.equals(other.idPedido))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "entidades.Pedido[ idPedido=" + idPedido + " ]";
    }
    
}
