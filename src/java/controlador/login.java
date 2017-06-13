/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controlador;

/**
 *
 * @author Estudiante_2
 */

import modelo.UsuarioDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequestMapping("login.htm")
public class login {

    @Autowired
    private UsuarioDao dao;

    @RequestMapping(method = RequestMethod.GET)
    public String registrarProd() {
        return "login";
    }
 
    @RequestMapping(method = RequestMethod.POST)
    public String registrar(
            @RequestParam("txtCedula") String ced,
            @RequestParam("txtNombre") String nomb,
            @RequestParam("txtDir") String dir,
            @RequestParam("txtTelf") String telf,
            @RequestParam("txtCod") int cod,
            @RequestParam("txtContra") String contra,
            Model model) {
        
        //              codigo
        //gerente       112
        //contador      113
        //provedor      114
        //cliente       115

        
        
        return "exito";
    }

}
