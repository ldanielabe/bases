package entidades;

import entidades.EntradaProducto;
import javax.annotation.Generated;
import javax.persistence.metamodel.CollectionAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.6.1.v20150605-rNA", date="2017-06-12T08:53:50")
@StaticMetamodel(Gerente.class)
public class Gerente_ { 

    public static volatile CollectionAttribute<Gerente, EntradaProducto> entradaProductoCollection;
    public static volatile SingularAttribute<Gerente, String> cedula;
    public static volatile SingularAttribute<Gerente, String> direccion;
    public static volatile SingularAttribute<Gerente, Integer> cod;
    public static volatile SingularAttribute<Gerente, String> telefono;
    public static volatile SingularAttribute<Gerente, String> nombre;
    public static volatile SingularAttribute<Gerente, String> contra;

}