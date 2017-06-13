/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controlador;

import entidades.Producto;
import modelo.ProductoDao;
import modelo.ServicioException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;


@Controller
@RequestMapping("/registrarProd.htm")
public class RegistrarProd {
    
    @Autowired
    private ProductoDao dao;
    
    @RequestMapping(method = RequestMethod.GET)
    public String registrarProd(){     
        return "registrarProd";   
    }
    
    @RequestMapping(method = RequestMethod.POST)    
    public String registrarProd(
            @RequestParam("txtNombre") String nomb,
            @RequestParam("txtDescrip") String descrip,
            @RequestParam("txtPrecio") int precio,
            @RequestParam("txtStack") int stack,
            Model model) {
        
        try {
            dao.create(new Producto(0,descrip,stack,nomb,precio));
            return "exito";
        } catch (ServicioException ex) {
            
        }
            return "error";  
    }

     //return productos mostraba tablas con productos

    
    
}
