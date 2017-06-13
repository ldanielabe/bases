package entidades;

import entidades.EntradaProducto;
import entidades.Producto;
import javax.annotation.Generated;
import javax.persistence.metamodel.CollectionAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.6.1.v20150605-rNA", date="2017-06-12T08:53:50")
@StaticMetamodel(Proveedor.class)
public class Proveedor_ { 

    public static volatile CollectionAttribute<Proveedor, EntradaProducto> entradaProductoCollection;
    public static volatile SingularAttribute<Proveedor, String> cedula;
    public static volatile SingularAttribute<Proveedor, String> direccion;
    public static volatile SingularAttribute<Proveedor, Integer> cod;
    public static volatile CollectionAttribute<Proveedor, Producto> productoCollection;
    public static volatile SingularAttribute<Proveedor, String> telefono;
    public static volatile SingularAttribute<Proveedor, String> nombre;
    public static volatile SingularAttribute<Proveedor, String> contra;

}