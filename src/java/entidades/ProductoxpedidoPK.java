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
public class ProductoxpedidoPK implements Serializable {

    @Basic(optional = false)
    @Column(name = "Producto_idProducto")
    private int productoidProducto;
    @Basic(optional = false)
    @Column(name = "Pedido_idPedido")
    private int pedidoidPedido;

    public ProductoxpedidoPK() {
    }

    public ProductoxpedidoPK(int productoidProducto, int pedidoidPedido) {
        this.productoidProducto = productoidProducto;
        this.pedidoidPedido = pedidoidPedido;
    }

    public int getProductoidProducto() {
        return productoidProducto;
    }

    public void setProductoidProducto(int productoidProducto) {
        this.productoidProducto = productoidProducto;
    }

    public int getPedidoidPedido() {
        return pedidoidPedido;
    }

    public void setPedidoidPedido(int pedidoidPedido) {
        this.pedidoidPedido = pedidoidPedido;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (int) productoidProducto;
        hash += (int) pedidoidPedido;
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof ProductoxpedidoPK)) {
            return false;
        }
        ProductoxpedidoPK other = (ProductoxpedidoPK) object;
        if (this.productoidProducto != other.productoidProducto) {
            return false;
        }
        if (this.pedidoidPedido != other.pedidoidPedido) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "entidades.ProductoxpedidoPK[ productoidProducto=" + productoidProducto + ", pedidoidPedido=" + pedidoidPedido + " ]";
    }
    
}
