package Utils;


import com.db4o.Db4oEmbedded;
import com.db4o.ObjectContainer;
import com.db4o.ext.DatabaseFileLockedException;
import com.db4o.ext.DatabaseReadOnlyException;
import com.db4o.ext.Db4oIOException;
import com.db4o.ext.IncompatibleFileFormatException;
import com.db4o.ext.OldFormatException;

/**
 * Esta clase gestiona la conexión a una base de datos orientada a objetos DB4O
 *
 * @author Francisco Jesús Delgado Almirón
 */
public class ConexionDB4O {
    
    // Objeto para almacenar la base de datos orientada a objetos
    public static ObjectContainer bd;
    public static String rutabd;

    /**
     * Constructor por defecto
     *
     * @param rutabd Ruta del fichero .db4o para la base de datos orientada a objetos
     */
    /*
    public ConexionDB4O(String rutabd) {
        bd = null;
        this.rutabd = rutabd;
    }

    /**
     * Conecta con la base de datos orientada a objetos
     *
     * @throws DB4OException Se lanzará la excepción cuando ocurra un error con la base de datos
     */
    public static void conectar() throws DB4OException {
        try {
            bd = Db4oEmbedded.openFile(Db4oEmbedded.newConfiguration(), rutabd);
        } catch (Db4oIOException | DatabaseFileLockedException | IncompatibleFileFormatException | OldFormatException | DatabaseReadOnlyException error) {
            throw new DB4OException(error.toString());
        }
    }

    /**
     * Desconecta de la base de datos orientada objetos
     *
     * @throws DB4OException Se lanzará la excepción cuando ocurra un error con la base de datos
     */
    public static void desconectar() throws DB4OException {
        try {
            bd.close();
        } catch (Db4oIOException error) {
            throw new DB4OException(error.toString());
        }
    }
}
