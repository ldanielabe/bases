package entidades;

import entidades.Pedido;
import javax.annotation.Generated;
import javax.persistence.metamodel.CollectionAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.6.1.v20150605-rNA", date="2017-06-12T08:53:50")
@StaticMetamodel(Contador.class)
public class Contador_ { 

    public static volatile SingularAttribute<Contador, String> cedula;
    public static volatile SingularAttribute<Contador, String> direccion;
    public static volatile SingularAttribute<Contador, Integer> cod;
    public static volatile CollectionAttribute<Contador, Pedido> pedidoCollection;
    public static volatile SingularAttribute<Contador, String> telefono;
    public static volatile SingularAttribute<Contador, String> nombre;
    public static volatile SingularAttribute<Contador, String> contra;

}