/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controlador;


import entidades.Producto;
import modelo.ProductoDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

/**
 *
 * @author heltonsmith
 */
@Controller
@RequestMapping("/prueba.htm")
public class prueba {
    
    @Autowired
    private ProductoDao dao;
    
     
    @RequestMapping(method = RequestMethod.GET)
    public String prueba(){     
        return "prueba";   
    }
    
//    @RequestMapping(value = "/holi",method = RequestMethod.POST)    
//    public String prueba(
//            @RequestParam("txtId") int id,
//            Model model) {
//        
//            Producto p=dao.consultar(id);
//           
//            if (p == null) {
//                return "error";
//            }
//            
//            model.addAttribute("Prod", p);
//            
//            return "prueba";
//    } 
}
