/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package OfertaAcademica;

 
public class Facultad {
    private String nombre, direccion;
    private int nro, nroCarreras;
    
    public Facultad(int x,String n,String d,int y){
        nro = x;
        nombre = n;
        direccion = d;
        nroCarreras = y;
    }
    
    
    public void mostrar(){
        System.out.println(nombre+" "+direccion+" ");
    }
}
