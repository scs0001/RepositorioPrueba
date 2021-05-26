/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

import java.util.ArrayList;


public class Pedido {
    public String codigoPedido;
    public String nombreCliente;
    public String direccion;
    public String hora;
    public String telefono;
    public String estado;
    
    public double precioTotal;
    public double precioSinIVA;
    
    public double descuento;
    public boolean cambio; //Indica si el repartidor debe llevar cambio
    public double cambioDeCuanto; //Indica el billete del cambio
    
    public ArrayList<Pizza> pizzas;
    
    public Pedido(){
        pizzas = new ArrayList<Pizza>();
    }
}
