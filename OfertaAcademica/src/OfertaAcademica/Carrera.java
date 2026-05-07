
package OfertaAcademica;


public class Carrera {
    private String nombre,direccion,pagWeb,telefono;
    private int nroSem;
    
    public Carrera(String nom,String dir,String pag,String tel,int nroS){
        nombre = nom;
        direccion = dir;
        pagWeb = pag;
        telefono = tel;
        nroSem = nroS;
    }
    public void mostrar(){
        System.out.println(nombre+" "+direccion+" "+pagWeb+" "+telefono+" "+nroSem);
    }
}
