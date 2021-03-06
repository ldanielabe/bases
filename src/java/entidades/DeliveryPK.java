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
public class DeliveryPK implements Serializable {

    @Basic(optional = false)
    @Column(name = "idDelivery")
    private int idDelivery;
    @Basic(optional = false)
    @Column(name = "Pedido_idPedido")
    private int pedidoidPedido;

    public DeliveryPK() {
    }

    public DeliveryPK(int idDelivery, int pedidoidPedido) {
        this.idDelivery = idDelivery;
        this.pedidoidPedido = pedidoidPedido;
    }

    public int getIdDelivery() {
        return idDelivery;
    }

    public void setIdDelivery(int idDelivery) {
        this.idDelivery = idDelivery;
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
        hash += (int) idDelivery;
        hash += (int) pedidoidPedido;
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof DeliveryPK)) {
            return false;
        }
        DeliveryPK other = (DeliveryPK) object;
        if (this.idDelivery != other.idDelivery) {
            return false;
        }
        if (this.pedidoidPedido != other.pedidoidPedido) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "entidades.DeliveryPK[ idDelivery=" + idDelivery + ", pedidoidPedido=" + pedidoidPedido + " ]";
    }
    
}
