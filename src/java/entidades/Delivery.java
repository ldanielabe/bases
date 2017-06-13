/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entidades;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author maquina2
 */
@Entity
@Table(name = "delivery")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Delivery.findAll", query = "SELECT d FROM Delivery d")
    , @NamedQuery(name = "Delivery.findByIdDelivery", query = "SELECT d FROM Delivery d WHERE d.deliveryPK.idDelivery = :idDelivery")
    , @NamedQuery(name = "Delivery.findByFechaEnvio", query = "SELECT d FROM Delivery d WHERE d.fechaEnvio = :fechaEnvio")
    , @NamedQuery(name = "Delivery.findByFechaLlegada", query = "SELECT d FROM Delivery d WHERE d.fechaLlegada = :fechaLlegada")
    , @NamedQuery(name = "Delivery.findByPedidoidPedido", query = "SELECT d FROM Delivery d WHERE d.deliveryPK.pedidoidPedido = :pedidoidPedido")})
public class Delivery implements Serializable {

    private static final long serialVersionUID = 1L;
    @EmbeddedId
    protected DeliveryPK deliveryPK;
    @Basic(optional = false)
    @Column(name = "fecha_envio")
    @Temporal(TemporalType.TIMESTAMP)
    private Date fechaEnvio;
    @Basic(optional = false)
    @Column(name = "fecha_llegada")
    @Temporal(TemporalType.TIMESTAMP)
    private Date fechaLlegada;
    @JoinColumn(name = "Pedido_idPedido", referencedColumnName = "idPedido", insertable = false, updatable = false)
    @ManyToOne(optional = false)
    private Pedido pedido;

    public Delivery() {
    }

    public Delivery(DeliveryPK deliveryPK) {
        this.deliveryPK = deliveryPK;
    }

    public Delivery(DeliveryPK deliveryPK, Date fechaEnvio, Date fechaLlegada) {
        this.deliveryPK = deliveryPK;
        this.fechaEnvio = fechaEnvio;
        this.fechaLlegada = fechaLlegada;
    }

    public Delivery(int idDelivery, int pedidoidPedido) {
        this.deliveryPK = new DeliveryPK(idDelivery, pedidoidPedido);
    }

    public DeliveryPK getDeliveryPK() {
        return deliveryPK;
    }

    public void setDeliveryPK(DeliveryPK deliveryPK) {
        this.deliveryPK = deliveryPK;
    }

    public Date getFechaEnvio() {
        return fechaEnvio;
    }

    public void setFechaEnvio(Date fechaEnvio) {
        this.fechaEnvio = fechaEnvio;
    }

    public Date getFechaLlegada() {
        return fechaLlegada;
    }

    public void setFechaLlegada(Date fechaLlegada) {
        this.fechaLlegada = fechaLlegada;
    }

    public Pedido getPedido() {
        return pedido;
    }

    public void setPedido(Pedido pedido) {
        this.pedido = pedido;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (deliveryPK != null ? deliveryPK.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Delivery)) {
            return false;
        }
        Delivery other = (Delivery) object;
        if ((this.deliveryPK == null && other.deliveryPK != null) || (this.deliveryPK != null && !this.deliveryPK.equals(other.deliveryPK))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "entidades.Delivery[ deliveryPK=" + deliveryPK + " ]";
    }
    
}
