/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Clases;

/**
 *
 * @author maxim
 */
public class Departamento implements java.io.Serializable {
    private int id;
    private String nombre;
    
    public Departamento(){}
    
    public Departamento (int id, String nombre){
        this.id = id;
        this.nombre = nombre;
       }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    
    
}
