package entidades;

import entidades.Gerente;
import entidades.Producto;
import entidades.Proveedor;
import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.6.1.v20150605-rNA", date="2017-06-12T08:53:50")
@StaticMetamodel(EntradaProducto.class)
public class EntradaProducto_ { 

    public static volatile SingularAttribute<EntradaProducto, Integer> codigo;
    public static volatile SingularAttribute<EntradaProducto, Gerente> idGerente;
    public static volatile SingularAttribute<EntradaProducto, Date> fechaLlegada;
    public static volatile SingularAttribute<EntradaProducto, Proveedor> idProveedor;
    public static volatile SingularAttribute<EntradaProducto, Integer> cantidad;
    public static volatile SingularAttribute<EntradaProducto, Producto> idProducto;

}