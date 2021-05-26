
package Modelo;

public class Ingrediente {

    public Ingrediente() {
        super();
    }
    
    public String codigo;
    public String nombre;
    public double precio;
    public String descripcion;

    public Ingrediente(String codigo, String nombre, float precio, String descripcion) {
        this.codigo = codigo;
        this.nombre = nombre;
        this.precio = precio;
        this.descripcion = descripcion;
        
        
             
    }
    
}
