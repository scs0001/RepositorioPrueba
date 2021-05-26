
package Controladores;

import Modelo.*;
import Utils.ConexionDB4O;
import Utils.DB4OException;
import Vistas.Ventana_Aniadir_Ingrediente;
import Vistas.Ventana_Ingredientes;
import com.db4o.ObjectSet;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class Ingredientes_Controller {
    
    
    /**
     * oBTIENE UN LISTADO DE INGREDIENTES
     * 
     * @return Un conjunto de objetos Ingrediente
     * @throws
     */
    public ObjectSet<Ingrediente> getListado() throws DB4OException{
        ObjectSet<Ingrediente> result; //Devolver el resultado de la función
        
        Ingrediente iQBE = new Ingrediente();
        
        result = ConexionDB4O.bd.queryByExample(iQBE);
        
            
        return result;
        
    }
    
    
    
    public Ingrediente getIngrediente(String nombre) throws Exception{
        Ingrediente result = null;
        
        Ingrediente iQBE = new Ingrediente(); //Objeto para la búsqueda
        iQBE.nombre = nombre;
        
        
        ObjectSet<Ingrediente> listado =
                ConexionDB4O.bd.queryByExample(iQBE);
        
        if(listado.hasNext()){
            result = listado.next();
        }else{
            throw new Exception("No hay ningún ingrediente en la búsqueda");
        }
        
        return result;
        
    }       
      
    public Ingrediente AniadirIngrediente() throws Exception{
        Ingrediente ing = new Ingrediente();
        Ventana_Aniadir_Ingrediente ventana = new Ventana_Aniadir_Ingrediente();
        ing.codigo = ventana.tfCodigo.getText();
        ing.descripcion = ventana.tfComentarios.getText();
        ing.nombre = ventana.tfNombre.getText();
        ing.precio = Double.parseDouble(ventana.tfPrecio.getText());
        
        ConexionDB4O.bd.store(ing);
        
        return ing;
    }
   
}
