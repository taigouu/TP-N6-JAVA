/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tpnumero6.java.ejercicio2;



/**
 *
 * @author Taigo Capo
 */
public class Productos implements Comparable<Productos> {
    
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
    
    
    public Productos(int codigo, String descripcion, double precio,int stock, String rubros){
        this.codigo=codigo;
        this.descripcion=descripcion;
        this.precio=precio;
        this.stock=stock;
        this.rubros=rubros;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public int getStock() {
        return stock;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }

    public String getRubros() {
        return rubros;
    }

    public void setRubros(String rubros) {
        this.rubros = rubros;
    }

    @Override
public int compareTo(Productos otro) {
    return Integer.compare(this.codigo, otro.codigo);
}


    
    
    
   






}
