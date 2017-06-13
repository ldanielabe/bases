/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;


import entidades.Usuario;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import org.springframework.transaction.annotation.Transactional;

/**
 *
 * @author maquina2
 */
public class UsuarioDao {

    @PersistenceContext
    private EntityManager em;

    @Transactional(rollbackFor = {ServicioException.class})
    //@Transactional

    //Crear Entity
    public void createCliente(Usuario dto) throws ServicioException {
        em.persist(dto);
    }

   

    //consulta simple Entity
    public Usuario consultar(int id) throws SecurityException {
        return em.find(Usuario.class, id);
    }

    //otra forma de query JPQL (Consulta simple)
    public Usuario consultarJPQL(String id) throws SecurityException {
        String sql = "Select a from Alumno a Where a.id = :id";

        Query q = em.createQuery(sql);
        q.setParameter("id", id);

        try {
            return (Usuario) q.getSingleResult();
        } catch (Exception e) {
            return null;
        }
    }

    //query JPQL (Consulta multiple)
    public List<Usuario> readAllJPQL() throws SecurityException {
        String sql = "Select a from Alumno a";

        Query q = em.createQuery(sql);
        return q.getResultList();
    }

    ////////////////////////////////////////////////////////
    //otra forma de query JPQL (Consulta simple)
    //compatible con cualquier motor de BD 
    public boolean readByIdJPQLCreate(String id) throws SecurityException {
        String sql = "Select a from Alumno a Where a.id = :id";

        Query q = em.createQuery(sql);
        q.setParameter("id", id);

        if (q.getResultList().size() > 0) {
            return true;
        } else {
            return false;
        }
    }

    //query JPQL (insertar)
    public int createJPQL(Usuario dto) throws SecurityException {
        if (readByIdJPQLCreate(String.valueOf(dto.getCedula()))) {
            return 0;
        } else {
            em.persist(dto);
            return 1;
        }
    }

}
