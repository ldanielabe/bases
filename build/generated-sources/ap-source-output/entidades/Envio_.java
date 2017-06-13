package entidades;

import entidades.Pedido;
import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.6.1.v20150605-rNA", date="2017-06-12T08:53:50")
@StaticMetamodel(Envio.class)
public class Envio_ { 

    public static volatile SingularAttribute<Envio, Integer> codigo;
    public static volatile SingularAttribute<Envio, Date> fechaEnvio;
    public static volatile SingularAttribute<Envio, Date> fechaLlegada;
    public static volatile SingularAttribute<Envio, Pedido> idPedido;

}