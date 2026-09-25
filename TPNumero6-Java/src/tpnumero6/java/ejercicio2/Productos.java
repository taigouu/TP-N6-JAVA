/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tpnumero6.java.ejercicio2;

/**
 *
 * @author Taigo Capo
 */
public class Productos {
    
    private int codigo;
    private String descripcion;
    private double precio;
    private int stock;
    private String rubros;
    
    
    
    public void verificacion(String rubro){
        
        if(rubro.equalsIgnoreCase("comestible")){
            rubros=rubro;
       
                } else if(rubro.equalsIgnoreCase("limpieza")){
                     rubros=rubro;
        
                }else if(rubro.equalsIgnoreCase("perfumeria")){
                     rubros=rubro;
    
                }else if(rubro.equalsIgnoreCase("perfumería")){
                     rubros=rubro;
   
       }else{
            System.out.println("Rubro incorrecto.");
        }
    }
    
    







}
