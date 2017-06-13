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
@Table(name = "pedido_proveedorxproducto")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "PedidoProveedorxproducto.findAll", query = "SELECT p FROM PedidoProveedorxproducto p")
    , @NamedQuery(name = "PedidoProveedorxproducto.findByProductoidProducto", query = "SELECT p FROM PedidoProveedorxproducto p WHERE p.pedidoProveedorxproductoPK.productoidProducto = :productoidProducto")
    , @NamedQuery(name = "PedidoProveedorxproducto.findByPedidoProveedoridpedidoproveedor", query = "SELECT p FROM PedidoProveedorxproducto p WHERE p.pedidoProveedorxproductoPK.pedidoProveedoridpedidoproveedor = :pedidoProveedoridpedidoproveedor")
    , @NamedQuery(name = "PedidoProveedorxproducto.findByCantidad", query = "SELECT p FROM PedidoProveedorxproducto p WHERE p.cantidad = :cantidad")})
public class PedidoProveedorxproducto implements Serializable {

    private static final long serialVersionUID = 1L;
    @EmbeddedId
    protected PedidoProveedorxproductoPK pedidoProveedorxproductoPK;
    @Basic(optional = false)
    @Column(name = "cantidad")
    private int cantidad;
    @JoinColumn(name = "Pedido_Proveedor_idpedido_proveedor", referencedColumnName = "idpedido_proveedor", insertable = false, updatable = false)
    @ManyToOne(optional = false)
    private PedidoProveedor pedidoProveedor;
    @JoinColumn(name = "Producto_idProducto", referencedColumnName = "idProducto", insertable = false, updatable = false)
    @ManyToOne(optional = false)
    private Producto producto;

    public PedidoProveedorxproducto() {
    }

    public PedidoProveedorxproducto(PedidoProveedorxproductoPK pedidoProveedorxproductoPK) {
        this.pedidoProveedorxproductoPK = pedidoProveedorxproductoPK;
    }

    public PedidoProveedorxproducto(PedidoProveedorxproductoPK pedidoProveedorxproductoPK, int cantidad) {
        this.pedidoProveedorxproductoPK = pedidoProveedorxproductoPK;
        this.cantidad = cantidad;
    }

    public PedidoProveedorxproducto(int productoidProducto, int pedidoProveedoridpedidoproveedor) {
        this.pedidoProveedorxproductoPK = new PedidoProveedorxproductoPK(productoidProducto, pedidoProveedoridpedidoproveedor);
    }

    public PedidoProveedorxproductoPK getPedidoProveedorxproductoPK() {
        return pedidoProveedorxproductoPK;
    }

    public void setPedidoProveedorxproductoPK(PedidoProveedorxproductoPK pedidoProveedorxproductoPK) {
        this.pedidoProveedorxproductoPK = pedidoProveedorxproductoPK;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public PedidoProveedor getPedidoProveedor() {
        return pedidoProveedor;
    }

    public void setPedidoProveedor(PedidoProveedor pedidoProveedor) {
        this.pedidoProveedor = pedidoProveedor;
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
        hash += (pedidoProveedorxproductoPK != null ? pedidoProveedorxproductoPK.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof PedidoProveedorxproducto)) {
            return false;
        }
        PedidoProveedorxproducto other = (PedidoProveedorxproducto) object;
        if ((this.pedidoProveedorxproductoPK == null && other.pedidoProveedorxproductoPK != null) || (this.pedidoProveedorxproductoPK != null && !this.pedidoProveedorxproductoPK.equals(other.pedidoProveedorxproductoPK))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "entidades.PedidoProveedorxproducto[ pedidoProveedorxproductoPK=" + pedidoProveedorxproductoPK + " ]";
    }
    
}
