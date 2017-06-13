package entidades;

import entidades.Cliente;
import entidades.Contador;
import entidades.Envio;
import entidades.Producto;
import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.CollectionAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.6.1.v20150605-rNA", date="2017-06-12T08:53:50")
@StaticMetamodel(Pedido.class)
public class Pedido_ { 

    public static volatile SingularAttribute<Pedido, Date> fecha;
    public static volatile SingularAttribute<Pedido, Integer> cantidadP;
    public static volatile CollectionAttribute<Pedido, Envio> envioCollection;
    public static volatile SingularAttribute<Pedido, Contador> idContador;
    public static volatile SingularAttribute<Pedido, Integer> codigo;
    public static volatile SingularAttribute<Pedido, Cliente> idCliente;
    public static volatile SingularAttribute<Pedido, String> idVendedor;
    public static volatile SingularAttribute<Pedido, Producto> idProducto;

}