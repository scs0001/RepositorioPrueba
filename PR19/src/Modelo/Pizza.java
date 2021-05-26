
package Modelo;

import java.util.ArrayList;

public class Pizza {
    public String codigoPizza;
    public String masa;
    public double precio;
    public ArrayList<Ingrediente> ingredientes;
    
    public Pizza(){
        ingredientes = new ArrayList<Ingrediente>();
    }
}
