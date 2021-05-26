package pr19;
import Vistas.Ventana_Ingredientes;
import Utils.DB4OException;
import Controladores.GestionBD;
import Controladores.GestionBD_Controller;
import Modelo.Ingrediente;
import com.db4o.ObjectSet;
import java.io.File;
import javax.swing.JOptionPane;
import static Utils.ConexionDB4O.bd;

public class Launcher {

    public static void main(String[] args) throws DB4OException {
        
        /*
        String filePath = new File("").getAbsolutePath();
        
        String ruta =  filePath.concat("\\datos\\baseDatos.pizza");
        
        ConexionDB4O testDB4O = new ConexionDB4O(ruta);
        
        try{
            testDB4O.conectar();
        }catch(DB4OException err){
            err.printStackTrace();
        }
        
        try{
            testDB4O.desconectar();
        }catch(DB4OException err){
            err.printStackTrace();
        }
        */

        
        //Gestionar la base de datos
        GestionBD frame = new GestionBD();
        frame.setVisible(true);
        
        GestionBD_Controller.conectar();
        
        Ventana_Ingredientes ventana = new Ventana_Ingredientes();
        ventana.setVisible(true);
        
        GestionBD_Controller.desconectar();
        
        /*
        try{
            
            ConexionDB4O.conectar();
        
            Ingrediente ingrediente1 = new Ingrediente("1", "Pepperoni", 2, "Que bueno");
            ConexionDB4O.bd.store(ingrediente1);
            
            ConexionDB4O.desconectar();
        
        }catch (Exception err){
            JOptionPane.showMessageDialog(null, "Error al abrir la base de datos", "Error", JOptionPane.ERROR_MESSAGE);
        }
        */
        
        //Consultar la base de datos
        
        /*
        Ingrediente iQBE = new Ingrediente(); //Le damos un objeto que queramos encontrar en la BBDD
        iQBE.codigo = "1";
        try{
            ConexionDB4O.conectar();
            
            Devuelve todos los ingredientes de la base de datos cuyos datos
            coincidan con iQBE
            ObjectSet<Ingredientes> os = ConexionDB4O.bd.queryByExample(iQBE); 
 
            
            for(Ingrediente i:os){
                System.out.println(i.nombre);
            }   
            ConexionDB4O.desconectar();
            
        }catch(Exception err){
            
        }
        */
    }
    
}
