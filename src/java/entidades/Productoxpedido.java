/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entidades;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author maquina2
 */
@Entity
@Table(name = "productoxpedido")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Productoxpedido.findAll", query = "SELECT p FROM Productoxpedido p")
    , @NamedQuery(name = "Productoxpedido.findByProductoidProducto", query = "SELECT p FROM Productoxpedido p WHERE p.productoxpedidoPK.productoidProducto = :productoidProducto")
    , @NamedQuery(name = "Productoxpedido.findByPedidoidPedido", query = "SELECT p FROM Productoxpedido p WHERE p.productoxpedidoPK.pedidoidPedido = :pedidoidPedido")
    , @NamedQuery(name = "Productoxpedido.findByCantidad", query = "SELECT p FROM Productoxpedido p WHERE p.cantidad = :cantidad")})
public class Productoxpedido implements Serializable {

    private static final long serialVersionUID = 1L;
    @EmbeddedId
    protected ProductoxpedidoPK productoxpedidoPK;
    @Basic(optional = false)
    @Column(name = "cantidad")
    private int cantidad;
    @JoinColumn(name = "Pedido_idPedido", referencedColumnName = "idPedido", insertable = false, updatable = false)
    @ManyToOne(optional = false)
    private Pedido pedido;
    @JoinColumn(name = "Producto_idProducto", referencedColumnName = "idProducto", insertable = false, updatable = false)
    @ManyToOne(optional = false)
    private Producto producto;

    public Productoxpedido() {
    }

    public Productoxpedido(ProductoxpedidoPK productoxpedidoPK) {
        this.productoxpedidoPK = productoxpedidoPK;
    }

    public Productoxpedido(ProductoxpedidoPK productoxpedidoPK, int cantidad) {
        this.productoxpedidoPK = productoxpedidoPK;
        this.cantidad = cantidad;
    }

    public Productoxpedido(int productoidProducto, int pedidoidPedido) {
        this.productoxpedidoPK = new ProductoxpedidoPK(productoidProducto, pedidoidPedido);
    }

    public ProductoxpedidoPK getProductoxpedidoPK() {
        return productoxpedidoPK;
    }

    public void setProductoxpedidoPK(ProductoxpedidoPK productoxpedidoPK) {
        this.productoxpedidoPK = productoxpedidoPK;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public Pedido getPedido() {
        return pedido;
    }

    public void setPedido(Pedido pedido) {
        this.pedido = pedido;
    }

    public Producto getProducto() {
        return producto;
    }

    public void setProducto(Producto producto) {
        this.producto = producto;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (productoxpedidoPK != null ? productoxpedidoPK.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Productoxpedido)) {
            return false;
        }
        Productoxpedido other = (Productoxpedido) object;
        if ((this.productoxpedidoPK == null && other.productoxpedidoPK != null) || (this.productoxpedidoPK != null && !this.productoxpedidoPK.equals(other.productoxpedidoPK))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "entidades.Productoxpedido[ productoxpedidoPK=" + productoxpedidoPK + " ]";
    }
    
}
