/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entidades;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Embeddable;

/**
 *
 * @author maquina2
 */
@Embeddable
public class PedidoProveedorxproductoPK implements Serializable {

    @Basic(optional = false)
    @Column(name = "Producto_idProducto")
    private int productoidProducto;
    @Basic(optional = false)
    @Column(name = "Pedido_Proveedor_idpedido_proveedor")
    private int pedidoProveedoridpedidoproveedor;

    public PedidoProveedorxproductoPK() {
    }

    public PedidoProveedorxproductoPK(int productoidProducto, int pedidoProveedoridpedidoproveedor) {
        this.productoidProducto = productoidProducto;
        this.pedidoProveedoridpedidoproveedor = pedidoProveedoridpedidoproveedor;
    }

    public int getProductoidProducto() {
        return productoidProducto;
    }

    public void setProductoidProducto(int productoidProducto) {
        this.productoidProducto = productoidProducto;
    }

    public int getPedidoProveedoridpedidoproveedor() {
        return pedidoProveedoridpedidoproveedor;
    }

    public void setPedidoProveedoridpedidoproveedor(int pedidoProveedoridpedidoproveedor) {
        this.pedidoProveedoridpedidoproveedor = pedidoProveedoridpedidoproveedor;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (int) productoidProducto;
        hash += (int) pedidoProveedoridpedidoproveedor;
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof PedidoProveedorxproductoPK)) {
            return false;
        }
        PedidoProveedorxproductoPK other = (PedidoProveedorxproductoPK) object;
        if (this.productoidProducto != other.productoidProducto) {
            return false;
        }
        if (this.pedidoProveedoridpedidoproveedor != other.pedidoProveedoridpedidoproveedor) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "entidades.PedidoProveedorxproductoPK[ productoidProducto=" + productoidProducto + ", pedidoProveedoridpedidoproveedor=" + pedidoProveedoridpedidoproveedor + " ]";
    }
    
}
