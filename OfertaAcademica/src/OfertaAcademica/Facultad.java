/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package OfertaAcademica;

import java.util.Scanner;

 
public class Facultad {
    private String nombre, direccion;
    private int nro, nroCarreras;
    private Carrera[] CR;
    Scanner sc = new Scanner(System.in);
    
    public Facultad(int x,String n,String d){
        nro = x;
        nombre = n;
        direccion = d;
        
        nroCarreras = 0;
        CR = new Carrera[20];
        for (int i = 0; i < 20; i++) {
            CR[i] = new Carrera(0,"","","","",9);
        }
        
        /*nroCarreras = 3;
        CR = new Carrera[20];
        CR[1] = new Carrera(1,"Fisica","Z.Sur","www.fis.com","7653212",9);
        CR[2] = new Carrera(2,"Quimica","Z.Sur","www.qmc.com","7653212",9);
        CR[3] = new Carrera(1,"Matematica","Edif-Antiguo","www.mat.com","7656712",9);
        
        for (int i = 0; i < 20; i++) {
            CR[i] = new Carrera(0,"","","","",9);
        }*/
    }
        public Facultad(int x,String n,String d, int nc){
        nro = x;
        nombre = n;
        direccion = d;
        
        nroCarreras = nc;
        nroCarreras = 3;
        CR = new Carrera[20];
        CR[1] = new Carrera(1,"Fisica","Z.Sur","www.fis.com","7653212",9);
        CR[2] = new Carrera(2,"Quimica","Z.Sur","www.qmc.com","7653212",9);
        CR[3] = new Carrera(1,"Matematica","Edif-Antiguo","www.mat.com","7656712",9);
        
        for (int i = nroCarreras; i < 20; i++) {
            CR[i] = new Carrera(0,"","","","",9);
        }
    }
    

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public int getNro() {
        return nro;
    }

    public void setNro(int nro) {
        this.nro = nro;
    }

    public int getNroCarreras() {
        return nroCarreras;
    }

    public void setNroCarreras(int nroCarreras) {
        this.nroCarreras = nroCarreras;
    }
    
    public void mostrar(){
        System.out.println(nro+" "+nombre+" "+direccion+" ");
    }
    public void mostrarCarreras(){
        if (nroCarreras != 0) {
            for (int i = 0; i < nroCarreras; i++) {
                CR[i].mostrar();
            }
        }
        else
            System.out.println("No existen carreras registradas!");
    }
    public void agregarCarrera(){
        System.out.print("Ingrese nombre: ");
        String nom = sc.next();
        System.out.print("Ingrese direccion: ");
        String dir = sc.next();
        System.out.print("Ingrese pagina: ");
        String pag = sc.next();
        System.out.print("Ingrese telefono: ");
        String tel = sc.next();
        
        CR[nroCarreras] = new Carrera(nroCarreras+1,nom,dir,pag,tel,8);
        nroCarreras++;
        
    }
    public void quitarCarrera(){
        System.out.print("Seleccione la carrera (NRO): ");
        int n = sc.nextInt();
        int aux = 0;
        if (n > 0 && n <= nroCarreras) {
            for (int i = 0; i < nroCarreras; i++) {
                if (CR[i].getNro() == n) {
                    for (int j = i; j < nroCarreras; j++) {
                        aux = CR[j].getNro();
                        CR[j] = CR[j + 1];
                        CR[j].setNro(aux);
                        
                    }
                    nroCarreras--;
                }
            }
        } else {
            System.out.println("El numero no es valido!");
        }
    }
}
