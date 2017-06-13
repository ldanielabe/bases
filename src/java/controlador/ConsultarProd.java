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
@RequestMapping("/consultarProd.htm")
public class ConsultarProd {
    
    @Autowired
    private ProductoDao dao;
    
    @RequestMapping(method = RequestMethod.GET)
    public String registrarProd(){     
        return "consultarProd";   
    }
    
    @RequestMapping(method = RequestMethod.POST)    
    public String registrarProd(
            @RequestParam("txtId") int id,
            Model model) {
        
            Producto p=dao.consultar(id);
           
            if (p == null) {
                return "error";
            }
            
            model.addAttribute("Prod", p);
            
            return "consultarProd";
    }
    
    @RequestMapping(value = "/holi",method = RequestMethod.GET)
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
  

