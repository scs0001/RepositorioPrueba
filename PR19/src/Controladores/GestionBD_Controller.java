/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controladores;

import Utils.ConexionDB4O;
import Utils.DB4OException;
import java.util.logging.Level;
import java.util.logging.Logger;


public class GestionBD_Controller {
    
    //Comprobar conexion con la base de datos.    
    public boolean comprobarBaseDeDatos() throws DB4OException {
        ConexionDB4O.conectar();
        ConexionDB4O.desconectar();
        
        return true;
    }
    
    //Cambiar la ruta de la base de datos
    public void cambiarRutaBD(String ruta){
        ConexionDB4O.rutabd = ruta;
    }
    
    public static void conectar(){
        try {
            ConexionDB4O.conectar();
        } catch (DB4OException ex) {
            Logger.getLogger(GestionBD_Controller.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
        
    public static void desconectar(){
        try {
            ConexionDB4O.desconectar();
        } catch (DB4OException ex) {
            Logger.getLogger(GestionBD_Controller.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    
}
