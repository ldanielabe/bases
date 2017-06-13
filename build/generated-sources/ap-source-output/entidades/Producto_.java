package entidades;

import entidades.EntradaProducto;
import entidades.Pedido;
import entidades.Proveedor;
import javax.annotation.Generated;
import javax.persistence.metamodel.CollectionAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.6.1.v20150605-rNA", date="2017-06-12T08:53:50")
@StaticMetamodel(Producto.class)
public class Producto_ { 

    public static volatile SingularAttribute<Producto, String> descripcion;
    public static volatile CollectionAttribute<Producto, EntradaProducto> entradaProductoCollection;
    public static volatile SingularAttribute<Producto, Integer> precio;
    public static volatile SingularAttribute<Producto, Integer> stack;
    public static volatile CollectionAttribute<Producto, Proveedor> proveedorCollection;
    public static volatile SingularAttribute<Producto, Integer> id;
    public static volatile CollectionAttribute<Producto, Pedido> pedidoCollection;
    public static volatile SingularAttribute<Producto, String> nombre;

}